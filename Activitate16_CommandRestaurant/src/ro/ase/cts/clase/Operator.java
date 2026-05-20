package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void preiaComanda(IComanda comanda) {
        this.comenzi.add(comanda);
    }

    public void executaComenzi(){
        for(IComanda comanda : comenzi){
            comanda.executa();
        }
        comenzi.clear();
    }
}
