/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._20241125_4id_nahio_espag18;

/**
 *
 * @author nahio
 */
public class Cerchio {

    public double xc;
    public double yc;
    public double r;

    public Cerchio(double xc, double yc, double r) {
        this.xc = xc;
        this.yc = yc;
        this.r = r;
    }

    public double calcolaArea() {
        return Math.PI * r * r;
    }

    public double calcolaPerimetro() {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {

        Cerchio cerchio = new Cerchio(2, 3, 5);

        System.out.println("Area del cerchio: " + cerchio.calcolaArea());

        System.out.println("Perimetro del cerchio: " + cerchio.calcolaPerimetro());
    }
}
