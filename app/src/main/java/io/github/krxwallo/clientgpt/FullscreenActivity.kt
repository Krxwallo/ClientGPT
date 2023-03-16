package io.github.krxwallo.clientgpt

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import io.github.krxwallo.clientgpt.databinding.ActivityFullscreenBinding


/**
 * full-screen activity to display the web view
 */
class FullscreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFullscreenBinding
    private lateinit var webView: WebView

    @SuppressLint("ClickableViewAccessibility", "SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFullscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        webView = binding.webview
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.settings.savePassword = true
        webView.settings.saveFormData = true
        webView.loadUrl("https://chat.openai.com")
    }
}