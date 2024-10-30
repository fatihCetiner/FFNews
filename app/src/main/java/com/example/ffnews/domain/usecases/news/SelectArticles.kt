package com.example.ffnews.domain.usecases.news

import com.example.ffnews.data.local.NewsDao
import com.example.ffnews.domain.model.Article
import com.example.ffnews.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SelectArticles (
    private val newsRepository: NewsRepository
) {
     operator fun invoke(): Flow<List<Article>> {
        return newsRepository.selectArticles()
    }
}