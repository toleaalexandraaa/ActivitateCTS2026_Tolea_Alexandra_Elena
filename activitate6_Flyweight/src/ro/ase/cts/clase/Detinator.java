package ro.ase.cts.clase;

public class Detinator {
    private String nume;
    private String adresa;
    private String telefon;
    private String email;

    public Detinator(String nume, String adresa, String telefon, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.telefon = telefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
