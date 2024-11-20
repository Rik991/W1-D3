package Esercizio3;

import java.util.Date;

public class Cliente {
    private int codiceCliente;
    private String nomeECognome;
    private String email;
    private int dataIscrizione;

    public Cliente(int codiceCliente, int dataIscrizione, String email, String nomeECognome) {
        this.codiceCliente = codiceCliente;
        this.dataIscrizione = dataIscrizione;
        this.email = email;
        this.nomeECognome = nomeECognome;
    }

    public static void stampaCliente(Cliente cliente){
        System.out.println("Dati Cliente: ");
        System.out.println("Codice: " + cliente.codiceCliente);
        System.out.println("Nome e Cognome: " + cliente.nomeECognome);
        System.out.println("email: " + cliente.email);
        System.out.println("Data iscrizione: " + cliente.dataIscrizione);
    }


}
