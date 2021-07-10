package org.utarid.handleaction

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import org.utarid.handleaction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding!!.root
        setContentView(view)

        when (intent?.action) {
            Intent.ACTION_SEND -> {
                if ("text/plain" == intent.type) {
                    Log.d("handleaction", "intent.getStringExtra(Intent.EXTRA_TEXT : " + intent.getStringExtra(Intent.EXTRA_TEXT))
                    binding!!.textView.text = intent.getStringExtra(Intent.EXTRA_TEXT)
                }
            }
        }
    }
}