package com.michael.foody.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.michael.foody.models.FoodRecipe
import com.michael.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe

) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}