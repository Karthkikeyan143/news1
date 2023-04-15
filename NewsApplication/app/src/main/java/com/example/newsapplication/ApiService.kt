package com.example.newsheadlines

interface ApiService {

    //@GET("movielist.json")
    @GET("top-headlines?country=us&category" +
            "=business&apiKey=684cb893caf7425abeffad82ac1d0f4e")
    ///@GET("search?q=chatgpt")
    suspend fun getMovies() :News

    companion object {
        var apiService: ApiService? = null
        fun getInstance() : ApiService {
            if (apiService == null) {
                apiService = Retrofit.Builder()
                    // .baseUrl("https://howtodoandroid.com/apis/")
                    .baseUrl("https://newsapi.org/v2/")
                    //.baseUrl("https://podcast-episodes.p.rapidapi.com/")

                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            }
            return apiService!!
        }
    }

}

private fun Any.create(java: Class<ApiService>): ApiService? {
    TODO("Not yet implemented")
}

private fun Any.build(): Any {
    TODO("Not yet implemented")
}

private fun Any.addConverterFactory(create: Any): Any {
    TODO("Not yet implemented")
}

annotation class GET(val value: String)

class Retrofit {
    class Builder {
        fun baseUrl(s: String): Any {
            TODO("Not yet implemented")
        }

    }

}

class GsonConverterFactory {
    companion object {
        fun create(): Any {
            TODO("Not yet implemented")
        }
    }

}
