package com.github.joostvdg.jpb.mon.command;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/github/joostvdg/jpb/mon/command/RetrievePipelineRunCommand;", "Ljava/lang/Runnable;", "()V", "auth", "", "client", "Lio/micronaut/http/client/HttpClient;", "client$annotations", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "run", "", "jpb-mon"})
@picocli.CommandLine.Command(name = "retrieve-pipeline-run", description = {"Retrieves Pipeline Run data from a Jenkins BlueOcean UI"}, mixinStandardHelpOptions = true)
public final class RetrievePipelineRunCommand implements java.lang.Runnable {
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Inject()
    private io.micronaut.http.client.HttpClient client;
    @picocli.CommandLine.Option(names = {"-a", "--auth"}, paramLabel = "AUTH", description = {"authorization username:password"})
    private java.lang.String auth;
    
    @io.micronaut.http.client.annotation.Client(value = "https://jenkins.gke.kearos.net/blue/rest/organizations/jenkins/pipelines/prom-test-2/runs/7/nodes/")
    public static void client$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.Nullable()
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    public RetrievePipelineRunCommand() {
        super();
    }
}