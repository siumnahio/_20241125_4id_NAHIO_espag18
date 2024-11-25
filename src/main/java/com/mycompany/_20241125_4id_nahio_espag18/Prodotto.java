/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._20241125_4id_nahio_espag18;

/**
 *
 * @author nahio
 */
public class Prodotto {

    // Attributi pubblici
    public String proprietario;
    public String nomeNegozio;

    // Primo costruttore: inizializza entrambi gli attributi
    public Prodotto(String proprietario, String nomeNegozio) {
        this.proprietario = proprietario;
        this.nomeNegozio = nomeNegozio;
    }

      public Prodotto(String proprietario) {
        this.proprietario = proprietario;
        this.nomeNegozio = "Essperunga";  
    }

  
    public void stampaDettagli() {
        System.out.println("Proprietario: " + proprietario);
        System.out.println("Nome del negozio: " + nomeNegozio);
    }

   
    public static void main(String[] args) {
       
        Prodotto prodotto1 = new Prodotto("Sem Nahio", "Supermercato Alimentare");
        Prodotto prodotto2 = new Prodotto("Don salve");

       
        System.out.println("Dettagli prodotto 1:");
        prodotto1.stampaDettagli();

        System.out.println("\nDettagli prodotto 2:");
        prodotto2.stampaDettagli();

    }
}