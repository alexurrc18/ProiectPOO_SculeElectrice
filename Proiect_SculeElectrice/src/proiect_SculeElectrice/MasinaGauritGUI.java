package proiect_SculeElectrice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class MasinaGauritGUI extends JFrame {
    private List<MasinaGaurit> masinaGauritList;


    private JTextField marcaField;
    private JTextField diametruGauraField;
    private JTextField trepteVitezaField;
    private JTextField materialBurghiuField;
    private JTextField directiaField;
    private JTextField lungimeBurghiuField;
    private JTextField putereField;

    // campuri de filtrare
    private JTextField filterDiametruMinField;
    private JTextField filterDiametruMaxField;
    private JTextField filterTrepteVitezaMinField;
    private JTextField filterLungimeBurghiuMinField;

    // afisare
    private JTextArea outputArea;

    public MasinaGauritGUI() {
        // Initializeaza lista
        masinaGauritList = new ArrayList<>();

        // Seteaza fereastra principala
        setTitle("Masina Gaurit Management");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Creeaza panel
        JPanel inputPanel = createInputPanel();
        JPanel filterPanel = createFilterPanel();
        JPanel buttonPanel = createButtonPanel();

        // Creeaza afisarea
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Adauga panel in fereastra
        add(inputPanel, BorderLayout.NORTH);
        add(filterPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.WEST);
        add(scrollPane, BorderLayout.SOUTH);
    }

    //adauga in panel campurile
    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.setBorder(BorderFactory.createTitledBorder("Adaugare Masina Gaurit"));

        panel.add(new JLabel("Marca:"));
        marcaField = new JTextField();
        panel.add(marcaField);

        panel.add(new JLabel("Diametru Gaura:"));
        diametruGauraField = new JTextField();
        panel.add(diametruGauraField);

        panel.add(new JLabel("Trepte Viteza:"));
        trepteVitezaField = new JTextField();
        panel.add(trepteVitezaField);

        panel.add(new JLabel("Material Burghiu:"));
        materialBurghiuField = new JTextField();
        panel.add(materialBurghiuField);

        panel.add(new JLabel("Directia:"));
        directiaField = new JTextField();
        panel.add(directiaField);

        panel.add(new JLabel("Lungime Burghiu:"));
        lungimeBurghiuField = new JTextField();
        panel.add(lungimeBurghiuField);

        panel.add(new JLabel("Putere:"));
        putereField = new JTextField();
        panel.add(putereField);

        return panel;
    }

    private JPanel createFilterPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.setBorder(BorderFactory.createTitledBorder("Filtrare Masini Gaurit"));

        panel.add(new JLabel("Diametru Gaura Min:"));
        filterDiametruMinField = new JTextField();
        panel.add(filterDiametruMinField);

        panel.add(new JLabel("Diametru Gaura Max:"));
        filterDiametruMaxField = new JTextField();
        panel.add(filterDiametruMaxField);

        panel.add(new JLabel("Trepte Viteza Min:"));
        filterTrepteVitezaMinField = new JTextField();
        panel.add(filterTrepteVitezaMinField);

        panel.add(new JLabel("Lungime Burghiu Min:"));
        filterLungimeBurghiuMinField = new JTextField();
        panel.add(filterLungimeBurghiuMinField);

        return panel;
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.setBorder(BorderFactory.createTitledBorder("Actiuni"));

        // Adaugare masina
        JButton adaugaButton = new JButton("Adauga Masina");
        adaugaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugaMasina();
            }
        });
        panel.add(adaugaButton);

        // Afisare lista
        JButton afiseazaButton = new JButton("Afiseaza Liste");
        afiseazaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afiseazaListe();
            }
        });
        panel.add(afiseazaButton);

        // Filtrare masini
        JButton filtreazaButton = new JButton("Filtreaza Masini");
        filtreazaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtreazaMasini();
            }
        });
        panel.add(filtreazaButton);

        // Porneste masina
        JButton pornesteButton = new JButton("Porneste Masina");
        pornesteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pornesteUltimaAdaugata();
            }
        });
        panel.add(pornesteButton);



      // Opreste masina
        JButton opresteButton = new JButton("Opreste Masina");
        opresteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opresteUltimaAdaugata();
            }
        });
        panel.add(opresteButton);



        return panel;

    }



    private void adaugaMasina() {
        try {
            // Citeste valorile din campuri
            String marca = marcaField.getText();
            int diametruGaura = Integer.parseInt(diametruGauraField.getText());
            int trepteViteza = Integer.parseInt(trepteVitezaField.getText());
            String materialBurghiu = materialBurghiuField.getText();
            String directia = directiaField.getText();
            double lungimeBurghiu = Double.parseDouble(lungimeBurghiuField.getText());
            double putere = Double.parseDouble(putereField.getText());

            // Creaza o noua masina gaurit
            MasinaGaurit masina = new MasinaGaurit(
                    diametruGaura, trepteViteza, materialBurghiu, directia, lungimeBurghiu,
                    marca, "USB", putere, 2.5, 150.0
            );

            // Adauga masina in lista
            masinaGauritList.add(masina);

            // Afiseaza mesaj de confirmare
            outputArea.append("Masina adaugata: " + masina + "\n\n");

            // Curata campurile
            curataCampuri();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Introduceti valori numerice corecte!",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void afiseazaListe() {
        outputArea.setText("Lista Masini Gaurit:\n");
        for (MasinaGaurit masina : masinaGauritList) {
            outputArea.append(masina.toString() + "\n\n");
        }
    }

    private void filtreazaMasini() {
        try {
            // Citeste valorile pentru filtrare
            int diametruMin = filterDiametruMinField.getText().isEmpty() ?
                    Integer.MIN_VALUE : Integer.parseInt(filterDiametruMinField.getText());

                    //filterDiametruMinField.getText().isEmpty() este true (adică câmpul este gol),
                    // atunci diametruMin va fi setat la Integer.MIN_VALUE
                    //Dacă câmpul nu este gol (adică isEmpty() returnează false), se va apela Integer.parseInt(filterDiametruMinField.getText()),
                    // care va converti textul introdus de utilizator în valoare numerică de tip int.

            int diametruMax = filterDiametruMaxField.getText().isEmpty() ?
                    Integer.MAX_VALUE : Integer.parseInt(filterDiametruMaxField.getText());
            int trepteVitezaMin = filterTrepteVitezaMinField.getText().isEmpty() ?
                    Integer.MIN_VALUE : Integer.parseInt(filterTrepteVitezaMinField.getText());
            double lungimeBurghiuMin = filterLungimeBurghiuMinField.getText().isEmpty() ?
                    Double.MIN_VALUE : Double.parseDouble(filterLungimeBurghiuMinField.getText());

            // Lista pentru masinile filtrate
            List<MasinaGaurit> masiniFiltrate = new ArrayList<>();

            // Filtrare
            for (MasinaGaurit masina : masinaGauritList) {
                if (masina.getDiametruGaura() >= diametruMin &&
                        masina.getDiametruGaura() <= diametruMax &&
                        masina.getTrepteViteza() >= trepteVitezaMin &&
                        masina.getLungimeBurghiu() >= lungimeBurghiuMin) {
                    masiniFiltrate.add(masina);
                }
            }

            // Afiseaza masinile filtrate
            outputArea.setText("Masini Filtrate:\n");
            if (masiniFiltrate.isEmpty()) {
                outputArea.append("Nu exista masini care sa indeplineasca criteriile de filtrare.\n");
            } else {
                for (MasinaGaurit masina : masiniFiltrate) {
                    outputArea.append(masina.toString() + "\n\n");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Introduceti valori numerice corecte pentru filtrare!",
                    "Eroare Filtrare", JOptionPane.ERROR_MESSAGE);
        }
    }

private void pornesteUltimaAdaugata() {
        if (!masinaGauritList.isEmpty()) {
            MasinaGaurit ultimaMasina = masinaGauritList.get(masinaGauritList.size() - 1);
            ultimaMasina.porneste();
            outputArea.append("Ultima masina pornita: " + ultimaMasina.getMarca() + "\n\n");
        } else {
            JOptionPane.showMessageDialog(this, "Nu exista masini in lista!",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void opresteUltimaAdaugata() {
        if (!masinaGauritList.isEmpty()) {
            MasinaGaurit ultimaMasina = masinaGauritList.get(masinaGauritList.size() - 1);
            ultimaMasina.opreste();
            outputArea.append("Ultima masina oprită: " + ultimaMasina.getMarca() + "\n\n");
        } else {
            JOptionPane.showMessageDialog(this, "Nu exista masini in lista!",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }



    private void curataCampuri() {
        marcaField.setText("");
        diametruGauraField.setText("");
        trepteVitezaField.setText("");
        materialBurghiuField.setText("");
        directiaField.setText("");
        lungimeBurghiuField.setText("");
        putereField.setText("");
    }

    public static void main(String[] args) {
        // Rulează GUI-ul pe Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            //permite executarea în siguranță a sarcinilor care modifică interfața grafică pe firul corect
            @Override
            public void run() {
                new MasinaGauritGUI().setVisible(true); //afiseaza interfata si o face vizibila
            }
        });
    }


}

