package org.learnig.java;

import java.util.Scanner;

public class BigliettoTreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // chiedo all'utente quanti km vuole fare
        System.out.print("Inserisci il numero di km che vuoi percorrere");
        int km = scanner.nextInt();

        // chiedo all'utente la sua età
        System.out.print("Inserisci la tua età");
        int eta = scanner.nextInt();

        // calcolo il prezzo del biglietto prezzo*km
        double prezzoBase = km * 0.21;
        double prezzoTot;

        if (eta < 18) {
            // sconto per l'utente minorenne
            prezzoTot = prezzoBase * 0.8; 
        } else if (eta >= 65) {
            // sconto per l'utente over 65
            prezzoTot = prezzoBase * 0.6;
        } else {
            prezzoTot = prezzoBase;
        }

        // stampo il prezzo del biglietto
        System.out.println("Il prezzo del tuo biglietto è: " + prezzoTot + " €");
    }
}
