package ro.ase.cts.ProblemaFreestyle.main;
import ro.ase.cts.ProblemaFreestyle.clase.ProbaOrala;
import ro.ase.cts.ProblemaFreestyle.clase.ProbaScrisa;
import ro.ase.cts.ProblemaFreestyle.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kim");
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();
    }
}