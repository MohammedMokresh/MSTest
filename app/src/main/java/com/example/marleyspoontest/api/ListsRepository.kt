package com.example.marleyspoontest.api

import com.example.marleyspoontest.BuildConfig
import com.example.marleyspoontest.api.remote.NetworkResponse
import com.example.marleyspoontest.base.model.ErrorBody
import com.example.marleyspoontest.models.RecipeResponseBody
import com.example.marleyspoontest.utils.Constants
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class ListsRepository(
    private val service: ApiServices,
) {

    suspend fun getRecipe(): Flow<NetworkResponse<RecipeResponseBody, ErrorBody>> {
        return flow {
            emit(
                service.getRecipe(
                    BuildConfig.SPACE_ID,
                    BuildConfig.ACCESS_TOKEN,
                    Constants.RECIPE,
                    Constants.FIELDS
                )
            )
        }.flowOn(Dispatchers.IO)
    }

}
