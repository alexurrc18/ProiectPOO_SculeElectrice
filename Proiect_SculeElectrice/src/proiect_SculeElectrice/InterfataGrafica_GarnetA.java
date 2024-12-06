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

public class InterfataGrafica_GarnetA {
    private JButton sculeElectriceButton;
    private JButton polizorButton;
    private JButton slefuitorButton;
    private JTable table1;
    private JButton adaugareButton;
    private JButton stergereButton;
    private JButton filtrareButton;
    private JButton activitateButton;
    private JPanel meniu;
    private JButton editareButton;
    private String paginaActuala;


    static ArrayList<SculeElectrice> listaScule = new ArrayList<>();
    static ArrayList<Polizor> listaPolizoare = new ArrayList<>();
    static ArrayList<Slefuitor> listaSlefuitoare = new ArrayList<>();

    public void setPaginaActuala(String paginaActuala) {
        this.paginaActuala = paginaActuala;
    }
    public String getPaginaActuala() {
        return paginaActuala;
    }


    public InterfataGrafica_GarnetA() {

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


        polizorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPaginaActuala("Polizor");

                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                        "Diametru Disc", "Turatie", "Nivel Zgomot", "Sistem de racire", "Siguranta"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);
                for (Polizor polizor : listaPolizoare) {
                    tabel.addRow(new Object[]{
                            polizor.getMarca(),
                            polizor.getTipAlimentare(),
                            polizor.getPutere(),
                            polizor.getGreutate(),
                            polizor.getPret(),
                            polizor.getDiametruDisc(),
                            polizor.getTuratie(),
                            polizor.getNivelZgomot(),
                            polizor.getSistRacire(),
                            polizor.getSiguranta()
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


        slefuitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPaginaActuala("Slefuitor");

                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                        "Diametru Disc", "Lungime Banda", "Tip Prindere", "Ergonomie", "Sistem colectare praf"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);
                for (Slefuitor slefuitor : listaSlefuitoare) {
                    tabel.addRow(new Object[]{
                            slefuitor.getMarca(),
                            slefuitor.getTipAlimentare(),
                            slefuitor.getPutere(),
                            slefuitor.getGreutate(),
                            slefuitor.getPret(),
                            slefuitor.getDiametruDisc(),
                            slefuitor.getLungimeBanda(),
                            slefuitor.getTipPrindere(),
                            slefuitor.getErgonomie(),
                            slefuitor.getSisColectPraf()

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
                if (getPaginaActuala().equals("Polizor")) {
                    String diametruDisc = JOptionPane.showInputDialog("[INT] Diametru Disc:");
                    if (diametruDisc == null) return;
                    String turatie = JOptionPane.showInputDialog("[INT] Turatie:");
                    if (turatie == null) return;
                    String nivelZgomot = JOptionPane.showInputDialog("[INT] Nivel Zgomot:");
                    if (nivelZgomot == null) return;
                    String sistRacire = JOptionPane.showInputDialog("[STRING] Sistem Racire:");
                    if (sistRacire == null) return;
                    String siguranta = JOptionPane.showInputDialog("[BOOLEAN] Siguranta:");
                    if (siguranta == null) return;

                    listaPolizoare.add(new Polizor(Integer.parseInt(diametruDisc), Integer.parseInt(turatie), Integer.parseInt(nivelZgomot), sistRacire, Boolean.parseBoolean(siguranta),
                            marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));

                    tabel.addRow(new Object[]{Integer.parseInt(diametruDisc), Integer.parseInt(turatie), Integer.parseInt(nivelZgomot), sistRacire, Boolean.parseBoolean(siguranta),
                            marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)
                    });

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");


                } else if (getPaginaActuala().equals("Slefuitor")) {
                    String diametruDisc = JOptionPane.showInputDialog("[INT] Diametru Disc:");
                    if (diametruDisc == null) return;
                    String lungimeBanda = JOptionPane.showInputDialog("[INT] Lungime banda:");
                    if (lungimeBanda == null) return;
                    String tipPrindere = JOptionPane.showInputDialog("[STRING] Tip prindere:");
                    if (tipPrindere == null) return;
                    String ergonomie = JOptionPane.showInputDialog("[STRING] Ergonomie:");
                    if (ergonomie == null) return;
                    String sisColectPraf = JOptionPane.showInputDialog("[STRING] Sistem Colectare Praf:");
                    if (sisColectPraf == null) return;

                    listaSlefuitoare.add(new Slefuitor(Integer.parseInt(diametruDisc), Integer.parseInt(lungimeBanda), tipPrindere, ergonomie, sisColectPraf,
                            marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));

                    tabel.addRow(new Object[]{Integer.parseInt(diametruDisc), Integer.parseInt(lungimeBanda), tipPrindere, ergonomie, sisColectPraf,
                            marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)
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

                    if (paginaActuala.equals("Slefuitor")) {
                        listaSlefuitoare.remove(linieSelectata - 1);
                    } else if (paginaActuala.equals("Polizor")) {
                        listaPolizoare.remove(linieSelectata - 1);
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
                String maxPret = JOptionPane.showInputDialog("Introduceți prețul maxim:");

                if (minPret == null || maxPret == null) {
                    return;
                }
                if (paginaActuala.equals("Polizor")) {
                    String[] numeColoana = {"Diametru Disc", "Turatie", "Nivel Zgomot", "Sistem Racire", "Siguranta",
                            "Marca", "Alimentare", "Putere", "Greutate", "Pret"};

                    DefaultTableModel tabelFiltrat = new DefaultTableModel(numeColoana, 0);

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    tabelFiltrat.addRow(numeColoana);

                    for (Polizor polizor : listaPolizoare) {
                        if (polizor.getPret() >= Double.parseDouble(minPret) && polizor.getPret() <= Double.parseDouble(maxPret)) {
                            tabelFiltrat.addRow(new Object[]{
                                    polizor.getMarca(),
                                    polizor.getTipAlimentare(),
                                    polizor.getPutere(),
                                    polizor.getGreutate(),
                                    polizor.getPret(),
                                    polizor.getDiametruDisc(),
                                    polizor.getTuratie(),
                                    polizor.getNivelZgomot(),
                                    polizor.getSistRacire(),
                                    polizor.getSiguranta()
                            });
                        }
                    }
                    table1.setModel(tabelFiltrat);
                    JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                } else if (paginaActuala.equals("Slefuitor")) {

                    String[] numeColoana = {"Diametru Disc", "Lungime Banda", "Tip Prindere", "Ergonomie", "Sistem Colectare Praf",
                            "Marca", "Alimentare", "Putere", "Greutate", "Pret",
                    };

                    DefaultTableModel tabelFiltrat = new DefaultTableModel();

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    tabelFiltrat.addRow(numeColoana);

                    for (Slefuitor slefuitor : listaSlefuitoare) {
                        if (slefuitor.getPret() >= Double.parseDouble(minPret) && slefuitor.getPret() <= Double.parseDouble(maxPret)) {
                            tabelFiltrat.addRow(new Object[]{
                                    slefuitor.getMarca(),
                                    slefuitor.getTipAlimentare(),
                                    slefuitor.getPutere(),
                                    slefuitor.getGreutate(),
                                    slefuitor.getPret(),
                                    slefuitor.getDiametruDisc(),
                                    slefuitor.getLungimeBanda(),
                                    slefuitor.getTipPrindere(),
                                    slefuitor.getErgonomie(),
                                    slefuitor.getSisColectPraf()
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
                if (paginaActuala.equals("Polizoare")) {
                    optiuni = new String[]{ "Diametru Disc", "Turatie", "Nivel Zgomot", "Sistem de racire", "Siguranta",
                            "Marca", "Tip Alimentare", "Putere", "Greutate", "Preț"};
                } else if (paginaActuala.equals("Slefuitoare")) {
                    optiuni = new String[]{"Diametru Disc", "Lungime Banda", "Tip Prindere", "Ergonomie", "Sistem Colectare Praf",
                            "Marca", "Tip Alimentare", "Putere", "Greutate", "Preț"};
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

                if (paginaActuala.equals("Polizoare")) {
                    Polizor polizor = listaPolizoare.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> polizor.setMarca(valoareNoua);
                        case "Tip Alimentare" -> polizor.setTipAlimentare(valoareNoua);
                        case "Putere" -> polizor.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> polizor.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> polizor.setPret(Double.parseDouble(valoareNoua));
                        case "Diametru Disc" -> polizor.setDiametruDisc(Integer.parseInt(valoareNoua));
                        case "Turatie" -> polizor.setTuratie(Integer.parseInt(valoareNoua));
                        case "Nivel Zgomot" -> polizor.setNivelZgomot(Integer.parseInt(valoareNoua));
                        case "Sistem de Racire" -> polizor.setSistRacire(valoareNoua);
                        case "Siguranta" -> polizor.setSiguranta(Boolean.parseBoolean(valoareNoua));
                    }
                } else if (paginaActuala.equals("Slefuitoare")) {
                    Slefuitor slefuitor = listaSlefuitoare.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> slefuitor.setMarca(valoareNoua);
                        case "Tip Alimentare" -> slefuitor.setTipAlimentare(valoareNoua);
                        case "Putere" -> slefuitor.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> slefuitor.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> slefuitor.setPret(Double.parseDouble(valoareNoua));
                        case "Diametru Disc" -> slefuitor.setDiametruDisc(Integer.parseInt(valoareNoua));
                        case "Lungime Banda" -> slefuitor.setLungimeBanda(Integer.parseInt(valoareNoua));
                        case "Tip Prindere" -> slefuitor.setTipPrindere(valoareNoua);
                        case "Ergonomie" -> slefuitor.setErgonomie(valoareNoua);
                        case "Sistem Colectare Praf" -> slefuitor.setSisColectPraf(valoareNoua);
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
                if (paginaActuala.equals("Polizor")) {
                    scula =listaPolizoare.get(linieSelectata - 1); // Ajustează indexul pentru rândul selectat
                } else if (paginaActuala.equals("Scule Electrice")) {
                    scula = listaScule.get(linieSelectata - 1);
                } else if (paginaActuala.equals("Slefuitor")) {
                    scula = listaSlefuitoare.get(linieSelectata - 1);
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
            FileInputStream fin = new FileInputStream("D:\\facultate\\java\\ProiectPOO_SculeElectrice\\Proiect_SculeElectrice\\src\\proiect_SculeElectrice\\POO_proiect_GarnetA.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fin));
            String linie;

            while ((linie = br.readLine()) != null) {
                 if (linie.startsWith("Polizor:")) {
                String[] valori = linie.split(": ")[1].split(", ");
                listaPolizoare.add(new Polizor(Integer.parseInt(valori[0]), Integer.parseInt(valori[1]), Integer.parseInt(valori[2]), valori[3], Boolean.parseBoolean(valori[4]), valori[5],
                        valori[6], Double.parseDouble(valori[7]), Double.parseDouble(valori[8]), Double.parseDouble(valori[9])
                ));
                } else if (linie.startsWith("Scule electrice:")) {
                String[] valori = linie.split(": ")[1].split(", ");
                listaScule.add(new SculeElectrice(valori[0], valori[1], Double.parseDouble(valori[2]), Double.parseDouble(valori[3]), Double.parseDouble(valori[4])
                ));
                } else if (linie.startsWith("Slefuitor:")) {
                     String[] valori = linie.split(": ")[1].split(", ");
                     listaSlefuitoare.add(new Slefuitor(Integer.parseInt(valori[0]), Integer.parseInt(valori[1]), valori[2], valori[3], valori[4],
                             valori[5], valori[6], Double.parseDouble(valori[7]), Double.parseDouble(valori[8]), Double.parseDouble(valori[9])
                     ));

                 }
            }
        } catch (
         IOException e) {
             System.out.println("[EROARE!] " + e.getMessage());
         }

        JFrame frame = new JFrame();
        frame.setContentPane(new InterfataGrafica_GarnetA().meniu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        }
    }
