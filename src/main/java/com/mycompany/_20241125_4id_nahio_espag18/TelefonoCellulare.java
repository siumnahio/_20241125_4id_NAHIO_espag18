/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany._20241125_4id_nahio_espag18;

/**
 *
 * @author nahio
 */
public class TelefonoCellulare {

    private String marca ;
    private String modello ;
    private double prezzo  ;

    public TelefonoCellulare(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {

        return modello;

    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrezzo() {
        return prezzo;
    }
    
    public void setPrezzo( double prezzo) {
        this.prezzo = prezzo;
    }
    
    public static void main(String[] args) {
        TelefonoCellulare telefono = new TelefonoCellulare("SAMSUNG","A53",302.40);
        System.out.println("Ecco le caratteristiche del telefono: marca "+telefono.getMarca());
        System.out.println("modello "+telefono.getModello());
        System.out.println("prezzo "+telefono.getPrezzo());
    }
}
