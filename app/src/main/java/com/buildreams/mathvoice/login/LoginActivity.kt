package com.buildreams.mathvoice.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.buildreams.mathvoice.mathtask.MathTaskActivity
import com.buildreams.mathvoice.ui.theme.MathVoiceTheme

class LoginActivity : ComponentActivity() {

    private val onSuccessfulLogin = {
        val intent = Intent(this, MathTaskActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MathVoiceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginComposable()
                }
            }
        }
    }

    @Composable
    private fun LoginComposable() {
        LoginPage(onSuccessfulLogin)
    }

    @Preview
    @Composable
    private fun LoginPreview() {
        LoginPage(onSuccessfulLogin)
    }
}