package com.example.practice

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })
        // 위의 버튼에 람다식 사용하기 위한 조건
        // 1. Kotlin interface가 아닌 자바 인터페이스여야 함
        // 2. 그 인터페이스는 딱 하나의 테스트만 가져야 함
        button.setOnClickListener {

        }
    }
}