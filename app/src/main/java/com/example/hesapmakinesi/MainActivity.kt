package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var sayi: Int = 0
    var toplanacakSayi: Int = 0
    var basilanSayi: Int = 0
    var sayiBasamak = 0

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.esittirButton.setOnClickListener {
            println("Basıldı 0")
            toplanacakSayi += sayi
            sayi = 0
            sayiBasamak = 0
            binding.textView.text = toplanacakSayi.toString()
        }

        binding.artiButton.setOnClickListener {
            println("Basıldı 0")

            if (sayiBasamak == 0){

            }else{
                toplanacakSayi += sayi
                binding.textView.text = sayi.toString()
                sayi = 0
                sayiBasamak = 0

            }



        }

        binding.silButton.setOnClickListener {
            sayi = 0
            basilanSayi = 0
            sayiBasamak = 0
            toplanacakSayi = 0
            binding.textView.text = sayi.toString()
        }


        binding.button0.setOnClickListener {
            println("Basıldı 0")
            basilanSayi = 0
            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1

        }

        binding.button1.setOnClickListener {
            println("Basıldı 0")
            basilanSayi = 1
            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1


        }
        binding.button2.setOnClickListener {
            println("Basıldı 0")
            basilanSayi = 2
            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1


        }
        binding.button3.setOnClickListener {
            println("Basıldı 0")
            basilanSayi = 3
            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1


        }
        binding.button4.setOnClickListener {
            println("Basıldı 0")
            basilanSayi = 4
            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1


        }
        binding.button5.setOnClickListener {
            println("Basıldı 0")
            basilanSayi = 5
            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1


        }
        binding.button6.setOnClickListener {
            println("Basıldı 0")
            basilanSayi = 6
            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1


        }
        binding.button7.setOnClickListener {
            println("Basıldı 0")
            basilanSayi = 7


            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1


        }
        binding.button8.setOnClickListener {
            println("Basıldı 0")


            basilanSayi = 8



            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1


        }
        binding.button9.setOnClickListener {
            println("Basıldı 0")
            basilanSayi = 9
            if (sayiBasamak == 0){
                sayi += basilanSayi
            }else{
                sayi *= 10
                sayi += basilanSayi
            }



            binding.textView.text = sayi.toString()

            sayiBasamak += 1


        }









    }









}