package proiect_SculeElectrice;

public class Polizor extends SculeElectrice implements ActivitateScule{
    private int diametruDisc,turatie,nivelZgomot;
    private String sistRacire;
    private boolean siguranta;

    Polizor(int diametruDisc, int turatie, int nivelZgomot, String sistRacire, boolean siguranta,
            String marca, String tipAlimentare, double putere, double greutate, double pret){
        super(marca, tipAlimentare, putere, greutate, pret);
        this.diametruDisc = diametruDisc;
        this.turatie = turatie;
        this.nivelZgomot = nivelZgomot;
        this.sistRacire = sistRacire;
        this.siguranta = siguranta;
    }
    Polizor(int diametruDisc, int turatie, int nivelZgomot, String sistRacire, boolean siguranta,SculeElectrice scule){
        super(scule);
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
        sistRacire = "";
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



    public void setDiametruDisc(int diametruDisc){
        this.diametruDisc = diametruDisc;
    }
    public void setTuratie(int turatie){
        this.turatie = turatie;
    }
    public void setNivelZgomot(int nivelZgomot){
        this.nivelZgomot = nivelZgomot;
    }
    public void setSistRacire(String sistRacire){
        this.sistRacire = sistRacire;
    }
    public void setSiguranta(boolean siguranta){
        this.siguranta = siguranta;
    }


    public int getDiametruDisc(){
        return diametruDisc;
    }
    public int getTuratie(){
        return turatie;
    }
    public int getNivelZgomot(){
        return nivelZgomot;
    }
    public String getSistRacire(){
        return sistRacire;
    }
    public boolean getSiguranta(){
        return siguranta;
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
