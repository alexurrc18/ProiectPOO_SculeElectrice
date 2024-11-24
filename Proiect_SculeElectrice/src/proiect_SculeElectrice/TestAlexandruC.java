package proiect_SculeElectrice;

import java.util.ArrayList;

public class TestAlexandruC {
    public static void main(String[] args) {
        // SculeElectrice:
        //      String marca, tipAlimentare;
        //      double putere, greutate, pret;
        SculeElectrice scula1 = new SculeElectrice("Bosch", "USB-A", 65.5, 423.33, 250);
        SculeElectrice scula2 = new SculeElectrice("Makita", "USB-C", 73.4, 500, 475);
        SculeElectrice scula3 = new SculeElectrice("AEG", "Jack", 83, 216.4, 308);
        SculeElectrice scula4 = new SculeElectrice("DeWalt", "Type-C", 90, 600, 550);
        SculeElectrice scula5 = new SculeElectrice("Black+Decker", "Battery", 70, 380, 400);

        System.out.println(scula1);
        System.out.println(scula2);
        System.out.println(scula3);
        System.out.println(scula4);
        System.out.println(scula5);

        // Fierăstrău pendular:
        //      int lungimeCursa, numarCurseMersGol, nivelZgomot;
        //      String tipPrindere; boolean vitezaReglabila;
        SculeElectrice fierastrau1 = new FierastrauPendular(scula1, 26, 3200, "tija U", 87, true);
        SculeElectrice fierastrau2 = new FierastrauPendular(scula2, 20, 3000, "tija U", 95, true);
        SculeElectrice fierastrau3 = new FierastrauPendular(scula3, 23, 3100, "SDS-Plus", 84, true);
        SculeElectrice fierastrau4 = new FierastrauPendular(scula4, 25, 3400, "SDS-Max", 90, true);
        SculeElectrice fierastrau5 = new FierastrauPendular(scula5, 30, 3500, "tija T", 92, false);

        System.out.println(fierastrau1);
        System.out.println(fierastrau2);
        System.out.println(fierastrau3);
        System.out.println(fierastrau4);
        System.out.println(fierastrau5);

        //Surubelniță electrică:
        //    String tipMandrina;
        //    int turatieNominala, capacitateBaterie;
        //    boolean trepteViteza;
        //    double cupluMaxim;
        SculeElectrice surubelnita1 = new SurubelnitaElectrica(scula1, "Pătrat", 1500, 1700, 60.53, true);
        SculeElectrice surubelnita2 = new SurubelnitaElectrica(scula2, "Hexagonal", 1000, 3400, 54.78, true);
        SculeElectrice surubelnita3 = new SurubelnitaElectrica(scula3, "Hexagonal", 800, 2500, 89.43, true);
        SculeElectrice surubelnita4 = new SurubelnitaElectrica(scula4, "Cilindric", 1200, 2800, 75.32, true);
        SculeElectrice surubelnita5 = new SurubelnitaElectrica(scula5, "Tetra", 1400, 3000, 64.50, false);

        System.out.println(surubelnita1);
        System.out.println(surubelnita2);
        System.out.println(surubelnita3);
        System.out.println(surubelnita4);
        System.out.println(surubelnita5);


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
            System.out.println(scula+"\n");
        }

