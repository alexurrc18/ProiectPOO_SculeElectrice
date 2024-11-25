package proiect_SculeElectrice;

import java.util.ArrayList;

public class Test_TimircanG {
    public static void main(String[] args) {
        // SculeElectrice:
        //      String marca, tipAlimentare;
        //      double putere, greutate, pret;
        SculeElectrice scula1 = new SculeElectrice("Bosch", "USB-A", 65.5, 423.33, 250);
        SculeElectrice scula2 = new SculeElectrice(scula1);
        SculeElectrice scula3 = new SculeElectrice("AEG", "Jack", 83, 216.4, 308);
        SculeElectrice scula4 = new SculeElectrice("DeWalt", "Type-C", 90, 600, 550);
        SculeElectrice scula5 = new SculeElectrice(scula4);

        System.out.println(scula1);
        System.out.println(scula2);
        System.out.println(scula3);
        System.out.println(scula4);
        System.out.println(scula5);


        SculeElectrice rotopercutor1 = new Rotopercutor(3000, 280, 4000, 4, "SDS", scula1);
        SculeElectrice rotopercutor2 = new Rotopercutor(2500, 250, 3500, 3, "SDS-Plus", scula2);
        SculeElectrice rotopercutor3 = new Rotopercutor(3200, 300, 5000, 5, "SDS-Max", scula3);
        SculeElectrice rotopercutor4 = new Rotopercutor((Rotopercutor)rotopercutor3);
        SculeElectrice rotopercutor5 = new Rotopercutor(3500, 320, 6000, 6, "SDS", scula5);

        System.out.println(rotopercutor1);
        System.out.println(rotopercutor2);
        System.out.println(rotopercutor3);
        System.out.println(rotopercutor4);
        System.out.println(rotopercutor5);

        SculeElectrice compactor1 = new Compactor("electric", 30, 60, 6, true, scula1);
        SculeElectrice compactor2 = new Compactor((Compactor)compactor1);
        SculeElectrice compactor3 = new Compactor("diesel", 50, 100, 10, true, scula3);
        SculeElectrice compactor4 = new Compactor("electric", 35, 70, 7, true, scula4);
        SculeElectrice compactor5 = new Compactor("benzina", 45, 90, 9, false, scula5);

        System.out.println(compactor1);
        System.out.println(compactor2);
        System.out.println(compactor3);
        System.out.println(compactor4);
        System.out.println(compactor5);

        ArrayList<SculeElectrice> listaSculeElectrice = new ArrayList<>();
        listaSculeElectrice.add(new SculeElectrice("AEG", "Jack", 83.0, 216.4, 308.0));
        listaSculeElectrice.add(new SculeElectrice("Bosch", "USB-A", 65.5, 423.33, 250.0));
        listaSculeElectrice.add(new SculeElectrice("Makita", "USB-C", 73.4, 500.0, 475.0));
        listaSculeElectrice.add(new SculeElectrice("Einhell", "Jack", 78.0, 300.0, 320.0));
        listaSculeElectrice.add(new SculeElectrice("Dewalt", "USB-C", 85.0, 450.0, 630.0));
        listaSculeElectrice.add(new SculeElectrice("Hitachi", "USB-A", 68.0, 380.0, 290.0));
        listaSculeElectrice.add(new SculeElectrice("Milwaukee", "USB-C", 90.0, 400.0, 520.0));
        listaSculeElectrice.add(new SculeElectrice("Metabo", "Jack", 82.0, 360.0, 480.0));
        listaSculeElectrice.add(new SculeElectrice("Ryobi", "USB-C", 74.0, 370.0, 490.0));
        listaSculeElectrice.add(new SculeElectrice("Stanley", "USB-A", 88.0, 410.0, 600.0));
        System.out.println("\n\n\n[LISTĂ] Scule Electrice:");
        for(SculeElectrice scula : listaSculeElectrice) {
            System.out.println(scula + "\n");
        }

        ArrayList<Rotopercutor> listaRotopercutoare = new ArrayList<>();
        listaRotopercutoare.add(new Rotopercutor(1200, 200, 4000, 3, "SDS-Plus", "Bosch", "USB-C", 800.0, 3.2, 1200.0));
        listaRotopercutoare.add(new Rotopercutor(1500, 210, 4500, 4, "SDS-Max", "Makita", "Micro-USB", 950.0, 4.0, 1400.0));
        listaRotopercutoare.add(new Rotopercutor(1000, 190, 3500, 2, "SDS-Plus", "DeWalt", "USB-A", 700.0, 2.8, 1100.0));
        listaRotopercutoare.add(new Rotopercutor(1300, 200, 4000, 3, "SDS-Plus", "Milwaukee", "USB-C", 850.0, 3.5, 1250.0));
        listaRotopercutoare.add(new Rotopercutor(1400, 220, 4300, 5, "SDS-Max", "Einhell", "USB-C", 1000.0, 4.2, 1500.0));
        listaRotopercutoare.add(new Rotopercutor(1100, 195, 3700, 3, "SDS-Plus", "Hitachi", "Micro-USB", 750.0, 3.0, 1150.0));
        listaRotopercutoare.add(new Rotopercutor(1600, 225, 4700, 6, "SDS-Max", "AEG", "USB-A", 1050.0, 4.5, 1600.0));
        listaRotopercutoare.add(new Rotopercutor(1250, 200, 3900, 3, "SDS-Plus", "Metabo", "USB-C", 800.0, 3.3, 1300.0));
        listaRotopercutoare.add(new Rotopercutor(1350, 210, 4200, 4, "SDS-Max", "Ryobi", "USB-C", 900.0, 3.8, 1350.0));
        listaRotopercutoare.add(new Rotopercutor(1500, 230, 4600, 4, "SDS-Max", "Stanley", "Micro-USB", 950.0, 4.0, 1450.0));

        System.out.println("\n\n\n[LISTĂ] Rotopercutoare:");
        for (Rotopercutor rotopercutor : listaRotopercutoare) {
            System.out.println(rotopercutor + "\n");
        }

        ArrayList<Compactor> listaCompactoare = new ArrayList<>();
        listaCompactoare.add(new Compactor("Diesel", 300, 50, 4, true, "Bosch", "USB-C", 1500.0, 80.0, 7500.0));
        listaCompactoare.add(new Compactor("Benzină", 250, 60, 5, false, "Makita", "Micro-USB", 1200.0, 75.0, 6800.0));
        listaCompactoare.add(new Compactor("Electric", 200, 55, 3, true, "DeWalt", "USB-A", 1000.0, 70.0, 6200.0));
        listaCompactoare.add(new Compactor("Diesel", 350, 65, 6, true, "Milwaukee", "USB-C", 1800.0, 85.0, 8200.0));
        listaCompactoare.add(new Compactor("Benzină", 300, 50, 4, false, "Einhell", "USB-C", 1400.0, 78.0, 7000.0));
        listaCompactoare.add(new Compactor("Electric", 270, 60, 5, true, "Hitachi", "Micro-USB", 1100.0, 72.0, 6500.0));
        listaCompactoare.add(new Compactor("Diesel", 320, 70, 6, true, "AEG", "USB-C", 1700.0, 90.0, 8800.0));
        listaCompactoare.add(new Compactor("Benzină", 280, 55, 4, false, "Metabo", "USB-A", 1300.0, 77.0, 7200.0));
        listaCompactoare.add(new Compactor("Electric", 250, 60, 3, true, "Ryobi", "USB-C", 1050.0, 73.0, 6600.0));
        listaCompactoare.add(new Compactor("Diesel", 400, 75, 6, true, "Stanley", "Micro-USB", 1900.0, 95.0, 9000.0));

        System.out.println("\n\n\n[LISTĂ] Compactoare:");
        for (Compactor compactor : listaCompactoare) {
            System.out.println(compactor + "\n");
        }
    }
}