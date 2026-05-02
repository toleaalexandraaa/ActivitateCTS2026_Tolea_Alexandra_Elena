package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Linie;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes",2003,23);
        Autobuz autobuz2 = new Autobuz("Opel",2020,30);
        Autobuz autobuz3 = new Autobuz("Otokar",2021,28);
        LinieFactory factory = new LinieFactory();
        factory.getLinieDeTransport(102,"CFR","Pantelimon")
                .afiseazaAutobuzLinie(autobuz1);
    }
}