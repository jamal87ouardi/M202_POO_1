package com.example.m202_poo_1

data class Smartphone(
    val nom : String,
    val prix : Double
)

data class Client (
    val estFidel : Boolean,
    val nom : String,
    val prenom : String
)

data class Command(
    val sm : Smartphone,
    val cl : Client,
    val quantite : Int
){
    fun calculerPrix() : Double {



        var total = sm.prix*quantite

        if(cl.estFidel) {
            val reduction = when {
                sm.nom == "Sv" -> 1000.0
                sm.nom == "Sk" -> 500.0
                else -> 0.0
            }
            total = total - reduction
        }
        return total

    }

}

fun main() {
    val cl1 = Client(true, "wafi","Ayman")
    val cl2 = Client(false, "Lazrak","Taha")

    val s1 = Smartphone("Sv", 4500.0)
    val s2 = Smartphone("Sk",2500.0)
    val s3 = Smartphone("So",3100.0)

    val com1 = Command(s1,cl1,4)
    println(com1.calculerPrix())



}