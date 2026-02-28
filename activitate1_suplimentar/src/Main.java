import model.Curs;
import model.Profesor;
import model.Student;

public class Main {
    public static void main(String[] args) {

        Profesor profesor = new Profesor("Ion", 42, "P200");
        Student student1 = new Student("Alexandra", 22, "S001");
        Student student2 = new Student("Ana", 23, "S002");

        Curs curs= new Curs("CTS", 5, profesor);
        curs.adaugaStudent(student1);
        curs.adaugaStudent(student2);
        System.out.println("Curs: " + curs.getNumeCurs() + ", credite: " + curs.getCredite());
        System.out.println("Profesor: " + profesor.getNume());

        profesor.preda();
        curs.afiseazaStudenti();
    }
}