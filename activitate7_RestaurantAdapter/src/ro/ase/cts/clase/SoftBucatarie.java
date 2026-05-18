package ro.ase.cts.clase;

public class SoftBucatarie implements SoftFacturi {

    @Override
    public void printeazaFacturi(String produs) {
        System.out.println("Factura pentru " + produs);
    }
}
