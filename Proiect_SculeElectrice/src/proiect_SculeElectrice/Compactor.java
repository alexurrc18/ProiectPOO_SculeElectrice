package proiect_SculeElectrice;

public class Compactor extends SculeElectrice implements ActivitateScule{
    int combustibil, adancime, frecventa, motorizare;
    boolean siguranta;

    Compactor(){
        combustibil=0;
        adancime=0;
        frecventa=0;
        motorizare=0;
        siguranta=false;
    }
    Compactor(int combustibil, int adancime, int frecventa, int motorizare, boolean siguranta){
        this.combustibil=combustibil;
        this.adancime=adancime;
        this.frecventa=frecventa;
        this.motorizare=motorizare;
        this.siguranta=siguranta;
    }
    Compactor(Compactor copie){
        this.combustibil=copie.combustibil;
        this.adancime=copie.adancime;
        this.frecventa=copie.frecventa;
        this.motorizare=copie.motorizare;
        this.siguranta=copie.siguranta;
    }
    public String toString(){
        return "Combustibilul utilizat este "+combustibil+"Adancimea de compactare este  "+adancime+"Frecventa vibratiilor este "+frecventa+" motorizarea este "+motorizare+" siguranta este "+siguranta;
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
