package com.example.dise_v2.domain.feed.domain.repository

import com.example.dise_v2.domain.feed.domain.Feed
import com.example.dise_v2.domain.feed.domain.type.Category
import com.example.dise_v2.domain.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FeedRepository : JpaRepository<Feed, Long> {
    fun findAllByOrderByIdDesc(): List<Feed>
    fun findByCategoryOrderByCreatedAtDesc(category: Category): List<Feed>
    fun findAllByUserOrderByCreatedAtDesc(user: User): List<Feed>
    fun findByTitleContainingOrderByCreatedAtDesc(keyword: String): List<Feed>
}