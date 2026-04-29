package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDep;
    private List<Structura> listaStructuri;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.listaStructuri =new ArrayList<>();
    }
    public void adaugaStructura(Structura structura)
    {
        listaStructuri.add(structura);
    }

    public void stergeStructura(Structura structura)
    {
        listaStructuri.remove(structura);
    }
    public Structura getStructura(int pozitie)
    {
        return listaStructuri.get(pozitie);
    }
    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Nume Departament. "+this.numeDep+"\n");
        for(Structura structura:listaStructuri)
        {
            structura.afiseazaDetaliiStructura();
        }
    }
}
