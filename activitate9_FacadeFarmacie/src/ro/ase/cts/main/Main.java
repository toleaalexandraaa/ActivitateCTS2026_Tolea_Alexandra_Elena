package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.FacadeMedicament;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Alina", true, true, true );
        Client client2=new Client("Ioana", false, true, true );
        Client client3=new Client("Aurel", true, false, true );
        Client client4=new Client("Ion", true, true, false );

        FacadeMedicament facadeMedicament=new FacadeMedicament();

        System.out.println("Verificare pentru client 1:");
        facadeMedicament.poateCumparaMedicament(client1);


        System.out.println("Verificare pentru client 2:");
        facadeMedicament.poateCumparaMedicament(client2);


        System.out.println("Verificare pentru client 3:");
        facadeMedicament.poateCumparaMedicament(client3);


        System.out.println("Verificare pentru client 4:");
        facadeMedicament.poateCumparaMedicament(client4);


    }
}