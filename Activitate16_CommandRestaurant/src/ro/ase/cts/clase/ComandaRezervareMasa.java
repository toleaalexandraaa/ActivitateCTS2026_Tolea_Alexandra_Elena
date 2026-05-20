package ro.ase.cts.clase;

public class ComandaRezervareMasa implements  IComanda{
    private Masa masa;

    public ComandaRezervareMasa(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.rezervaMasa();
    }
}
