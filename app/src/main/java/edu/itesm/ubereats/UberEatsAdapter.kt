package edu.itesm.ubereats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UberEatsAdapter(private val datos: List<Datos>)
    : RecyclerView.Adapter<UberEatsAdapter.UberEatsViewHolder>(){

    inner class UberEatsViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var fecha = renglon.findViewById<TextView>(R.id.fecha)
        var pago = renglon.findViewById<TextView>(R.id.pago)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UberEatsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.renglon_layout, parent, false)
        return UberEatsViewHolder(renglon_vista)
    }

    override fun getItemCount(): Int {
        return datos.size
    }

    override fun onBindViewHolder(holder: UberEatsViewHolder, position: Int) {
        val dato = datos[position]
        val pago = dato.pago
        holder.fecha.text = dato.fecha
        holder.pago.text = "total $pago"
    }
}