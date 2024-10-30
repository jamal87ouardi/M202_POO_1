package com.example.m202_poo_1

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

fun main() {
    // Définir le format des dates
    val dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    // Créer deux dates LocalDate
    val dateDebut = LocalDate.parse("01/01/2023", dateFormat)
    val dateFin = LocalDate.parse("30/10/2024", dateFormat)

    // Calculer la période entre les deux dates
    val periode: Period = Period.between(dateDebut, dateFin)

    // Afficher les résultats
    println("Date de début : $dateDebut")
    println("Date de fin : $dateFin")
    println("Durée entre les deux dates : ${periode.years} années, ${periode.months} mois, ${periode.days} jours")
}
