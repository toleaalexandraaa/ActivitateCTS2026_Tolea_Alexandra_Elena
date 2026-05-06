package ro.ase.cts.STB.clase;

public class Autobuz {
    private String marca;

    public Autobuz(String marca) {
        this.marca = marca;
    }

    public void pornestePeTraseu(int nrLinie){
        System.out.println("Autobuzul "+this.marca+" merge pe traseul: "+nrLinie);
    }
}