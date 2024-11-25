/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._20241125_4id_nahio_espag18;

/**
 *
 * @author nahio
 */
public class Auto {


   
    public String marca;
    public String modello;
    public String targa;
    public int annoImmatricolazione;

    
    public Auto(String marca, String modello, String targa, int annoImmatricolazione) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }

   
    @Override
    public String toString() {
        return "Auto [Marca=" + marca + ", Modello=" + modello + ", Targa=" + targa + ", Anno di Immatricolazione=" + annoImmatricolazione + "]";
    }

    
    public static void main(String[] args) {
      
        Auto auto1 = new Auto("Fiat", "Panda", "323484MI", 2020);
        
        
        System.out.println(auto1.toString());
    }
}


