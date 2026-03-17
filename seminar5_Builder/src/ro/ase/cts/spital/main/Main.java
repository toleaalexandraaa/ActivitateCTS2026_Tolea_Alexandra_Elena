package ro.ase.cts.spital.main;

import ro.ase.cts.spital.Builder.Internare;
import ro.ase.cts.spital.Builder.InternareBuilder;
import ro.ase.cts.spital.Builder.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare(true, false, true,true,"Mihai Popescu");
        Internare internare2 = new Internare(false, false, false,true,"Maria Radu");

        InternareBuilder builder= new InternareBuilder("Maria Pop");
        Internare internare3 = builder.build();

        Internare internare4=builder.setNume("Andrei Matei").setPat(true).setPapuciCamera(true).setHalat(true).build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        InternareBuilderAlternativ builderAlternativ=  new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare101=builderAlternativ.build("Alina Maria");
        Internare internare102=builderAlternativ.build("Petre Maria");
        Internare internare103= builderAlternativ.build("Tudor Ionut");

       // internare101.setNumePacient("Popescu Ionel");
        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());

    }
}
