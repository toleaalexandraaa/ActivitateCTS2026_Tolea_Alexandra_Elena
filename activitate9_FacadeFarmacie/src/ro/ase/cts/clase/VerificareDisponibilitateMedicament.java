package ro.ase.cts.clase;

public class VerificareDisponibilitateMedicament {
    public boolean verificaDisponibilitate(Client client){
        return client.isMedicamentDisponibil();
    }
}
