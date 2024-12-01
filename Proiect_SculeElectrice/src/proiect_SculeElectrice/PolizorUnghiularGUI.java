package proiect_SculeElectrice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class PolizorUnghiularGUI extends JFrame {
    private List<PolizorUnghiular> polizorUnghiularList;

    private JTextField marcaField;
    private JTextField diametruDiscField;
    private JTextField supraincalzireField;
    private JTextField tipField;
    private JTextField turatiaField;
    private JTextField sistemSigurantaField;

    //campuri de filtrare
    private JTextField filterDiametruMinField;
    private JTextField filterDiametruMaxField;
    private JTextField filterSupraincalzireMinField;
    private JTextField filterTuratiaMinField;

    // afisare
    private JTextArea outputArea;

    public PolizorUnghiularGUI() {
        polizorUnghiularList = new ArrayList<>();

        //seteaza fereastra principala
        setTitle("Polizor Unghiular Management");
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

    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.setBorder(BorderFactory.createTitledBorder("Adaugare Polizor Unghiular"));

        panel.add(new JLabel("Marca:"));
        marcaField = new JTextField();
        panel.add(marcaField);

        panel.add(new JLabel("Diametru disc:"));
        diametruDiscField = new JTextField();
        panel.add(diametruDiscField);

        panel.add(new JLabel("Supraincalzire:"));
        supraincalzireField = new JTextField();
        panel.add(supraincalzireField);

        panel.add(new JLabel("Tip:"));
        tipField = new JTextField();
        panel.add(tipField);

        panel.add(new JLabel("Turatia:"));
        turatiaField = new JTextField();
        panel.add(turatiaField);

        panel.add(new JLabel("Sistem siguranta:"));
        sistemSigurantaField = new JTextField();
        panel.add(sistemSigurantaField);

        return panel;
    }


    private JPanel createFilterPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.setBorder(BorderFactory.createTitledBorder("Filtrare Polizor Unghiular"));

        panel.add(new JLabel("Diametru Disc Min:"));
        filterDiametruMinField = new JTextField();
        panel.add(filterDiametruMinField);

        panel.add(new JLabel("Diametru Disc Max:"));
        filterDiametruMaxField = new JTextField();
        panel.add(filterDiametruMaxField);

        panel.add(new JLabel("Supraincalzire Min:"));
        filterSupraincalzireMinField = new JTextField();
        panel.add(filterSupraincalzireMinField);



        panel.add(new JLabel("Turatia Min:"));
        filterTuratiaMinField = new JTextField();
        panel.add(filterTuratiaMinField);

        return panel;
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.setBorder(BorderFactory.createTitledBorder("Actiuni"));

        // Adaugare polizorU
        JButton adaugaButton = new JButton("Adauga PolizorU");
        adaugaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugaPolizorU();
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

        // Filtrare polizorU
        JButton filtreazaButton = new JButton("Filtreaza polizorU");
        filtreazaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtreazaPolizorU();
            }
        });
        panel.add(filtreazaButton);

        // Porneste polizorU
        JButton pornesteButton = new JButton("Porneste polizorU");
        pornesteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pornestePolizorU();
            }
        });
        panel.add(pornesteButton);


        // Opreste masina
        JButton opresteButton = new JButton("Opreste PolizorU");
        opresteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oprestePolizorU();
            }
        });
        panel.add(opresteButton);
        return panel;

    }

    private void adaugaPolizorU() {
        try {
            //citeste valorile din campuri
            String marca = marcaField.getText();
            int diametruDisc = Integer.parseInt(diametruDiscField.getText());
            int supraincalzire = Integer.parseInt(supraincalzireField.getText());
            String tip = tipField.getText();
            double turatia = Double.parseDouble(turatiaField.getText());
            double sistemSiguranta =Double.parseDouble( sistemSigurantaField.getText());

            //creaza un nou polizorU
            PolizorUnghiular polizorU = new PolizorUnghiular(diametruDisc, supraincalzire, tip, turatia, sistemSiguranta,
                    marca, "USB", 60, 755.5, 699.9);

            //adauga PolizorU in lista
            polizorUnghiularList.add(polizorU);
            // Afiseaza mesaj de confirmare
            outputArea.append("PolizorU adaugat: " + polizorU + "\n\n");

            // Curata campurile
            curataCampuri();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Introduceti valori numerice corecte!",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void afiseazaListe() {
        outputArea.setText("Lista PolizorU:\n");
        for (PolizorUnghiular polizorU : polizorUnghiularList) {
            outputArea.append(polizorU.toString() + "\n\n");
        }
    }

    private void filtreazaPolizorU() {
        try {
            // Citeste valorile pentru filtrare
            int diametruMin = filterDiametruMinField.getText().isEmpty() ?
                    Integer.MIN_VALUE : Integer.parseInt(filterDiametruMinField.getText());
            int diametruMax = filterDiametruMaxField.getText().isEmpty() ?
                    Integer.MAX_VALUE : Integer.parseInt(filterDiametruMaxField.getText());
            int supraincalzireMin = filterSupraincalzireMinField.getText().isEmpty() ?
                    Integer.MIN_VALUE : Integer.parseInt(filterSupraincalzireMinField.getText());
            double turatiaMin = filterTuratiaMinField.getText().isEmpty() ?
                    Double.MIN_VALUE : Double.parseDouble(filterTuratiaMinField.getText());


            // Lista pentru polizorU filtrate
            List<PolizorUnghiular> polizorUFiltrate = new ArrayList<>();

            // Filtrare
            for (PolizorUnghiular polizorU : polizorUnghiularList) {
                if (polizorU.getDiametruDisc() >= diametruMin &&
                        polizorU.getDiametruDisc() <= diametruMax &&
                        polizorU.getSupraincalzire() >= supraincalzireMin &&
                        polizorU.getTuratia() >= turatiaMin) {
                    polizorUFiltrate.add(polizorU);

                }
            }

            // Afiseaza polizorU filtrate
            outputArea.setText("PolizorU Filtrate:\n");
            if (polizorUFiltrate.isEmpty()) {
                outputArea.append("Nu exista polizoare care sa indeplineasca criteriile de filtrare.\n");
            } else {
                for (PolizorUnghiular polizorU : polizorUnghiularList) {
                    outputArea.append(polizorU.toString() + "\n\n");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Introduceti valori numerice corecte pentru filtrare!",
                    "Eroare Filtrare", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void pornestePolizorU() {
        if (!polizorUnghiularList.isEmpty()) {
            PolizorUnghiular ultimPolizorU = polizorUnghiularList.get(polizorUnghiularList.size() - 1);
            ultimPolizorU.porneste();
            outputArea.append("Ultimul polizorU pornit: " + ultimPolizorU.getMarca() + "\n\n");
        } else {
            JOptionPane.showMessageDialog(this, "Nu exista polizorU in lista!",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void oprestePolizorU() {
        if (!polizorUnghiularList.isEmpty()) {
            PolizorUnghiular ultimPolizorU = polizorUnghiularList.get(polizorUnghiularList.size() - 1);
            ultimPolizorU.opreste();
            outputArea.append("Ultima masina oprită: " + ultimPolizorU.getMarca() + "\n\n");
        } else {
            JOptionPane.showMessageDialog(this, "Nu exista polizorU in lista!",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void curataCampuri() {
        marcaField.setText("");
        diametruDiscField.setText("");
        supraincalzireField.setText("");
        turatiaField.setText("");
        tipField.setText("");
        sistemSigurantaField.setText("");

    }


    public static void main(String[] args) {
        // Rulează GUI-ul pe Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PolizorUnghiularGUI().setVisible(true);
            }
        });
    }
}

