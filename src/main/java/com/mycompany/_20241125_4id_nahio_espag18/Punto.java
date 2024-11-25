/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._20241125_4id_nahio_espag18;

/**
 *
 * @author nahio
 */
public class Punto {

    public double x;
    public double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanzaOrigine() {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {

        Punto punto1 = new Punto(3, 4);

        System.out.println("La distanza del punto dall'origine è: " + punto1.distanzaOrigine());

    }
}
