package ro.ase.cts.hotel.clase;

public class VerificareCamera {
    public boolean esteCameraDisponibila(String codRezervare) {
        if (codRezervare.equals("R100")) {
            System.out.println("Exista camera disponibila pentru rezervare.");
            return true;
        } else {
            System.out.println("Nu exista camera disponibila pentru rezervare.");
            return false;
        }
    }
}
