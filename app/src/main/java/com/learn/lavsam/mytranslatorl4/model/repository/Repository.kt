package com.learn.lavsam.mytranslatorl4.model.repository

interface Repository<T> {

    suspend fun getData(word: String): T
}