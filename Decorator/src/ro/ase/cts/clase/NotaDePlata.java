package ro.ase.cts.clase;


public class NotaDePlata implements NotaDePlataAbstract{
    private Float suma;
    private String data;

    public NotaDePlata(Float suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println("\nLa data "+this.data+" a fost platita nota in suma de "+this.suma+" Lei.");
    }
}