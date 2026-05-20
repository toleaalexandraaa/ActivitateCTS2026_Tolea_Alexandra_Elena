package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SalaSport implements ISalaSport{
    private String nume;
    private List <ClientAbonat> clienti;

    public SalaSport(String nume) {
        this.nume = nume;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(ClientAbonat c : this.clienti){
            c.receptioneazaMesaj(mesaj+ " de la sala " + this.nume);
        }
    }

    @Override
    public void aboneazaClient(ClientAbonat client) {
        this.clienti.add(client);
    }

    @Override
    public void dezaboneazaClient(ClientAbonat client) {
        this.clienti.remove(client);
    }

    public void notificaMeciFotbal(){
        trimiteMesaj("A fost programat un nou meci de fotbal!");
    }

    public void notificaMeciHandbal(){
        trimiteMesaj("A fost programat un nou meci de handbal!");

    }

    public void notificaMeciVolei(){
        trimiteMesaj("A fost programat un nou meci de volei!");

    }
}
