package proiect_SculeElectrice;

public class SurubelnitaElectrica extends SculeElectrice implements ActivitateScule {
    String tipMandrina;
    int turatieNominala, capacitateBaterie;
    boolean trepteViteza;
    double cupluMaxim;

    SurubelnitaElectrica(SculeElectrice scula1, String pătrat, int capacitateBaterie, int turatieNominala, double cupluMaxim, boolean trepteViteza){
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

    SurubelnitaElectrica(SurubelnitaElectrica s,
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

    public String toString() {
        return super.toString()+ "Tip mandrina: "+ tipMandrina + "\nTuratie nominala: " + turatieNominala +"\nTrepte viteza: "+ trepteViteza + "\nCapacitate baterie: " +capacitateBaterie + "\nCuplu maxim: " + cupluMaxim +"\n";
    }

    @Override
    public void opreste() {
        System.out.println("Surubelnita Electrica oprită.");
    }

    @Override
    public void porneste() {
        System.out.println("Surubelnita Electrica pornită.");
    }

}
