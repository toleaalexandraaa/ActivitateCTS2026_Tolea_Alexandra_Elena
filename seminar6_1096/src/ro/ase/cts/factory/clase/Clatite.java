package ro.ase.cts.factory.clase;

public class Clatite extends Desert{

    public Clatite(int calorii, int gramaj, double pret) {
        super(calorii, gramaj, pret);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Clatite: " + super.toString());
    }
}
