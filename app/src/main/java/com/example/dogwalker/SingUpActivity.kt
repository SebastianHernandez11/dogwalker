package com.example.dogwalker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SingUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Inicialización de elementos de la interfaz de usuario
        val nameEditText = findViewById<EditText>(R.id.nombreEditText)
        val emailEditText = findViewById<EditText>(R.id.correoEditText)
        val passwordEditText = findViewById<EditText>(R.id.contrasenaEditText)
        val birthdateEditText = findViewById<EditText>(R.id.fechaNacimientoEditText)
        val userTypeEditText = findViewById<EditText>(R.id.tipodeusuarioEditText)
        val signUpButton = findViewById<Button>(R.id.ingresarButton)

        // Establecer un agente de escucha de clics para el botón de registro
        signUpButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val birthdate = birthdateEditText.text.toString()
            val userType = userTypeEditText.text.toString()

            // Realizar la validación de entrada
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || birthdate.isEmpty() || userType.isEmpty()) {
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            nameEditText.setText("")
            emailEditText.setText("")
            passwordEditText.setText("")
            birthdateEditText.setText("")
            userTypeEditText.setText("")

            // Mostrar un mensaje de éxito
            Toast.makeText(this, "Cuenta creada exitosamente", Toast.LENGTH_SHORT).show()
        }
    }
}