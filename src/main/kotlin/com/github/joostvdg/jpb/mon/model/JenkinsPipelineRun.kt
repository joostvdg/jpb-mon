package com.github.joostvdg.jpb.mon.model

data class JenkinsPipelineRun(
        val _class: String,
        val _links: Links,
        val actions: List<Any>,
        val causeOfBlockage: Any?,
        val displayDescription: Any?,
        val displayName: String,
        val durationInMillis: Int,
        val edges: List<Any>,
        val firstParent: String?,
        val id: String,
        val input: Any?,
        val restartable: Boolean,
        val result: String,
        val startTime: String?,
        val state: String,
        val type: String
)