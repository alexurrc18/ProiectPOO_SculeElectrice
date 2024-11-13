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




        // Călin Alexandru
        // Fierăstrău pendular:
        //     double lungimeCursa, nivelZgomot;
        //     int numarCurseMersGol;
        //     String tipPrindere;
        SculeElectrice fierastrau1 = new FierastrauPendular(26, 3200,
                "tija U", 87);
        SculeElectrice fierastrau2 = new FierastrauPendular(20, 3000,
                "tija U", 95);
        SculeElectrice fierastrau3 = new FierastrauPendular(23, 3100,
                "SDS-Plus", 84);

        System.out.println(fierastrau1);
        System.out.println(fierastrau2);
        System.out.println(fierastrau3);

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


    }
}