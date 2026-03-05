package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantare = 10;

	public static void setSumaFinantare(int sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
	}
	
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append("ocupatie='").append(ocupatie).append('\'');
		sb.append("salariu='").append(salariu).append('\'');
		sb.append("}");
		return sb.toString();
	}
	
	
	public void afisareFinantare() {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + Angajat.sumaFinantare + " Euro/zi in proiect.");
	}
	
}
