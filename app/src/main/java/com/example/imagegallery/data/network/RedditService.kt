package com.example.imagegallery.data.network

import com.example.imagegallery.data.model.RedditResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Used to connect to the Reddit API to fetch posts.
 */
interface RedditService {
   // const val photos="photos"
    @GET("r/photos")
    suspend fun getTopPosts(
        @Path("r/photos") subreddit: String
        ): RedditResponse
}
