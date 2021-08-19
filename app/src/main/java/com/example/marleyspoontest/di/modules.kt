package com.example.marleyspoontest.di


import com.example.marleyspoontest.api.ApiServices
import com.example.marleyspoontest.api.ListsRepository
import com.example.marleyspoontest.recipe.RecipeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val repositoryModule by lazy {
    module {
        single { ListsRepository(get()) }
    }
}

val viewModelModule by lazy {
    module {
        viewModel { RecipeViewModel(get()) }
    }
}


val serviceModule by lazy {
    module {
        single {
            ApiServices.create(get())
        }
    }

}