        ArrayList<FierastrauPendular> listaFierastraie = new ArrayList<>();
        listaFierastraie.add(new FierastrauPendular("Dewalt", "USB-C", 70.0, 320.0, 450.0, 30, 3100, "tija U", 90, true));
        listaFierastraie.add(new FierastrauPendular("Einhell", "USB-A", 80.0, 350.0, 500.0, 28, 3300, "SDS-Plus", 88, true));
        listaFierastraie.add(new FierastrauPendular("Milwaukee", "USB-C", 75.0, 400.0, 520.0, 26, 3200, "tija U", 92, false));
        listaFierastraie.add(new FierastrauPendular("Hitachi", "Jack", 68.0, 300.0, 480.0, 24, 3100, "SDS-Plus", 85, true));
        listaFierastraie.add(new FierastrauPendular("Metabo", "USB-C", 82.0, 370.0, 560.0, 29, 3400, "tija U", 69, false));
        listaFierastraie.add(new FierastrauPendular("Stanley", "USB-A", 90.0, 410.0, 600.0, 27, 3150, "SDS-Plus", 86, true));
        listaFierastraie.add(new FierastrauPendular("Ryobi", "USB-C", 74.0, 380.0, 490.0, 25, 3000, "tija U", 87, false));
        listaFierastraie.add(new FierastrauPendular("Bosch", "USB-C", 85.0, 450.0, 630.0, 31, 3350, "SDS-Max", 90, true));
        listaFierastraie.add(new FierastrauPendular("Makita", "USB-A", 78.0, 390.0, 520.0, 28, 3200, "tija U", 70, true));
        listaFierastraie.add(new FierastrauPendular("Black+Decker", "Jack", 72.0, 370.0, 480.0, 25, 3100, "SDS-Plus", 84, false));
        System.out.println("\n\n\n[LISTĂ] Fierăstraie pendulare:");
        for(FierastrauPendular fierastrau : listaFierastraie) {
            System.out.println(fierastrau);
        }

        ArrayList<SurubelnitaElectrica> listaSurubelnite = new ArrayList<>();
        listaSurubelnite.add(new SurubelnitaElectrica("Dewalt", "USB-C", 70.0, 320.0, 450.0, "Hexagonal", 2650, 2000, 60.5, true));
        listaSurubelnite.add(new SurubelnitaElectrica("Einhell", "USB-A", 80.0, 350.0, 500.0, "Pătrat", 1400, 1800, 55.0, true));
        listaSurubelnite.add(new SurubelnitaElectrica("Milwaukee", "USB-C", 75.0, 400.0, 520.0, "Hexagonal", 800, 2200, 62.0, false));
        listaSurubelnite.add(new SurubelnitaElectrica("Hitachi", "Jack", 68.0, 300.0, 480.0, "Pătrat", 800, 1700, 58.0, true));
        listaSurubelnite.add(new SurubelnitaElectrica("Metabo", "USB-C", 82.0, 370.0, 560.0, "Hexagonal", 1700, 2400, 65.0, false));
        listaSurubelnite.add(new SurubelnitaElectrica("Stanley", "USB-A", 90.0, 410.0, 600.0, "Cilindric", 1800, 2600, 70.0, true));
        listaSurubelnite.add(new SurubelnitaElectrica("Ryobi", "USB-C", 74.0, 380.0, 490.0, "Cilindric", 1400, 2000, 63.0, false));
        listaSurubelnite.add(new SurubelnitaElectrica("Bosch", "USB-C", 85.0, 450.0, 630.0, "Pătrat", 600, 2300, 68.0, true));
        listaSurubelnite.add(new SurubelnitaElectrica("Makita", "USB-A", 78.0, 390.0, 520.0, "Hexagonal", 2500, 2100, 61.5, true));
        listaSurubelnite.add(new SurubelnitaElectrica("Black+Decker", "Jack", 72.0, 370.0, 480.0, "Cilindric", 3000, 1900, 59.0, false));
        System.out.println("\n\n\n[LISTĂ] Surubelnite electrice:");
        for(SurubelnitaElectrica surubelnita : listaSurubelnite) {
            System.out.println(surubelnita + "\n");
        }

            //

            System.out.println("\n\n\n[FILTRARE] Scule electrice:");
            for(SculeElectrice scula : listaSculeElectrice) {
                if(scula.greutate<300.0 && scula.putere>80.0) System.out.println(scula+"\n");
            }

            System.out.println("\n\n\n[FILTRARE] Fierăstraie pendulare:");
            for(FierastrauPendular fierastrau : listaFierastraie) {
                if(fierastrau.getTipPrindere().equals("tija U") && fierastrau.getLungimeCursa()<80) System.out.println(fierastrau);
            }

        System.out.println("\n\n\n[FILTRARE] Surubelnite electrice:");
        for(SurubelnitaElectrica surubelnita : listaSurubelnite) {
            if(surubelnita.getTipMandrina().equals("Hexagonal") && surubelnita.getCupluMaxim()>2000) System.out.println(surubelnita + "\n");
        }

        }


    }

