package proiect_SculeElectrice;

public class            FierastrauPendular extends SculeElectrice implements ActivitateScule{
    private int lungimeCursa, numarCurseMersGol, nivelZgomot;
    private String tipPrindere; private boolean vitezaReglabila;

    FierastrauPendular() {
        super();
        lungimeCursa = 0;
        nivelZgomot = 0;
        numarCurseMersGol = 0;
        tipPrindere = "";
        vitezaReglabila = false;
    }

    FierastrauPendular(String marca, String tipAlimentare, double putere, double greutate, double pret,
                       int lungimeCursa, int numarCurseMersGol, String tipPrindere, int nivelZgomot, boolean vitezaReglabila) {
        super(marca, tipAlimentare, putere, pret, greutate);
        this.lungimeCursa = lungimeCursa;
        this.nivelZgomot = nivelZgomot;
        this.numarCurseMersGol = numarCurseMersGol;
        this.tipPrindere = tipPrindere;
        this.vitezaReglabila = vitezaReglabila;
    }

    FierastrauPendular(SculeElectrice s,
                       int lungimeCursa, int numarCurseMersGol, String tipPrindere, int nivelZgomot, boolean vitezaReglabila) {
        super(s);
        this.lungimeCursa = lungimeCursa;
        this.nivelZgomot = nivelZgomot;
        this.numarCurseMersGol = numarCurseMersGol;
        this.tipPrindere = tipPrindere;
        this.vitezaReglabila = vitezaReglabila;
    }

    FierastrauPendular(FierastrauPendular f){
        super(f);
        lungimeCursa= f.lungimeCursa;
        nivelZgomot = f.nivelZgomot;
        numarCurseMersGol = f.numarCurseMersGol;
        tipPrindere = f.tipPrindere;
        vitezaReglabila = f.vitezaReglabila;
    }


    public void setLungimeCursa(int lungimeCursa) {
        this.lungimeCursa = lungimeCursa;
    }
    public void setNumarCurseMersGol(int numarCurseMersGol) {
        this.numarCurseMersGol = numarCurseMersGol;
    }
    public void setTipPrindere(String tipPrindere) {
        this.tipPrindere = tipPrindere;
    }
    public void setVitezaReglabila(boolean vitezaReglabila) {
        this.vitezaReglabila = vitezaReglabila;
    }


    public int getLungimeCursa(){
        return lungimeCursa;
    }
    public int getNumarCurseMersGol(){
        return numarCurseMersGol;
    }
    public String getTipPrindere(){
        return tipPrindere;
    }
    public int getNivelZgomot(){
        return nivelZgomot;
    }
    public boolean getVitezaReglabila(){
        return vitezaReglabila;
    }




    public String toString(){
        return super.toString()+"Lungime cursă:"+lungimeCursa+"\n Numar Curse:"
                +numarCurseMersGol+"\n Tip Prindere:"+tipPrindere+"\n Nivel zgomot:"+nivelZgomot+"\nViteză reglabilă:" + vitezaReglabila +"\n";
    }

    @Override
    public void opreste() {
        System.out.println("Fierăstrău pendular a fost oprit.");
    }

    @Override
    public void porneste() {
        System.out.println("Fierăstrău pendular a fost pornit.");
    }
}
