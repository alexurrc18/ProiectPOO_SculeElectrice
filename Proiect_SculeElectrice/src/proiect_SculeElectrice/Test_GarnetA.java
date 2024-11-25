package proiect_SculeElectrice;

import java.util.ArrayList;

public class Test_GarnetA {
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

        // Polizor:
        //     int diametruDisc,turatie,nivelZgomot,sistRacire;
        //     boolean siguranta;
        SculeElectrice polizorDeBanc = new Polizor(125, 6000, 110, "racire cu apa", true, scula1);
        SculeElectrice polizorCuBanda = new Polizor(115, 3000, 120, "racire cu aer", true, scula2);
        SculeElectrice polizorDeColt = new Polizor(125, 8000, 130, "racire prin pulverizare", true, scula3);
        SculeElectrice polizorDeMasa = new Polizor(150, 3000, 90, "racire cu apa", true, scula4);
        SculeElectrice polizorDePerete = new Polizor(230, 3500, 100, "racire cu apa", true, scula5);

        System.out.println(polizorDeBanc);
        System.out.println(polizorCuBanda);
        System.out.println(polizorDeColt);
        System.out.println(polizorDeMasa);
        System.out.println(polizorDePerete);

        //  Slefuitor:
        //  int diametruDisc,lungimeBanda;
        //  String tipPrindere,ergonomie,sisColectPraf;
        SculeElectrice slefuitorUnghiular = new Slefuitor(125, 115, "prindere cu filete", "amortizoare de vibratii", "aspirator", scula1);
        SculeElectrice slefuitorCuBanda = new Slefuitor(100, 610, "prindere cu role", "manere reglabile", "aspirator", scula2);
        SculeElectrice slefuitorCuOrbita = new Slefuitor(125, 125, "scai", "sist de vibratii reduse", "microfiltrare", scula3);
        SculeElectrice slefuitorDeColt = new Slefuitor(60, 70, "scai", "lucrari in detaliu", "microfiltrare", scula4);
        SculeElectrice slefuitorDePerete = new Slefuitor(225, 533, "prindere cu piulita", "manere reglabile", "filtru de praf", scula5);

        System.out.println(slefuitorUnghiular);
        System.out.println(slefuitorCuBanda);
        System.out.println(slefuitorCuOrbita);
        System.out.println(slefuitorDeColt);
        System.out.println(slefuitorDePerete);


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
        System.out.println("\n[LISTĂ] Scule Electrice:");
        for (SculeElectrice scula : listaSculeElectrice) {
            System.out.println(scula + "\n");
        }


        ArrayList<Polizor> listaPolizoare = new ArrayList<>();
        listaPolizoare.add(new Polizor(125, 6000, 110, "racire cu apa", true, "AEG", "Jack", 83.0, 216.4, 308.0));
        listaPolizoare.add(new Polizor(115, 3000, 120, "racire cu aer", true, "Bosch", "USB-A", 65.5, 423.33, 250.0));
        listaPolizoare.add(new Polizor(125, 8000, 130, "racire prin pulverizare", true, "Makita", "USB-C", 73.4, 500.0, 475.0));
        listaPolizoare.add(new Polizor(150, 3000, 90, "racire cu apa", true, "Einhell", "Jack", 78.0, 300.0, 320.0));
        listaPolizoare.add(new Polizor(230, 3500, 100, "racire cu apa", true, "Dewalt", "USB-C", 85.0, 450.0, 630.0));
        listaPolizoare.add(new Polizor(125, 6000, 110, "racire cu aer", true, "Hitachi", "USB-A", 68.0, 380.0, 290.0));
        listaPolizoare.add(new Polizor(115, 3000, 120, "racire prin pulverizare", true, "Milwaukee", "USB-C", 90.0, 400.0, 520.0));
        listaPolizoare.add(new Polizor(125, 8000, 130, "racire cu apa", true, "Metabo", "Jack", 82.0, 360.0, 480.0));
        listaPolizoare.add(new Polizor(150, 3000, 90, "racire cu aer", true, "Ryobi", "USB-C", 74.0, 370.0, 490.0));
        listaPolizoare.add(new Polizor(230, 3500, 100, "racire prin pulverizare", true, "Stanley", "USB-A", 88.0, 410.0, 600.0));
        System.out.println("\n[LISTĂ] Polizoare:");
        for (SculeElectrice polizor : listaPolizoare) {
            System.out.println(polizor + "\n");
        }

        ArrayList<Slefuitor> listaSlefuitoare = new ArrayList<>();
        listaSlefuitoare.add(new Slefuitor(125, 115, "prindere cu filete", "amortizoare de vibratii", "aspirator", "AEG", "Jack", 83.0, 216.4, 308.0));
        listaSlefuitoare.add(new Slefuitor(100, 610, "prindere cu role", "manere reglabile", "aspirator", "Bosch", "USB-A", 65.5, 423.33, 250.0));
        listaSlefuitoare.add(new Slefuitor(125, 125, "scai", "sist de vibratii reduse", "microfiltrare", "Makita", "USB-C", 73.4, 500.0, 475.0));
        listaSlefuitoare.add(new Slefuitor(60, 70, "scai", "lucrari in detaliu", "microfiltrare", "Einhell", "Jack", 78.0, 300.0, 320.0));
        listaSlefuitoare.add(new Slefuitor(225, 533, "prindere cu piulita", "manere reglabile", "filtru de praf", "Dewalt", "USB-C", 85.0, 450.0, 630.0));
        listaSlefuitoare.add(new Slefuitor(125, 115, "scai", "amortizoare de vibratii", "aspirator", "Hitachi", "USB-A", 68.0, 380.0, 290.0));
        listaSlefuitoare.add(new Slefuitor(100, 610, "prindere cu role", "manere reglabile", "aspirator", "Milwaukee", "USB-C", 90.0, 400.0, 520.0));
        listaSlefuitoare.add(new Slefuitor(125, 125, "scai", "sist de vibratii reduse", "microfiltrare", "Metabo", "Jack", 82.0, 360.0, 480.0));
        listaSlefuitoare.add(new Slefuitor(60, 70, "scai", "lucrari in detaliu", "microfiltrare", "Ryobi", "USB-C", 74.0, 370.0, 490.0));
        listaSlefuitoare.add(new Slefuitor(225, 533, "prindere cu piulita", "manere reglabile", "filtru de praf", "Stanley", "USB-A", 88.0, 410.0, 600.0));
        System.out.println("\n[LISTĂ] Slefuitoare:");
        for (SculeElectrice slefuitor : listaSlefuitoare) {
            System.out.println(slefuitor + "\n");
        }


        System.out.println("\n[FILTRARE] Scule electrice:");
        for (SculeElectrice scula : listaSculeElectrice) {
            if (scula.getGreutate() < 450.0 && scula.getPutere() > 90.0) System.out.println(scula + "\n");
        }

        System.out.println("\n[FILTRARE] Polizoare:");
        for (Polizor polizor : listaPolizoare) {
            if (polizor.getSistRacire().equals("racire cu apa") && polizor.getDiametruDisc()<115) System.out.println(polizor + "\n");
        }

        System.out.println("\n[FILTRARE] Slefuitoare:");
        for (Slefuitor slefuitor : listaSlefuitoare) {
            if(slefuitor.getTipPrindere().equals("scai") && slefuitor.getLungimeBanda()<70) System.out.println(slefuitor + "\n");
        }
    }
}
