package com.example.ffnews.domain.usecases.news

import com.example.ffnews.data.local.NewsDao
import com.example.ffnews.domain.model.Article
import kotlinx.coroutines.flow.Flow

class SelectArticles (
    private val newsDao: NewsDao
) {
     operator fun invoke(): Flow<List<Article>> {
        return newsDao.getArticles
    }
}