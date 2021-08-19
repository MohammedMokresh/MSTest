package com.example.marleyspoontest.recipe

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.marleyspoontest.R
import com.example.marleyspoontest.base.BaseFragment
import com.example.marleyspoontest.databinding.FragmentRecipeBinding
import com.example.marleyspoontest.utils.UIEvent

class RecipeFragment : BaseFragment<FragmentRecipeBinding, RecipeViewModel>
    (R.layout.fragment_recipe, RecipeViewModel::class) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getRecipe()
    }


    override fun onUIEventTriggered(event: UIEvent) {
        when (event) {
            is UIEvent.RenderRecipeItems -> {
                binding.rvRecipe.adapter = RecipeAdapter(event.recipeData)

            }

            is UIEvent.NavigateToDetails -> {
                val directions =
                    event.data.let {
                        RecipeFragmentDirections.actionRecipeFragmentToRecipeDetailsFragment(it)
                    }
                directions.let { findNavController().navigate(it) }

            }
        }
    }


}