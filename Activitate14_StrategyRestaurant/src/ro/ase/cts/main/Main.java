package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.PlataCard;
import ro.ase.cts.clase.PlataCash;

public class Main {
    public static void main(String[] args) {

        Client client=new Client("Cristina");
        client.platesteNota(190);

        client.setModPlata(new PlataCash());
        client.platesteNota(250);

        client.setModPlata(new PlataCard());
        client.platesteNota(90);
    }
}