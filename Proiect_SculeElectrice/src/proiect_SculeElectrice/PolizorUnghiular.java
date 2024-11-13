package proiect_SculeElectrice;

public class PolizorUnghiular extends SculeElectrice{

    int diametruDisc, supraincalzire;
    String tip;
    double turatia;

    //constructor fara parametri

    public PolizorUnghiular(){
        super();
        diametruDisc = 0;
        supraincalzire = 0;
        turatia = 0;
        tip=" ";
    }

    //constructor cu parametrii

    public PolizorUnghiular(int diametruDisc, int supraincalzire, String tip, double turatia,
                            String marca, String tipAlimentare, double putere, double greutate, double pret){

        super(marca, tipAlimentare, putere, greutate, pret);
        this.diametruDisc=diametruDisc;
        this.supraincalzire=supraincalzire;
        this.turatia=turatia;
        this.tip=tip;
    }

    //constructor copiere

    public PolizorUnghiular(PolizorUnghiular p){
        super(p);
        this.diametruDisc=p.diametruDisc;
        this.supraincalzire=p.supraincalzire;
        this.turatia=p.turatia;
        this.tip=p.tip;
    }

    //rescriere metoda toString

    public String toString(){
        return super.toString()+"\n\tdiametruDisc: "+diametruDisc+"\n\tsupraincalzire: "+supraincalzire+
                "\n\tturatia: "+turatia+"\n\ttip: "+tip;
    }


}

