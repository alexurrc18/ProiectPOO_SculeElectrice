package proiect_SculeElectrice;

public class SurubelnitaElectrica extends SculeElectrice{
    String tipMandrina;
    int turatieNominala;
    boolean trepteViteza;

    SurubelnitaElectrica(){
        tipMandrina = "";
        turatieNominala = 0;
        trepteViteza = false;
    }

    SurubelnitaElectrica(String tipMandrina, int turatieNominala, boolean trepteViteza) {
        this.tipMandrina = tipMandrina;
        this.turatieNominala = turatieNominala;
        this.trepteViteza = trepteViteza;
    }

    SurubelnitaElectrica(SurubelnitaElectrica s) {
        this.tipMandrina = s.tipMandrina;
    }

    public String toString() {
        return "Tip mandrina: "+ tipMandrina;
    }

}
