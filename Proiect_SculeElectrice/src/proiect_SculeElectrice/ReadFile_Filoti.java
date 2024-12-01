package proiect_SculeElectrice;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class ReadFile_Filoti {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Specificăm calea către fișier
            File myObj = new File("D:\\cristina\\proiect_poo\\ProiectPOO_SculeElectrice\\Proiect_SculeElectrice\\src\\proiect_SculeElectrice\\filename.txt");
            FileReader fileReader = new FileReader(myObj);
            reader = new BufferedReader(fileReader);

            String line;
            // Citim fișierul linie cu linie
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            // Asigurăm că reader-ul este închis
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
