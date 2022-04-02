package org.d3if3118.assesmentt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @SuppressLint("WrongViewCast")
    fun tambah(view: View){
        val angkaPertama = findViewById<EditText>(R.id.edsatu).text.toString()
        val angkaKedua = findViewById<EditText>(R.id.eddua).text.toString()
        val hasil = findViewById<EditText>(R.id.tv_hasil)

        val jumlah = angkaPertama.toDouble() + angkaKedua.toDouble()
        jumlah.toString()
    }
    @SuppressLint("WrongViewCast")
    fun kali(view: View){
        val angkaPertama = findViewById<EditText>(R.id.edsatu)
        val angkaKedua = findViewById<EditText>(R.id.eddua)
        val hasil = findViewById<EditText>(R.id.tv_hasil)

        val jumlah = angkaPertama.text.toString().toDouble() * angkaKedua.text.toString().toDouble()
        jumlah.toString()
    }
    @SuppressLint("WrongViewCast")
    fun bagi(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.edsatu)
        val angkaKedua = findViewById<EditText>(R.id.eddua)
        val hasil = findViewById<EditText>(R.id.tv_hasil)

        val jumlah = angkaPertama.text.toString().toDouble() / angkaKedua.text.toString().toDouble()
        jumlah.toString()

    }
    @SuppressLint("WrongViewCast")
    fun modulus(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.edsatu)
        val angkaKedua = findViewById<EditText>(R.id.eddua)
        val hasil = findViewById<EditText>(R.id.tv_hasil)
        val jumlah = angkaPertama.text.toString().toDouble() % angkaKedua.text.toString().toDouble()
        jumlah.toString()
    }
    @SuppressLint("WrongViewCast")
    fun kurang(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.edsatu)
        val angkaKedua = findViewById<EditText>(R.id.eddua)
        val hasil = findViewById<EditText>(R.id.tv_hasil)

        val jumlah = angkaPertama.text.toString().toDouble() - angkaKedua.text.toString().toDouble()
        jumlah.toString()
    }
}
