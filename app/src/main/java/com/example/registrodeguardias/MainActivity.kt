package com.example.registrodeguardias

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Instanciamos los componentes gráficos del menú exclusivo de la UT7
        val btnIrPrefs = findViewById<Button>(R.id.btnIrPrefs)
        val btnIrFicheros = findViewById<Button>(R.id.btnIrFicheros)
        val btnIrSQLite = findViewById<Button>(R.id.btnIrSQLite)

        // ========================================================
        //  SECCIÓN UT7: PERSISTENCIA DE LA INFORMACIÓN
        // ========================================================

        // 2.1. Selector de Preferencias Compartidas (Ejercicio Resuelto 1)
        btnIrPrefs.setOnClickListener {
            val intent = Intent(this, PreferenciasActivity::class.java)
            startActivity(intent)
        }

        // 2.2. Selector de Almacenamiento por Ficheros (Punto 3 - Próxima sesión)
        btnIrFicheros.setOnClickListener {
            // Nota pedagógica: Descomentar una vez creada la actividad del Ejercicio 2
            val intent = Intent(this, FicherosActivity::class.java)
            startActivity(intent)
        }

        // 2.3. Selector de Base de Datos Relacional SQLite (Punto 4 - Próxima sesión)
        btnIrSQLite.setOnClickListener {
            // Nota pedagógica: Descomentar una vez creada la actividad del Ejercicio 4
            val intent = Intent(this, SQLiteActivity::class.java)
            startActivity(intent)
        }

        // Integración del tercer botón de laboratorio en el menú de la UT7
        val btnIrExterno = findViewById<Button>(R.id.btnIrExterno) // Recuerda añadirlo a tu layout si lo necesitas
        btnIrExterno.setOnClickListener {
            val intent = Intent(this, AlmacenamientoExternoActivity::class.java)
            startActivity(intent)
        }

    }
}
