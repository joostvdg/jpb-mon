package com.github.joostvdg.jpb.mon

import com.github.joostvdg.jpb.mon.command.RetrievePipelineRunCommand
import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters


@Command(name = "jpb-mon", version=["0.1.0"],
        description = ["..."],
        mixinStandardHelpOptions = true,
        subcommands = [RetrievePipelineRunCommand::class])
class JpbMonCommand : Runnable {

    @Option(names = ["-v", "--verbose"], description = ["..."])
    private var verbose : Boolean = false

    override fun run() {
        // business logic here
        if (verbose) {
            println("Hi!")
        }
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            PicocliRunner.run(JpbMonCommand::class.java, *args)
        }
    }
}
