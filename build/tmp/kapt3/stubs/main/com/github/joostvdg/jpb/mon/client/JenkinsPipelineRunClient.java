package com.github.joostvdg.jpb.mon.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'\u00a8\u0006\u0004"}, d2 = {"Lcom/github/joostvdg/jpb/mon/client/JenkinsPipelineRunClient;", "", "fetchPipelineRun", "Lcom/github/joostvdg/jpb/mon/model/JenkinsPipelineRun;", "jpb-mon"})
@io.micronaut.http.client.annotation.Client()
public abstract interface JenkinsPipelineRunClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "https://jenkins.gke.kearos.net/blue/rest/organizations/jenkins/pipelines/prom-test-2/runs/7/nodes/")
    public abstract com.github.joostvdg.jpb.mon.model.JenkinsPipelineRun fetchPipelineRun();
}