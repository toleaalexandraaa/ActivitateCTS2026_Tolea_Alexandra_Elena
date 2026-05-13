package ro.ase.cts.hotel.program;

import ro.ase.cts.hotel.clase.*;

public class Main {
    public static void main(String[] args) {


        VerificareRezervare rezervare = new VerificareRezervare();
        VerificareActIdentitate actIdentitate = new VerificareActIdentitate();
        VerificareDatorii datoriiClient = new VerificareDatorii();
        VerificareCamera camera = new VerificareCamera();

        FacadeCazareHotel hotel = new FacadeCazareHotel(rezervare, actIdentitate, datoriiClient, camera);

        System.out.println("Prima verificare:");
        hotel.cazeazaClient("AB123456", "R100");

        System.out.println();

        System.out.println("A doua verificare:");
        hotel.cazeazaClient("AB999999", "R100");

        System.out.println();

        System.out.println("A treia verificare:");
        hotel.cazeazaClient("AB123456", "R200");
    }
}