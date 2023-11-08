package com.example.checkbok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun mostrarResultado(view: View){
        var superNintendo: CheckBox = findViewById(R.id.check_super_nintendo)
        var megaDriver: CheckBox = findViewById(R.id.check_mega_drive)
        var nintendo64: CheckBox = findViewById(R.id.check_nintendo64)
        var masterSystem: CheckBox = findViewById(R.id.check_master_system)
        var atari: CheckBox = findViewById(R.id.check_atari)
        var dreamcast: CheckBox = findViewById(R.id.check_dreamcast)
        var psOne: CheckBox = findViewById(R.id.check_ps_one)


        var resultado : TextView = findViewById(R.id.resultado)

        var videoGames: ArrayList<String> = arrayListOf()
        var contador = 0

        if (superNintendo.isChecked){
            contador++
            videoGames.add("Super Nintendo")
        }else{
            contador--
            videoGames.remove("Super Nintendo")
        }

        if (megaDriver.isChecked){
            contador++
            videoGames.add("Mega Drive")
        }else{
            contador--
            videoGames.remove("Mega Drive")
        }

        if (nintendo64.isChecked){
            contador++
            videoGames.add("Nintendo 64")
        }else{
            contador--
            videoGames.remove("Nintendo 64 ")
        }

        if (masterSystem.isChecked){
            contador++
            videoGames.add("Master System")
        }else{
            contador--
            videoGames.remove("Master System")
        }

        if (atari.isChecked){
            contador++
            videoGames.add("Atari")
        }else{
            contador--
            videoGames.remove("Atari")
        }

        if (dreamcast.isChecked){
            contador++
            videoGames.add("Dreamcast")
        }else{
            contador--
            videoGames.remove("Dreamcast")
        }

        if (psOne.isChecked){
            contador++
            videoGames.add("Ps One")
        }else{
            contador--
            videoGames.remove("Ps One ")
        }

        if (contador >= 3) {
        resultado.text = "Parabéns! Você já jogou muitos jogos antigos"
        }else {
            resultado.text = "Uma pena! Você deveria aproveitar os clássicos"
        }
    //    resultado.text = videoGames.toString()



    }
}