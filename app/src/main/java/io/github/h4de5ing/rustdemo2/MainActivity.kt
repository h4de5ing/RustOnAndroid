package io.github.h4de5ing.rustdemo2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.nishtahir.androidrust.MainActivity.invokeCallbackViaJNI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        invokeCallbackViaJNI { message ->
            textView.setText(message)
        }
    }
}