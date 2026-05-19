package ro.ase.cts.decorator;

import ro.ase.cts.clase.AbstractBonCasa;

public abstract class DecoratorBonCasa implements AbstractBonCasa {

   private AbstractBonCasa bonDeCasa;

    public DecoratorBonCasa(AbstractBonCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    @Override
    public void printeazaBon() {
        bonDeCasa.printeazaBon();
    }

    public abstract void printeazaFelicitare();
}
