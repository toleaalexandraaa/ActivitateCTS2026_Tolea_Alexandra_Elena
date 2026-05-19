package ro.ase.cts.main;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.Optiune;
import ro.ase.cts.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Optiune farmacie= new Sectiune("Farmacie");

        Optiune raceala=new Sectiune("Raceala");
        Optiune durere=new Sectiune("Durere");
        Optiune antibiotice=new Sectiune("Antibiotice");

        Optiune adulti=new Sectiune("Adulti");
        Optiune copii=new Sectiune("Copii");

        Optiune paracetamol=new Medicament("Paracetamol", 12.9);
        Optiune nurofen=new Medicament("Nurofen", 9.9);
        Optiune siropTuse=new Medicament("SiropTuse", 22);
        Optiune antinevralgic=new Medicament("Antinevralgic", 45);

        adulti.adaugaNod(paracetamol);
        copii.adaugaNod(siropTuse);

        raceala.adaugaNod(adulti);
        raceala.adaugaNod(copii);

        durere.adaugaNod(nurofen);
        antibiotice.adaugaNod(antinevralgic);

        farmacie.adaugaNod(raceala);
        farmacie.adaugaNod(durere);
        farmacie.adaugaNod(antibiotice);

        farmacie.descriere();
    }
}