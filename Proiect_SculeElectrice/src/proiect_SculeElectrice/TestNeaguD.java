// PROIECT: SCULE ELECTRICE
//
// 17. Filoti Cristina - PolizorUnghiular / MasinaGaurit
// 18. Călin Alexandru - FierastrauPendular / SurubelnitaElectrica
// 19. Gârneț Alina - Polizor / Slefuitor
// 20. Timircan Georgiana - Rotopercutor / Compactor
// 21. Neagu Diana - GeneratorElectric / AparatSudura
//

package proiect_SculeElectrice;
import java.util.ArrayList;

public class TestNeaguD {


    public static void main(String[] args) {
        SculeElectrice s1 = new SculeElectrice("Bosch", "USB-A", 65.5, 423.33, 250);
        SculeElectrice s2 = new SculeElectrice("Makita", "USB-C", 73.4, 500, 475);
        SculeElectrice s3 = new SculeElectrice("AEG", "Jack", 83, 216.4, 308);
        SculeElectrice s4 = new SculeElectrice();
        SculeElectrice s5 = new SculeElectrice(s1);
        SculeElectrice s6 = new SculeElectrice();
        SculeElectrice s7 = new SculeElectrice(s2);
        SculeElectrice s8 = new SculeElectrice(s1);
        SculeElectrice s9 = new SculeElectrice();
        SculeElectrice s10 = new SculeElectrice();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("\ns1 " + s1 + "\ns2 " + s2 + "\ns3 " + s3 + "\ns4" + " " + s4 + "\ns5" + " " + s5 + "\ns6" + " " + s6 + "\ns7" + " " + s7 + "\ns8" + " " + s8 + "\ns9" + " " + s9 + "\ns10" + " " + s10);

        ArrayList<SculeElectrice> scule = new ArrayList<>();

        scule.add(new SculeElectrice("Bosch", "USB-A", 65.5, 423.33, 250));
        scule.add(new SculeElectrice("Makita", "USB-C", 73.4, 500, 475));
        scule.add(new SculeElectrice("AEG", "Jack", 83, 216.4, 308));
        scule.add(new SculeElectrice("Dewalt", "Jack", 90.0, 300.0, 600));
        scule.add(new SculeElectrice("Hitachi", "USB", 70.0, 400.0, 450));
        scule.add(new SculeElectrice("Black & Decker", "USB-C", 85.0, 500.0, 500));
        scule.add(new SculeElectrice("Milwaukee", "Jack", 75.0, 350.0, 550));
        scule.add(new SculeElectrice("Stanley", "USB", 60.0, 600.0, 400));
        scule.add(new SculeElectrice("Ryobi", "USB-C", 80.0, 480.0, 520));
        scule.add(new SculeElectrice("Skil", "Jack", 55.0, 450.0, 380));

        System.out.println("\nInstanțe SculeElectrice:");
        for (SculeElectrice scula : scule) {
            System.out.println(scula);
        }



        GeneratorElectric g1 = new GeneratorElectric("monofazat", 54, 103, 100, "gaz", "Weina", "USB-C", 112, 350, 632);
        GeneratorElectric g2 = new GeneratorElectric("monofazat",70, 110,60, "motorina","Bisonte", "USB", 120, 30,1000 );
        GeneratorElectric g3 = new GeneratorElectric ("trifazat",72, 120, 55, "gaz","Weina", "USB-C", 110, 25,700);
        GeneratorElectric g4= new GeneratorElectric();
        GeneratorElectric g5 = new GeneratorElectric();
        GeneratorElectric g6 = new GeneratorElectric(g3);
        GeneratorElectric g7 = new GeneratorElectric(g1);
        GeneratorElectric g8 = new GeneratorElectric(g4);
        GeneratorElectric g9 = new GeneratorElectric();
        GeneratorElectric g10 = new GeneratorElectric("trifazat", 77, 99, 65, "benzina", "Rotark", "Jack", 98, 87,673);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);

        System.out.println("\ng1 " + g1 + "\ng2 " + g2 + "\ng3 " + g3 + "\ng4" + " " + g4 + "\ng5" + " " + g5 + "\ng6" + " " + g6 + "\ng7" + " " + g7 + "\ng8" + " " + g8 + "\ng9" + " " + g9 + "\ng10" + " " + g10);



        ArrayList<GeneratorElectric> generator = new ArrayList<>();

