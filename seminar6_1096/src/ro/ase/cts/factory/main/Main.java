package ro.ase.cts.factory.main;

import ro.ase.cts.factory.clase.FelDeMancare;
import ro.ase.cts.factory.enums.TipDesert;
import ro.ase.cts.factory.enums.TipSupa;
import ro.ase.cts.factory.fabrici.FabricaDesert;
import ro.ase.cts.factory.fabrici.FabricaFelDeMancare;
import ro.ase.cts.factory.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
            FabricaFelDeMancare fabricaFelDeMancare = new FabricaSupa();
            FabricaFelDeMancare fabricaFelDeMancareDesert = new FabricaDesert();

            FelDeMancare supaDeVita = fabricaFelDeMancare.createFelDeMancare(TipSupa.SupaDeVita,200,30.50);
            FelDeMancare supaDeLegume = fabricaFelDeMancare.createFelDeMancare(TipSupa.SupaDeLegume, 150, 20.50);

            FelDeMancare clatite = fabricaFelDeMancareDesert.createFelDeMancare(TipDesert.Clatite, 250, 15.50, 600);
            FelDeMancare papanasi = fabricaFelDeMancareDesert.createFelDeMancare(TipDesert.Papanasi, 300, 25.50, 900);

            supaDeVita.afisareDescriere();
            supaDeLegume.afisareDescriere();

            clatite.afisareDescriere();
            papanasi.afisareDescriere();
    }
}