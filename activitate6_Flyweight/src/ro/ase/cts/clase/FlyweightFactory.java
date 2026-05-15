package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IContBancar> conturi;


    public FlyweightFactory() {
        this.conturi = new HashMap<>();
    }

   public IContBancar getContBancar(Detinator detinator, Banca banca){
       String cheie = detinator.getNume() + "_" + detinator.getTelefon() + "_" + banca.getNume();

       if (!conturi.containsKey(cheie)) {
           IContBancar contBancar = new ContBancar(detinator, banca);
           conturi.put(cheie, contBancar);
       }

       return conturi.get(cheie);
   }

   public int getNumarConturiCreate(){
        return conturi.size();
   }
}
