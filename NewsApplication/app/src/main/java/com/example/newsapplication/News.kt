package com.example.newsheadlines

import com.example.example.Articles


data class News (
    @SerializedName("status") var status:String?= null,
    @SerializedName("totalResults") var totalResults : Int?                = null,
    @SerializedName("articles") var articles     : ArrayList<Articles> = arrayListOf()
) {
    annotation class SerializedName(val value: String)
}
