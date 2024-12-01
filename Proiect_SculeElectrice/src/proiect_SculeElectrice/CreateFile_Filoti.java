package proiect_SculeElectrice;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

public class CreateFile_Filoti {
    public static void main(String[] args) {
        try {
            //creare fisier
            File myObj = new File("D:\\cristina\\proiect_poo\\ProiectPOO_SculeElectrice\\Proiect_SculeElectrice\\src\\proiect_SculeElectrice\\filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            //scriere in fisier
            FileWriter myWriter = new FileWriter(myObj);
            myWriter.write("SculeElectrice1: marca:\"Bosch\", \n\ttipAlimentare:\"USB-A\", \n\tputere:65.5, \n\tgreutate:423.33, \n\tpret:250" + "\n");
            myWriter.write("SculeElectrice2: marca:\"Makita\", \n\ttipAlimentare:\"USB-C\", \n\tputere:73.4, \n\tgreutate:500, \n\tpret:475" + "\n");
            myWriter.write("SculeElectrice3: marca:\"AEG\", \n\ttipAlimentare:\"Jack\", \n\tputere:83, \n\tgreutate:216.4, \n\tpret:308" + "\n\n\n");

            myWriter.write("PolizorUnghiular1: diametruDisc:16, \n\tsupraincalzire:42, \n\ttip:\"vertical\", \n\tturatie:65.5, \n\tsistemSiguranta:4.5, \n\tmarca:\"Bosch\", \n\ttipAlimentare\"USB\", \n\tputere:43.4, \n\tgreutate:673.2, \n\tpret:174" + "\n");
            myWriter.write("PolizorUnghiular2: diametruDisc:12, \n\tsupraincalzire:33, \n\ttip:\"inclinat\", \n\tturatie:44.4, \n\tsistemSiguranta:3.3, \n\tmarca:\"Bosch\", \n\ttipAlimentare\"USB-C\", \n\tputere:55.5, \n\tgreutate:763.3, \n\tpret:421" + "\n");
            myWriter.write("PolizorUnghiular3: diametruDisc:22, \n\tsupraincalzire:56, \n\ttip:\"vertical\", \n\tturatie:62.7, \n\tsistemSiguranta:9.2, \n\tmarca:\"Makita\", \n\ttipAlimentare\"USB\", \n\tputere:73.7, \n\tgreutate:854, \n\tpret:470" + "\n\n\n");

            myWriter.write("MasinaGaurit1: diametruGaura:21, \n\ttrepteViteza:4, \n\tmaterialBurghiu:\"otel\", \n\tdirectia:\"vertical\", \n\tlungimeBurghiu:12.5, \n\tmarca:\"Bosch\", \n\ttipAlimentare:\"Jack\", \n\tputere:55, \n\tgreutate:254.5, \n\tpret:532"+"\n");
            myWriter.write("MasinaGaurit2: diametruGaura:19, \n\ttrepteViteza:5, \n\tmaterialBurgiu\"zinc\", \n\tdirectia:\"inclinat\", \n\tlngimeBurgiu14.3, \n\tmarca:\"AEG\", \n\ttipAlimentare:\"Jack\", \n\tputere:66.6, \n\tgreutate:176, \n\tpret:389.9" +"\n");
            myWriter.write("MasinaGaurit3: diametruGaura:20, \n\ttrepteViteza:3, \n\tmaterialBurgiu:\"fier\", \n\tdirectia:\"vertical\", \n\tlungimeBurghiu:9.7, \n\tmarca:\"AEG\", \n\ttipAlimentare:\"USB\", \n\tputere:53.9, \n\tgreutate:98.2, \n\tpret:157.9" + "\n\n\n");

            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

