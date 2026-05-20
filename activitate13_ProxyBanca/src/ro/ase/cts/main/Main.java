package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractCredit;
import ro.ase.cts.clase.Credit;
import ro.ase.cts.clase.ProxyCredit;

public class Main {
    public static void main(String[] args) {
        Credit credit=new Credit();
        AbstractCredit proxyCredit=new ProxyCredit(credit);
        System.out.println("Cerere credit in RON:");
        proxyCredit.realizeazaCredit("RON");
        System.out.println();

        System.out.println("Cerere credit in EUR:");
        proxyCredit.realizeazaCredit("EUR");
        System.out.println();

        System.out.println("Cerere credit in lire:");
        proxyCredit.realizeazaCredit("lire");

    }
}