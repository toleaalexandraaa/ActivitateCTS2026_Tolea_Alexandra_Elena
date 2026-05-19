package ro.ase.cts.clase;

public class BonDeCasa implements AbstractBonCasa {
    private int nrBon;
    private double suma;

    public BonDeCasa(int nrBon, double suma) {
        this.nrBon = nrBon;
        this.suma = suma;
    }

    @Override
    public void printeazaBon() {
        System.out.println("Se printeaza bonul de casa cu numarul "+ this.nrBon);
        System.out.println("Suma de plata: " + this.suma);
    }
}
