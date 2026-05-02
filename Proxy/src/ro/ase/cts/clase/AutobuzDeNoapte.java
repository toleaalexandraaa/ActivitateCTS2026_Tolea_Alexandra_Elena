package ro.ase.cts.clase;

public class AutobuzDeNoapte implements MijlocDeTransport{
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzDeNoapte(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie() {
        if(mijlocDeTransport.getNrCalatori()>0){
            mijlocDeTransport.opresteInStatie();
        }else {
            System.out.println("Nu opreste in statie -> CALATORI 0");
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocDeTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return mijlocDeTransport.getLinie();
    }
}