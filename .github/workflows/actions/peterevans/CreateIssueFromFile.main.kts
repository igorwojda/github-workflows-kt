#!/usr/bin/env kotlin
// This file was generated using 'action-binding-generator' module. Don't change it by hand, your changes will
// be overwritten with the next binding code regeneration. Instead, consider introducing changes to the
// generator itself.
@file:DependsOn("io.github.typesafegithub:github-workflows-kt:1.2.0")
@file:Suppress(
    "DataClassPrivateConstructor",
    "UNUSED_PARAMETER",
)

import io.github.typesafegithub.workflows.domain.actions.Action
import io.github.typesafegithub.workflows.domain.actions.RegularAction
import java.util.LinkedHashMap
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.toList
import kotlin.collections.toTypedArray

/**
 * Action: Create Issue From File
 *
 * An action to create an issue using content from a file
 *
 * [Action on GitHub](https://github.com/peter-evans/create-issue-from-file)
 */
public data class CreateIssueFromFile private constructor(
    /**
     * The GitHub authentication token
     */
    public val token: String? = null,
    /**
     * The target GitHub repository
     */
    public val repository: String? = null,
    /**
     * The issue number of an existing issue to update
     */
    public val issueNumber: Int? = null,
    /**
     * The title of the issue
     */
    public val title: String,
    /**
     * The file path to the issue content
     */
    public val contentFilepath: String? = null,
    /**
     * A comma or newline-separated list of labels
     */
    public val labels: List<String>? = null,
    /**
     * A comma or newline-separated list of assignees (GitHub usernames)
     */
    public val assignees: List<String>? = null,
    /**
     * Type-unsafe map where you can put any inputs that are not yet supported by the binding
     */
    public val _customInputs: Map<String, String> = mapOf(),
    /**
     * Allows overriding action's version, for example to use a specific minor version, or a newer
     * version that the binding doesn't yet know about
     */
    public val _customVersion: String? = null,
) : RegularAction<CreateIssueFromFile.Outputs>("peter-evans", "create-issue-from-file",
        _customVersion ?: "v4") {
    public constructor(
        vararg pleaseUseNamedArguments: Unit,
        token: String? = null,
        repository: String? = null,
        issueNumber: Int? = null,
        title: String,
        contentFilepath: String? = null,
        labels: List<String>? = null,
        assignees: List<String>? = null,
        _customInputs: Map<String, String> = mapOf(),
        _customVersion: String? = null,
    ) : this(token=token, repository=repository, issueNumber=issueNumber, title=title,
            contentFilepath=contentFilepath, labels=labels, assignees=assignees,
            _customInputs=_customInputs, _customVersion=_customVersion)

    @Suppress("SpreadOperator")
    override fun toYamlArguments(): LinkedHashMap<String, String> = linkedMapOf(
        *listOfNotNull(
            token?.let { "token" to it },
            repository?.let { "repository" to it },
            issueNumber?.let { "issue-number" to it.toString() },
            "title" to title,
            contentFilepath?.let { "content-filepath" to it },
            labels?.let { "labels" to it.joinToString(",") },
            assignees?.let { "assignees" to it.joinToString(",") },
            *_customInputs.toList().toTypedArray(),
        ).toTypedArray()
    )

    override fun buildOutputObject(stepId: String): Outputs = Outputs(stepId)

    public class Outputs(
        stepId: String,
    ) : Action.Outputs(stepId) {
        /**
         * The number of the created issue
         */
        public val issueNumber: String = "steps.$stepId.outputs.issue-number"
    }
}
