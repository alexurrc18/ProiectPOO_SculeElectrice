package proiect_SculeElectrice;

public class Compactor extends SculeElectrice implements ActivitateScule{
    int combustibil, adancime, frecventa;

    Compactor(){
        combustibil=0;
        adancime=0;
        frecventa=0;
    }
    Compactor(int combustibil, int adancime, int frecventa){
        this.combustibil=combustibil;
        this.adancime=adancime;
        this.frecventa=frecventa;
    }
    Compactor(Compactor copie){
        this.combustibil=copie.combustibil;
        this.adancime=copie.adancime;
        this.frecventa=copie.frecventa;
    }
    public String toString(){
        return "Combustibilul utilizat este "+combustibil+"Adancimea de compactare este  "+adancime+"Frecventa vibratiilor este "+frecventa;
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
