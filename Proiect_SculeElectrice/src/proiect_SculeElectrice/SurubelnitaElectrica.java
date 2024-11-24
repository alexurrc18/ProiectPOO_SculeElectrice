package proiect_SculeElectrice;

public class SurubelnitaElectrica extends SculeElectrice implements ActivitateScule {
    private String tipMandrina;
    private int turatieNominala, capacitateBaterie;
    private boolean trepteViteza;
    private double cupluMaxim;

    SurubelnitaElectrica(SurubelnitaElectrica scula1, String pătrat, int capacitateBaterie, int turatieNominala, double cupluMaxim, boolean trepteViteza){
        super();
        tipMandrina = "";
        this.turatieNominala = 0;
        this.trepteViteza = false;
    }

    SurubelnitaElectrica(String marca, String tipAlimentare, double putere, double greutate, double pret,
                         String tipMandrina,int capacitateBaterie,  int turatieNominala, double cupluMaxim, boolean trepteViteza) {
        super(marca, tipAlimentare, putere, greutate, pret);
        this.tipMandrina = tipMandrina;
        this.turatieNominala = turatieNominala;
        this.trepteViteza = trepteViteza;
        this.capacitateBaterie = capacitateBaterie;
        this.cupluMaxim = cupluMaxim;
    }

    SurubelnitaElectrica(SculeElectrice s,
                         String tipMandrina,int capacitateBaterie,  int turatieNominala, double cupluMaxim, boolean trepteViteza) {
        super(s);
        this.tipMandrina = tipMandrina;
        this.turatieNominala = turatieNominala;
        this.trepteViteza = trepteViteza;
        this.capacitateBaterie = capacitateBaterie;
        this.cupluMaxim = cupluMaxim;
    }

    SurubelnitaElectrica(SurubelnitaElectrica s) {
        super(s);
        this.tipMandrina = s.tipMandrina;
        this.turatieNominala = s.turatieNominala;
        this.trepteViteza = s.trepteViteza;
        this.capacitateBaterie = s.capacitateBaterie;
        this.cupluMaxim = s.cupluMaxim;
    }

    public void setTipMandrina(String tipMandrina) {
        this.tipMandrina = tipMandrina;
    }
    public void setTuratieNominala(int turatieNominala) {
        this.turatieNominala = turatieNominala;
    }
    public void setTrepteViteza(boolean trepteViteza) {
        this.trepteViteza = trepteViteza;
    }
    public void setCapacitateBaterie(int capacitateBaterie) {
        this.capacitateBaterie = capacitateBaterie;
    }
    public void setCupluMaxim(double cupluMaxim) {
        this.cupluMaxim = cupluMaxim;
    }

    public String getTipMandrina() {
        return tipMandrina;
    }
    public int getTuratieNominala() {
        return turatieNominala;
    }
    public boolean isTrepteViteza() {
        return trepteViteza;
    }
    public int getCapacitateBaterie() {
        return capacitateBaterie;
    }
    public double getCupluMaxim() {
        return cupluMaxim;
    }



    public String toString() {
        return super.toString()+ "Tip mandrina: "+ tipMandrina + "\nTuratie nominala: " + turatieNominala +"\nTrepte viteza: "+ trepteViteza + "\nCapacitate baterie: " +capacitateBaterie + "\nCuplu maxim: " + cupluMaxim +"\n";
    }

    @Override
    public void opreste() {
        System.out.println("Surubelnita Electrica a fost oprită.");
    }

    @Override
    public void porneste() {
        System.out.println("Surubelnita Electrica a fost pornită.");
    }

}
