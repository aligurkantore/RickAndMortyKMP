package com.example.composemphelloworld.domain.model

sealed class BaseResult<out T: Any>{
    data class Success<out T:Any>(val data: T): BaseResult<T>()
    data class Error(val exception: Exception): BaseResult<Nothing>()
}