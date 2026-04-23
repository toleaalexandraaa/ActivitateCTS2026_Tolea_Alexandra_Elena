package ro.ase.cts.Adapter.main;
import ro.ase.cts.Adapter.farmacie.Medicament;
import ro.ase.cts.Adapter.spital.MedicamentAdapter;

public class Main {
    private static void procuraMedicament(Medicament medicament){
        medicament.cumparaMedicament();

    }
    public static void main(String[] args) {
        Medicament medicamentFarmacie = new Medicament("Nurofen");
        ro.ase.cts.Adapter.spital.Medicament medicamentSpital = new ro.ase.cts.Adapter.spital.Medicament("Algocalmin", 22);

        medicamentFarmacie.cumparaMedicament();
        medicamentSpital.achizitioneazaMedicament();
        procuraMedicament(medicamentFarmacie);
      //procuraMedicament(medicamentSpital);

        MedicamentAdapter medicamentAdapter= new MedicamentAdapter(medicamentSpital);
        procuraMedicament(medicamentAdapter);


    }
}