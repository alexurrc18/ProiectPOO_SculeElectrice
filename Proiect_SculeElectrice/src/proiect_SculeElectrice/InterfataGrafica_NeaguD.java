package proiect_SculeElectrice;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InterfataGrafica_NeaguD {
    private JButton sculeElectriceButton;
    private JButton generatorButton;
    private JButton aparatButton;
    private JTable table1;
    private JButton adaugareButton;
    private JButton stergereButton;
    private JButton filtrareButton;
    private JButton activitateButton;
    private JPanel meniu;
    private JButton editareButton;
    private String paginaActuala;


    static ArrayList<SculeElectrice> listaScule = new ArrayList<>();
    static ArrayList<GeneratorElectric> listaGenerator = new ArrayList<>();
    static ArrayList<AparatDeSudura> listaAS = new ArrayList<>();

    public void setPaginaActuala(String paginaActuala) {
        this.paginaActuala = paginaActuala;
    }
    public String getPaginaActuala() {
        return paginaActuala;
    }


    public InterfataGrafica_NeaguD() {

        sculeElectriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPaginaActuala("Scule Electrice");

                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);
                for (SculeElectrice scula : listaScule) {
                    tabel.addRow(new Object[]{
                            scula.getMarca(),
                            scula.getTipAlimentare(),
                            scula.getPutere(),
                            scula.getGreutate(),
                            scula.getPret()

                    });
                }
                table1.setModel(tabel);
                adaugareButton.setEnabled(true);
                stergereButton.setEnabled(true);
                filtrareButton.setEnabled(true);
                activitateButton.setEnabled(true);
            }
        });


        generatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPaginaActuala("Generator Electric");

                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                        "TipCurent", "Voltaj", "Cc", "Frecventa", "Carburant"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);
                for (GeneratorElectric gen : listaGenerator) {
                    tabel.addRow(new Object[]{
                            gen.getMarca(),
                            gen.getTipAlimentare(),
                            gen.getPutere(),
                            gen.getGreutate(),
                            gen.getPret(),
                            gen.getTipCurent(),
                            gen.getVoltaj(),
                            gen.getCc(),
                            gen.getFrecventa(),
                            gen.getCarburant()

                    });
                }
                table1.setModel(tabel);
                editareButton.setEnabled(true);
                adaugareButton.setEnabled(true);
                stergereButton.setEnabled(true);
                filtrareButton.setEnabled(true);
                activitateButton.setEnabled(true);
            }
        });


        aparatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPaginaActuala("Aparat Sudura");

                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                        "Impuls", "TipAprindere", "Intensitate", "Material", "Control"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);
                for (AparatDeSudura as: listaAS) {
                    tabel.addRow(new Object[]{
                            as.getMarca(),
                            as.getTipAlimentare(),
                            as.getPutere(),
                            as.getGreutate(),
                            as.getPret(),
                            as.getImpuls(),
                            as.getTipAprindere(),
                            as.getIntensitate(),
                            as.getMaterial(),
                            as.getControl()

                    });
                }
                table1.setModel(tabel);
                adaugareButton.setEnabled(true);
                stergereButton.setEnabled(true);
                filtrareButton.setEnabled(true);
                activitateButton.setEnabled(true);
            }
        });


        adaugareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tabel = (DefaultTableModel) table1.getModel();

                String marca = JOptionPane.showInputDialog("[STRING] Nume marca:");
                if (marca == null) return;
                String tipAlimentare = JOptionPane.showInputDialog("[STRING] Tip Alimentare:");
                if (tipAlimentare == null) return;
                String putere = JOptionPane.showInputDialog("[DOUBLE] Putere:");
                if (putere == null) return;
                String greutate = JOptionPane.showInputDialog("[DOUBLE] Greutate:");
                if (greutate == null) return;
                String pret = JOptionPane.showInputDialog("[DOUBLE] Pret:");
                if (pret == null) return;
                if (getPaginaActuala().equals("Generator Electric")) {
                    String voltaj = JOptionPane.showInputDialog("[INT] Voltaj:");
                    if (voltaj == null) return;
                    String cc = JOptionPane.showInputDialog("[INT] Cc:");
                    if (cc == null) return;
                    String frecventa = JOptionPane.showInputDialog("[DOUBLE] Frecventa:");
                    if (frecventa == null) return;
                    String carburant = JOptionPane.showInputDialog("[STRING] Carburant:");
                    if (carburant == null) return;
                    String tipCurent = JOptionPane.showInputDialog("[STRING] TipCurent:");
                    if (tipCurent == null) return;

                    listaGenerator.add(new GeneratorElectric(tipCurent, Integer.parseInt(voltaj), Integer.parseInt(cc), Double.parseDouble(frecventa), carburant,
                            marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));

                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                            Integer.parseInt(voltaj), Integer.parseInt(cc), Double.parseDouble(frecventa), tipCurent, carburant
                    });

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");


                } else if (getPaginaActuala().equals("Aparat Sudura")) {
                    String intensitate = JOptionPane.showInputDialog("[INT] Intensitate:");
                    if (intensitate == null) return;
                    String impuls = JOptionPane.showInputDialog("[INT] Impuls:");
                    if (impuls == null) return;
                    String material = JOptionPane.showInputDialog("[STRING] Material:");
                    if (material == null) return;
                    String control = JOptionPane.showInputDialog("[STRING] Control:");
                    if (control == null) return;
                    String tipAprindere = JOptionPane.showInputDialog("[STRING] TipAprindere:");
                    if (tipAprindere == null) return;

                    listaAS.add(new AparatDeSudura(Integer.parseInt(impuls), tipAprindere, Integer.parseInt(intensitate), material, control,
                            marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));

                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                            Integer.parseInt(impuls), Integer.parseInt(intensitate), tipAprindere, material, control

                    });

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");

                } else {
                    listaScule.add(new SculeElectrice(marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));
                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)});

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");
                }


                table1.repaint();
                table1.revalidate();
            }
        });


        stergereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linieSelectata = table1.getSelectedRow();

                if (linieSelectata == 0) {
                    JOptionPane.showMessageDialog(null, "Nu puteți șterge header-ul!");
                    return;
                }

                if (linieSelectata == -1) {
                    JOptionPane.showMessageDialog(null, "Selectați un rând pentru a șterge!");
                    return;
                }
                int confirm = JOptionPane.showConfirmDialog(null,
                        "Sunteți sigur că doriți să ștergeți acest element?",
                        "Confirmare ștergere", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    DefaultTableModel tabel = (DefaultTableModel) table1.getModel();

                    if (paginaActuala.equals("Aparat Sudura")) {
                        listaAS.remove(linieSelectata - 1);
                    } else if (paginaActuala.equals("Generator Electric")) {
                        listaGenerator.remove(linieSelectata - 1);
                    } else if (paginaActuala.equals("Scule Electrice")) {
                        listaScule.remove(linieSelectata - 1);
                    }

                    tabel.removeRow(linieSelectata);

                    JOptionPane.showMessageDialog(null, "Elementul a fost șters cu succes!");

                }
            }
        });


        filtrareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String minPret = JOptionPane.showInputDialog("Introduceți prețul minim:");
                if (minPret == null) {
                    return;
                }
                String maxPret = JOptionPane.showInputDialog("Introduceți prețul maxim:");
                if (maxPret == null) {
                    return;
                }

                if (getPaginaActuala().equals("Aparat Sudura")) {
                    String minIntensitate = JOptionPane.showInputDialog("Introduceti intensitatea minima:");
                    if (minIntensitate == null) {
                        return;
                    }
                    String maxIntensitate = JOptionPane.showInputDialog("Introduceti intensitatea maxima:");
                    if (maxIntensitate == null) {
                        return;
                    }

                    String minImpuls = JOptionPane.showInputDialog("Introduceti impulsul minim: ");
                    if (minImpuls == null) {
                        return;
                    }
                    String maxImpuls = JOptionPane.showInputDialog("Introduceti impulsul maxim: ");
                    if (maxImpuls == null) {
                        return;
                    }

                    if (paginaActuala.equals("Aparat Sudura")) {
                        String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                                "Impuls", "TipAprindere", "Intensitate", "Material", "Control"};


                        DefaultTableModel tabelFiltrat = new DefaultTableModel(numeColoana, 0);

                        tabelFiltrat.setColumnIdentifiers(numeColoana);
                        tabelFiltrat.addRow(numeColoana);

                        for (AparatDeSudura as : listaAS) {
                            if (as.getPret() >= Double.parseDouble(minPret) && as.getPret() <= Double.parseDouble(maxPret) && as.getIntensitate() >= Integer.parseInt(minIntensitate) &&
                                    as.getIntensitate() <= Integer.parseInt(maxIntensitate) && as.getImpuls()>=Integer.parseInt(minImpuls) && as.getImpuls()<=Integer.parseInt(maxImpuls)) {
                                tabelFiltrat.addRow(new Object[]{
                                        as.getMarca(),
                                        as.getTipAlimentare(),
                                        as.getPutere(),
                                        as.getGreutate(),
                                        as.getPret(),
                                        as.getImpuls(),
                                        as.getTipAprindere(),
                                        as.getIntensitate(),
                                        as.getMaterial(),
                                        as.getControl()
                                });
                            }
                        }
                        table1.setModel(tabelFiltrat);
                        JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                    } else if (paginaActuala.equals("Generator Electric")) {

                        String minVoltaj=JOptionPane.showInputDialog("Introduceti voltajul minim: "); if(minVoltaj==null){return;}
                        String maxVoltaj=JOptionPane.showInputDialog("Introduceti voltajul maxim: "); if(maxVoltaj==null){return;}

                        String minCc=JOptionPane.showInputDialog("Introduceti cc minim: "); if(minCc==null){return;}
                        String maxCc=JOptionPane.showInputDialog("Introduceti cc maxim: "); if(maxCc==null){return;}


                        String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                                "TipCurent", "Voltaj", "Cc", "Frecventa", "Carburant"};

                        DefaultTableModel tabelFiltrat = new DefaultTableModel();

                        tabelFiltrat.setColumnIdentifiers(numeColoana);
                        tabelFiltrat.addRow(numeColoana);

                        for (GeneratorElectric gen : listaGenerator) {
                            if(gen.getPret()>=Integer.parseInt(minPret) && gen.getPret()<=Integer.parseInt(maxPret) && gen.getVoltaj()>=Integer.parseInt(minVoltaj) &&
                                    gen.getVoltaj()<=Integer.parseInt(maxVoltaj) && gen.getCc()>=Integer.parseInt(minCc) && gen.getCc()<=Integer.parseInt(maxCc)) {

                                tabelFiltrat.addRow(new Object[]{
                                        gen.getMarca(),
                                        gen.getTipAlimentare(),
                                        gen.getPutere(),
                                        gen.getGreutate(),
                                        gen.getPret(),
                                        gen.getTipCurent(),
                                        gen.getVoltaj(),
                                        gen.getCc(),
                                        gen.getFrecventa(),
                                        gen.getCarburant()

                                });
                            }
                        }

                        table1.setModel(tabelFiltrat);
                        JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                    } else {
                        String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret"};

                        DefaultTableModel tabelFiltrat = new DefaultTableModel();
                        tabelFiltrat.addRow(numeColoana);

                        tabelFiltrat.setColumnIdentifiers(numeColoana);
                        for (SculeElectrice scula : listaScule) {
                            if (scula.getPret() >= Double.parseDouble(minPret) && scula.getPret() <= Double.parseDouble(maxPret)) {
                                tabelFiltrat.addRow(new Object[]{
                                        scula.getMarca(),
                                        scula.getTipAlimentare(),
                                        scula.getPutere(),
                                        scula.getGreutate(),
                                        scula.getPret()
                                });
                            }
                        }
                        table1.setModel(tabelFiltrat);
                        JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                    }
                }
            }
        });

        editareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linieSelectata = table1.getSelectedRow();

                if (linieSelectata == -1) {
                    JOptionPane.showMessageDialog(null, "Selectați un rând pentru a edita!");
                    return;
                }

                if (linieSelectata == 0) {
                    JOptionPane.showMessageDialog(null, "Nu puteți selecta header-ul!");
                    return;
                }
                String[] optiuni;
                if (paginaActuala.equals("Generator Electric")) {
                    optiuni = new String[]{"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                            "TipCurent", "Voltaj", "Cc", "Frecventa", "Carburant"};
                } else if (paginaActuala.equals("Aparat Sudura")) {
                    optiuni = new String[]{"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                            "Impuls", "TipAprindere", "Intensitate", "Material", "Control"};
                } else {
                    optiuni = new String[]{"Marca", "Tip Alimentare", "Putere", "Greutate", "Preț"};
                }

                String atributSelectat = (String) JOptionPane.showInputDialog(null,
                        "Selectați atributul de modificat:",
                        "Editare",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        optiuni,
                        optiuni[0]);

                if (atributSelectat == null) {
                    return;
                }

                String valoareNoua = JOptionPane.showInputDialog("Introduceți noua valoare pentru " + atributSelectat + ":");
                if (valoareNoua == null) {
                    return;
                }

                DefaultTableModel tabel = (DefaultTableModel) table1.getModel();

                if (paginaActuala.equals("Generator Electric")) {
                    GeneratorElectric gen = listaGenerator.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> gen.setMarca(valoareNoua);
                        case "Tip Alimentare" -> gen.setTipAlimentare(valoareNoua);
                        case "Putere" -> gen.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> gen.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> gen.setPret(Double.parseDouble(valoareNoua));
                        case "Voltaj" -> gen.setVoltaj(Integer.parseInt(valoareNoua));
                        case "Cc" -> gen.setCc(Integer.parseInt(valoareNoua));
                        case "Frecventa" -> gen.setFrecventa(Double.parseDouble(valoareNoua));
                        case "Carburant" -> gen.setCarburant(valoareNoua);
                        case "tipCurent" -> gen.setTipCurent(valoareNoua);
                    }
                } else if (paginaActuala.equals("Aparat Sudura")) {
                    AparatDeSudura as = listaAS.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> as.setMarca(valoareNoua);
                        case "Tip Alimentare" -> as.setTipAlimentare(valoareNoua);
                        case "Putere" -> as.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> as.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> as.setPret(Double.parseDouble(valoareNoua));
                        case "Intensitate" -> as.setIntensitate(Integer.parseInt(valoareNoua));
                        case "Impuls" -> as.setImpuls(Integer.parseInt(valoareNoua));
                        case "Material" -> as.setMaterial(valoareNoua);
                        case "Control" -> as.setControl(valoareNoua);
                        case "TipAprindere" -> as.setTipAprindere(valoareNoua);
                    }

                }
                tabel.setValueAt(valoareNoua, linieSelectata, java.util.Arrays.asList(optiuni).indexOf(atributSelectat));
                JOptionPane.showMessageDialog(null, "Modificarea a fost realizată cu succes!");


            }
        });



        activitateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linieSelectata = table1.getSelectedRow();

                if (linieSelectata == -1) {
                    JOptionPane.showMessageDialog(null, "Selectați un rând pentru porni obiectul!");
                    return;
                }

                if (linieSelectata == 0) {
                    JOptionPane.showMessageDialog(null, "Nu puteți selecta header-ul!");
                    return;
                }

                SculeElectrice scula = null;
                if (paginaActuala.equals("Generator Electric")) {
                    scula =listaGenerator.get(linieSelectata - 1); // Ajustează indexul pentru rândul selectat
                } else if (paginaActuala.equals("Scule Electrice")) {
                    scula = listaScule.get(linieSelectata - 1);
                } else if (paginaActuala.equals("Aparat Sudura")) {
                    scula = listaAS.get(linieSelectata - 1);
                }

                if (scula == null) {
                    JOptionPane.showMessageDialog(null, "Scula nu a fost găsită!");
                    return;
                }

                String mesaj = "Ce doriți să faceți cu scula selectată?";

                Object[] optiuni = {"Pornește", "Oprește"};
                int optiune = JOptionPane.showOptionDialog(null,
                        mesaj,
                        "Confirmare Activitate",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        optiuni,
                        optiuni[0]
                );
                if (optiune == 0) {
                    scula.porneste();
                    JOptionPane.showMessageDialog(null, "Scula a fost pornită!");
                } else if (optiune == 1) {
                    scula.opreste();
                    JOptionPane.showMessageDialog(null, "Scula a fost oprită!");
                }
            }
        });
    }

    public static void main(String[] args) {


        try{
            FileInputStream fin = new FileInputStream("D:\\proiect\\ProiectPOO_SculeElectrice\\Proiect_SculeElectrice\\src\\proiect_SculeElectrice\\fisier_Neagu.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fin));
            String linie;

            while ((linie = br.readLine()) != null) {
                if (linie.startsWith("Scule Electrice: ")) {
                    String[] valori = linie.split(": ")[1].split(", ");
                    listaScule.add(new SculeElectrice(valori[0], valori[1], Double.parseDouble(valori[2]), Double.parseDouble(valori[3]), Double.parseDouble(valori[4])
                    ));
                } else if (linie.startsWith("Generatoare Electrice: ")) {
                    String[] valori = linie.split(": ")[1].split(", ");
                    listaGenerator.add(new GeneratorElectric(valori[0], Integer.parseInt(valori[1]), Integer.parseInt(valori[2]), Double.parseDouble(valori[3]), valori[4], valori[5],
                            valori[6], Double.parseDouble(valori[7]), Double.parseDouble(valori[8]), Double.parseDouble(valori[9])
                    ));

                } else if (linie.startsWith("Aparate Sudura: ")) {
                    String[] valori = linie.split(": ")[1].split(", ");
                    listaAS.add(new AparatDeSudura(Integer.parseInt(valori[0]), valori[1], Integer.parseInt(valori[2]), valori[3], valori[4],
                            valori[5], valori[6], Double.parseDouble(valori[7]), Double.parseDouble(valori[8]), Double.parseDouble(valori[9])
                    ));

                }
            }
        } catch (
                IOException e) {
            System.out.println("[EROARE!] " + e.getMessage());
        }

        JFrame frame = new JFrame();
        frame.setContentPane(new InterfataGrafica_NeaguD().meniu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
