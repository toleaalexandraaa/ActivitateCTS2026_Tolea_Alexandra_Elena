package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.NotificareEmail;
import ro.ase.cts.clase.NotificareManager;
import ro.ase.cts.clase.NotificareSMS;

public class Main {
    public static void main(String[] args) {
        Client clientCuDate = new Client("Ana", "0722222222", "ana@gmail.com");
        Client clientDoarCuEmail=new Client(
                "Mara",
                null,
                "mara@gmail.com"
        );
        Client clientFaraDate=new Client("Ioana", null, null);
        NotificareSMS notificareSMS = new NotificareSMS();
        NotificareEmail notificareEmail = new NotificareEmail();
        NotificareManager notificareManager=new NotificareManager();

        notificareSMS.seteazaUrmator(notificareEmail);
        notificareEmail.seteazaUrmator(notificareManager);

        String mesaj= "Avem o noua oferta la restaurant";

        System.out.println("Notificare client cu date:");
        notificareSMS.notifica(clientCuDate, mesaj);

        System.out.println("Notificare client doar email:");
        notificareSMS.notifica(clientDoarCuEmail, mesaj);

        System.out.println("Notificare client fara date:");
        notificareSMS.notifica(clientFaraDate, mesaj);


    }
}