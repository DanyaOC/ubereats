package edu.itesm.ubereats

data class Orden (var subtotal: Double){
    var smallorderfee = subtotal * 0.02
    var servicefee =    subtotal * 0.05
    var deliveryfee =   subtotal * 0.1
    var subtotal1 =     subtotal

}