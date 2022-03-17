package com.example.exam2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam2.R
import com.example.exam2.model.Cards

class CardAdapter(var cards: ArrayList<Cards>): RecyclerView.Adapter<CardAdapter.CardViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardAdapter.CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card,parent,false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val card = cards[position]
        if (holder is CardViewHolder){
            apply {
                holder.tv_card_number.setText(card.numberCard)
                holder.tv_card_name.setText(card.name)
                holder.tv_card_date.setText(card.data)
            }
        }
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    inner class CardViewHolder(view: View): RecyclerView.ViewHolder(view){

            var tv_card_number: TextView
            var tv_card_date: TextView
            var tv_card_name: TextView


        init {
            tv_card_number = view.findViewById(R.id.tv_card_number)
            tv_card_date = view.findViewById(R.id.tv_card_date)
            tv_card_name = view.findViewById(R.id.tv_card_name)
        }
    }
}