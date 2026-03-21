package ro.ase.cts.factory.clase;

public abstract class Desert implements FelDeMancare{
    private int calorii;
    private int gramaj;
    private double pret;

    public Desert(int calorii, int gramaj, double pret) {
        this.calorii = calorii;
        this.gramaj = gramaj;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("calorii=").append(calorii);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
