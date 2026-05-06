package ro.ase.cts.ProblemaFreestyle.clase;

public class Student {
    private ModSustinere modSustinere;
    private String nume;
    public Student(String nume) {
        modSustinere = new Grila();
        this.nume = nume;
    }
    public Student(String nume, ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
        this.nume = nume;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}