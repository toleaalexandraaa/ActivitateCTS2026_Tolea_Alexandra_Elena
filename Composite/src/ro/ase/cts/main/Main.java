package ro.ase.cts.main;
import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {

        System.out.println("COMPOSITE");
        Structura depAdministrativ=new Departament("Administratie");
        Structura depSpital=new Departament("Spital");
        Structura sectieSecretariat=new Sectie("Secretariat",12);
        Structura sectieManagement=new Sectie("Management",5);

        ((Departament)depSpital).adaugaStructura(depAdministrativ);
        ((Departament)depSpital).adaugaStructura(sectieManagement);
        ((Departament)depAdministrativ).adaugaStructura(sectieSecretariat);
        depSpital.afiseazaDetaliiStructura();

        ((Departament)depSpital).stergeStructura(sectieManagement);
        ((Departament)depAdministrativ).adaugaStructura(sectieManagement);
    }
}