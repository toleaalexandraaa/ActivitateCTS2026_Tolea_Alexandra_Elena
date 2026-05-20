package ro.ase.cts.clase;

public class ClientAbonat implements IClientNotificat{

    private String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Clientul "+ this.nume + " a primit mesajul: "+mesaj);
    }
}
