package com.michael.foody.data

import com.michael.foody.data.network.FoodRecipesApi
import com.michael.foody.models.FoodJoke
import com.michael.foody.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipes(searchQuery: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.searchRecipes(searchQuery)
    }

    suspend fun getFoodJoke(apikey: String): Response<FoodJoke> {
        return foodRecipesApi.getFoodJoke(apikey)
    }
}