package com.example.example

import com.example.newsheadlines.News


data class Articles (

    @News.SerializedName("title"       ) var title       : String? = null,
    @News.SerializedName("description" ) var description : String? = null,
    @News.SerializedName("urlToImage"  ) var urlToImage  : String? = null,

    )
