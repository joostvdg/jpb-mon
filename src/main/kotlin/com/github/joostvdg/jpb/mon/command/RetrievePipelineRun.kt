package com.github.joostvdg.jpb.mon.command

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import picocli.CommandLine
import javax.inject.Inject

@CommandLine.Command(name = "retrieve-pipeline-run", description = ["Retrieves Pipeline Run data from a Jenkins BlueOcean UI"],
        mixinStandardHelpOptions = true)
class RetrievePipelineRunCommand : Runnable {

    @Client("https://jenkins.gke.kearos.net/blue/rest/organizations/jenkins/pipelines/prom-test-2/runs/7/nodes/")
    @Inject
    var client: HttpClient? = null

    @CommandLine.Option(names = ["-a", "--auth"], paramLabel = "AUTH",
            description = ["authorization username:password"])
    private var auth: String = ""

    override fun run() {
        println("Hello!")
        // jenkinsPipelineRunClient.fetchPipelineRun()
        var response = client?.retrieve("https://jenkins.gke.kearos.net/blue/rest/organizations/jenkins/pipelines/prom-test-2/runs/7/nodes/")
        println("Response:" + response)
    }
}