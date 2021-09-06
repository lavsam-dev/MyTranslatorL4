package com.learn.lavsam.mytranslatorl4.model.datasource

interface DataSource<T> {

    suspend fun getData(word: String): T
}
