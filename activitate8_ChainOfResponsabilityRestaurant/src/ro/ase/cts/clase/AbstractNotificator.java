package ro.ase.cts.clase;

public abstract class AbstractNotificator {

    protected AbstractNotificator urmator;

    public void seteazaUrmator(AbstractNotificator urmator) {
        this.urmator = urmator;
    }

    public abstract void notifica(Client client, String mesaj);
}
