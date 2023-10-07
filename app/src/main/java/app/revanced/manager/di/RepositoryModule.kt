package app.revanced.manager.di

import app.revanced.manager.data.platform.Filesystem
import app.revanced.manager.data.platform.NetworkInfo
import app.revanced.manager.domain.repository.*
import app.revanced.manager.domain.worker.WorkerRepository
import app.revanced.manager.network.api.ReVancedAPI
import org.koin.core.module.dsl.createdAtStart
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::ReVancedAPI)
    singleOf(::Filesystem) {
        createdAtStart()
    }
    singleOf(::NetworkInfo)
    singleOf(::PatchBundlePersistenceRepository)
    singleOf(::PatchSelectionRepository)
    singleOf(::PatchBundleRepository)
    singleOf(::WorkerRepository)
    singleOf(::DownloadedAppRepository)
    singleOf(::InstalledAppRepository)
}