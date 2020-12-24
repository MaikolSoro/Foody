package com.michael.foody.data

import com.michael.foody.data.database.RecipesDao
import com.michael.foody.data.database.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDao: RecipesDao
){

     fun  readDataBase() : Flow<List<RecipesEntity>> {
        return recipesDao.readRecipes()
    }
    suspend fun insertRecipes(recipesEntity: RecipesEntity){
        recipesDao.insertRecipes(recipesEntity)
    }
}