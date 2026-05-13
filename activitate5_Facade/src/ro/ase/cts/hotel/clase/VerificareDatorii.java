package ro.ase.cts.hotel.clase;

public class VerificareDatorii {
    public boolean areDatorii(String serieAct){
        if(serieAct.equals("AB9999")){
            System.out.println("Clientul are datorii");
            return true;
        }else {
            System.out.println("Clientul nu are datorii");
        return false;
        }
    }
}
