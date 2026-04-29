package ro.ase.cts.decorator;


import ro.ase.cts.clase.NotaDePlataAbstract;

public class NotaDePlataNouAn extends NotaDePlataDecorator{

    public NotaDePlataNouAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("\nFelicitari cu ocazia Noului An!");
    }
}
