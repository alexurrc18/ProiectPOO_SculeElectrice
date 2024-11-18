package proiect_SculeElectrice;

public class Slefuitor {
    int diametruDisc,lungimeBanda,tipPrindere;

    Slefuitor(int diametruDisc, int lungimeBanda, int tipPrindere) {
        this.diametruDisc = diametruDisc;
        this.lungimeBanda = lungimeBanda;
        this.tipPrindere = tipPrindere;
    }
    Slefuitor() {
        diametruDisc = 0;
        lungimeBanda = 0;
        tipPrindere = 0;
    }
    Slefuitor(Slefuitor s) {
        diametruDisc = s.diametruDisc;
        lungimeBanda = s.lungimeBanda;
        tipPrindere = s.tipPrindere;
    }
    public String toString() {
        return " diametruDisc :" + diametruDisc + " lungimeBanda :" + lungimeBanda + " tipPrindere :" + tipPrindere;
    }
}
