package proiect_SculeElectrice;


public class MasinaGaurit extends SculeElectrice implements ActivitateScule{
    int diametruGaura, trepteViteza;
    String materialBurghiu, directia;
    double lungimeBurghiu;

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


}



