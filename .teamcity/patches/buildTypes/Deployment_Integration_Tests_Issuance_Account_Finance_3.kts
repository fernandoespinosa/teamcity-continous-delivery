package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_1.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'Deployment_Integration_Tests_Issuance_Account_Finance_3'
in the project with id = 'Tests_Integration', and delete the patch script.
*/
create(RelativeId("Tests_Integration"), BuildType({
    id("Deployment_Integration_Tests_Issuance_Account_Finance_3")
    name = "Issuance SOR ↭ Account SOR ↭ Finance SOR (Batch 3)"

    vcs {
        showDependenciesChanges = true
    }

    dependencies {
        snapshot(RelativeId("Deployment_Integration_Consumers_Finance")) {
        }
        snapshot(RelativeId("Deployment_Integration_Producers_Account")) {
        }
        snapshot(RelativeId("Deployment_Integration_Producers_Issuance")) {
        }
    }
}))

