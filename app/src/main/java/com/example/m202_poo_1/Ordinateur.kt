package com.example.m202_poo_1

data class Ordinateur(
    val id : Int,
    val prix : Double,
    val nom : String,
    val typeCPU : String
)

data class Client(
    val idClient : Int,
    val nom : String,
    val prenom : String
)

data class Commandee(
    val quantite : Int,
    val cl : Client,
    val or : Ordinateur
)
{
    fun calcule_prix_A_R() : Double {

        val prix_ar = or.prix * quantite
        return prix_ar

    }

    fun calcule_prix_de_Remise() : Double {
        val prix_R = calcule_prix_A_R()
        var Remise = 0.0

        Remise = when {
            prix_R > 20000.0 -> prix_R * 0.15
            prix_R > 10000.0 -> prix_R * 0.10
            else -> 0.0
        }

        return Remise
    }

    fun prix_apres_remise(): Double{
        val prixAvantRemise = calcule_prix_A_R()
        val remise = calcule_prix_de_Remise()
        val prixApresRemise = prixAvantRemise - remise
        return prixApresRemise
    }
}

fun main() {
    val ordinateur = Ordinateur(1, 4000.0, "HP", "i7")
    val client = Client(1, "Tabeg", "Zouhair")
    val commande = Commandee(8, client, ordinateur)



    println("Prix avant remise: ${commande.calcule_prix_A_R()}")
    println("Prix après remise: ${commande.prix_apres_remise()}")
    println("Prix de remise: ${commande.calcule_prix_de_Remise()}")


}