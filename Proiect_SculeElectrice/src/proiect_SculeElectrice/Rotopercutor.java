package proiect_SculeElectrice;

public class Rotopercutor extends SculeElectrice implements ActivitateScule{
    private int turatii, inaltime, percutie, impact;
    private String prindere;

    Rotopercutor(){
        super();
        turatii=0;
        inaltime=0;
        percutie=0;
        impact=0;
        prindere="";
    }

    Rotopercutor(int turatii, int inaltime, int percutie, int impact, String prindere, SculeElectrice scule){
        super(scule);
        this.turatii=turatii;
        this.inaltime=inaltime;
        this.percutie=percutie;
        this.impact=impact;
        this.prindere=prindere;
    }

    Rotopercutor(int turatii, int inaltime, int percutie, int impact, String prindere,
                 String marca, String tipAlimentare, double putere, double greutate, double pret){
        super(marca, tipAlimentare, putere, greutate, pret);
        this.turatii=turatii;
        this.inaltime=inaltime;
        this.percutie=percutie;
        this.impact=impact;
        this.prindere=prindere;
    }
    Rotopercutor(Rotopercutor copie){
        super(copie);
        this.turatii=copie.turatii;
        this.inaltime=copie.inaltime;
        this.percutie=copie.percutie;
        this.impact=copie.impact;
        this.prindere=copie.prindere;
    }
    public String toString(){
        return super.toString()+turatii+"Inaltimea este "+inaltime+"Energie de percutie(J) "+percutie+"Energie de impact: "+impact+"Prindere: "+prindere;
    }

    public int getTuratii() {
        return turatii;
    }

    public int getInaltime() {
        return inaltime;
    }

    public int getPercutie() {
        return percutie;
    }

    public int getImpact() {
        return impact;
    }

    public String getPrindere() {
        return prindere;
    }

    public void setTuratii(int turatii) {
        this.turatii = turatii;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setPercutie(int percutie) {
        this.percutie = percutie;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }

    public void setPrindere(String prindere) {
        this.prindere = prindere;
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
