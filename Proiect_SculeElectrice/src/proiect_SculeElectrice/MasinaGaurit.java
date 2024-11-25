package proiect_SculeElectrice;


public class MasinaGaurit extends SculeElectrice implements ActivitateScule{
   private int diametruGaura, trepteViteza;
   private String materialBurghiu, directia;
   private double lungimeBurghiu;

    //constructor fara parametri

    public MasinaGaurit(){
        super();
        trepteViteza = 0;
        diametruGaura = 0;
        materialBurghiu = " ";
        directia = " ";
        lungimeBurghiu = 0;
    }

    //constructor cu parametri

    public MasinaGaurit(int diametruGaura, int trepteViteza, String materialBurghiu, String directia, double lungimeBurghiu,
                        String marca, String tipAlimentare, double putere, double greutate, double pret){

        super(marca, tipAlimentare, putere, greutate, pret);
        this.diametruGaura = diametruGaura;
        this.trepteViteza = trepteViteza;
        this.materialBurghiu = materialBurghiu;
        this.directia = directia;
        this.lungimeBurghiu = lungimeBurghiu;
    }

    //constructor copiere

    public MasinaGaurit(MasinaGaurit m){
        super(m);
        this.diametruGaura = m.diametruGaura;
        this.trepteViteza = m.trepteViteza;
        this.materialBurghiu = m.materialBurghiu;
        this.directia = m.directia;
        this.lungimeBurghiu = m.lungimeBurghiu;
    }


    //redefinire metoda toString

    public String toString(){
        return super.toString()+"\n\tdiametruGaura: "+diametruGaura+"\n\ttrepteViteza"+trepteViteza+"\n\tmaterialBurghiu"+materialBurghiu+
                "\n\tdirectia: "+directia+"\n\tlungimeBurghiu: "+lungimeBurghiu;
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

    public void setDiametruGaura(int diametruGaura){
        this.diametruGaura = diametruGaura;
    }
    public void setTrepteViteza(int trepteViteza){
        this.trepteViteza = trepteViteza;
    }
    public void setMaterialBurghiu(String materialBurghiu){
        this.materialBurghiu = materialBurghiu;
    }
    public void setDirectia(String directia){
        this.directia = directia;
    }
    public void setLungimeBurghiu(double lungimeBurghiu){
        this.lungimeBurghiu = lungimeBurghiu;
    }

    public int getDiametruGaura(){
        return diametruGaura;
    }
    public int getTrepteViteza(){
        return trepteViteza;
    }
    public String getMaterialBurghiu(){
        return materialBurghiu;
    }
    public String getDirectia(){
        return directia;
    }
    public double getLungimeBurghiu(){
        return lungimeBurghiu;
    }



}



