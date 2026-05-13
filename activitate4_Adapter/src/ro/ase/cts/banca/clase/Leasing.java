package ro.ase.cts.banca.clase;

public class Leasing {
    private String numeClient;
    private double valoareBun;

    public Leasing(String numeClient, double valoareBun) {
        this.numeClient = numeClient;
        this.valoareBun = valoareBun;
    }

    public void acordaLeasing(){
        System.out.println("Framework-ul acorda leasing clientului " + numeClient + " pentru un bun in valoare de " + valoareBun + " lei.");
    }
}
