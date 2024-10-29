package com.example.ffnews.presentation.bookmark

import com.example.ffnews.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList(),
)