package edu.itesm.ubereats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_resultado.*
import kotlinx.android.synthetic.main.renglon_layout.*
import java.time.LocalDateTime
import kotlin.collections.ArrayList
import kotlin.random.Random

class ResultadoActivity : AppCompatActivity() {
    private lateinit var uberEatsAdapter: UberEatsAdapter
    private lateinit var datos : ArrayList<Datos>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        initRecycler()
    }

    fun initRecycler(){
        datos = ArrayList<Datos>()
        uberEatsAdapter = UberEatsAdapter(datos)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = uberEatsAdapter
        for( i in 0..30){
            val fecha = LocalDateTime.now()
            val pago = String.format( "%.2f" , Random.nextDouble()* 1000 ).toDouble()
            val dato = Datos(fecha.toString(),pago)
            datos.add(dato)
        }

    }
}