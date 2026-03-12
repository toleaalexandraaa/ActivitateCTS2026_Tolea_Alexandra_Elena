package ro.ase.cts.lazy;

public class Hotel {
    private String denumireHotel;
    private int numarCamere;
    private int numarCameraInchiriate;
    private int numarAngajati;

    public void afisareInchiriereCamera(){
        if(numarCameraInchiriate == numarCamere){
            System.out.println("Nu mai sunt camere disponibile!");
        }
        else{
            System.out.println("Camera a fost inchiriata cu succes!");
            numarCameraInchiriate++;
        }


    }

    public void afisareDescriere(){
       StringBuilder sb = new StringBuilder();
       sb.append(denumireHotel);
       sb.append(numarCamere);
       sb.append(numarAngajati);
       //sb.append(nrCameraInchiriate);
        System.out.println(sb.toString());
    }

    private static Hotel instanta= null;

    private Hotel(String denumireHotel, int numarCamere, int numarAngajati) {
        this.denumireHotel = denumireHotel;
        this.numarCamere = numarCamere;
        this.numarCameraInchiriate = 0;
        this.numarAngajati = numarAngajati;
    }

    public static synchronized Hotel getInstance(String denumire, int nrCamere, int nrAngajati) {
        if(instanta == null){
            instanta = new Hotel(denumire, nrCamere, nrAngajati);

        }
        return instanta;
    }
}
