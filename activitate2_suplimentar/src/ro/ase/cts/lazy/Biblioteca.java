package ro.ase.cts.lazy;

public class Biblioteca {
    private  String numeBiblioteca;
    private int numarSectiuni;
    private int numarCartiDisponibile;
    private int numarCititori;

    private static Biblioteca instanta = null;


    public Biblioteca(String numeBiblioteca, int numarSectiuni, int numarCartiDisponibile) {
        this.numeBiblioteca = numeBiblioteca;
        this.numarSectiuni = numarSectiuni;
        this.numarCartiDisponibile = numarCartiDisponibile;
        this.numarCititori = 0;
    }

    public static synchronized Biblioteca getInstance(String nume, int sectiuni, int carti) {
        if(instanta == null){
            instanta = new Biblioteca(nume, sectiuni, carti);
        }
        return instanta;
    }

    public void imprumutaCarte() {
        if (numarCartiDisponibile == 0) {
            System.out.println("Nu mai sunt carti disponibile!");
        } else{
            System.out.println("Cartea a fost imprumutata!");
            numarCartiDisponibile--;
            numarCititori++;
        }
    }

    public void afisareDescriere(){
        StringBuilder sb= new StringBuilder();
        sb.append("Biblioteca: ").append(numeBiblioteca);
        sb.append(", numarSectiuni: ").append(numarSectiuni);
        sb.append(", numarCarti: ").append(numarCartiDisponibile);
        sb.append(", numarCititori: ").append(numarCititori);
        System.out.println(sb.toString());
    }
}
