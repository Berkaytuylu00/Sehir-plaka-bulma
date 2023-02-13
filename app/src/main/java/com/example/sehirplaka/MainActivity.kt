package com.example.sehirplaka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sehirplaka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener(){
            if (binding.editTextNumber.text.isNotEmpty()){
            var plakaKodu = binding.editTextNumber.text.toString().toInt()
                when(plakaKodu){
                    35 -> binding.textView.text="İzmir"
                    45 -> binding.textView.text="Manisa"
                    34 -> binding.textView.text="İstanbul"
                    3 -> binding.textView.text="Afyon"
                    9 -> binding.textView.text="Aydın"
                    57 -> binding.textView.text="Sinop"
                    else -> {
                        binding.textView.text="Bulunmadı"
                    }
                }
            }else{
                binding.textView.text = "Şehir plaka kodunu giriniz!!"
            }
            binding.editTextNumber.text.clear()
        }

    }
}

