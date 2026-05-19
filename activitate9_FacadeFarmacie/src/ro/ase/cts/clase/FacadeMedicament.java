package ro.ase.cts.clase;

public class FacadeMedicament {
    private VerificareReteta verificareReteta;
    private VerificareDisponibilitateMedicament verificareDisponibilitateMedicament;
    private VerificareCardSanatate verificareCardSanatate;


    public FacadeMedicament() {
        this.verificareReteta = new VerificareReteta();
        this.verificareDisponibilitateMedicament = new VerificareDisponibilitateMedicament();
        this.verificareCardSanatate =new VerificareCardSanatate();
    }

    public boolean poateCumparaMedicament(Client client){
        boolean rezultat = verificareReteta.verificaReteta(client)
                && verificareDisponibilitateMedicament.verificaDisponibilitate(client)
                && verificareCardSanatate.verificaCard(client);
        if(rezultat){
            System.out.println("Clientul " + client.getNume() + " poate cumpara medicament.");
        }
        else{
            System.out.println("Clientul " + client.getNume() + " nu poate cumpara medicamentul.");
        }
        return rezultat;
    }
}

