package ro.ase.cts.clase;

public class AdapterBar implements SoftFacturi{
    private SoftBar softBar;

    public AdapterBar(SoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaFacturi(String produs) {
        this.softBar.printeazaFacturaBar(produs);
    }
}
