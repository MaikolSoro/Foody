package com.michael.foody.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.michael.foody.data.database.entities.FavoritesEntity
import com.michael.foody.databinding.FavoriteRecipesRowLayoutBinding
import com.michael.foody.ui.fragments.favorites.FavoriteRecipesFragment
import com.michael.foody.ui.fragments.favorites.FavoriteRecipesFragmentDirections
import com.michael.foody.util.RecipesDiffUtil

class FavoriteRecipesAdapter : RecyclerView.Adapter<FavoriteRecipesAdapter.MyViewHolder>() {

    private var favoritesRecipes = emptyList<FavoritesEntity>()


    class MyViewHolder(val binding: FavoriteRecipesRowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(favoritesEntity: FavoritesEntity) {
            binding.favoritesEntity = favoritesEntity
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = FavoriteRecipesRowLayoutBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentRecipe = favoritesRecipes[position]
        holder.bind(currentRecipe)

        /**
         * Single Click Listener
         */
        holder.binding.favoriteRecipesRowLayout.setOnClickListener {

            val action =
                FavoriteRecipesFragmentDirections.actionFavoriteRecipesFragmentToDetailsActivity(
                    currentRecipe.result
                )
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return favoritesRecipes.size
    }

    fun setData(newFavoritesRecipes: List<FavoritesEntity>) {

        val favoriteRecipesDiffUtil = RecipesDiffUtil(favoritesRecipes, newFavoritesRecipes)
        val diffUtilResult = DiffUtil.calculateDiff(favoriteRecipesDiffUtil)
        favoritesRecipes = newFavoritesRecipes
        diffUtilResult.dispatchUpdatesTo(this)
    }
}