package ro.ase.cts.clase;

public class Medicament implements Optiune {
    private String nume;
    private double pret;

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        System.out.println("Nu se poate adauga nod intr-un medicament.");
    }

    @Override
    public void stergereNod(Optiune optiune) {
        System.out.println("Nu se poate sterge nod dintr un medicament.");
    }

    @Override
    public Optiune getNod(int index) {
        System.out.println("Medicamentul nu contine alte noduri.");
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("Medicamentu: " + this.nume + ", pret:" + this.pret + " lei." );

    }
}
