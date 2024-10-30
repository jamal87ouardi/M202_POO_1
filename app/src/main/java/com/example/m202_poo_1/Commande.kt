package com.example.m202_poo_1




data class Commande(
    val type:String,
    val quantite:Int,
    val estFidele:Boolean) {

    fun calculerPrix() : Double {

        val prix = when {
            type == "Sv" -> 4500.0
            type == "Sk" -> 2500.0
            type == "So" -> 3100.0

            else -> 0.0
        }

        var total = prix*quantite
        if(estFidele) {
            val reduction = when {
                type == "Sv" -> 1000.0
                type == "Sk" -> 500.0
                else -> 0.0
            }
            total = total - reduction
        }
        return total

    }


}

fun main() {
    val C1 = Commande("Sv", 3, true)
    println(C1.calculerPrix())

}