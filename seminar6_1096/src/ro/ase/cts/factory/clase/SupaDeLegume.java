package ro.ase.cts.factory.clase;

public class SupaDeLegume extends Supa{
    public SupaDeLegume(int gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Supa de legume: " + super.toString());
    }
}
