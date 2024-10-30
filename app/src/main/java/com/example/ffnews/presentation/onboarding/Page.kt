package com.example.ffnews.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.ffnews.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Stay Updated with the Latest News",
        description = "Never miss out on global events! Get the latest news instantly with our app.",
        image = R.drawable.first_onboarding
    ),
    Page(
        title = "Personalized Content & Search",
        description = "Discover content based on your interests or quickly find any news with our powerful search feature",
        image = R.drawable.second_onboarding
    ),
    Page(
        title = "Save Your Favorite News",
        description = "Save articles of interest and revisit them anytime to stay informed.",
        image = R.drawable.onboarding_last
    )
)