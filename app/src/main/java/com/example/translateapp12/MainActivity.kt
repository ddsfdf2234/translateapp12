package com.example.translateapp12

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CategoriesAdapter(Data.categories) { category ->
            val intent = Intent(this, WordsActivity::class.java)
            intent.putExtra("category", category.name)
            startActivity(intent)
        }
    }
}

// Адаптер для списка категорий
class CategoriesAdapter(
    private val categories: List<Category>,
    private val onClick: (Category) -> Unit
) : RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(android.R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Используем встроенную в Android разметку simple_list_item_1 (обычный текст)
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false)

        // Делаем кнопки красивыми (как карточки)
        view.setBackgroundResource(R.drawable.bg_card)
        val lp = view.layoutParams as ViewGroup.MarginLayoutParams
        lp.setMargins(0, 0, 0, 24)
        view.layoutParams = lp
        view.setPadding(40, 40, 40, 40)

        val tv = view.findViewById<TextView>(android.R.id.text1)
        tv.setTextColor(Color.parseColor("#012169")) // Темно-синий цвет текста
        tv.textSize = 18f
        tv.setTypeface(null, android.graphics.Typeface.BOLD)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = categories[position]
        holder.textView.text = category.name
        holder.itemView.setOnClickListener { onClick(category) }
    }

    override fun getItemCount() = categories.size
}