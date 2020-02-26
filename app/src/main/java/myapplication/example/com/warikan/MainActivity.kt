package myapplication.example.com.warikan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{

            val linearLayout = findViewById<LinearLayout>(R.id.MainLinearLayout)
            linearLayout.gravity = Gravity.CENTER   // 画面中央寄せ

            val text = TextView(this)
            text.text = "ここにテキスト"
            text.gravity = Gravity.CENTER
            text.textSize = 35F

            linearLayout.addView(text)
        }



    }
}
