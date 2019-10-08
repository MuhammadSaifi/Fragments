package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
            loadf1(FragmentOne())
        }
        btn2.setOnClickListener {
            loadf2(Fragment_two())
        }

    }
    private fun loadf1(frag1: FragmentOne){
        val ft=supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag1)
        ft.commit()
    }
    fun loadf2(frag2:Fragment_two){
        val f=supportFragmentManager.beginTransaction()
        f.replace(R.id.fragment,frag2)
        f.commit()
    }

}
