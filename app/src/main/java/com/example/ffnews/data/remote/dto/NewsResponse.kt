package com.example.ffnews.data.remote.dto

import com.example.ffnews.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
