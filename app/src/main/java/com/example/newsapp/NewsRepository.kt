package com.example.newsapp

object NewsRepository {
    fun getSampleNews(): List<NewsArticle> {
        return listOf(
            NewsArticle(
                id = 1,
                title = "Breaking: Technology Advances in AI",
                description = "New developments in artificial intelligence are transforming various industries with improved machine learning algorithms.",
                source = "Tech News",
                publishedAt = "2024-01-28",
                url = "https://example.com/news/1"
            ),
            NewsArticle(
                id = 2,
                title = "Global Climate Summit Concludes",
                description = "World leaders gather to discuss sustainable solutions and climate change mitigation strategies for the future.",
                source = "World News",
                publishedAt = "2024-01-27",
                url = "https://example.com/news/2"
            ),
            NewsArticle(
                id = 3,
                title = "Stock Markets Reach New Highs",
                description = "Major stock indices show positive growth as investors remain optimistic about economic recovery.",
                source = "Business News",
                publishedAt = "2024-01-26",
                url = "https://example.com/news/3"
            ),
            NewsArticle(
                id = 4,
                title = "Space Exploration Makes History",
                description = "New space mission successfully launches, marking a significant milestone in human space exploration.",
                source = "Science News",
                publishedAt = "2024-01-25",
                url = "https://example.com/news/4"
            ),
            NewsArticle(
                id = 5,
                title = "Health Research Breakthrough",
                description = "Scientists announce a major breakthrough in medical research that could revolutionize treatment options.",
                source = "Health News",
                publishedAt = "2024-01-24",
                url = "https://example.com/news/5"
            )
        )
    }
}
