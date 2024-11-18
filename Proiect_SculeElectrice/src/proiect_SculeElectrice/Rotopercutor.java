package proiect_SculeElectrice;

public class Rotopercutor extends SculeElectrice{
    int turatii, inaltime, percutie;

    Rotopercutor(){
        turatii=0;
        inaltime=0;
        percutie=0;
    }
    Rotopercutor(int turatii, int inaltime, int percutie){
        this.turatii=turatii;
        this.inaltime=inaltime;
        this.percutie=percutie;
    }
    Rotopercutor(Rotopercutor copie){
        this.turatii=copie.turatii;
        this.inaltime=copie.inaltime;
        this.percutie=copie.percutie;
    }
    public String toString(){
        return "Numarul de turatii este "+turatii+"Inaltimea este "+inaltime+"Energie de percutie(J) "+percutie;
    }
}
