package com.example.m202_poo_1

// Interface pour les employés avec les attributs nom et prenom
interface Employe {
    val nom: String   // Attribut pour le nom de l'employé
    val prenom: String // Attribut pour le prénom de l'employé

    fun calculerSalaire(): Double  // Méthode abstraite pour calculer le salaire
}

// Classe pour un employé permanent
class EmployePermanent(override val nom: String, override val prenom: String, private val salaireFixe: Double) : Employe {
    override fun calculerSalaire(): Double {
        return salaireFixe  // Salaire fixe
    }
}

// Classe pour un employé temporaire
class EmployeTemporaire(override val nom: String, override val prenom: String, private val tauxHoraire: Double, private val heuresTravaillees: Double) : Employe {
    override fun calculerSalaire(): Double {
        return tauxHoraire * heuresTravaillees  // Salaire basé sur les heures travaillées
    }
}

// Classe pour un employé à commission
class EmployeCommission(override val nom: String, override val prenom: String, private val salaireDeBase: Double, private val commission: Double) : Employe {
    override fun calculerSalaire(): Double {
        return salaireDeBase + commission  // Salaire de base plus commission
    }
}

// Programme principal
fun main() {
    // Création d'instances des différents types d'employés
    val employe1: Employe = EmployePermanent("Dupont", "Jean", 3000.0)  // Employé permanent avec salaire fixe
    val employe2: Employe = EmployeTemporaire("Martin", "Sophie", 15.0, 80.0) // Employé temporaire avec 80 heures travaillées
    val employe3: Employe = EmployeCommission("Leroy", "Paul", 2500.0, 500.0) // Employé à commission

    // Affichage des salaires calculés
    println("Salaire de l'employé permanent ${employe1.prenom} ${employe1.nom} : ${employe1.calculerSalaire()} dh")
    println("Salaire de l'employé temporaire ${employe2.prenom} ${employe2.nom} : ${employe2.calculerSalaire()} dh")
    println("Salaire de l'employé à commission ${employe3.prenom} ${employe3.nom} : ${employe3.calculerSalaire()} dh")
}
