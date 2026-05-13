package ro.ase.cts.hotel.clase;

public class VerificareActIdentitate {
    public boolean esteActValid(String serieAct){

        if(serieAct.length()==8){
            System.out.println("Actul este valid");
            return true;
        }else{
            System.out.println("Actul nu este invalid");
            return false;
        }
    }
}
