package proiect_SculeElectrice;
import java.util.ArrayList;

public class Test_Filoti {
    public static void main(String[] args) {

        ArrayList<SculeElectrice> scule = new ArrayList<>();

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
        System.out.println("\ns1 " + s1 + "\ns2 " + s2 + "\ns3 " + s3 + "\ns4" + " " + s4 + "\ns5" + " " + s5 + "\ns6" + " " + s6 + "\ns7" + " " + s7 + "\ns8" + " " + s8 + "\ns9" + " " + s9 + "\ns10" + " " + s10);

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


        System.out.println("\n\n\n[FILTRARE] Listă Scule Electrice:");
        for (SculeElectrice scula : scule) {
            if (scula.greutate >= 400.0 && scula.putere > 80.0)
                System.out.println(scula + "\n");
        }


        ArrayList<PolizorUnghiular> polizoare = new ArrayList<>();

        PolizorUnghiular a = new PolizorUnghiular(16, 42, "vertical", 65.5, 4.5, "Bosch", "USB", 43.4, 673.2, 174);
        PolizorUnghiular b = new PolizorUnghiular(12, 33, "inclinat", 44.4, 3.3, "Bosch", "USB-C", 55.5, 763.3, 421);
        PolizorUnghiular c = new PolizorUnghiular(22, 56, "vertical", 62.7, 9.2, "Makita", "USB", 73.7, 854, 470);
        PolizorUnghiular d = new PolizorUnghiular();
        PolizorUnghiular e = new PolizorUnghiular();
        PolizorUnghiular f = new PolizorUnghiular(a);
        PolizorUnghiular g = new PolizorUnghiular();
        PolizorUnghiular h = new PolizorUnghiular(c);
        PolizorUnghiular i = new PolizorUnghiular();
        PolizorUnghiular j = new PolizorUnghiular(d);

        System.out.println("\na " + a + "\nb " + b + "\nc " + c + "\nd" + " " + d + "\ne" + " " + e + "\nf" + " " + f + "\ng" + " " + g + "\nh" + " " + h + "\ni" + " " + i + "\nj" + " " + j);


        polizoare.add(new PolizorUnghiular(16, 42, "vertical", 65.5, 4.5, "Bosch", "USB", 43.4, 673.2, 174));
        polizoare.add(new PolizorUnghiular(12, 33, "inclinat", 44.4, 3.3, "Bosch", "USB-C", 55.5, 763.3, 421));
        polizoare.add(new PolizorUnghiular(22, 56, "vertical", 62.7, 9.2, "Makita", "USB", 73.7, 854, 470));
        polizoare.add(new PolizorUnghiular(15, 69, "inclinat", 73.3, 3.3, "AEG", "Jack", 53.7, 899.5, 624));
        polizoare.add(new PolizorUnghiular(18, 45, "vertical", 80.0, 5.5, "DeWalt", "USB", 65.0, 700.0, 500));
        polizoare.add(new PolizorUnghiular(14, 30, "inclinat", 50.0, 4.0, "Makita", "Jack", 60.0, 650.0, 400));
        polizoare.add(new PolizorUnghiular(20, 35, "vertical", 55.0, 6.0, "Bosch", "USB-C", 70.0, 720.0, 450));
        polizoare.add(new PolizorUnghiular(10, 25, "vertical", 45.0, 3.0, "Hitachi", "USB", 50.0, 600.0, 350));
        polizoare.add(new PolizorUnghiular(11, 40, "inclinat", 60.0, 5.0, "Milwaukee", "Jack", 75.0, 800.0, 550));
        polizoare.add(new PolizorUnghiular(13, 50, "vertical", 65.0, 7.0, "Black & Decker", "USB", 80.0, 750.0, 600));

        System.out.println("\nInstanțe PolizorUnghiular:");
        for (PolizorUnghiular polizor : polizoare) {
            System.out.println(polizor);
        }


        System.out.println("\n\n\n[FILTRARE] Listă Polizoare Unghiulare:");
        for (PolizorUnghiular polizor : polizoare) {
            if (polizor.supraincalzire > 27 && polizor.tip != "vertical")
                System.out.println(polizor + "\n");
        }


        ArrayList<MasinaGaurit> masiniGaurit = new ArrayList<>();

        MasinaGaurit m1 = new MasinaGaurit(21, 4, "otel", "vertical", 12.5, "Bosch", "Jack", 55, 254.5, 532);
        MasinaGaurit m2 = new MasinaGaurit(19, 5, "zinc", "inclinat", 14.3, "AEG", "Jack", 66.6, 176, 389.9);
        MasinaGaurit m3 = new MasinaGaurit(20, 3, "fier", "vertical", 9.7, "AEG", "USB", 53.9, 98.2, 157.9);
        MasinaGaurit m4 = new MasinaGaurit();
        MasinaGaurit m5 = new MasinaGaurit();
        MasinaGaurit m6 = new MasinaGaurit(m1);
        MasinaGaurit m7 = new MasinaGaurit(m2);
        MasinaGaurit m8 = new MasinaGaurit();
        MasinaGaurit m9 = new MasinaGaurit();
        MasinaGaurit m10 = new MasinaGaurit(9, 8, "zinc", "unghiular", 7.2, "Makita", "USB", 73.3, 555.5, 284.9);

        System.out.println("\nm1 " + m1 + "\nm2 " + m2 + "\nm3 " + m3 + "\nm4" + " " + m4 + "\nm5" + " " + m5 + "\nm6" + " " + m6 + "\nm7" + " " + m7 + "\nm8" + " " + m8 + "\nm9" + " " + m9 + "\nm10" + " " + m10);


        masiniGaurit.add(new MasinaGaurit(21, 4, "otel", "vertical", 12.5, "Bosch", "Jack", 55, 254.5, 532));
        masiniGaurit.add(new MasinaGaurit(19, 5, "zinc", "inclinat", 14.3, "AEG", "Jack", 66.6, 176, 389.9));
        masiniGaurit.add(new MasinaGaurit(20, 3, "fier", "vertical", 9.7, "AEG", "USB", 53.9, 98.2, 157.9));
        masiniGaurit.add(new MasinaGaurit(25, 5, "otel", "inclinat", 19.9, "Makita", "Jack", 99, 761, 500.9));
        masiniGaurit.add(new MasinaGaurit(11, 6, "zinc", "vertical", 9.4, "Makita", "USB-C", 86.7, 716, 355));
        masiniGaurit.add(new MasinaGaurit(9, 8, "zinc", "unghiular", 7.2, "Makita", "USB", 73.3, 555.5, 284.9));
        masiniGaurit.add(new MasinaGaurit(30, 4, "aluminiu", "vertical", 15.0, "Bosch", "Jack", 60, 300, 600));
        masiniGaurit.add(new MasinaGaurit(22, 5, "plastic", "inclinat", 10.5, "AEG", "Jack", 70, 200, 400));
        masiniGaurit.add(new MasinaGaurit(18, 6, "otel", "vertical", 12.0, "Makita", "USB", 80, 250, 450));

        for (MasinaGaurit masini : masiniGaurit) {
            System.out.println(masini);
        }


        System.out.println("\n\n\n[FILTRARE] Listă Masini Gaurit:");
        for (MasinaGaurit masini : masiniGaurit) {
            if (masini.diametruGaura < 20 && masini.lungimeBurghiu>10.3)
                System.out.println(masini + "\n");
            }

        }
    }
