package ro.ase.cts.clase;

public class HolidayPackage implements AbstractHolidayPackage{

    private String transport;
    private int durataCazare;
    private String tipCamera;
    private int steleHotel;
    private String activitatiExtra;

    public HolidayPackage(String transport, int durataCazare, String tipCamera, int steleHotel, String activitatiExtra) {
        this.transport = transport;
        this.durataCazare = durataCazare;
        this.tipCamera = tipCamera;
        this.steleHotel = steleHotel;
        this.activitatiExtra = activitatiExtra;
    }

    public String getTransport() {
        return transport;
    }

    public int getDurataCazare() {
        return durataCazare;
    }

    public String getTipCamera() {
        return tipCamera;
    }

    public int getSteleHotel() {
        return steleHotel;
    }

    public String getActivitatiExtra() {
        return activitatiExtra;
    }

    @Override
    public void afisareDescriere() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolidayPackage{");
        sb.append("transport='").append(transport).append('\'');
        sb.append(", durataCazare=").append(durataCazare);
        sb.append(", tipCamera='").append(tipCamera).append('\'');
        sb.append(", steleHotel=").append(steleHotel);
        sb.append(", activitatiExtra='").append(activitatiExtra).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
