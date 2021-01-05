package com.michael.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.michael.foody.util.Constants.Companion.FAVORITE_RECIPES_TABLE
import com.michael.foody.models.Result

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)
