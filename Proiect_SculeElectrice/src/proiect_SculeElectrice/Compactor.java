package proiect_SculeElectrice;

public class Compactor extends SculeElectrice implements ActivitateScule{
    private int adancime, frecventa, motorizare;
    private String combustibil;
    private boolean siguranta;

    Compactor(){
        super();
        combustibil="";
        adancime=0;
        frecventa=0;
        motorizare=0;
        siguranta=false;
    }
    Compactor(String combustibil, int adancime, int frecventa, int motorizare, boolean siguranta,
              String marca, String tipAlimentare, double putere, double greutate, double pret){
        super(marca, tipAlimentare, putere, greutate, pret);
        this.combustibil=combustibil;
        this.adancime=adancime;
        this.frecventa=frecventa;
        this.motorizare=motorizare;
        this.siguranta=siguranta;
    }
    Compactor(Compactor copie){
        super(copie);
        this.combustibil=copie.combustibil;
        this.adancime=copie.adancime;
        this.frecventa=copie.frecventa;
        this.motorizare=copie.motorizare;
        this.siguranta=copie.siguranta;
    }
    public String toString(){
        return super.toString()+combustibil+"Adancimea de compactare este  "+adancime+"Frecventa vibratiilor este "+frecventa+" motorizarea este "+motorizare+" siguranta este "+siguranta;
    }

    public int getAdancime() {
        return adancime;
    }

    public int getFrecventa() {
        return frecventa;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public boolean isSiguranta() {
        return siguranta;
    }

    public int getMotorizare() {
        return motorizare;
    }

    public void setAdancime(int adancime) {
        this.adancime = adancime;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public void setFrecventa(int frecventa) {
        this.frecventa = frecventa;
    }

    public void setMotorizare(int motorizare) {
        this.motorizare = motorizare;
    }

    public void setSiguranta(boolean siguranta) {
        this.siguranta = siguranta;
    }
    Compactor(String combustibil, int adancime, int frecventa, int motorizare, boolean siguranta, SculeElectrice scule) {
        super(scule);
        this.combustibil = combustibil;
        this.adancime = adancime;
        this.frecventa = frecventa;
        this.motorizare = motorizare;
        this.siguranta = siguranta;
    }
    @Override
    public void opreste() {
        System.out.println("Oprit.");
    }

    @Override
    public void porneste() {
        System.out.println("Pornit.");
    }
}
