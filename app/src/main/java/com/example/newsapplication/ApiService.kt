
    package com.example.newsheadlines

    import retrofit2.Retrofit
    import retrofit2.http.GET

    interface ApiService {

        //@GET("movielist.json")
        @GET("top-headlines?country=us&category=business&apiKey=684cb893caf7425abeffad82ac1d0f4e")
        ///@GET("search?q=chatgpt")
        suspend fun <News> getMovies(): News

        companion object : ApiService {
            var apiService: ApiService? = null
            fun getInstance(): ApiService {
                if (apiService == null) {
                    apiService = Retrofit.Builder()
                        // .baseUrl("https://howtodoandroid.com/apis/")
                        .baseUrl("https://newsapi.org/v2/")
                        //.baseUrl("https://podcast-episodes.p.rapidapi.com/")

                        .addConverterFactory(GsonConvertorFactory.create())
                        .build().create(ApiService::class.java)
                }
                return ApiService!!
            }

            override suspend fun <News> getMovies(): News {
                TODO("Not yet implemented")
            }
        }
    }

    private fun Retrofit.Builder.addConverterFactory(create: Unit): Retrofit.Builder {

    }

    class GsonConvertorFactory {
        companion object {
            fun create() {

            }
        }

    }
