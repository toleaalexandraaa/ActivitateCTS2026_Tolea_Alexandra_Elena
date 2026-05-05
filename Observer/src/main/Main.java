package main;

import clase.ISpital;
import clase.Pacient;
import clase.PacientAbonat;
import clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1= new PacientAbonat("Ionescu",30);
        Pacient pacient2=new PacientAbonat("Popa",60);
        Pacient pacient3=new PacientAbonat("Ina",30);

        ISpital spital= new Spital("Cantacuzino");
        spital.aboneazaPacientul(pacient1);
        spital.aboneazaPacientul(pacient2);
        spital.aboneazaPacientul(pacient3);

        ((Spital)spital).notificaEpidemie();
        ((Spital)spital).notificaVirus();

    }
}