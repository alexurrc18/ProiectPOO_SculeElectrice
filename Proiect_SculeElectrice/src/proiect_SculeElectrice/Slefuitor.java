package proiect_SculeElectrice;

public class Slefuitor extends SculeElectrice implements ActivitateScule{
    private int diametruDisc,lungimeBanda;
    private String tipPrindere,ergonomie,sisColectPraf;

    Slefuitor(int diametruDisc, int lungimeBanda, String tipPrindere, String ergonomie, String sisColectPraf,
              String marca, String tipAlimentare, double putere, double greutate, double pret){
        super(marca, tipAlimentare, putere, greutate, pret);
        this.diametruDisc = diametruDisc;
        this.lungimeBanda = lungimeBanda;
        this.tipPrindere = tipPrindere;
        this.ergonomie = ergonomie;
        this.sisColectPraf = sisColectPraf;
    }
    Slefuitor(int diametruDisc, int lungimeBanda, String tipPrindere, String ergonomie, String sisColectPraf,SculeElectrice scule) {
        super(scule);
        this.diametruDisc = diametruDisc;
        this.lungimeBanda = lungimeBanda;
        this.tipPrindere = tipPrindere;
        this.ergonomie = ergonomie;
        this.sisColectPraf = sisColectPraf;
    }
    Slefuitor() {
        super();
        diametruDisc = 0;
        lungimeBanda = 0;
        tipPrindere = "";
        ergonomie = "";
        sisColectPraf = "";
    }
    Slefuitor(Slefuitor s) {
        super(s);
        diametruDisc = s.diametruDisc;
        lungimeBanda = s.lungimeBanda;
        tipPrindere = s.tipPrindere;
        ergonomie = s.ergonomie;
        sisColectPraf = s.sisColectPraf;
    }



    public void setDiametruDisc(int diametruDisc){
        this.diametruDisc = diametruDisc;
    }
    public void setLungimeBanda(int lungimeBanda){
        this.lungimeBanda = lungimeBanda;
    }
    public void setTipPrindere(String tipPrindere){
        this.tipPrindere = tipPrindere;
    }
    public void setErgonomie(String ergonomie){
        this.ergonomie = ergonomie;
    }
    public void setSisColectPraf(String sisColectPraf){
        this.sisColectPraf = sisColectPraf;
    }


    public int getDiametruDisc(){
        return diametruDisc;
    }
    public int getLungimeBanda(){
        return lungimeBanda;
    }
    public String getTipPrindere(){
        return tipPrindere;
    }
    public String getErgonomie(){
        return ergonomie;
    }
    public String getSisColectPraf(){
        return sisColectPraf;
    }




    public String toString() {
        return super.toString() + diametruDisc + " lungimeBanda :" + lungimeBanda + " tipPrindere :" + tipPrindere + " ergonomie :" + ergonomie + " sisColectPraf :" + sisColectPraf;
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
