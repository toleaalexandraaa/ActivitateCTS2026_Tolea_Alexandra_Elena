package clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String nume;
    private List<Pacient> pacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.pacienti = new ArrayList<>();
    }


    @Override
    public void trimiteMesaj(String mesaj) {
        for(Pacient pacient : this.pacienti) {
            pacient.receptioneazaMesaj(mesaj + " de la Spitalul "+ this.nume);
        }
    }

    @Override
    public void aboneazaPacientul(Pacient pacient) {
        pacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPacientul(Pacient pacient) {
        pacienti.remove(pacient);
    }

    public void notificaVirus(){
        trimiteMesaj("Exista un virus nou in oras!");
    }

    public void notificaEpidemie(){
        trimiteMesaj("Exista o epidemie noua in oras!");
    }
}
