package ro.ase.cts.clase;

public class RezervareRestaurant implements IRezervare{
    private Client client;

    public RezervareRestaurant(Client client) {
        this.client = client;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println("Rezervare pentru clientul " + client.getNume()
        + ", numar telefon: " + client.getTelefon()+
                ", adresa email: " + client.getEmail()
        +", masa: " + rezervare.getNrMasa()+
                ", numar persoane: " + rezervare.getNrPersoane()+
                ", ora: " + rezervare.getOraRezervare());
    }


}
