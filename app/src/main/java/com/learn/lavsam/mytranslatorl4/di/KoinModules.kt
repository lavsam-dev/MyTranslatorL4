package com.learn.lavsam.mytranslatorl4.di

import com.learn.lavsam.mytranslatorl4.model.data.DataModel
import com.learn.lavsam.mytranslatorl4.model.datasource.RetrofitImplementation
import com.learn.lavsam.mytranslatorl4.model.datasource.RoomDataBaseImplementation
import com.learn.lavsam.mytranslatorl4.model.repository.Repository
import com.learn.lavsam.mytranslatorl4.model.repository.RepositoryImplementation
import com.learn.lavsam.mytranslatorl4.view.main.MainInteractor
import com.learn.lavsam.mytranslatorl4.view.main.MainViewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val application = module {
    single<Repository<List<DataModel>>>(named(NAME_REMOTE)) {
        RepositoryImplementation(
            RetrofitImplementation()
        )
    }
    single<Repository<List<DataModel>>>(named(NAME_LOCAL)) {
        RepositoryImplementation(
            RoomDataBaseImplementation()
        )
    }
}

val mainScreen = module {
    factory { MainInteractor(get(named(NAME_REMOTE)), get(named(NAME_LOCAL))) }
    factory { MainViewModel(get()) }
}