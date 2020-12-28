package com.michael.foody.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.michael.foody.util.Constants.Companion.API_KEY
import com.michael.foody.util.Constants.Companion.DEFAULT_DIET_TYPE
import com.michael.foody.util.Constants.Companion.DEFAULT_MEAL_TYPE
import com.michael.foody.util.Constants.Companion.DEFAULT_RECIPES_NUMBER
import com.michael.foody.util.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import com.michael.foody.util.Constants.Companion.QUERY_API_KEY
import com.michael.foody.util.Constants.Companion.QUERY_DIET
import com.michael.foody.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.michael.foody.util.Constants.Companion.QUERY_NUMBER
import com.michael.foody.util.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {
     fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = DEFAULT_RECIPES_NUMBER
        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_TYPE] = DEFAULT_MEAL_TYPE
        queries[QUERY_DIET] = DEFAULT_DIET_TYPE
        queries[QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries

    }
}