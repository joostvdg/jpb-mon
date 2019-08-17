package com.github.joostvdg.jpb.mon.client

import com.github.joostvdg.jpb.mon.model.JenkinsPipelineRun
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client
interface JenkinsPipelineRunClient  {
    @Get("https://jenkins.gke.kearos.net/blue/rest/organizations/jenkins/pipelines/prom-test-2/runs/7/nodes/")
    fun fetchPipelineRun(): JenkinsPipelineRun
}