package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{
    private MijlocDeTransport autobuz;

    public AutobuzCursaSpeciala(MijlocDeTransport autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getLinie().toLowerCase().contains("speciala")){
            System.out.println("AUTOBUZUL NU OPRESTE, CURSA SPECIALA");
        }else {
            autobuz.opresteInStatie();
        }
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return autobuz.getLinie();
    }
}
