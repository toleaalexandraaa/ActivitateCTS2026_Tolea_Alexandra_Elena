package ro.ase.cts.main;


import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataNouAn;

public class Main {
    public static void main(String[] args) {

        System.out.println("DECORATOR");
        NotaDePlata notaDePlata=new NotaDePlata(350.2f,"01.05.2026");
        notaDePlata.printeaza();

        int a=1;
        ro.ase.cts.decorator.NotaDePlataDecorator notaDePlataDecorator;
        if(a==2)
        {
            notaDePlataDecorator=new NotaDePlataNouAn(notaDePlata);
        }
        else {
            notaDePlataDecorator=new NotaDePlata1Mai(notaDePlata);
        }
        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();


    }
}