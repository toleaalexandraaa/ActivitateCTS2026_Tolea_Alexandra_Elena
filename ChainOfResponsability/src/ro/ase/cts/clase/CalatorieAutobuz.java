package ro.ase.cts.clase;

public class CalatorieAutobuz extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta<5)
            return "Autobuz";
        else
            return this.calatorieHandler.recomandaCalatorie(distanta);
    }
}
