package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.FabricaRezervari;
import ro.ase.cts.clase.IRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        FabricaRezervari fabricaRezervari=new FabricaRezervari();
        Client client1=new Client("Ana Popescu", "0766654908", "ana@gmail.com");
        Client client2=new Client("Marius Ion", "0754632189","marius.ion@gmail.com");

        Rezervare rezervare1=new Rezervare(1,2,"18:50");
        Rezervare rezervare2=new Rezervare(4, 8,"12:00");
        Rezervare rezervare3=new Rezervare(8, 2,"21:00");
        Rezervare rezervare4=new Rezervare(6,3,"13:00");

        IRezervare rezervareClient1=fabricaRezervari.getRezervare(client1);
        rezervareClient1.afiseazaRezervare(rezervare1);

        IRezervare rezervareClient1DinNou=fabricaRezervari.getRezervare(client1);
        rezervareClient1DinNou.afiseazaRezervare(rezervare2);

        IRezervare rezervareClient2=fabricaRezervari.getRezervare(client2);
        rezervareClient2.afiseazaRezervare(rezervare3);

        IRezervare rezervareClient2DinNou=fabricaRezervari.getRezervare(client2);
        rezervareClient2DinNou.afiseazaRezervare(rezervare4);

        System.out.println("Numar rezervari create pentru clienti: "+ fabricaRezervari.getNumarRezervariCreate());
    }
}