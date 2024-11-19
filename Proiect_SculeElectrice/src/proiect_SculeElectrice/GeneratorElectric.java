package proiect_SculeElectrice;
        
public class GeneratorElectric extends SculeElectrice implements ActivitateScule {
    int voltaj, cc;
    double frecventa;
    String carburant, tipCurent;
    
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
}