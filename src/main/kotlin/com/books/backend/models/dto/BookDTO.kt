package com.books.backend.models.dto

data class BookDTO(
    val id: Long? = null,
    val name: String? = null,
    val pageCount: Int? = null,
    val authorId: Int? = null,
    )
