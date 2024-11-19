// PROIECT: SCULE ELECTRICE
//
// 17. Filoti Cristina - PolizorUnghiular / MasinaGaurit
// 18. Călin Alexandru - FierastrauPendular / SurubelnitaElectrica
// 19. Gârneț Alina - Polizor / Slefuitor
// 20. Timircan Georgiana - Rotopercutor / Compactor
// 21. Neagu Diana - GeneratorElectric / AparatSudura
//

package proiect_SculeElectrice;

public class TestNeaguD {
    public static void main(String[] args) {
        SculeElectrice scula1 = new SculeElectrice("Bosch", "USB-A", 65.5, 423.33, 250);
        SculeElectrice scula2 = new SculeElectrice("Makita", "USB-C", 73.4, 500, 475);
        SculeElectrice scula3 = new SculeElectrice("AEG", "Jack", 83, 216.4, 308);

        System.out.println(scula1);
        System.out.println(scula2);
        System.out.println(scula3);

        GeneratorElectric g1 = new GeneratorElectric("monofazat",65,100, 50, "benzina", "Rotakt", "Jack", 98, 20,800);
        GeneratorElectric g2 = new GeneratorElectric("monofazat",70, 110,60, "motorina","Bisonte", "USB", 120, 30,1000 );
        GeneratorElectric g3 = new GeneratorElectric ("trifazat",72, 120, 55, "gaz","Weina", "USB-C", 110, 25,700);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);

        AparatDeSudura a1 = new AparatDeSudura (6, "prin contact", 200, "fier", "analogic", "Bohler","stecher",100,14,400);
        AparatDeSudura a2 = new  AparatDeSudura (4, "cu ridicare",250, "inox", "digital","ESAB", "stecher",110,10,500);
        AparatDeSudura a3 = new AparatDeSudura (2, "automata",239, "otel","digital","Daihen", "stecher",120,9,800);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}