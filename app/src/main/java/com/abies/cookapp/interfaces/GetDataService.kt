package com.abies.cookapp.interfaces

import com.abies.cookapp.entities.Category
import com.abies.cookapp.entities.CategoryItems
import com.abies.cookapp.entities.Meal
import com.abies.cookapp.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>
}