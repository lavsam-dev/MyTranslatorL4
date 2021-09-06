package com.learn.lavsam.mytranslatorl4.model.data

import com.google.gson.annotations.SerializedName

class DataModel(
    @field:SerializedName("text") val text: String?,
    @field:SerializedName("meanings") val meanings: List<Meanings>?
)