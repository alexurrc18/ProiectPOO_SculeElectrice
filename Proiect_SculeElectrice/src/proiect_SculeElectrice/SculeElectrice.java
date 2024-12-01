package proiect_SculeElectrice;

public class SculeElectrice implements ActivitateScule{
        private String marca, tipAlimentare;
        private double putere, greutate, pret;


    // Constructor fără parametrii
    SculeElectrice(){
        this.marca = " ";
        this.tipAlimentare = " ";
        this.putere = 0.0;
        this.greutate = 0.0;
        this.pret = 0.0;
    }


    // Constructor cu toți parametrii
    SculeElectrice(String marca, String tipAlimentare, double putere, double greutate, double pret){
        this.marca = marca;
        this.tipAlimentare = tipAlimentare;
        this.putere = putere;
        this.pret = pret;
        this.greutate = greutate;
    }


    // Constructor copiere
    SculeElectrice(SculeElectrice s){
        this.marca = s.marca;
        this.tipAlimentare = s.tipAlimentare;
        this.putere = s.putere;
        this.greutate = s.greutate;
        this.pret = s.pret;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getTipAlimentare() {
        return tipAlimentare;
    }

    public void setTipAlimentare(String tipAlimentare) {
        this.tipAlimentare = tipAlimentare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPutere() {
        return putere;
    }

    public void setPutere(double putere) {
        this.putere = putere;
    }

    //Rescriere metoda toString
    public String toString(){
        return "Marca: "+marca+"\nTip Alimentare: "+tipAlimentare+"\nPutere: "+putere+"\nGreutate: "+greutate+"\nPret: "+pret+"\n";
    }


    public String getMarca(){
        return marca;
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

