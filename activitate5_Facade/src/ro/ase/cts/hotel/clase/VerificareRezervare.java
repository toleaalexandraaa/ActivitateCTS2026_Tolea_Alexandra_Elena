package ro.ase.cts.hotel.clase;

public class VerificareRezervare {

    public boolean existaRezervare(String codRezervare){
        if(codRezervare.equals("R100")){
            System.out.println("Rezervarea exista in sistem");
            return true;
        }else{
            System.out.println("Rezervarea nu exista in sistem");
            return false;
        }
    }
}
