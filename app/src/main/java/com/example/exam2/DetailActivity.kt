package com.example.exam2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.exam2.helper.Logger
import com.example.exam2.model.Cards
import com.example.exam2.networking.ApiClient
import retrofit2.Call
import retrofit2.Callback

class DetailActivity : AppCompatActivity() {

    lateinit var cancel: ImageView
    lateinit var et_card_number: EditText
    lateinit var et_card_month: EditText
    lateinit var et_card_day: EditText
    lateinit var et_card_svv: EditText
    lateinit var et_card_name: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }

    fun findId(){
        cancel = findViewById(R.id.iv_cancel)
        et_card_number = findViewById(R.id.et_card_number)
        et_card_name = findViewById(R.id.et_card_name)
        et_card_month = findViewById(R.id.et_card_month)
        et_card_day = findViewById(R.id.et_card_day)
        et_card_svv = findViewById(R.id.et_card_cvv)

        var number = et_card_number.text.toString()
        var name = et_card_name.text.toString()
        var date: String = et_card_month.text.toString() + "/"  + et_card_day.text.toString()

        if (number.length == 16 && et_card_svv.text.toString().length == 4 && date.length == 5){
            val card = Cards(et_card_svv.text.toString(),date,name)
            Toast.makeText(this,"Successfully added",Toast.LENGTH_SHORT).show()

        }

    }
    fun initViews(){

        cancel.setOnClickListener { finish() }

        findId()


    }


}