package ro.ase.cts.hotel.clase;

public class FacadeCazareHotel {
    private VerificareRezervare rezervare;
    private VerificareActIdentitate actIdentitate;
    private VerificareDatorii datoriiClient;
    private VerificareCamera camera;

    public FacadeCazareHotel(VerificareRezervare rezervare, VerificareActIdentitate actIdentitate, VerificareDatorii datoriiClient, VerificareCamera camera) {
        this.rezervare = rezervare;
        this.actIdentitate = actIdentitate;
        this.datoriiClient = datoriiClient;
        this.camera = camera;
    }

    public void cazeazaClient(String serieAct, String codRezervare) {
        if (rezervare.existaRezervare(codRezervare)) {

            if (actIdentitate.esteActValid(serieAct)) {

                if (!datoriiClient.areDatorii(serieAct)) {

                    if (camera.esteCameraDisponibila(codRezervare)) {
                        System.out.println("Clientul poate fi cazat.");
                    } else {
                        System.out.println("Clientul nu poate fi cazat deoarece nu exista camera disponibila.");
                    }

                } else {
                    System.out.println("Clientul nu poate fi cazat deoarece are datorii neachitate.");
                }

            } else {
                System.out.println("Clientul nu poate fi cazat deoarece actul de identitate nu este valid.");
            }

        } else {
            System.out.println("Clientul nu poate fi cazat deoarece rezervarea nu exista.");
        }
    }
}

