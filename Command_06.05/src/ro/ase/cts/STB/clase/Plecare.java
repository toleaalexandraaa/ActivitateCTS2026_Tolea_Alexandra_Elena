package ro.ase.cts.STB.clase;

public class Plecare implements Command{
    private Autobuz autobuz;
    private int nrLinie;

    public Plecare(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void pleacaInCursa() {
        autobuz.pornestePeTraseu(nrLinie);
    }
}