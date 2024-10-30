package com.example.ffnews.presentation.details

import com.example.ffnews.domain.model.Article

sealed class DetailsEvent{
    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()
    data object RemoveSideEffect: DetailsEvent()
}