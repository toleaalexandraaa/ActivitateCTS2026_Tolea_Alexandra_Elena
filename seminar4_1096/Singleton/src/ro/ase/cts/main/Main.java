package ro.ase.cts.main;

import ro.ase.cts.lazy.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Hotel 1", 2, 1);
        Hotel hotel2 = Hotel.getInstance("Hotel 2", 6, 4);

        hotel1.afisareInchiriereCamera();
        hotel1.afisareInchiriereCamera();

        hotel2.afisareInchiriereCamera();
        hotel2.afisareInchiriereCamera();


    }
}
