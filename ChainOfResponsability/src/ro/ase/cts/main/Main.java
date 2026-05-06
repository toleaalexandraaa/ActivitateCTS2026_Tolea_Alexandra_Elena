package ro.ase.cts.main;

import ro.ase.cts.clase.*;
public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieAutobuz.setCalatorieHandler(calatorieTroleibuz);
        calatorieTroleibuz.setCalatorieHandler(calatorieTramvai);
        calatorieTramvai.setCalatorieHandler(calatorieMetrou);

        System.out.println(calatorieAutobuz.recomandaCalatorie(7));
        System.out.println(calatorieAutobuz.recomandaCalatorie(12));
    }
}