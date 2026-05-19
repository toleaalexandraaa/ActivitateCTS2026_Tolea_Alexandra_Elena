package ro.ase.cts.clase;

public class NotificareEmail extends AbstractNotificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getEmail() != null) {
            System.out.println("Email trimis catre clientul " + client.getNume()
                    + " la adresa " + client.getEmail()
                    + " cu mesajul: " + mesaj);
        } else {
            System.out.println("Clientul " + client.getNume()
                    + " nu are adresa de mail. Se trimite notificarea mai departe.");

            if (this.urmator != null) {
                this.urmator.notifica(client, mesaj);
            }
        }
    }
}

