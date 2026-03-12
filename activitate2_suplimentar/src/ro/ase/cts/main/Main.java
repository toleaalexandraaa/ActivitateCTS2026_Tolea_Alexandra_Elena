package ro.ase.cts.main;

import ro.ase.cts.lazy.Biblioteca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca1 = Biblioteca.getInstance("Biblioteca Nationala", 5, 2);
        Biblioteca biblioteca2 = Biblioteca.getInstance("Biblioteca Academiei Romane", 10, 6);

        biblioteca1.imprumutaCarte();
        biblioteca1.imprumutaCarte();

        biblioteca2.imprumutaCarte();
        biblioteca2.imprumutaCarte();

        biblioteca1.afisareDescriere();

        System.out.println(biblioteca1 == biblioteca2);



    }
}