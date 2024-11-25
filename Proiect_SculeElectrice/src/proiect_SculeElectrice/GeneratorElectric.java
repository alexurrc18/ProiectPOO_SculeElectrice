package proiect_SculeElectrice;
        
public class GeneratorElectric extends SculeElectrice implements ActivitateScule {
     private int voltaj, cc;
     private double frecventa;
    private String carburant, tipCurent;
    
    //constructor fara parametri
    
    public GeneratorElectric(){
        super();
        voltaj=0;
        cc=0;
        frecventa=0;
        carburant=" ";
        tipCurent=" ";
               
    }
    
    //constructor cu parametri
    
    public GeneratorElectric(String tipCurent,int voltaj, int cc,double frecventa, String carburant,String marca, String tipAlimentare, double putere, double greutate, double pret){
        super(marca, tipAlimentare, putere, greutate,pret);
        this.voltaj=voltaj;
        this.cc=cc;
        this.frecventa=frecventa;
        this.carburant=carburant;
        this.tipCurent=tipCurent;
    }
    //constructor de copiere
    
    public GeneratorElectric(GeneratorElectric g){
        super(g);
        this.voltaj=g.voltaj;
        this.cc=g.cc;
        this.frecventa=g.frecventa;
        this.carburant=g.carburant;
        this.tipCurent=g.tipCurent;
    }
    //redefinire metoda toString
    
    
   // @Override
    public String toString(){
        return super.toString()+"\n\tvoltaj:"+voltaj+"\n\tcc:"+cc+"\n\tfrecventa:"+frecventa+"\n\tcarburant"+carburant+"\n\ttipCurent"+tipCurent+"\n";
    }

    @Override
    public void opreste() {
        System.out.println("Oprit.");
    }

    @Override
    public void porneste() {
        System.out.println("Pornit.");
    }


    //set si get

    public void setVoltaj(int voltaj) {
        this.voltaj = voltaj;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public void setFrecventa(double frecventa) {
        this.frecventa = frecventa;
    }
    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }
    public void setTipCurent(String tipCurent) {
        this.tipCurent = tipCurent;
    }

    public int getvoltaj() {
        return voltaj;
    }
    public int getCc() {
        return cc;
    }
    public double getfrecventa() {
        return frecventa;
    }
    public String getCarburant() {
        return carburant;
    }
    public String getTipCurent() {
        return tipCurent;
    }


}