package proiect_SculeElectrice;

public class SurubelnitaElectrica extends SculeElectrice implements ActivitateScule {
    String tipMandrina;
    int turatieNominala, capacitateBaterie;
    boolean trepteViteza;
    double cupluMaxim;

    SurubelnitaElectrica(){
        super();
        tipMandrina = "";
        turatieNominala = 0;
        trepteViteza = false;
    }

    SurubelnitaElectrica(String tipMandrina,int capacitateBaterie,  int turatieNominala, double cupluMaxim, boolean trepteViteza,
        String marca, String tipAlimentare, double putere, double greutate, double pret) {
        super(marca, tipAlimentare, putere, greutate, pret);
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
