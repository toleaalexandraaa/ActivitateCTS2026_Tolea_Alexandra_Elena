package ro.ase.cts.clase;

import ro.ase.cts.exceptions.LicenseAlreadySetException;

public class TourismLicense implements AbstractTourismLicense{
    private String licenseNumber;
    private boolean isSet;

    private static TourismLicense instance = null;

    public TourismLicense() {
        this.licenseNumber = "";
        this.isSet = false;
    }

    public static synchronized TourismLicense getInstance() {
        if(instance == null) {
            instance = new TourismLicense();
        }
        return instance;
    }

    @Override
    public synchronized void setLicenseNumber(String licenseNumber) throws LicenseAlreadySetException {
        if (this.isSet) {
            throw new LicenseAlreadySetException("Numarul licentei poate fi setat o singura data.");
        }
        this.licenseNumber = licenseNumber;
        this.isSet = true;

    }

    @Override
    public String getLicenseNumber() {
        return this.licenseNumber;
    }
}
