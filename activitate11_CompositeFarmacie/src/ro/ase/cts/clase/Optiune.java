package ro.ase.cts.clase;

public interface Optiune {
    void adaugaNod(Optiune optiune);
    void stergereNod(Optiune optiune);
    Optiune getNod(int index);
    void descriere();
}
