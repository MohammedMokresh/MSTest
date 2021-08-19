package com.example.marleyspoontest.api


import android.content.Context
import com.example.marleyspoontest.BuildConfig
import com.example.marleyspoontest.api.remote.NetworkResponse
import com.example.marleyspoontest.api.remote.NetworkResponseAdapterFactory
import com.example.marleyspoontest.base.model.ErrorBody
import com.example.marleyspoontest.models.RecipeResponseBody
import com.example.marleyspoontest.utils.NetworkConnectionInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

interface ApiServices {

    @GET("spaces/{space_id}/environments/master/entries")
    suspend fun getRecipe(
        @Path("space_id") spaceId: String,
        @Query("access_token") accessToken: String,
        @Query("content_type") contentType: String,
        @Query("select") select: String
    ): NetworkResponse<RecipeResponseBody, ErrorBody>


    companion object {

        fun create(context: Context): ApiServices {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            val okHttpClient = OkHttpClient.Builder()
            okHttpClient.connectTimeout(40, TimeUnit.SECONDS).readTimeout(40, TimeUnit.SECONDS)
                .writeTimeout(40, TimeUnit.SECONDS)
            okHttpClient.addInterceptor(logging)
            okHttpClient.addInterceptor(NetworkConnectionInterceptor(context))


            return Retrofit.Builder().baseUrl(BuildConfig.BASE_URL).client(okHttpClient.build())
                .addCallAdapterFactory(NetworkResponseAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiServices::class.java)
        }
    }

}