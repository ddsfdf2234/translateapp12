package com.example.translateapp12

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

class WordsActivity : AppCompatActivity() {

    private var tts: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_words)

        val categoryName = intent.getStringExtra("category") ?: ""
        findViewById<TextView>(R.id.title).text = categoryName
        findViewById<Button>(R.id.btnBack).setOnClickListener { finish() }

        // Инициализация озвучки
        tts = TextToSpeech(this) { status ->
            if (status == TextToSpeech.SUCCESS) {
                tts?.language = Locale.UK // Британский акцент (по желанию можно US)
            }
        }

        val category = Data.categories.firstOrNull { it.name == categoryName }
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PhrasesAdapter(category?.phrases ?: emptyList()) { phrase ->
            tts?.speak(phrase.original, TextToSpeech.QUEUE_FLUSH, null, null)
        }
    }

    override fun onDestroy() {
        tts?.stop()
        tts?.shutdown()
        super.onDestroy()
    }
}

// Адаптер для фраз
class PhrasesAdapter(
    private val phrases: List<Phrase>,
    private val onSpeakClick: (Phrase) -> Unit
) : RecyclerView.Adapter<PhrasesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvOriginal: TextView = view.findViewById(R.id.tvOriginal)
        val tvTranslation: TextView = view.findViewById(R.id.tvTranslation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_word, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val phrase = phrases[position]
        holder.tvOriginal.text = phrase.original
        holder.tvTranslation.text = phrase.translation

        // Озвучка при клике на карточку
        holder.itemView.setOnClickListener { onSpeakClick(phrase) }
    }

    override fun getItemCount() = phrases.size
}