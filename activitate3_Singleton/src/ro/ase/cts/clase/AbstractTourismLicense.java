package ro.ase.cts.clase;

import ro.ase.cts.exceptions.LicenseAlreadySetException;

public interface AbstractTourismLicense {
    void setLicenseNumber(String licenseNumber) throws LicenseAlreadySetException;
    String getLicenseNumber();
}
