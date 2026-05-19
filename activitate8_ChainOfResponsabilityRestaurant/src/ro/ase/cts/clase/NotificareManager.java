package ro.ase.cts.clase;

public class NotificareManager extends AbstractNotificator{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Notificare catre manager: clientul "
                + client.getNume()
                + " nu are nici numar de telefon, nici adresa de email.");
        }
    }
