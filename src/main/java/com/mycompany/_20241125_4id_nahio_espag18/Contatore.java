/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._20241125_4id_nahio_espag18;

/**
 *
 * @author nahio
 */
public class Contatore {

    // Attributo pubblico che tiene traccia del valore del contatore
    public int conta;

    // Costruttore che inizializza il contatore a zero
    public Contatore() {
        this.conta = 0;
    }

    // Metodo pubblico per incrementare il contatore di una unità
    public void incrementa() {
        conta++;
    }

    // Metodo pubblico per decrementare il contatore di una unità
    public void decrementa() {
        conta--;
    }

    // Metodo pubblico per ottenere il valore attuale del contatore
    public int getValore() {
        return conta;
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        // Creazione di un oggetto Contatore
        Contatore contatore = new Contatore();

        // Incrementiamo il contatore
        contatore.incrementa();
        contatore.incrementa();

        // Stampiamo il valore del contatore
        System.out.println("Valore del contatore dopo 2 incrementi: " + contatore.getValore());

        // Decrementiamo il contatore
        contatore.decrementa();

        // Stampiamo il valore del contatore dopo il decremento
        System.out.println("Valore del contatore dopo 1 decremento: " + contatore.getValore());
    }
}

