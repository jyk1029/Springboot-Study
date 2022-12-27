package com.example.dise_v2.global.security.auth

import com.example.dise_v2.domain.user.facade.UserFacade
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class AuthDetailsService(
    private val userFacade: UserFacade
) : UserDetailsService {
    override fun loadUserByUsername(accountId: String?): UserDetails {
        val user = userFacade.getUserCurrentUser(accountId)
        return AuthDetails(user = user)
    }
}