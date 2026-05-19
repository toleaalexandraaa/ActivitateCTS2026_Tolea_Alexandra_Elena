package ro.ase.cts.decorator;

import ro.ase.cts.clase.AbstractBonCasa;

public class DecoratorFelicitare extends DecoratorBonCasa{


    public DecoratorFelicitare(AbstractBonCasa bonDeCasa) {
        super(bonDeCasa);
    }

    @Override
    public void printeazaBon() {
        super.printeazaBon();
        printeazaFelicitare();
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani! Va multumim ca ati ales farmacia noastra!");
    }
}
