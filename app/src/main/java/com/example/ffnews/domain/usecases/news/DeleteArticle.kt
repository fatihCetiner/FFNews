package com.example.ffnews.domain.usecases.news

import com.example.ffnews.data.local.NewsDao
import com.example.ffnews.domain.model.Article
import com.example.ffnews.domain.repository.NewsRepository

class DeleteArticle (
    private val newsRepository: NewsRepository
) {
    suspend operator fun invoke(article: Article) {
        newsRepository.deleteArticle(article)
    }
}