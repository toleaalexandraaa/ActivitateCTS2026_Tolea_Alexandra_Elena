package ro.ase.cts.clase;

public class Medic {

    public boolean areInregistratPacientul(Pacient pacient){
        return pacient.getGravitate()>5;
    }
}
