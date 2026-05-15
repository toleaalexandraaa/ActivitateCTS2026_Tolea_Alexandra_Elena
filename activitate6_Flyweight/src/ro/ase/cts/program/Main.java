package ro.ase.cts.program;

import ro.ase.cts.clase.Banca;
import ro.ase.cts.clase.Detinator;
import ro.ase.cts.clase.FlyweightFactory;
import ro.ase.cts.clase.IContBancar;

public class Main {
    public static void main(String[] args) {
FlyweightFactory factory = new FlyweightFactory();

Banca banca1= new Banca("BCR", "Bucuresti", 5000000);
Banca banca2=new Banca("BT", "Targoviste", 9000000);

Detinator detinator=new Detinator(
        "Popa Mirela",
        "Bucuresti",
        "0722222222",
        "popescu@gmail.com"
);

Detinator detinator2= new Detinator(
        "Ion Maria",
        "Pitesti",
        "0788888888",
        "maria@gmail.com"
);

        IContBancar cont1 = factory.getContBancar(detinator, banca1);
        cont1.afiseazaInformatiiCont("RO01BCR0001", 2500);

        IContBancar cont2 = factory.getContBancar(detinator, banca1);
        cont2.afiseazaInformatiiCont("RO01BCR0002", 5000);

        IContBancar cont3 = factory.getContBancar(detinator, banca1);
        cont3.afiseazaInformatiiCont("RO01BCR0003", 12000);

        IContBancar cont4 = factory.getContBancar(detinator2, banca2);
        cont4.afiseazaInformatiiCont("RO02BT0001", 3400);

        System.out.println("Numar obiecte flyweight create: "
                + factory.getNumarConturiCreate());
    }
}