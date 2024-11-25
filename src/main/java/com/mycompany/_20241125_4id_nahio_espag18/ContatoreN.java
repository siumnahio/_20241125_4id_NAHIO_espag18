/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._20241125_4id_nahio_espag18;

/**
 *
 * @author nahio
 */
public class ContatoreN {

    // Attributi pubblici
    public int conta;
    public int N;

    // Costruttore che inizializza il contatore a zero e imposta N
    public ContatoreN(int N) {
        this.conta = 0;  // Contatore inizializzato a 0
        this.N = N;      // Imposta il modulo N
    }

    // Metodo per incrementare il contatore, con modulo N
    public void incrementa() {
        conta = (conta + 1) % N;  // Se conta raggiunge N, torna a 0
    }

    // Metodo per decrementare il contatore, con modulo N
    public void decrementa() {
        conta = (conta - 1 + N) % N;  // Se conta scende sotto 0, torna a N-1
    }

    // Metodo per ottenere il valore attuale
    public int getValore() {
        return conta;
    }

    
    public static void main(String[] args) {
        ContatoreN contatore = new ContatoreN(3); // Impostiamo N=5


        contatore.incrementa();
        contatore.incrementa();
        contatore.incrementa();
     
        System.out.println("Valore dopo 3 incrementi: " + contatore.getValore());  


        contatore.decrementa();
        contatore.decrementa();

        System.out.println("Valore dopo 2 decrementi: " + contatore.getValore()); 
    }
}
