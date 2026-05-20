package ro.ase.cts.clase;

public class PlataCash implements ModPlata {
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul "+ numeClient+ " a platit cash suma de "+ suma +".");
    }
}
