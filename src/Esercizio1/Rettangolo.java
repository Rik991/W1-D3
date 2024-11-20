package Esercizio1;

public class Rettangolo {

    //proprietà rettangolo
    private double altezza;
    private double larghezza;


    // costruttori
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //metodi della classe
    private static double calcolaPerimetro(double altezza, double larghezza){
       double perimetro = (altezza * 2) + (larghezza *2);
       return perimetro;
    };
    private static double calcolaArea(double altezza, double larghezza){
        double area = larghezza * altezza;
        return area;
    };

    private static void stampaRettangolo (Rettangolo rettangoloDato){
        System.out.println("Il perimetro è" + calcolaPerimetro(rettangoloDato.altezza, rettangoloDato.larghezza));
        System.out.println("L'area è" + calcolaArea(rettangoloDato.altezza, rettangoloDato.larghezza));

    }

    private static void stampaDueRettangoli (Rettangolo rettangoloDato, Rettangolo rettangoloDato2){
        double sommaPerimetro = calcolaPerimetro(rettangoloDato.altezza, rettangoloDato.larghezza) + calcolaPerimetro(rettangoloDato2.altezza, rettangoloDato2.larghezza);
        double sommaArea = calcolaArea(rettangoloDato.altezza, rettangoloDato.larghezza) + calcolaArea(rettangoloDato2.altezza, rettangoloDato2.larghezza);
        System.out.println("Il perimetro del primo è " + calcolaPerimetro(rettangoloDato.altezza, rettangoloDato.larghezza));
        System.out.println("L'area del primo è " + calcolaArea(rettangoloDato.altezza, rettangoloDato.larghezza));
        System.out.println("Il perimetro del secondo è " + calcolaPerimetro(rettangoloDato2.altezza, rettangoloDato2.larghezza));
        System.out.println("L'area del terzo è " + calcolaArea(rettangoloDato2.altezza, rettangoloDato2.larghezza));
        System.out.println("la somma dei perimetri è " + sommaPerimetro);
        System.out.println("la somma dell'area è " + sommaArea);
    }




    public static void main(String[] args) {


        Rettangolo rettangolo1 = new Rettangolo(10,5);
        Rettangolo rettangolo2 = new Rettangolo(20,30);


        stampaRettangolo(rettangolo1);
        stampaDueRettangoli(rettangolo1,rettangolo2 );


    }
}
