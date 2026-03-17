package ro.ase.cts.spital.Builder;

public class InternareBuilderAlternativ implements InternareBuilderAbstractA{

    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;

    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuciCamera = false;
        this.halat = false;
    }

    public InternareBuilderAlternativ setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilderAlternativ setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public InternareBuilderAlternativ setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }

    @Override
    public Internare build(String nume) {
        Internare internare= new Internare(this.patRabatabil, this.micDejun, this.papuciCamera, this.halat, nume);
        return  internare;
    }
}
