/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._20241125_4id_nahio_espag18;

/**
 *
 * @author nahio
 */
public class Studente {

    public String cognome;
    public String nome;
    public String codiceFiscale;
    public String numeroMatricola;

    public Studente(String cognome, String nome, String codiceFiscale, String numeroMatricola) {
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.numeroMatricola = numeroMatricola;
    }

    @Override
    public String toString() {
        return "Studente [Cognome = " + cognome + ", NomeV = " + nome + ", Codice FiscaleV = " + codiceFiscale + ", Numero Matricola = " + numeroMatricola + "]";
    }

    public static void main(String[] args) {

        Studente studente1 = new Studente("Nahio", "Sem", "NAHJN80A01H052S", "12345");

        System.out.println(studente1.toString());
    }
}
