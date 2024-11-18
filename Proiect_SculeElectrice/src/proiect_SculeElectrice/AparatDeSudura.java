package proiect_SculeElectrice;

public class AparatDeSudura extends SculeElectrice{
    int intensitate;
    String material, control;
    
    //constructor fara parametri
    public AparatDeSudura(){
        super();
        intensitate=0;
        material=" ";
        control=" ";
    }
    
    // constructor cu parametri
     public AparatDeSudura(int intensitate, String material, String control, String marca, String tipAlimentare, double putere, double greutate, double pret){
         super(marca, tipAlimentare, putere,greutate, pret);
         this.intensitate=intensitate;
         this.material=material;
         this.control=control;
     }
     
     //constructor de copiere
     public AparatDeSudura(AparatDeSudura a){
         super(a);
         this.intensitate=a.intensitate;
         this.material=a.material;
         this.control=a.control;
     }
     //redefinire metoda toString
     
     public String toString(){
         return super.toString()+"\n\tintensitate:"+intensitate+"\n\tmaterial:"+material+"\n\tcontrol"+control;
                 
     }
}