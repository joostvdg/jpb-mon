FROM oracle/graalvm-ce:19.1.1 as graalvm
RUN gu install native-image
COPY . /home/app/jpb-mon
WORKDIR /home/app/jpb-mon
RUN java -cp \
 build/libs/jpb-mon-0.1-all.jar:picocli-4.0.2.jar:picocli-codegen-4.0.2.jar \
 picocli.codegen.aot.graalvm.ReflectionConfigGenerator jpb.mon.JpbMonCommand > reflect.json
RUN native-image --static --no-server -cp build/libs/jpb-mon-*-all.jar \
    -H:Name=jpb-mon \
    -H:Class=com.github.joostvdg.jpb.mon.JpbMonCommand \
    -H:ReflectionConfigurationFiles=reflect.json \
    -H:+ReportExceptionStackTraces \
    -H:IncludeResources="application.yml" \
    -H:+ReportUnsupportedElementsAtRuntime \
    -H:+AllowVMInspection \
    --allow-incomplete-classpath \
    --initialize-at-build-time \
    --no-fallback


FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/jpb-mon .
ENTRYPOINT ["./jpb-mon"]
