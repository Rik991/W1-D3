package Esercizio2;

import java.util.Arrays;

public class Sim {
    private int numeroDiTelefono;
    private double creditoDisponibile;
    private Chiamata[] listaChiamate ;

    public Sim(int numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.creditoDisponibile = 0;
        this.listaChiamate = new Chiamata[5];
    }

    public static void stampaDatiSim(Sim simUtente){
        System.out.println("Ecco la tua SIM:");
        System.out.println("Il numero è " +simUtente.numeroDiTelefono + ", il credito è "
                + simUtente.creditoDisponibile );
        System.out.println(Chiamata.stampaChiamata(simUtente.listaChiamate));
    }

    public static void main(String[] args) {

        Sim newSim = new Sim(349556678);
        Chiamata chiamata1 = new Chiamata(36, 354985647);
        Chiamata chiamata2 = new Chiamata(15, 333339854);
        newSim.listaChiamate[0] = chiamata1;
        newSim.listaChiamate[1] = chiamata2;

        stampaDatiSim(newSim);
    }
}
