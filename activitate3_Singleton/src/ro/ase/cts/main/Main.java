package ro.ase.cts.main;

import ro.ase.cts.clase.HolidayPackage;
import ro.ase.cts.clase.HolidayPackageBuilder;
import ro.ase.cts.clase.TourismLicense;
import ro.ase.cts.exceptions.LicenseAlreadySetException;

public class Main {
    public static void main(String[] args) {
       TourismLicense license1 = TourismLicense.getInstance();
       TourismLicense license2 = TourismLicense.getInstance();

       final TourismLicense[] license3= new TourismLicense[1];

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                license3[0] = TourismLicense.getInstance();
            }
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("license1 == license2: " + (license1 == license2));
        System.out.println("license1 == license3: " + (license1 == license3[0]));
        System.out.println("license2 == license3: " + (license2 == license3[0]));

        try {
            license1.setLicenseNumber("RO-12345");
            System.out.println("Numarul licentei este: " + license1.getLicenseNumber());

            license2.setLicenseNumber("RO-99999");
        } catch (LicenseAlreadySetException e) {
            System.out.println("Exceptie: " + e.getMessage());
        }

        HolidayPackage pachet1 = new HolidayPackageBuilder()
                .setDurataCazare(5)
                .setTipCamera("Dubla")
                .setSteleHotel(4)
                .build();

        HolidayPackage pachet2 = new HolidayPackageBuilder()
                .setTransport("Avion")
                .build();

        HolidayPackage pachet3 = new HolidayPackageBuilder()
                .setTransport("Autocar")
                .setDurataCazare(7)
                .setTipCamera("Apartament")
                .setSteleHotel(5)
                .setActivitatiExtra("Excursii si muzee")
                .build();

        pachet1.afisareDescriere();
        pachet2.afisareDescriere();
        pachet3.afisareDescriere();
    }
}