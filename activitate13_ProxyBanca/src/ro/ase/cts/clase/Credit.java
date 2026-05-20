package ro.ase.cts.clase;

public class Credit implements AbstractCredit {
    @Override
    public void realizeazaCredit(String moneda) {
        System.out.println("A fost realizat un credit in moneda " + moneda +".");
    }
}
