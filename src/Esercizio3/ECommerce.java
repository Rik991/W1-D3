package Esercizio3;

import javax.swing.text.Caret;

public class ECommerce {


    public static void main(String[] args) {

        Cliente Rik = new Cliente(1,2024, "ril@a.it",  "riccardo santilli" );
        Articolo computer = new Articolo(1, "desktop", 5, 750 );
        Articolo mouse = new Articolo(2, "logitech", 15, 5 );

        Articolo[] articoli = {computer, mouse};

      int totale = Articolo.costoArticolinelCarrello(articoli);
        Carrello mioShop = new Carrello(Rik, articoli, totale);


        System.out.println(mioShop);


    }

}
