package com.example.ffnews.domain.usecases.news

import androidx.paging.PagingData
import com.example.ffnews.domain.model.Article
import com.example.ffnews.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SearchNews(
    private val newsRepository: NewsRepository
) {

    operator fun invoke(searchQuery: String,sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.searchNews(searchQuery = searchQuery,sources = sources)
    }
}