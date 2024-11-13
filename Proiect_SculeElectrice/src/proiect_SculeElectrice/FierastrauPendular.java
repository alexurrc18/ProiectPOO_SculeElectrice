package proiect_SculeElectrice;

public class FierastrauPendular extends SculeElectrice {
    int lungimeCursa, numarCurseMersGol, nivelZgomot;
    String tipPrindere;

    FierastrauPendular() {
        lungimeCursa = 0;
        nivelZgomot = 0;
        numarCurseMersGol = 0;
        tipPrindere = "";
    }

    FierastrauPendular(int lungimeCursa, int numarCurseMersGol,
                       String tipPrindere, int nivelZgomot) {
        this.lungimeCursa = lungimeCursa;
        this.nivelZgomot = nivelZgomot;
        this.numarCurseMersGol = numarCurseMersGol;
        this.tipPrindere = tipPrindere;
    }

    FierastrauPendular(FierastrauPendular f){
        lungimeCursa = f.lungimeCursa;
        nivelZgomot = f.nivelZgomot;
        numarCurseMersGol = f.numarCurseMersGol;
        tipPrindere = f.tipPrindere;
    }

    public String toString(){
        return "Lungime cursă:"+lungimeCursa+"\n Numar Curse:"
                +numarCurseMersGol+"\n Tip Prindere:"+tipPrindere+"\n Nivel zgomot:"+nivelZgomot+"\n";
    }
}