        generator.add(new GeneratorElectric("monofazat", 65, 100, 50, "benzina", "Rotakt", "Jack", 98, 20, 800));
        generator.add(new GeneratorElectric("trifazat", 85, 120, 60, "motorina", "Honda", "USB", 92, 25, 1000));
        generator.add(new GeneratorElectric("monofazat", 75, 110, 55, "benzina", "Kipor", "USB-C", 96, 22, 950));
        generator.add(new GeneratorElectric("trifazat", 90, 130, 70, "motorina", "Lifan", "Jack", 90, 30, 1100));
        generator.add(new GeneratorElectric("monofazat", 80, 100, 65, "benzina", "Yamaha", "USB-A", 94, 18, 900));
        generator.add(new GeneratorElectric("trifazat", 100, 150, 80, "motorina", "Kohler", "USB", 93, 35, 1200));
        generator.add(new GeneratorElectric("monofazat", 70, 90, 50, "benzina", "Hyundai", "Jack", 88, 15, 850));
        generator.add(new GeneratorElectric("trifazat", 95, 140, 75, "motorina", "Caterpillar", "USB-C", 91, 28, 1150));
        generator.add(new GeneratorElectric("monofazat", 60, 80, 45, "benzina", "Generac", "USB", 85, 12, 800));
        generator.add(new GeneratorElectric("trifazat", 110, 160, 90, "motorina", "Perkins", "Jack", 97, 38, 1300));


        System.out.println("\nInstante GeneratorElectric:");
        for (GeneratorElectric gen : generator) {
            System.out.println(gen + "\n");
        }


        AparatDeSudura a1 = new AparatDeSudura (6, "prin contact", 200, "fier", "analogic", "Bohler","stecher",100,14,400);
        AparatDeSudura a2 = new  AparatDeSudura (4, "cu ridicare",250, "inox", "digital","ESAB", "stecher",110,10,500);
        AparatDeSudura a3 = new AparatDeSudura (2, "automata",239, "otel","digital","Daihen", "stecher",120,9,800);
        AparatDeSudura a4=new AparatDeSudura(5, "cu ridicare", 222, "fier", "digital", "ESAB", "stecher", 108, 12, 632);
        AparatDeSudura a5 =new AparatDeSudura();
        AparatDeSudura a6 = new AparatDeSudura();
        AparatDeSudura a7 = new AparatDeSudura(a2);
        AparatDeSudura a8 = new AparatDeSudura(a3);
        AparatDeSudura a9 = new AparatDeSudura(a7);
        AparatDeSudura a10 = new AparatDeSudura();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\na1 " + a1 + "\na2 " + a2 + "\na3 " + a3 + "\na4" + " " + a4 + "\na5" + " " + a5 + "\na6" + " " + a6 + "\na7" + " " + a7 + "\na8" + " " + a8 + "\na9" + " " + a9 + "\na10" + " " + a10);


        ArrayList<AparatDeSudura> as = new ArrayList<>();
        as.add(new AparatDeSudura(6, "prin contact", 200, "fier", "analogic", "Bohler", "stecher", 100, 14, 400));
        as.add(new AparatDeSudura(7, "prin arc", 250, "aluminiu", "digital", "Lincoln", "schuko", 120, 15, 450));
        as.add(new AparatDeSudura(5, "prin contact", 180, "otel", "analogic", "Esab", "stecher", 110, 13, 380));
        as.add(new AparatDeSudura(8, "prin arc", 300, "fier", "digital", "Kemppi", "schuko", 130, 16, 500));
        as.add(new AparatDeSudura(6, "prin contact", 220, "otel inoxidabil", "analogic", "Miller", "stecher", 115, 14, 420));
        as.add(new AparatDeSudura(7, "prin arc", 270, "aluminiu", "digital", "Forney", "schuko", 125, 15, 470));
        as.add(new AparatDeSudura(6, "prin contact", 230, "fier", "analogic", "Hobart", "stecher", 105, 14, 410));
        as.add(new AparatDeSudura(9, "prin arc", 350, "otel", "digital", "WeldTec", "schuko", 140, 17, 550));
        as.add(new AparatDeSudura(5, "prin contact", 160, "fier", "analogic", "Fronius", "stecher", 100, 13, 370));
        as.add(new AparatDeSudura(8, "prin arc", 320, "otel inoxidabil", "digital", "Makita", "schuko", 135, 16, 520));

        System.out.println("\nInstante Aparat de sudura:");
        for (AparatDeSudura aparat : as) {
            System.out.println(aparat + "\n");
        }




          System.out.println("\n\n\n[FILTRARE] Listă Scule Electrice:");
          for (SculeElectrice scula : scule) {
            if (scula.getGreutate() >= 350.0 && scula.getPutere() > 82.7)
                System.out.println(scula + "\n");
        }


        System.out.println("\n\n\n[FILTRARE] Listă Generator electric:");
        for (GeneratorElectric gen : generator) {
            if (gen.getCc() > 110 && gen.getPutere() <= 90)
                System.out.println(gen + "\n");
        }



        System.out.println("\n\n\n[FILTRARE] Listă Aparat de sudura:");
        for (AparatDeSudura aparat : as) {
            if (aparat.getImpuls() ==6 && aparat.getMaterial() == "fier")
                System.out.println(aparat + "\n");
        }
        

    }

}
