package proiect_SculeElectrice;

public class Polizor extends SculeElectrice implements ActivitateScule{
    int diametruDisc,turatie,nivelZgomot,sistRacire;
    boolean siguranta;

    Polizor(int diametruDisc, int turatie, int nivelZgomot, int sistRacire, boolean siguranta,
            String marca, String tipAlimentare, double putere, double greutate, double pret){
        super(marca, tipAlimentare, putere, greutate, pret);
        this.diametruDisc = diametruDisc;
        this.turatie = turatie;
        this.nivelZgomot = nivelZgomot;
        this.sistRacire = sistRacire;
        this.siguranta = siguranta;
    }
    Polizor() {
        super();
        diametruDisc = 0;
        turatie = 0;
        nivelZgomot = 0;
        sistRacire = 0;
        siguranta = false;
    }
    Polizor(Polizor p) {
        super(p);
        diametruDisc = p.diametruDisc;
        turatie = p.turatie;
        nivelZgomot = p.nivelZgomot;
        sistRacire = p.sistRacire;
        siguranta = p.siguranta;
    }
    public String toString() {
        return super.toString() + diametruDisc + " turatie :" + turatie + " nivelZgomot :" + nivelZgomot + "sistRacire :" + sistRacire+"siguranta :" + siguranta;
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
