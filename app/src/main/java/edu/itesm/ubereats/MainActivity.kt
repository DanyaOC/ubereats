package edu.itesm.ubereats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import edu.itesm.ubereats.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var propina: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seleccionarPropina()
    }

    fun seleccionarPropina() {
        button0.setOnClickListener{
            propina = 0.0
        }
        button10.setOnClickListener{
            propina = 0.10
        }
        button15.setOnClickListener{
            propina = 0.15
        }
        button20.setOnClickListener{
            propina = 0.20
        }
        button25.setOnClickListener{
            propina = 0.25
        }
    }

    fun calculo(view: View) {
        var orden = Orden(subtotal.text.toString().toDouble())
        mostrarValores(orden)
        var total = orden.smallorderfee + orden.servicefee + orden.deliveryfee + orden.subtotal1 + orden.subtotal1 * propina
        Log.i("edu.itesm.ubereats", "$total" )
        placeorder.text= "Place order $${total}"
        ordenFinal()
    }

    fun mostrarValores(orden : Orden){
        smallorder1.text = "$ ${orden.smallorderfee}"
        servicefee1.text = "$ ${orden.servicefee}"
        deliveryfee1.text = "$ ${orden.deliveryfee}"
    }

    fun ordenFinal(){
        placeorder.setOnClickListener {
            propina = 0.0
            smallorder1.text = "$0"
            servicefee1.text = "$0"
            deliveryfee1.text = "$0"
            placeorder.text= "Púchale aquí para ordenar"
        }
    }

}