package ro.ase.cts.clase;

public class NotificareSMS extends AbstractNotificator {

    @Override
        public void notifica(Client client, String mesaj) {
         if (client.getTelefon() != null) {
                    System.out.println("SMS trimis catre clientul " + client.getNume()
                            + " la numarul " + client.getTelefon()
                            + " cu mesajul: " + mesaj);
                } else {
                    System.out.println("Clientul " + client.getNume()
                            + " nu are numar de telefon. Se trimite notificarea mai departe.");

                    if (this.urmator != null) {
                        this.urmator.notifica(client, mesaj);
                    }
                }
         }
    }
