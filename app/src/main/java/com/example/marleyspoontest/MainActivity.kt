package com.example.marleyspoontest

import com.example.marleyspoontest.base.BaseActivity
import com.example.marleyspoontest.databinding.ActivityMainBinding
import com.example.marleyspoontest.recipe.RecipeViewModel


class MainActivity : BaseActivity<ActivityMainBinding,
        RecipeViewModel>(R.layout.activity_main, RecipeViewModel::class)
