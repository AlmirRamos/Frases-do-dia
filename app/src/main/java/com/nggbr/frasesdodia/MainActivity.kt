package com.nggbr.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nggbr.frasesdodia.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnAtualizar.setOnClickListener {
            gerarFrasesAleatorias()
        }

    }

    fun gerarFrasesAleatorias() {

        var frases = arrayOf(
            "Frase01",
            "Frase02",
            "Frase03",
            "Frase04",
            "Frase05"
        )

        val numeroAleatorio = Random.nextInt(5)

        binding.txtFrases.text = "${frases[numeroAleatorio]}"
    }
}