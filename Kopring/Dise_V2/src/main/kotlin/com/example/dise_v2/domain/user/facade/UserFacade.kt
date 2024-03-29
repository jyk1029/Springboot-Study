package com.example.dise_v2.domain.user.facade

import com.example.dise_v2.domain.user.domain.User
import com.example.dise_v2.domain.user.domain.repository.UserRepository
import com.example.dise_v2.domain.user.exception.UserNotFoundException
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component

@Component
class UserFacade(
    private val userRepository: UserRepository
) {
    fun getCurrentUser(): User {
        val accountId: String = SecurityContextHolder.getContext().authentication.name

        return getByAccountId(accountId)
    }

    fun checkUserExist(accountId: String): Boolean {
        return userRepository.existsByAccountId(accountId)
    }

    fun getByAccountId(accountId: String): User {
        return userRepository.findByAccountId(accountId) ?: throw UserNotFoundException.EXCEPTION
    }

    fun getUserId(): Long? {
        return getCurrentUser().id
    }
}