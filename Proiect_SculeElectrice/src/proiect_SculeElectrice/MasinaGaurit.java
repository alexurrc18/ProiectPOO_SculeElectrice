package proiect_SculeElectrice;


public class MasinaGaurit extends SculeElectrice{
        int diametruGaura;
        String materialBurghiu, directia;
        double lungimeBurghiu;

        //constructor fara parametri

        public MasinaGaurit(){
            super();
            diametruGaura = 0;
            materialBurghiu = " ";
            directia = " ";
            lungimeBurghiu = 0;
        }

        //constructor cu parametri

        public MasinaGaurit(int diametruGaura, String materialBurghiu, String directia, double lungimeBurghiu,
                            String marca, String tipAlimentare, double putere, double greutate, double pret){

            super(marca, tipAlimentare, putere, greutate, pret);
            this.diametruGaura = diametruGaura;
            this.materialBurghiu = materialBurghiu;
            this.directia = directia;
            this.lungimeBurghiu = lungimeBurghiu;
        }

        //constructor copiere

        public MasinaGaurit(MasinaGaurit m){
            super(m);
            this.diametruGaura = m.diametruGaura;
            this.materialBurghiu = m.materialBurghiu;
            this.directia = m.directia;
            this.lungimeBurghiu = m.lungimeBurghiu;
        }

        //redefinire metoda toString

        public String toString(){
            return super.toString()+"\n\tdiametruGaura: "+diametruGaura+"\n\tmaterialBurghiu: "+materialBurghiu+
                    "\n\tdirectia: "+directia+"\n\tlungimeBurghiu: "+lungimeBurghiu;
        }


    }


