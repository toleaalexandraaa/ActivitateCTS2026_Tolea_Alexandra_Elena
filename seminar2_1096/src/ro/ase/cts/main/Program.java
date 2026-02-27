package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.loaders.AngajatiLoaders;
import ro.ase.cts.clase.loaders.AplicantiLoaders;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantiLoaders loader = new AngajatiLoaders();

		try {
			listaAngajati =loader.load("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
