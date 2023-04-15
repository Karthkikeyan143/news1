package com.example.example

import com.example.newsheadlines.News


data class Source (

    @News.SerializedName("id"   ) var id   : String? = null,
    @News.SerializedName("name" ) var name : String? = null

)
