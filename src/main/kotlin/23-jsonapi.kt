import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call
import retrofit2.http.GET


const val URL = "https://api.github.com/users/Omaro-IB/repos/"


interface ApiService {
    @GET("/")
    fun get(): Call<Any>
}


fun main () {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val service = retrofit.create(ApiService::class.java)
    val data = service.get().execute().body()

    println(data)
}