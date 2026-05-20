package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
    private Map<String, IRezervare> rezervari;

    public FabricaRezervari() {
        this.rezervari = new HashMap<>();
    }

    public IRezervare getRezervare(Client client) {
        String cheie=client.getNume()+ "_" +client.getTelefon()+"_"+client.getEmail();
        if(!rezervari.containsKey(cheie)){
            IRezervare rezervareRestaurant=new RezervareRestaurant(client);
            rezervari.put(cheie,rezervareRestaurant);

        }
        return rezervari.get(cheie);
    }

    public int getNumarRezervariCreate(){
        return rezervari.size();
    }
}
