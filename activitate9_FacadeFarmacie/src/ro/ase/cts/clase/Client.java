package ro.ase.cts.clase;

public class Client {
    private String nume;
    private boolean areReteta;
    private boolean medicamentDisponibil;
    private boolean areCardDeSanatate;

    public Client(String nume, boolean areReteta, boolean medicamentDisponibil, boolean areCardDeSanatate) {
        this.nume = nume;
        this.areReteta = areReteta;
        this.medicamentDisponibil = medicamentDisponibil;
        this.areCardDeSanatate = areCardDeSanatate;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreReteta() {
        return areReteta;
    }

    public boolean isMedicamentDisponibil() {
        return medicamentDisponibil;
    }

    public boolean isAreCardDeSanatate() {
        return areCardDeSanatate;
    }
}
