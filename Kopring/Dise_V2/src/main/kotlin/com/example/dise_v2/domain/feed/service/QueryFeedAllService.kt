package com.example.dise_v2.domain.feed.service

import com.example.dise_v2.domain.feed.controller.dto.response.FeedElement
import com.example.dise_v2.domain.feed.controller.dto.response.FeedListResponse
import com.example.dise_v2.domain.feed.domain.Feed
import com.example.dise_v2.domain.feed.domain.repository.FeedRepository
import com.example.dise_v2.domain.feed.facade.FeedFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class QueryFeedAllService(
    private val feedRepository: FeedRepository,
    private val feedFacade: FeedFacade
) {
    @Transactional(readOnly = true)
    fun execute(): FeedListResponse {
        val feedList: List<Feed> = feedRepository.queryFeedList()

        return FeedListResponse(
            feedRepository.queryFeedList().map {
                FeedElement(
                    feedId = it.id,
                    title = it.title,
                    content = it.content,
                    name = it.userName(),
                    createdAt = it.createdAt
                )
            }
        )
    }
}