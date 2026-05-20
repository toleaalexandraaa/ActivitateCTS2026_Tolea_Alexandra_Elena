package ro.ase.cts.clase;

public class PlataCard implements ModPlata {
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul "+ numeClient + " a platit cu cardul suma de "+ suma+ ".");
    }
}
