// This file was generated using 'action-binding-generator' module. Don't change it by hand, your changes will
// be overwritten with the next binding code regeneration. Instead, consider introducing changes to the
// generator itself.
@file:Suppress(
    "DataClassPrivateConstructor",
    "UNUSED_PARAMETER",
)

package io.github.typesafegithub.workflows.actions.gradle

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
 * Action: Gradle Build Action
 *
 * Configures Gradle for GitHub actions, caching state and generating a dependency graph via
 * Dependency Submission.
 *
 * [Action on GitHub](https://github.com/gradle/gradle-build-action)
 */
public data class GradleBuildActionV2 private constructor(
    /**
     * Gradle version to use. If specified, this Gradle version will be downloaded, added to the
     * PATH and used for invoking Gradle.
     */
    public val gradleVersion: String? = null,
    /**
     * Path to the Gradle executable. If specified, this executable will be added to the PATH and
     * used for invoking Gradle.
     */
    public val gradleExecutable: String? = null,
    /**
     * Path to the root directory of the build. Default is the root of the GitHub workspace.
     */
    public val buildRootDirectory: String? = null,
    /**
     * When 'true', all caching is disabled. No entries will be written to or read from the cache.
     */
    public val cacheDisabled: Boolean? = null,
    /**
     * When 'true', existing entries will be read from the cache but no entries will be written.
     * By default this value is 'false' for workflows on the GitHub default branch and 'true' for
     * workflows on other branches.
     */
    public val cacheReadOnly: Boolean? = null,
    /**
     * When 'true', entries will not be restored from the cache but will be saved at the end of the
     * Job.
     * Setting this to 'true' implies cache-read-only will be 'false'.
     */
    public val cacheWriteOnly: Boolean? = null,
    /**
     * When 'true', a pre-existing Gradle User Home will not prevent the cache from being restored.
     */
    public val cacheOverwriteExisting: Boolean? = null,
    /**
     * Paths within Gradle User Home to cache.
     */
    public val gradleHomeCacheIncludes: List<String>? = null,
    /**
     * Paths within Gradle User Home to exclude from cache.
     */
    public val gradleHomeCacheExcludes: List<String>? = null,
    /**
     * Gradle command line arguments (supports multi-line input)
     */
    public val arguments: String? = null,
    /**
     * When 'false', no Job Summary will be generated for the Job.
     */
    public val generateJobSummary: Boolean? = null,
    /**
     * Specifies if a GitHub dependency snapshot should be generated for each Gradle build, and if
     * so, how. Valid values are 'disabled' (default), 'generate', 'generate-and-submit' and
     * 'download-and-submit'.
     */
    public val dependencyGraph: GradleBuildActionV2.DependencyGraph? = null,
    /**
     * When 'true', the action will not attempt to restore the Gradle User Home entries from other
     * Jobs.
     */
    public val gradleHomeCacheStrictMatch: String? = null,
    /**
     * Used to uniquely identify the current job invocation. Defaults to the matrix values for this
     * job; this should not be overridden by users (INTERNAL).
     */
    public val workflowJobContext: String? = null,
    /**
     * When 'true', the action will attempt to remove any stale/unused entries from the Gradle User
     * Home prior to saving to the GitHub Actions cache.
     */
    public val gradleHomeCacheCleanup: Boolean? = null,
    /**
     * The GitHub token used to authenticate when submitting via the Dependency Submission API.
     */
    public val githubToken: String? = null,
    /**
     * Type-unsafe map where you can put any inputs that are not yet supported by the binding
     */
    public val _customInputs: Map<String, String> = mapOf(),
    /**
     * Allows overriding action's version, for example to use a specific minor version, or a newer
     * version that the binding doesn't yet know about
     */
    public val _customVersion: String? = null,
) : RegularAction<GradleBuildActionV2.Outputs>("gradle", "gradle-build-action", _customVersion ?:
        "v2") {
    public constructor(
        vararg pleaseUseNamedArguments: Unit,
        gradleVersion: String? = null,
        gradleExecutable: String? = null,
        buildRootDirectory: String? = null,
        cacheDisabled: Boolean? = null,
        cacheReadOnly: Boolean? = null,
        cacheWriteOnly: Boolean? = null,
        cacheOverwriteExisting: Boolean? = null,
        gradleHomeCacheIncludes: List<String>? = null,
        gradleHomeCacheExcludes: List<String>? = null,
        arguments: String? = null,
        generateJobSummary: Boolean? = null,
        dependencyGraph: GradleBuildActionV2.DependencyGraph? = null,
        gradleHomeCacheStrictMatch: String? = null,
        workflowJobContext: String? = null,
        gradleHomeCacheCleanup: Boolean? = null,
        githubToken: String? = null,
        _customInputs: Map<String, String> = mapOf(),
        _customVersion: String? = null,
    ) : this(gradleVersion=gradleVersion, gradleExecutable=gradleExecutable,
            buildRootDirectory=buildRootDirectory, cacheDisabled=cacheDisabled,
            cacheReadOnly=cacheReadOnly, cacheWriteOnly=cacheWriteOnly,
            cacheOverwriteExisting=cacheOverwriteExisting,
            gradleHomeCacheIncludes=gradleHomeCacheIncludes,
            gradleHomeCacheExcludes=gradleHomeCacheExcludes, arguments=arguments,
            generateJobSummary=generateJobSummary, dependencyGraph=dependencyGraph,
            gradleHomeCacheStrictMatch=gradleHomeCacheStrictMatch,
            workflowJobContext=workflowJobContext, gradleHomeCacheCleanup=gradleHomeCacheCleanup,
            githubToken=githubToken, _customInputs=_customInputs, _customVersion=_customVersion)

    @Suppress("SpreadOperator")
    override fun toYamlArguments(): LinkedHashMap<String, String> = linkedMapOf(
        *listOfNotNull(
            gradleVersion?.let { "gradle-version" to it },
            gradleExecutable?.let { "gradle-executable" to it },
            buildRootDirectory?.let { "build-root-directory" to it },
            cacheDisabled?.let { "cache-disabled" to it.toString() },
            cacheReadOnly?.let { "cache-read-only" to it.toString() },
            cacheWriteOnly?.let { "cache-write-only" to it.toString() },
            cacheOverwriteExisting?.let { "cache-overwrite-existing" to it.toString() },
            gradleHomeCacheIncludes?.let { "gradle-home-cache-includes" to it.joinToString("\n") },
            gradleHomeCacheExcludes?.let { "gradle-home-cache-excludes" to it.joinToString("\n") },
            arguments?.let { "arguments" to it },
            generateJobSummary?.let { "generate-job-summary" to it.toString() },
            dependencyGraph?.let { "dependency-graph" to it.stringValue },
            gradleHomeCacheStrictMatch?.let { "gradle-home-cache-strict-match" to it },
            workflowJobContext?.let { "workflow-job-context" to it },
            gradleHomeCacheCleanup?.let { "gradle-home-cache-cleanup" to it.toString() },
            githubToken?.let { "github-token" to it },
            *_customInputs.toList().toTypedArray(),
        ).toTypedArray()
    )

    override fun buildOutputObject(stepId: String): Outputs = Outputs(stepId)

    public sealed class DependencyGraph(
        public val stringValue: String,
    ) {
        public object Disabled : GradleBuildActionV2.DependencyGraph("disabled")

        public object Generate : GradleBuildActionV2.DependencyGraph("generate")

        public object GenerateAndSubmit : GradleBuildActionV2.DependencyGraph("generate-and-submit")

        public object DownloadAndSubmit : GradleBuildActionV2.DependencyGraph("download-and-submit")

        public class Custom(
            customStringValue: String,
        ) : GradleBuildActionV2.DependencyGraph(customStringValue)
    }

    public class Outputs(
        stepId: String,
    ) : Action.Outputs(stepId) {
        /**
         * Link to the Build Scan® generated by a Gradle build. Note that this output applies to a
         * Step executing Gradle, not to the `gradle-build-action` Step itself.
         */
        public val buildScanUrl: String = "steps.$stepId.outputs.build-scan-url"

        /**
         * Path to the GitHub Dependency Graph snapshot file generated by a Gradle build. Note that
         * this output applies to a Step executing Gradle, not to the `gradle-build-action` Step
         * itself.
         */
        public val dependencyGraphFile: String = "steps.$stepId.outputs.dependency-graph-file"

        /**
         * Version of Gradle that was setup by the action
         */
        public val gradleVersion: String = "steps.$stepId.outputs.gradle-version"
    }
}
