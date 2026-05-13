package ro.ase.cts.banca.clase;

public class CreditNevoiPersonale implements ICredit {
    private String numeClient;
    private double suma;

    public CreditNevoiPersonale(String numeClient, double suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    @Override
    public void oferaCredit() {
        System.out.println("Banca ofera credit de nevoi personale clientului " + numeClient + " pentru suma de " + suma + " lei.");
    }
}
