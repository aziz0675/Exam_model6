package com.example.exam2.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam2.R
import com.example.exam2.model.Cards
import org.w3c.dom.Text
import java.util.concurrent.TimeoutException

class CardAdapter(var context: Context, var cards: ArrayList<Cards>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card,parent,false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val card = cards[position]
        if (holder is CardViewHolder){
            apply {

            }
        }
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    class CardViewHolder(view: View): RecyclerView.ViewHolder(view){
        var card_number: EditText
        var card_name: EditText
        var card_day: EditText
        var card_month: EditText
        var card_cvv: EditText


        init {
            card_number = view.findViewById(R.id.tv_cardNumber)
            card_name = view.findViewById(R.id.userName)
            card_day = view.findViewById(R.id.et_card_day)
            card_month = view.findViewById(R.id.et_card_month)
            card_cvv = view.findViewById(R.id.et_card_cvv)
        }
    }
}