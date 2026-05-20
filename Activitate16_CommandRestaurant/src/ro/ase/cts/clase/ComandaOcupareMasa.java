package ro.ase.cts.clase;

public class ComandaOcupareMasa implements IComanda {
    private Masa masa;

    public ComandaOcupareMasa(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.ocupaMasa();
    }
}
