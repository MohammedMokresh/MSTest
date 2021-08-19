package com.example.marleyspoontest.recipe

import com.example.marleyspoontest.R
import com.example.marleyspoontest.base.GenericAdapter
import com.example.marleyspoontest.databinding.ItemRecipeBinding
import com.example.marleyspoontest.models.ParsedItem
import com.example.marleyspoontest.utils.UIEvent

class RecipeAdapter(items: List<ParsedItem?>) :
    GenericAdapter<ParsedItem, ItemRecipeBinding>(layoutId = R.layout.item_recipe, items = items) {


    override fun onItemClick(item: ParsedItem) {
        super.onItemClick(item)
        publishUIEvent(UIEvent.NavigateToDetails(item))
    }
}