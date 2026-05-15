package ro.ase.cts.clase;

public class ContBancar implements IContBancar{
    private Detinator detinator;
    private Banca banca;

    public ContBancar(Detinator detinator, Banca banca) {
        this.detinator = detinator;
        this.banca = banca;
    }

    @Override
    public void afiseazaInformatiiCont(String numarCont, double suma) {
        System.out.println("Contul cu numarul " + numarCont +
                " are suma " + suma +
                ", detinator: " + detinator.getNume() +
                ", banca: " + banca.getNume() +
                ", sucursala: " + banca.getSucursala());
    }
}
