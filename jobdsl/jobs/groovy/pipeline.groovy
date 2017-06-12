import job_lib.JobBuilder

import javaposse.jobdsl.dsl.DslFactory

new JobBuilder(this as DslFactory, "jenkins_as_a_code-pipeline", "pipeline")
    .addLogRotator()
    .addScmPollTrigger("@midnight")
    .addPipelineDefinitionFile("jobdsl/jobs/resources/pipelines/jenkinsdeploy.groovy")
    .build()
