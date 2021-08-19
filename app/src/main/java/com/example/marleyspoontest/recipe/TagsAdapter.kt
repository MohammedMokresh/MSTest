package com.example.marleyspoontest.recipe

import com.example.marleyspoontest.R
import com.example.marleyspoontest.base.GenericAdapter
import com.example.marleyspoontest.databinding.ItemTagBinding

class TagsAdapter(items: List<String?>) :
    GenericAdapter<String, ItemTagBinding>(layoutId = R.layout.item_tag, items = items)