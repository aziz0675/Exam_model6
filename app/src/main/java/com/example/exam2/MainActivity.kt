package com.example.exam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.exam2.model.Cards
import com.example.exam2.model.RetrofitHttp
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var tv_cardNumber: TextView
    lateinit var iv_ad: ImageView
    lateinit var user_name: TextView
    lateinit var date: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        iv_ad = findViewById(R.id.add_cards)
        iv_ad.setOnClickListener { openDetailActivity() }
    }

    private fun getCards(){
        RetrofitHttp.userService.getAllCards().enqueue(object : Callback<ArrayList<Cards>>{
            override fun onFailure(call: Call<ArrayList<Cards>>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(
                call: Call<ArrayList<Cards>>,
                response: Response<ArrayList<Cards>>
            ) {
                TODO("Not yet implemented")
            }
        })
    }

    fun openDetailActivity(){
        val intent: Intent = Intent(this,DetailActivity::class.java)
        startActivity(intent)
    }
}