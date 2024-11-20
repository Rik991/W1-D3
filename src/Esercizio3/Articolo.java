package Esercizio3;

public class Articolo {
    private int codiceArticolo;
    private String descrizione;
    private int prezzo;
    private int numeroPezziInMagazzino;

    public Articolo(int codiceArticolo, String descrizione, int numeroPezziInMagazzino, int prezzo) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.numeroPezziInMagazzino = numeroPezziInMagazzino;
        this.prezzo = prezzo;
    }

    public static void stampaArticolo(Articolo articoloDato){
        System.out.println("Specifiche articolo: ");
        System.out.println("Codice: " + articoloDato.codiceArticolo);
        System.out.println("Descrzione: " + articoloDato.descrizione);
        System.out.println("prezzo: " + articoloDato.prezzo);
        System.out.println("Giacenza: " + articoloDato.numeroPezziInMagazzino);
    }

    public static int costoArticolinelCarrello (Articolo[] listaArticoli){
        int totale = 0;
        for (int i = 0; i < listaArticoli.length; i++) {
            totale += listaArticoli[i].prezzo;
        }
        return totale;
    }






}
