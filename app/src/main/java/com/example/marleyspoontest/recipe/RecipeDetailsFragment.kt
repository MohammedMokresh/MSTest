package com.example.marleyspoontest.recipe

import android.os.Bundle
import android.view.View
import com.example.marleyspoontest.R
import com.example.marleyspoontest.base.BaseFragment
import com.example.marleyspoontest.databinding.FragmentRecipeBinding
import com.example.marleyspoontest.databinding.FragmentRecipeDetailsBinding
import com.example.marleyspoontest.models.ParsedItem
import com.example.marleyspoontest.utils.UIEvent


class RecipeDetailsFragment : BaseFragment<FragmentRecipeDetailsBinding, RecipeViewModel>
    (R.layout.fragment_recipe_details, RecipeViewModel::class) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments != null) {
            val item: ParsedItem =
                RecipeDetailsFragmentArgs.fromBundle(requireArguments()).recipeItem
            binding.item = item
            binding.tagsRecyclerView.adapter = item?.tags?.let { TagsAdapter(it) }
        }


    }


    override fun onUIEventTriggered(event: UIEvent) {
    }


}