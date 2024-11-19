// PROIECT: SCULE ELECTRICE
//
// 17. Filoti Cristina - PolizorUnghiular / MasinaGaurit
// 18. Călin Alexandru - FierastrauPendular / SurubelnitaElectrica
// 19. Gârneț Alina - Polizor / Slefuitor
// 20. Timircan Georgiana - Rotopercutor / Compactor
// 21. Neagu Diana - GeneratorElectric / AparatSudura
//

package proiect_SculeElectrice;

public class Test {
    public static void main(String[] args) {

        // SculeElectrice:
        //        String marca, tipAlimentare;
        //        double putere, greutate, pret;
        SculeElectrice scula1 = new SculeElectrice("Bosch", "USB-A", 65.5, 423.33, 250);
        SculeElectrice scula2 = new SculeElectrice("Makita", "USB-C", 73.4, 500, 475);
        SculeElectrice scula3 = new SculeElectrice("AEG", "Jack", 83, 216.4, 308);

        System.out.println(scula1);
        System.out.println(scula2);
        System.out.println(scula3);


        // Neagu Diana
        GeneratorElectric g1 = new GeneratorElectric(65,100, 50, "benzina", "Rotakt", "Jack", 98, 20,800);
        GeneratorElectric g2 = new GeneratorElectric(70, 110,60, "motorina","Bisonte", "USB", 120, 30,1000 );
        GeneratorElectric g3 = new GeneratorElectric (72, 120, 55, "gaz","Weina", "USB-C", 110, 25,700);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);

        AparatDeSudura a1 = new AparatDeSudura (200, "fier", "analogic", "Bohler","stecher",100,14,400);
        AparatDeSudura a2 = new  AparatDeSudura (250, "inox", "digital","ESAB", "stecher",110,10,500);
        AparatDeSudura a3 = new AparatDeSudura ( 239, "otel","digital","Daihen", "stecher",120,9,800);


