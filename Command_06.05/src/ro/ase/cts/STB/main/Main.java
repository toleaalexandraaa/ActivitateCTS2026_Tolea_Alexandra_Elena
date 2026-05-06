package ro.ase.cts.STB.main;

import ro.ase.cts.STB.clase.Autobuz;
import ro.ase.cts.STB.clase.Command;
import ro.ase.cts.STB.clase.Operator;
import ro.ase.cts.STB.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Command comanda1 = new Plecare(new Autobuz("Mercedes"),41);
        Command comanda2 = new Plecare(new Autobuz("Audi"),10);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new Plecare(new Autobuz("Otokar"),20));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}