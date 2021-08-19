package com.example.marleyspoontest.recipe

import androidx.lifecycle.viewModelScope
import com.example.marleyspoontest.api.ListsRepository
import com.example.marleyspoontest.api.remote.NetworkResponse
import com.example.marleyspoontest.base.BaseViewModel
import com.example.marleyspoontest.models.ParsedItem
import com.example.marleyspoontest.utils.Constants
import com.example.marleyspoontest.utils.UIEvent
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class RecipeViewModel(
    private val listsRepository: ListsRepository,
) : BaseViewModel() {


    fun getRecipe() {
        viewModelScope.launch {
            listsRepository.getRecipe().collect {
                when (it) {
                    is NetworkResponse.ApiError -> errorMessage.value = it.body.message
                    is NetworkResponse.NetworkError, is NetworkResponse.UnknownError -> errorMessage.value =
                        Constants.GENERAL_ERROR_MESSAGE
                    is NetworkResponse.Success -> {
                        val parsedItems: ArrayList<ParsedItem> = ArrayList()
                        var parsedItem: ParsedItem?

                        val pagedResponse = it.body
                        val data = pagedResponse.items

                        if (data != null) {
                            for (item in data) {
                                parsedItem = ParsedItem()

                                parsedItem?.title = item.fields?.title
                                parsedItem?.description = item.fields?.description
                                if (pagedResponse.includes?.asset != null) {
                                    for (assetItem in pagedResponse.includes?.asset!!) {
                                        if (assetItem.sys?.id == item.fields?.photo?.sys?.id) {
                                            parsedItem?.image =
                                                "https:" + assetItem.fields?.file?.url

                                            break
                                        }
                                    }
                                }
                                if (item.fields?.chef != null) {
                                    if (pagedResponse.includes?.entry != null) {
                                        for (entryItem in pagedResponse.includes?.entry!!) {
                                            if (entryItem.sys?.id == item.fields?.chef?.sys?.id) {
                                                parsedItem?.chef = entryItem.fields?.name
                                                break
                                            }
                                        }
                                    }

                                }
                                if (item.fields?.tags != null) {
                                    if (pagedResponse.includes?.entry != null) {
                                        for (entryItem in pagedResponse.includes?.entry!!) {
                                            for (tagItem in item.fields?.tags!!) {
                                                if (entryItem.sys?.id == tagItem.sys?.id) {
                                                    parsedItem?.tags?.add(entryItem.fields?.name!!)
                                                    break
                                                }

                                            }
                                        }
                                    }
                                }
                                parsedItems.add(parsedItem!!)
                            }
                        }

                        publishUIEvent(UIEvent.RenderRecipeItems(parsedItems))
                    }

                }
            }
        }
    }


}