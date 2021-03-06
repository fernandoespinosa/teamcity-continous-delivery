package Tests_Integration.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*

object Tests_Integration_Issuance_Account_Finance_2 : BuildType({
    name = "Issuance SOR ↭ Account SOR ↭ Finance SOR (Batch 2)"

    vcs {
        showDependenciesChanges = true
    }

    dependencies {
        snapshot(Deployment_Integration.buildTypes.Deployment_Integration_Consumers_Finance) {
        }
        snapshot(Deployment_Integration.buildTypes.Deployment_Integration_Producers_Account) {
        }
        snapshot(Deployment_Integration.buildTypes.Deployment_Integration_Producers_Issuance) {
        }
    }
})
