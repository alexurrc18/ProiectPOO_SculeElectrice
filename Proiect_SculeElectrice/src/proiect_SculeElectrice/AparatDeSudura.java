package proiect_SculeElectrice;

public class AparatDeSudura extends SculeElectrice implements ActivitateScule{
   private int intensitate, impuls;
   private String material, control, tipAprindere;
    
    //constructor fara parametri
    public AparatDeSudura(){
        super();
        intensitate=0;
        material=" ";
        control=" ";
        impuls=0;
        tipAprindere="";
    }
    
    // constructor cu parametri
     public AparatDeSudura(int impuls, String tipAprindere,int intensitate, String material, String control, String marca, String tipAlimentare, double putere, double greutate, double pret){
         super(marca, tipAlimentare, putere,greutate, pret);
         this.impuls=impuls;
         this.tipAprindere=tipAprindere;
         this.intensitate=intensitate;
         this.material=material;
         this.control=control;
     }
     
     //constructor de copiere
     public AparatDeSudura(AparatDeSudura a){
         super(a);
         this.impuls=a.impuls;
         this.tipAprindere=a.tipAprindere;
         this.intensitate=a.intensitate;
         this.material=a.material;
         this.control=a.control;
     }
     //redefinire metoda toString
     
     public String toString(){
         return super.toString()+"\n\tintensitate:"+intensitate+"\n\tmaterial:"+material+"\n\tcontrol"+control+"\n\timpuls"+impuls+"\n\ttipAprindere"+tipAprindere;
                 
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
    public void setIntensitate(int intensitate){
        this.intensitate=intensitate;
    }
    public void setImpuls( int impuls){
        this.impuls=impuls;
    }
    public void setMaterial(String material){
        this.material=material;
    }
    public void setControl(String control){
        this.control=control;
    }
    public void setTipAprindere(String tipAprindere){
        this.tipAprindere=tipAprindere;
    }
    public int getIntensitate(){
        return intensitate;
    }
    public int getImpuls(){
        return impuls;
    }
    public String getMaterial(){
        return material;
    }
    public String getControl(){
        return control;
    }
    public String getTipAprindere(){
        return tipAprindere;
    }
}