package com.example.ffnews.presentation.details

sealed class DetailsEvent{
    data object SaveArticle : DetailsEvent()
}