package ro.ase.cts;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.loaders.AngajatiLoaders;
import ro.ase.cts.loaders.AplicantiLoaders;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantiLoaders loader = new AngajatiLoaders();

		try {
			listaAngajati =loader.load("angajati.txt");
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
				angajat.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
