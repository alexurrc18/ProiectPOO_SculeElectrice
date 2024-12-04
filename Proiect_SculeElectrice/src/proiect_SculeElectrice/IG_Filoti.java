package proiect_SculeElectrice;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class IG_Filoti extends JFrame {
    private JPanel meniu;
    private JButton masinaGaurit;
    private JButton polizorUnghiular;
    private JTable tabelObiecte;
    private JButton adaugaButton;
    private JButton editezaButton;
    private JButton stergeButton;
    private JButton filtrareButton;
    private JButton sculeElectrice;
    private JButton activitateButton;

    private String numePagina;

    public void setNumePagina(String numePagina) {
        this.numePagina = numePagina;
    }
    public String getNumePagina() {
        return numePagina;
    }


    static ArrayList<SculeElectrice> listaScule = new ArrayList<>();
    static ArrayList<MasinaGaurit> listaMasina = new ArrayList<>();
    static ArrayList<PolizorUnghiular> listaPolizor = new ArrayList<>();

    public IG_Filoti() {
        masinaGaurit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numeColoana = {"Marca", "TipAlimentare", "Putere", "Pret", "Greutate", "DiametruGaura",
                        "TrepteViteza", "MaterialBurghiu", "Directia", "LungimeBurghiu"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);

                for (MasinaGaurit masina : listaMasina) {
                    tabel.addRow(new Object[]{
                            masina.getMarca(),
                            masina.getTipAlimentare(),
                            masina.getPutere(),
                            masina.getGreutate(),
                            masina.getPret(),
                            masina.getDiametruGaura(),
                            masina.getMaterialBurghiu(),
                            masina.getDirectia(),
                            masina.getLungimeBurghiu(),
                            masina.getTrepteViteza()
                    });
                }


                tabelObiecte.setModel(tabel);
                adaugaButton.setEnabled(true);
                editezaButton.setEnabled(true);
                stergeButton.setEnabled(true);
                filtrareButton.setEnabled(true);
                tabelObiecte.setEnabled(true);
                activitateButton.setEnabled(true);
                setNumePagina("Masina Gaurit");
            }
        });

        sculeElectrice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);

                for (SculeElectrice scule : listaScule) {
                    tabel.addRow(new Object[]{
                            scule.getMarca(),
                            scule.getTipAlimentare(),
                            scule.getPutere(),
                            scule.getGreutate(),
                            scule.getPret()
                    });
                }


                tabelObiecte.setModel(tabel);
                adaugaButton.setEnabled(true);
                editezaButton.setEnabled(true);
                stergeButton.setEnabled(true);
                filtrareButton.setEnabled(true);
                tabelObiecte.setEnabled(true);
                activitateButton.setEnabled(true);
                setNumePagina("Scule electrice");
            }
        });

        adaugaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tabel = (DefaultTableModel) tabelObiecte.getModel();

                String marca = JOptionPane.showInputDialog("[STRING] Nume marca:"); if(marca==null) return;
                String tipAlimentare=JOptionPane.showInputDialog("[STRING] Tip Alimentare:"); if(tipAlimentare==null) return;
                String putere = JOptionPane.showInputDialog("[DOUBLE] Putere:"); if(putere==null) return;
                String greutate = JOptionPane.showInputDialog("[DOUBLE] Greutate:"); if(greutate==null) return;
                String pret = JOptionPane.showInputDialog("[DOUBLE] Pret:"); if(pret==null) return;
                if (getNumePagina().equals("Masina Gaurit")) {
                    String diametruGaura = JOptionPane.showInputDialog("[INT] DiametruGaura:");
                    if (diametruGaura == null) return;
                    String trepteViteza = JOptionPane.showInputDialog("[INT] TrepteViteza:");
                    if (trepteViteza == null) return;
                    String materialBurghiu = JOptionPane.showInputDialog("[STRING] MaterialBurghiu:");
                    if (materialBurghiu == null) return;
                    String directia = JOptionPane.showInputDialog("[STRING] Directia:");
                    if (directia == null) return;
                    String lungimeBurghiu = JOptionPane.showInputDialog("[DOUBLE] LungimeBurghiu:");
                    if (lungimeBurghiu == null) return;
                    listaMasina.add(new MasinaGaurit(Integer.parseInt(diametruGaura), Integer.parseInt(trepteViteza), marca, tipAlimentare, Double.parseDouble(pret),
                            materialBurghiu, directia, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(lungimeBurghiu)));

                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                            diametruGaura, trepteViteza, materialBurghiu, directia, lungimeBurghiu
                    });

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");


                } else if (getNumePagina().equals("Polizor Unghiular")) {
                    String diametruDisc = JOptionPane.showInputDialog("[INT] DiametruDisc:");
                    if (diametruDisc == null) return;
                    String supraincalzire = JOptionPane.showInputDialog("[INT] Supraincalzire:");
                    if (supraincalzire == null) return;
                    String tip = JOptionPane.showInputDialog("[STRING] Tip:");
                    if (tip == null) return;
                    String turatia = JOptionPane.showInputDialog("[DOUBLE] Turatia:");
                    if (turatia == null) return;
                    String sistemSiguranta = JOptionPane.showInputDialog("[DOUBLE] SistemSiguranta:");
                    if (sistemSiguranta == null) return;

                    listaPolizor.add(new PolizorUnghiular(Integer.parseInt(diametruDisc), Integer.parseInt(supraincalzire), tip, Double.parseDouble(turatia), Double.parseDouble(sistemSiguranta),
                            marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));

                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                            Integer.parseInt(diametruDisc), Integer.parseInt(supraincalzire), tip, Double.parseDouble(turatia), Double.parseDouble(sistemSiguranta)
                    });

                            JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");

                } else {
                    listaScule.add(new SculeElectrice(marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));
                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)});

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");}



                tabelObiecte.repaint();
                tabelObiecte.revalidate();

            }
        });

        stergeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linieSelectata = tabelObiecte.getSelectedRow();

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
                    DefaultTableModel tabel = (DefaultTableModel) tabelObiecte.getModel();

                    if (getNumePagina().equals("Masina Gaurit")) {
                        listaMasina.remove(linieSelectata - 1);
                    } else if (getNumePagina().equals("Polizor Unghiular")) {
                        listaPolizor.remove(linieSelectata - 1);
                    } else if (getNumePagina().equals("Scule electrice")) {
                        listaScule.remove(linieSelectata-1);
                    }

                    tabel.removeRow(linieSelectata);

                    JOptionPane.showMessageDialog(null, "Elementul a fost șters cu succes!");
                }
            }
        });

        editezaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linieSelectata = tabelObiecte.getSelectedRow();

                if (linieSelectata == -1) {
                    JOptionPane.showMessageDialog(null, "Selectați un rând pentru a edita!");
                    return;
                }

                if (linieSelectata == 0) {
                    JOptionPane.showMessageDialog(null, "Nu puteți selecta header-ul!");
                    return;
                }

                String[] optiuni;
                if (getNumePagina().equals("MasinaGaurit")) {
                    optiuni = new String[]{"Marca", "TipAlimentare", "Putere", "Greutate", "Pret", "Alimentare", "DiametruGaura",
                            "TrepteViteza", "MaterialBurghiu", "Directia", "LungimeBurghiu"};
                } else if (getNumePagina().equals("PolizorUnghiular")) {
                    optiuni = new String[]{"Marca", "Tip Alimentare", "Putere", "Greutate", "Preț", "DiametruDisc", "Supraincalzire",
                            "Tip", "Turatia", "SistemSiguranta"};
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

                DefaultTableModel tabel = (DefaultTableModel) tabelObiecte.getModel();

                if (getNumePagina().equals("MasinaGaurit")) {
                    MasinaGaurit masina = listaMasina.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> masina.setMarca(valoareNoua);
                        case "TipAlimentare" -> masina.setTipAlimentare(valoareNoua);
                        case "Putere" -> masina.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> masina.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> masina.setPret(Double.parseDouble(valoareNoua));
                        case "DiametruGaura" -> masina.setDiametruGaura(Integer.parseInt(valoareNoua));
                        case "TrepteViteza" -> masina.setTrepteViteza(Integer.parseInt(valoareNoua));
                        case "MaterialBurghiu" -> masina.setMaterialBurghiu(valoareNoua);
                        case "Directia" -> masina.setDirectia(valoareNoua);
                        case "LungimeBurghiu" -> masina.setLungimeBurghiu(Double.parseDouble(valoareNoua));
                    }
                } else if (getNumePagina().equals("PolizorUnghiular")) {
                    PolizorUnghiular polizor = listaPolizor.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> polizor.setMarca(valoareNoua);
                        case "Tip Alimentare" -> polizor.setTipAlimentare(valoareNoua);
                        case "Putere" -> polizor.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> polizor.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> polizor.setPret(Double.parseDouble(valoareNoua));
                        case "DiametruDisc" -> polizor.setDiametruDisc(Integer.parseInt(valoareNoua));
                        case "Supraincalzire" -> polizor.setSupraincalzire(Integer.parseInt(valoareNoua));
                        case "Tip" -> polizor.setTip(valoareNoua);
                        case "Turatia" -> polizor.setTuratia(Double.parseDouble(valoareNoua));
                        case "SistemSiguranta" -> polizor.setSistemSiguranta(Double.parseDouble(valoareNoua));
                    }
                }

                tabel.setValueAt(valoareNoua, linieSelectata, java.util.Arrays.asList(optiuni).indexOf(atributSelectat));
                JOptionPane.showMessageDialog(null, "Modificarea a fost realizată cu succes!");
            }
        });


        polizorUnghiular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                        "DiametruDisc", "Supraincalzire", "Tip", "Turatia", "SistemSiguranta"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);


                for (PolizorUnghiular polizor : listaPolizor) {
                    tabel.addRow(new Object[]{
                            polizor.getMarca(),
                            polizor.getTipAlimentare(),
                            polizor.getPutere(),
                            polizor.getGreutate(),
                            polizor.getPret(),
                            polizor.getDiametruDisc(),
                            polizor.getSistemSiguranta(),
                            polizor.getTip(),
                            polizor.getTuratia(),
                            polizor.getSistemSiguranta()
                    });
                }


                tabelObiecte.setModel(tabel);
                adaugaButton.setEnabled(true);
                editezaButton.setEnabled(true);
                stergeButton.setEnabled(true);
                filtrareButton.setEnabled(true);
                tabelObiecte.setEnabled(true);
                activitateButton.setEnabled(true);
                setNumePagina("Polizor Unghiular");
            }
        });


        filtrareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String minPret = JOptionPane.showInputDialog("Introduceți prețul minim:"); if(minPret==null) {return;}
                String maxPret = JOptionPane.showInputDialog("Introduceți prețul maxim:"); if(maxPret==null) {return;}


                if (getNumePagina().equals("MasinaGaurit")) {
                    String minTrepteViteza = JOptionPane.showInputDialog("Introduceți treapta minimă:"); if(minTrepteViteza==null) {return;}
                    String maxTrepteViteza = JOptionPane.showInputDialog("Introduceți treapta maximă:"); if(maxTrepteViteza==null) {return;}

                    String minDiametruGaura = JOptionPane.showInputDialog("Introduceți diametrul minim:"); if(minDiametruGaura==null) {return;}
                    String maxDiametruGaura = JOptionPane.showInputDialog("Introduceți diametrul maxim:"); if(maxDiametruGaura==null) {return;}


                    String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret", "Alimentare", "DiametruGaura",
                            "TrepteViteza", "MaterialBurghiu", "Directia", "LungimeBurghiu"};
                    DefaultTableModel tabelFiltrat = new DefaultTableModel(numeColoana, 0);

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    tabelFiltrat.addRow(numeColoana);

                    for (MasinaGaurit masina : listaMasina) {
                        if (masina.getPret() >= Double.parseDouble(minPret) && masina.getPret() <= Double.parseDouble(maxPret) &&
                                masina.getTrepteViteza()>= Double.parseDouble(minTrepteViteza) && masina.getTrepteViteza() <= Double.parseDouble(maxTrepteViteza) &&
                                masina.getDiametruGaura()>=Double.parseDouble(minDiametruGaura) && masina.getDiametruGaura() <= Double.parseDouble(maxDiametruGaura)) {
                            tabelFiltrat.addRow(new Object[]{
                                    masina.getMarca(),
                                    masina.getTipAlimentare(),
                                    masina.getPutere(),
                                    masina.getGreutate(),
                                    masina.getPret(),
                                    masina.getDiametruGaura(),
                                    masina.getTrepteViteza(),
                                    masina.getMaterialBurghiu(),
                                    masina.getDirectia(),
                                    masina.getLungimeBurghiu()
                            });
                        }
                    }

                    tabelObiecte.setModel(tabelFiltrat);
                    JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                } else if (getNumePagina().equals("PolizorUnghiular")) {

                    String minSupraincalzire = JOptionPane.showInputDialog("Introduceți supraincalzirea minimă:"); if(minSupraincalzire==null) {return;}
                    String maxSupraincalzire = JOptionPane.showInputDialog("Introduceți supraincalzirea maximă:"); if(maxSupraincalzire==null) {return;}

                    String minTuratia = JOptionPane.showInputDialog("Introduceți turatia minim:"); if(minTuratia==null) {return;}
                    String maxTuratia = JOptionPane.showInputDialog("Introduceți turatia maxim:"); if (maxTuratia==null) {return;}


                    String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                            "DiametruDisc", "Supraincalzire", "Tip", "Turatia", "SistemSiguranta"};

                    DefaultTableModel tabelFiltrat = new DefaultTableModel();

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    tabelFiltrat.addRow(numeColoana);

                    for (PolizorUnghiular polizor : listaPolizor) {
                        if (polizor.getPret() >= Double.parseDouble(minPret) && polizor.getPret() <= Double.parseDouble(maxPret) &&
                                polizor.getSupraincalzire()>= Double.parseDouble(minSupraincalzire) && polizor.getSupraincalzire()<= Double.parseDouble(maxSupraincalzire)&&
                                polizor.getTuratia()>=Double.parseDouble(minTuratia) && polizor.getTuratia()<=Double.parseDouble(maxTuratia)) {
                            tabelFiltrat.addRow(new Object[]{
                                    polizor.getMarca(),
                                    polizor.getTipAlimentare(),
                                    polizor.getPutere(),
                                    polizor.getGreutate(),
                                    polizor.getPret(),
                                    polizor.getDiametruDisc(),
                                    polizor.getSistemSiguranta(),
                                    polizor.getTip(),
                                    polizor.getTuratia(),
                                    polizor.getSistemSiguranta()
                            });
                        }
                    }
                    tabelObiecte.setModel(tabelFiltrat);
                    JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                } else {

                    String minGreutate = JOptionPane.showInputDialog("Introduceți greutate minimă:"); if(minGreutate==null){return;}
                    String maxGreutate = JOptionPane.showInputDialog("Introduceți greutate maximă:"); if(maxGreutate==null){return;}

                    String minPutere = JOptionPane.showInputDialog("Introduceți putere minimă:"); if(minPutere==null) {return;}
                    String maxPutere = JOptionPane.showInputDialog("Introduceți putere maximă:"); if(maxPutere==null) {return;}


                    String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret"};

                    DefaultTableModel tabelFiltrat = new DefaultTableModel();
                    tabelFiltrat.addRow(numeColoana);

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    for (SculeElectrice scula : listaScule) {
                        if (scula.getPret() >= Double.parseDouble(minPret) && scula.getPret() <= Double.parseDouble(maxPret) &&
                                scula.getGreutate() >= Double.parseDouble(minGreutate) && scula.getGreutate() <= Double.parseDouble(maxGreutate) &&
                                scula.getPutere() >= Double.parseDouble(minPutere) && scula.getPutere() <= Double.parseDouble(maxPutere)) {
                            tabelFiltrat.addRow(new Object[]{
                                    scula.getMarca(),
                                    scula.getTipAlimentare(),
                                    scula.getPutere(),
                                    scula.getGreutate(),
                                    scula.getPret()
                            });
                        }
                    }
                    tabelObiecte.setModel(tabelFiltrat);
                    JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                }
            }
        });


        activitateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linieSelectata = tabelObiecte.getSelectedRow();

                if (linieSelectata == -1) {
                    JOptionPane.showMessageDialog(null, "Selectați un rând pentru porni obiectul!");
                    return;
                }

                if (linieSelectata == 0) {
                    JOptionPane.showMessageDialog(null, "Nu puteți selecta header-ul!");
                    return;
                }

                SculeElectrice scula = null;
                if (getNumePagina().equals("Masina Gaurit")) {
                    scula = listaMasina.get(linieSelectata - 1);
                } else if (getNumePagina().equals("Polizor Unghiular")) {
                    scula = listaPolizor.get(linieSelectata - 1);
                } else if (getNumePagina().equals("Scule Electrice")) {
                    scula = listaScule.get(linieSelectata - 1);
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

        try {
            FileInputStream fin = new FileInputStream("D:\\cristina\\proiect_poo\\ProiectPOO_SculeElectrice\\Proiect_SculeElectrice\\src\\proiect_SculeElectrice\\fisier.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fin));
            String linie;

            while ((linie = br.readLine()) != null) {
                if (linie.startsWith("Masina Gaurit")) {
                    String[] valori = linie.split(": ")[1].split(", ");
                    listaMasina.add(new MasinaGaurit(
                            Integer.parseInt(valori[0]), Integer.parseInt(valori[1]), valori[2], valori[3], Double.parseDouble(valori[4]), valori[5],
                            valori[6], Double.parseDouble(valori[7]), Double.parseDouble(valori[8]), Double.parseDouble(valori[9])
                    ));
                } else if (linie.startsWith("Scule Electrice")) {
                    String[] valori = linie.split(": ")[1].split(", ");
                    listaScule.add(new SculeElectrice(
                            valori[0], valori[1], Double.parseDouble(valori[2]), Double.parseDouble(valori[3]), Double.parseDouble(valori[4])
                    ));
                } else if (linie.startsWith("Polizor Unghiular")) {
                    String[] valori = linie.split(": ")[1].split(", ");
                    listaPolizor.add(new PolizorUnghiular(
                            Integer.parseInt(valori[0]), Integer.parseInt(valori[1]), valori[2], Double.parseDouble(valori[3]), Double.parseDouble(valori[4]),
                            valori[5], valori[6], Double.parseDouble(valori[7]), Double.parseDouble(valori[8]), Double.parseDouble(valori[9])
                    ));
                }
            }
        } catch (IOException e) {
            System.out.println("[EROARE!] " + e.getMessage());
        }

        JFrame frame = new JFrame();
        frame.setContentPane(new IG_Filoti().meniu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

