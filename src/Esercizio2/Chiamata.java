package Esercizio2;

public class Chiamata {
    private double durataInMinuti;
    private int numeroChiamato;

    public Chiamata(double durataInMinuti, int numeroChiamato) {
        this.durataInMinuti = durataInMinuti;
        this.numeroChiamato = numeroChiamato;
    }

    public static Chiamata[] stampaChiamata(Chiamata[] listaChiamate){

        for (int i = 0; i < listaChiamate.length ; i++) {
        System.out.println("La durata in minuti è stata: " + listaChiamate[i].durataInMinuti);
        System.out.println("Hai chiamato il numero: " + listaChiamate[i].numeroChiamato);
        }

        return listaChiamate;
    }


}
