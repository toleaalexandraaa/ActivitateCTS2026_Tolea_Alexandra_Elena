package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractBonCasa;
import ro.ase.cts.clase.BonDeCasa;
import ro.ase.cts.decorator.DecoratorFelicitare;
public class Main {
    public static void main(String[] args) {
        AbstractBonCasa bonSimplu= new BonDeCasa(101, 87.90);

        System.out.println("Printare bon simplu:");
        bonSimplu.printeazaBon();

        AbstractBonCasa bonCuFelicitare=new DecoratorFelicitare(bonSimplu);
        System.out.println("Printare bon cu felicitare:");
        bonCuFelicitare.printeazaBon();
    }
}