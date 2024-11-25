package proiect_SculeElectrice;

public class PolizorUnghiular extends SculeElectrice implements ActivitateScule{

   private int diametruDisc, supraincalzire;
   private String tip;
   private double turatia, sistemSiguranta;

    //constructor fara parametri

    public PolizorUnghiular(){
        super();
        diametruDisc = 0;
        supraincalzire = 0;
        turatia = 0;
        tip=" ";
        sistemSiguranta = 0;
    }

    //constructor cu parametrii

    public PolizorUnghiular(int diametruDisc, int supraincalzire, String tip, double turatia, double sistemSiguranta,
                            String marca, String tipAlimentare, double putere, double greutate, double pret){

        super(marca, tipAlimentare, putere, greutate, pret);
        this.diametruDisc=diametruDisc;
        this.supraincalzire=supraincalzire;
        this.turatia=turatia;
        this.tip=tip;
        this.sistemSiguranta=sistemSiguranta;
    }

    //constructor copiere

    public PolizorUnghiular(PolizorUnghiular p){
        super(p);
        this.diametruDisc=p.diametruDisc;
        this.supraincalzire=p.supraincalzire;
        this.turatia=p.turatia;
        this.tip=p.tip;
        this.sistemSiguranta=p.sistemSiguranta;
    }

    //rescriere metoda toString

    public String toString(){
        return super.toString()+"\n\tdiametruDisc: "+diametruDisc+"\n\tsupraincalzire: "+supraincalzire+
                "\n\tturatia: "+turatia+"\n\ttip: "+tip+"\n\tsistemSiguranta: "+sistemSiguranta;
    }

    @Override
    public void opreste() {
        System.out.println("Oprit.");
    }

    @Override
    public void porneste() {
        System.out.println("Pornit.");
    }


    // set si get

    public void setDiametruDisc(){
        this.diametruDisc=diametruDisc;
    }
    public void setSupraincalzire(){
        this.supraincalzire=supraincalzire;
    }
    public void setTuratia(){
        this.turatia=turatia;
    }
    public void setTip(){
        this.tip=tip;
    }
    public void setSistemSiguranta(){
        this.sistemSiguranta=sistemSiguranta;
    }

    public int getDiametruDisc(){
        return diametruDisc;
    }
    public int getSupraincalzire(){
        return supraincalzire;
    }
    public String getTip(){
        return tip;
    }
    public double getTuratia(){
        return turatia;
    }
    public double getSistemSiguranta(){
        return sistemSiguranta;
    }

}

