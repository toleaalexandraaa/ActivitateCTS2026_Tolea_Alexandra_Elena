package ro.ase.cts.Adapter.spital;

import ro.ase.cts.Adapter.farmacie.Medicament;

public class MedicamentAdapter extends Medicament {
   private ro.ase.cts.Adapter.spital.Medicament medicamentSpital;

    public MedicamentAdapter(ro.ase.cts.Adapter.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNumeMedicament());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
