package ro.ase.cts.prototype.clase;

public class Rezervare implements PrototypeRezervare {
    private String numeClient;
    private int nrPersoane;
    private String ora;
    private String nrTelefon;

    public Rezervare(String numeClient, String ora, int nrPersoane, String nrTelefon){
        if(numeClient.length()>=2){
            this.numeClient=numeClient;
        } else{
            this.numeClient= "Client";
        }

        this.ora=ora;

        if(nrPersoane > 0){
            this.nrPersoane=nrPersoane;
        }else{
            this.nrPersoane= 1;
        }

        if(nrTelefon.length()==10){
            this.nrTelefon=nrTelefon;
        }else{
            this.nrTelefon="invalid";
        }
    }

    private Rezervare(){

    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public PrototypeRezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.ora = this.ora;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.nrTelefon = this.nrTelefon;
        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
