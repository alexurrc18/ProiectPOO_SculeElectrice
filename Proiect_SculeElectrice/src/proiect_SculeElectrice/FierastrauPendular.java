package proiect_SculeElectrice;

public class FierastrauPendular extends SculeElectrice implements ActivitateScule{
    int lungimeCursa, numarCurseMersGol, nivelZgomot;
    String tipPrindere; boolean vitezaReglabila;

    FierastrauPendular() {
        lungimeCursa = 0;
        nivelZgomot = 0;
        numarCurseMersGol = 0;
        tipPrindere = "";
        vitezaReglabila = false;
    }

    FierastrauPendular(int lungimeCursa, int numarCurseMersGol,
                       String tipPrindere, int nivelZgomot, boolean vitezaReglabila) {
        this.lungimeCursa = lungimeCursa;
        this.nivelZgomot = nivelZgomot;
        this.numarCurseMersGol = numarCurseMersGol;
        this.tipPrindere = tipPrindere;
        this.vitezaReglabila = vitezaReglabila;
    }

    FierastrauPendular(FierastrauPendular f){
        lungimeCursa = f.lungimeCursa;
        nivelZgomot = f.nivelZgomot;
        numarCurseMersGol = f.numarCurseMersGol;
        tipPrindere = f.tipPrindere;
        vitezaReglabila = f.vitezaReglabila;
    }

    public String toString(){
        return "Lungime cursă:"+lungimeCursa+"\n Numar Curse:"
                +numarCurseMersGol+"\n Tip Prindere:"+tipPrindere+"\n Nivel zgomot:"+nivelZgomot+"\nViteză reglabilă:" + vitezaReglabila +"\n";
    }

    @Override
    public void opreste() {
        System.out.println("Fierăstrău pendular oprit.");
    }

    @Override
    public void porneste() {
        System.out.println("Fierăstrău pendular pornit " + marca);
    }
}
