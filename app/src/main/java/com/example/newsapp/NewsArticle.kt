package com.example.newsapp

data class NewsArticle(
    val id: Int,
    val title: String,
    val description: String,
    val source: String,
    val publishedAt: String,
    val url: String
)
