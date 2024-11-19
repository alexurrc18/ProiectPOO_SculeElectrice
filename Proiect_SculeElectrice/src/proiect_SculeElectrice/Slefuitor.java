package proiect_SculeElectrice;

public class Slefuitor extends SculeElectrice implements ActivitateScule{
    int diametruDisc,lungimeBanda,tipPrindere,ergonomie,sisColectPraf;

    Slefuitor(int diametruDisc, int lungimeBanda, int tipPrindere, int ergonomie, int sisColectPraf) {
        this.diametruDisc = diametruDisc;
        this.lungimeBanda = lungimeBanda;
        this.tipPrindere = tipPrindere;
        this.ergonomie = ergonomie;
        this.sisColectPraf = sisColectPraf;
    }
    Slefuitor() {
        diametruDisc = 0;
        lungimeBanda = 0;
        tipPrindere = 0;
        ergonomie = 0;
        sisColectPraf = 0;
    }
    Slefuitor(Slefuitor s) {
        diametruDisc = s.diametruDisc;
        lungimeBanda = s.lungimeBanda;
        tipPrindere = s.tipPrindere;
        ergonomie = s.ergonomie;
        sisColectPraf = s.sisColectPraf;
    }
    public String toString() {
        return " diametruDisc :" + diametruDisc + " lungimeBanda :" + lungimeBanda + " tipPrindere :" + tipPrindere + " ergonomie :" + ergonomie + " sisColectPraf :" + sisColectPraf;
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