        //Filoti Cristina
        PolizorUnghiular a = new PolizorUnghiular(16, 42, "vertical", 65.5, "Bosch", "USB", 43.4, 673.2, 174);
        PolizorUnghiular b = new PolizorUnghiular(12, 33, "inclinat", 44.4, "Bosch", "USB-C", 55.5, 763.3, 421);
        PolizorUnghiular c = new PolizorUnghiular(22, 56, "vertical", 62.7, "Makita", "USB", 73.7, 854, 470);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        MasinaGaurit m1 = new MasinaGaurit(21, "otel", "vertical", 12.5, "Bosch", "Jack", 55, 254.5, 532);
        MasinaGaurit m2 = new MasinaGaurit(19, "zinc", "inclinat", 14.3, "AEG", "Jack", 66.6, 176, 389.9);
        MasinaGaurit m3 = new MasinaGaurit(20, "fier", "vertical", 9.7, "AEG", "USB", 53.9, 98.2, 157.9);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

/*
        SculeElectrice[] vScule = new SculeElectrice[40];
        PolizorUnghiular[] vPolizor = new PolizorUnghiular[10];
        MasinaGaurit[] vMasina = new MasinaGaurit[10];


        SculeElectrice s4 = new SculeElectrice();
        SculeElectrice s5 = new SculeElectrice(scula1);
        SculeElectrice s6 = new SculeElectrice("AEG", "Jack", 54, 354.6, 197.9);
        SculeElectrice s7 = new SculeElectrice(scula2);
        SculeElectrice s8 = new SculeElectrice(scula1);
        SculeElectrice s9 = new SculeElectrice("Bosch", "USB", 66, 764.3, 221);
        SculeElectrice s10 = new SculeElectrice();

        PolizorUnghiular d = new PolizorUnghiular();
        PolizorUnghiular e = new PolizorUnghiular(11, 47, "vertical", 65.7, "Bosch", "USB-C", 43.4, 677, 178);
        PolizorUnghiular f = new PolizorUnghiular(a);
        PolizorUnghiular g = new PolizorUnghiular();
        PolizorUnghiular h = new PolizorUnghiular(15, 69, "inclinat", 73.3, "AEG", "Jack", 53.7, 899.5, 624.8);
        PolizorUnghiular i = new PolizorUnghiular();
        PolizorUnghiular j = new PolizorUnghiular(d);

        MasinaGaurit m4 = new MasinaGaurit();
        MasinaGaurit m5 = new MasinaGaurit();
        MasinaGaurit m6 = new MasinaGaurit(m1);
        MasinaGaurit m7 = new MasinaGaurit(m2);
        MasinaGaurit m8 = new MasinaGaurit(25, "otel", "inclinat", 19.9, "Makita", "Jack", 99, 761, 500.9);
        MasinaGaurit m9 = new MasinaGaurit(11, "zinc", "vertical", 9.4, "Makita", "USB-C", 86.7, 716, 355);
        MasinaGaurit m10 = new MasinaGaurit(9, "zinc", "unghiular", 7.2, "Makita", "USB", 73.3, 555.5, 284.9);

        for (int k = 0; k < 10; k++) {
            vScule[k] = new SculeElectrice("Marca" + (k + 1), "Tip" + (k + 1), 50 + k * 5, 200 + k * 10, 100 + k * 15);
        }

        // Adăugăm 10 instanțe din PolizorUnghiular
        for (int l = 0; l < 10; l++) {
            vPolizor[l] = new PolizorUnghiular(10 + l, 30 + l, "Tip" + (l + 1), 1000 + l * 50, "Marca" + (l + 1), "Tip" + (l + 1), 50 + l * 5, 200 + l * 10, 100 + l * 15);
        }

        // Adăugăm 10 instanțe din MasinaGaurit
        for (int o = 0; o < 10; o++) {
            vMasina[o] = new MasinaGaurit(15 + o, "Material" + (o + 1), "Directie" + (o + 1), 20 + o * 2, "Marca" + (o + 1), "Tip" + (o + 1), 60 + o * 5, 300 + o * 10, 150 + o * 20);
        }

        // Afișăm instanțele din SculeElectrice
        System.out.println("Instanțele din SculeElectrice:");
        for (SculeElectrice scula : vScule) {
            System.out.println(scula.toString());
        }

        // Afișăm instanțele din PolizorUnghiular
        System.out.println("\nInstanțele din PolizorUnghiular:");
        for (PolizorUnghiular polizor : vPolizor) {
            System.out.println(polizor.toString());
        }

        // Afișăm instanțele din MasinaGaurit
        System.out.println("\nInstanțele din MasinaGaurit:");
        for (MasinaGaurit masina : vMasina) {
            System.out.println(masina.toString());
        }
*/


        // Călin Alexandru
        // Fierăstrău pendular:
        //     double lungimeCursa, nivelZgomot;
        //     int numarCurseMersGol;
        //     String tipPrindere;
        SculeElectrice fierastrau1 = new FierastrauPendular(26, 3200,
                "tija U", 87, true);
        SculeElectrice fierastrau2 = new FierastrauPendular(20, 3000,
                "tija U", 95, true);
        SculeElectrice fierastrau3 = new FierastrauPendular(23, 3100,
                "SDS-Plus", 84, true);

        System.out.println(fierastrau1);
        System.out.println(fierastrau2);
        System.out.println(fierastrau3);


        /*
        //Surubelniță electrică:
        //    String tipMandrina;
        //    int turatieNominala;
        //    boolean trepteViteza;
        SculeElectrice pistol1 = new SurubelnitaElectrica("Pătrat", 1750, true);
        SculeElectrice pistol2 = new SurubelnitaElectrica("Hexagonal", 3400, true);
        SculeElectrice pistol3 = new SurubelnitaElectrica("Hexagonal", 2500, true);

        System.out.println(pistol1);
        System.out.println(pistol2);
        System.out.println(pistol3);
        */


    }
}