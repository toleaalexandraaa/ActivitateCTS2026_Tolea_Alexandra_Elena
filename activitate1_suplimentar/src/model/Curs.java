package model;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private Profesor profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void adaugaStudent(Student student) {
        studenti.add(student);
    }

    public void afiseazaStudenti(){
        for (Student student : studenti) {
            System.out.println(student.getNume());
        }
    }
}
