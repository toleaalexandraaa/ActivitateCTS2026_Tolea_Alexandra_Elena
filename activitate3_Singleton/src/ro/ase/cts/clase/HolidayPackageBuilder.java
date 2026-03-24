package ro.ase.cts.clase;

public class HolidayPackageBuilder {
    private String transport;
    private int durataCazare;
    private String tipCamera;
    private int steleHotel;
    private String activitatiExtra;

    public HolidayPackageBuilder() {
        this.transport = null;
        this.durataCazare = 0;
        this.tipCamera = null;
        this.steleHotel = 0;
        this.activitatiExtra = null;
    }

    public HolidayPackageBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public HolidayPackageBuilder setDurataCazare(int durataCazare) {
        this.durataCazare = durataCazare;
        return this;
    }

    public HolidayPackageBuilder setTipCamera(String tipCamera) {
        this.tipCamera = tipCamera;
        return this;
    }

    public HolidayPackageBuilder setSteleHotel(int steleHotel) {
        this.steleHotel = steleHotel;
        return this;
    }

    public HolidayPackageBuilder setActivitatiExtra(String activitatiExtra) {
        this.activitatiExtra = activitatiExtra;
        return this;
    }

    public HolidayPackage build() {
        return new HolidayPackage(
                this.transport,
                this.durataCazare,
                this.tipCamera,
                this.steleHotel,
                this.activitatiExtra
        );

    }
}
