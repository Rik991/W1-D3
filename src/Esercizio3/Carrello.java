package Esercizio3;

import java.util.Arrays;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private int totaleCostoArticoli;


    public Carrello(Cliente clienteAssociato, Articolo[] elencoArticoli, int totaleCostoArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.totaleCostoArticoli = 0;
    }

    public static void stampaCarrello (Carrello carello, Articolo[] listaArticoli){
        System.out.println(carello.clienteAssociato );
        System.out.println(Arrays.toString(carello.elencoArticoli));
        System.out.println(Articolo.costoArticolinelCarrello(listaArticoli));
    }


}

