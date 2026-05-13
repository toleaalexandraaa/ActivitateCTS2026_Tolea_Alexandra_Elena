package ro.ase.cts.banca.clase;

public class LeasingAdapter implements ICredit{
    private Leasing leasing;

    public LeasingAdapter(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void oferaCredit() {
        leasing.acordaLeasing();
    }
}
