package proiect_SculeElectrice;

public class Polizor {
    int diametruDisc,turatie,nivelZgomot;

    Polizor(int diametruDisc, int turatie, int nivelZgomot) {
        this.diametruDisc = diametruDisc;
        this.turatie = turatie;
        this.nivelZgomot = nivelZgomot;
    }
    Polizor() {
        diametruDisc = 0;
        turatie = 0;
        nivelZgomot = 0;
    }
    Polizor(Polizor p) {
        diametruDisc = p.diametruDisc;
        turatie = p.turatie;
        nivelZgomot = p.nivelZgomot;
    }
    public String toString() {
        return " diametruDisc :" + diametruDisc + " turatie :" + turatie + " nivelZgomot :" + nivelZgomot;
    }
}
