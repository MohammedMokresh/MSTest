package com.example.marleyspoontest.utils

import com.example.marleyspoontest.models.ParsedItem


abstract class UIEvent {

    data class RenderRecipeItems(val recipeData: ArrayList<ParsedItem>) : UIEvent()

    data class NavigateToDetails(val data: ParsedItem) : UIEvent()


}