package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Optiune {
    private String nume;
    private List<Optiune> lista;

    public Sectiune(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        lista.add(optiune);
    }

    @Override
    public void stergereNod(Optiune optiune) {
        lista.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        if(index >=0 && index< lista.size()){
            return lista.get(index);
        }
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune " + this.nume);

        for(Optiune optiune : lista){
            optiune.descriere();
        }
    }
}
