// This file was generated using 'action-binding-generator' module. Don't change it by hand, your changes will
// be overwritten with the next binding code regeneration. Instead, consider introducing changes to the
// generator itself.
@file:Suppress(
    "DataClassPrivateConstructor",
    "UNUSED_PARAMETER",
)

package io.github.typesafegithub.workflows.actions.reposync

import io.github.typesafegithub.workflows.domain.actions.Action
import io.github.typesafegithub.workflows.domain.actions.RegularAction
import java.util.LinkedHashMap
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.toList
import kotlin.collections.toTypedArray

/**
 * Action: GitHub Pull Request Action
 *
 * ⤵️ Create pull request
 *
 * [Action on GitHub](https://github.com/repo-sync/pull-request)
 */
public data class PullRequestV2 private constructor(
    /**
     * Repository (user/repo) to create the pull request in, falls back to checkout repository or
     * triggered repository
     */
    public val destinationRepository: String? = null,
    /**
     * Branch name to pull from, default is triggered branch
     */
    public val sourceBranch: String? = null,
    /**
     * Branch name to sync to in this repo, default is master
     */
    public val destinationBranch: String? = null,
    /**
     * Pull request title
     */
    public val prTitle: String? = null,
    /**
     * Pull request body
     */
    public val prBody: String? = null,
    /**
     * Pull request template
     */
    public val prTemplate: String? = null,
    /**
     * Pull request reviewers, comma-separated list (no spaces)
     */
    public val prReviewer: List<String>? = null,
    /**
     * Pull request assignees, comma-separated list (no spaces)
     */
    public val prAssignee: List<String>? = null,
    /**
     * Pull request labels, comma-separated list (no spaces)
     */
    public val prLabel: List<String>? = null,
    /**
     * Pull request milestone
     */
    public val prMilestone: String? = null,
    /**
     * Draft pull request
     */
    public val prDraft: Boolean? = null,
    /**
     * Create PR even if no changes
     */
    public val prAllowEmpty: Boolean? = null,
    /**
     * GitHub token secret
     */
    public val githubToken: String? = null,
    /**
     * Bash set -x debugging mode
     */
    public val debug: Boolean? = null,
    /**
     * Type-unsafe map where you can put any inputs that are not yet supported by the binding
     */
    public val _customInputs: Map<String, String> = mapOf(),
    /**
     * Allows overriding action's version, for example to use a specific minor version, or a newer
     * version that the binding doesn't yet know about
     */
    public val _customVersion: String? = null,
) : RegularAction<PullRequestV2.Outputs>("repo-sync", "pull-request", _customVersion ?: "v2") {
    public constructor(
        vararg pleaseUseNamedArguments: Unit,
        destinationRepository: String? = null,
        sourceBranch: String? = null,
        destinationBranch: String? = null,
        prTitle: String? = null,
        prBody: String? = null,
        prTemplate: String? = null,
        prReviewer: List<String>? = null,
        prAssignee: List<String>? = null,
        prLabel: List<String>? = null,
        prMilestone: String? = null,
        prDraft: Boolean? = null,
        prAllowEmpty: Boolean? = null,
        githubToken: String? = null,
        debug: Boolean? = null,
        _customInputs: Map<String, String> = mapOf(),
        _customVersion: String? = null,
    ) : this(destinationRepository=destinationRepository, sourceBranch=sourceBranch,
            destinationBranch=destinationBranch, prTitle=prTitle, prBody=prBody,
            prTemplate=prTemplate, prReviewer=prReviewer, prAssignee=prAssignee, prLabel=prLabel,
            prMilestone=prMilestone, prDraft=prDraft, prAllowEmpty=prAllowEmpty,
            githubToken=githubToken, debug=debug, _customInputs=_customInputs,
            _customVersion=_customVersion)

    @Suppress("SpreadOperator")
    override fun toYamlArguments(): LinkedHashMap<String, String> = linkedMapOf(
        *listOfNotNull(
            destinationRepository?.let { "destination_repository" to it },
            sourceBranch?.let { "source_branch" to it },
            destinationBranch?.let { "destination_branch" to it },
            prTitle?.let { "pr_title" to it },
            prBody?.let { "pr_body" to it },
            prTemplate?.let { "pr_template" to it },
            prReviewer?.let { "pr_reviewer" to it.joinToString(",") },
            prAssignee?.let { "pr_assignee" to it.joinToString(",") },
            prLabel?.let { "pr_label" to it.joinToString(",") },
            prMilestone?.let { "pr_milestone" to it },
            prDraft?.let { "pr_draft" to it.toString() },
            prAllowEmpty?.let { "pr_allow_empty" to it.toString() },
            githubToken?.let { "github_token" to it },
            debug?.let { "debug" to it.toString() },
            *_customInputs.toList().toTypedArray(),
        ).toTypedArray()
    )

    override fun buildOutputObject(stepId: String): Outputs = Outputs(stepId)

    public class Outputs(
        stepId: String,
    ) : Action.Outputs(stepId) {
        /**
         * Pull request URL
         */
        public val prUrl: String = "steps.$stepId.outputs.pr_url"

        /**
         * Pull request number
         */
        public val prNumber: String = "steps.$stepId.outputs.pr_number"

        /**
         * Boolean string indicating if a pull request was created from the action run
         */
        public val prCreated: String = "steps.$stepId.outputs.pr_created"

        /**
         * Boolean string indicating whether any file has been changed
         */
        public val hasChangedFiles: String = "steps.$stepId.outputs.has_changed_files"
    }
}
