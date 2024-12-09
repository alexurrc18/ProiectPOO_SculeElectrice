package proiect_SculeElectrice;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class InterfataGrafica_AlexandruC extends JFrame {
    private JPanel dashboard;
    private JPanel navbar;
    private JPanel content;
    private JButton acasa;
    private JButton surubelnitaElectrica;
    private JButton fierastrauPendular;
    private JLabel numePagina;
    private JTable tabelObiecte;
    private JButton adaugaButton;
    private JButton editezaButton;
    private JButton stergeButton;
    private JButton filtrareButton;
    private JButton sculeElectrice;
    private JButton activitateButton;

    static ArrayList<SculeElectrice> listaScule = new ArrayList<>();
    static ArrayList<SurubelnitaElectrica> listaSurubelnite = new ArrayList<>();
    static ArrayList<FierastrauPendular> listaFierastrau = new ArrayList<>();

    public InterfataGrafica_AlexandruC() {
        surubelnitaElectrica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret", "Mandrina",
                        "Turatie nominala", "Cap. baterie", "Cuplu maxim", "Trepte viteza"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);

                for (SurubelnitaElectrica surubelnita : listaSurubelnite) {
                    tabel.addRow(new Object[]{
                            surubelnita.getMarca(),
                            surubelnita.getTipAlimentare(),
                            surubelnita.getPutere(),
                            surubelnita.getGreutate(),
                            surubelnita.getPret(),
                            surubelnita.getTipMandrina(),
                            surubelnita.getTuratieNominala(),
                            surubelnita.getCapacitateBaterie(),
                            surubelnita.getCupluMaxim(),
                            surubelnita.isTrepteViteza()
                    });
                }


                tabelObiecte.setModel(tabel);
                adaugaButton.setVisible(true);
                editezaButton.setVisible(true);
                stergeButton.setVisible(true);
                filtrareButton.setVisible(true);
                tabelObiecte.setVisible(true);
                activitateButton.setVisible(true);
                numePagina.setText("Surubelnițe electrice");
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
                adaugaButton.setVisible(true);
                editezaButton.setVisible(true);
                stergeButton.setVisible(true);
                filtrareButton.setVisible(true);
                tabelObiecte.setVisible(true);
                activitateButton.setVisible(true);
                numePagina.setText("Scule electrice");
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
                if(numePagina.getText().equals("Surubelnițe electrice")) {
                    String tipMandrina = JOptionPane.showInputDialog("[STRING] Tip Mandrina:"); if(tipMandrina==null) return;
                    String capacitateBaterie = JOptionPane.showInputDialog("[INT] Capacitate baterie:");if(capacitateBaterie==null) return;
                    String turatieNominala = JOptionPane.showInputDialog("[INT] Turatie nominala:"); if(turatieNominala==null) return;
                    String cupluMaxim = JOptionPane.showInputDialog("[INT] Cuplu maxim:"); if(cupluMaxim==null) return;
                    String trepteViteza = JOptionPane.showInputDialog("[BOOLEAN] Trepte viteza:"); if(trepteViteza==null) return;

                    listaSurubelnite.add(new SurubelnitaElectrica(marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                            tipMandrina, Integer.parseInt(capacitateBaterie), Integer.parseInt(turatieNominala), Integer.parseInt(cupluMaxim), Boolean.parseBoolean(trepteViteza)));

                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                            tipMandrina, Integer.parseInt(capacitateBaterie), Integer.parseInt(turatieNominala), Integer.parseInt(cupluMaxim), Boolean.parseBoolean(trepteViteza)
                    });

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");


                } else if (numePagina.getText().equals("Fierăstraie pendulare")) {
                    String lungimeCursa= JOptionPane.showInputDialog("[INT] Lungime cursă"); if(lungimeCursa==null) return;
                    String numarCurseMersGol= JOptionPane.showInputDialog("[INT] Nr. curse mers în gol"); if(numarCurseMersGol==null) return;
                    String tipPrindere = JOptionPane.showInputDialog("[STRING] Tip prindere:"); if(tipPrindere==null) return;
                    String nivelZgomot = JOptionPane.showInputDialog("[INT] Nivel zgomot:"); if(nivelZgomot==null) return;
                    String vitezaReglabila= JOptionPane.showInputDialog("[BOOLEAN] Viteza reglabilpă:"); if(vitezaReglabila==null) return;

                    listaFierastrau.add(new FierastrauPendular(marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                                Integer.parseInt(lungimeCursa), Integer.parseInt(numarCurseMersGol), tipPrindere, Integer.parseInt(nivelZgomot), Boolean.parseBoolean(vitezaReglabila)));

                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                            Integer.parseInt(lungimeCursa), Integer.parseInt(numarCurseMersGol), tipPrindere, Integer.parseInt(nivelZgomot), Boolean.parseBoolean(vitezaReglabila)});

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

                    if (numePagina.getText().equals("Surubelnițe electrice")) {
                        listaSurubelnite.remove(linieSelectata - 1);
                    } else if (numePagina.getText().equals("Fierăstraie pendulare")) {
                        listaFierastrau.remove(linieSelectata - 1);
                    } else if (numePagina.getText().equals("Scule electrice")) {
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
                if (numePagina.getText().equals("Surubelnițe electrice")) {
                    optiuni = new String[]{"Marca", "Tip Alimentare", "Putere", "Greutate", "Preț", "Tip Mandrină",
                            "Turație Nominală", "Capacitate Baterie", "Cuplu Maxim", "Trepte Viteză"};
                } else if (numePagina.getText().equals("Fierăstraie pendulare")) {
                    optiuni = new String[]{"Marca", "Tip Alimentare", "Putere", "Greutate", "Preț", "Lungime Cursă",
                            "Nr. Curse Mers Gol", "Tip Prindere", "Nivel Zgomot", "Viteză Reglabilă"};
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

                if (numePagina.getText().equals("Surubelnițe electrice")) {
                    SurubelnitaElectrica surubelnita = listaSurubelnite.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> surubelnita.setMarca(valoareNoua);
                        case "Tip Alimentare" -> surubelnita.setTipAlimentare(valoareNoua);
                        case "Putere" -> surubelnita.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> surubelnita.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> surubelnita.setPret(Double.parseDouble(valoareNoua));
                        case "Tip Mandrină" -> surubelnita.setTipMandrina(valoareNoua);
                        case "Turație Nominală" -> surubelnita.setTuratieNominala(Integer.parseInt(valoareNoua));
                        case "Capacitate Baterie" -> surubelnita.setCapacitateBaterie(Integer.parseInt(valoareNoua));
                        case "Cuplu Maxim" -> surubelnita.setCupluMaxim(Integer.parseInt(valoareNoua));
                        case "Trepte Viteză" -> surubelnita.setTrepteViteza(Boolean.parseBoolean(valoareNoua));
                    }
                } else if (numePagina.getText().equals("Fierăstraie pendulare")) {
                    FierastrauPendular fierastrau = listaFierastrau.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> fierastrau.setMarca(valoareNoua);
                        case "Tip Alimentare" -> fierastrau.setTipAlimentare(valoareNoua);
                        case "Putere" -> fierastrau.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> fierastrau.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> fierastrau.setPret(Double.parseDouble(valoareNoua));
                        case "Lungime Cursă" -> fierastrau.setLungimeCursa(Integer.parseInt(valoareNoua));
                        case "Nr. Curse Mers Gol" -> fierastrau.setNumarCurseMersGol(Integer.parseInt(valoareNoua));
                        case "Tip Prindere" -> fierastrau.setTipPrindere(valoareNoua);
                        case "Nivel Zgomot" -> fierastrau.setNivelZgomot(Integer.parseInt(valoareNoua));
                        case "Viteză Reglabilă" -> fierastrau.setVitezaReglabila(Boolean.parseBoolean(valoareNoua));
                    }
                }

                tabel.setValueAt(valoareNoua, linieSelectata, java.util.Arrays.asList(optiuni).indexOf(atributSelectat));
                JOptionPane.showMessageDialog(null, "Modificarea a fost realizată cu succes!");
            }
        });


        fierastrauPendular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                        "Lungime cursă", "Curse mers în gol", "Tip prindere", "Niv. zgomot", "Viteza reglabilă"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);

                for (FierastrauPendular fierastrau : listaFierastrau) {
                    tabel.addRow(new Object[]{
                            fierastrau.getMarca(),
                            fierastrau.getTipAlimentare(),
                            fierastrau.getPutere(),
                            fierastrau.getGreutate(),
                            fierastrau.getPret(),
                            fierastrau.getLungimeCursa(),
                            fierastrau.getNumarCurseMersGol(),
                            fierastrau.getTipPrindere(),
                            fierastrau.getNivelZgomot(),
                            fierastrau.getVitezaReglabila()
                    });
                }


                tabelObiecte.setModel(tabel);
                adaugaButton.setVisible(true);
                editezaButton.setVisible(true);
                stergeButton.setVisible(true);
                filtrareButton.setVisible(true);
                tabelObiecte.setVisible(true);
                activitateButton.setVisible(true);
                numePagina.setText("Fierăstraie pendulare");
            }
        });


        acasa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugaButton.setVisible(false);
                editezaButton.setVisible(false);
                stergeButton.setVisible(false);
                filtrareButton.setVisible(false);
                tabelObiecte.setVisible(false);
                activitateButton.setVisible(false);
                numePagina.setText("Acasa");
            }
        });


        filtrareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String minPret = JOptionPane.showInputDialog("Introduceți prețul minim:"); if(minPret==null) {return;}
                String maxPret = JOptionPane.showInputDialog("Introduceți prețul maxim:"); if(maxPret==null) {return;}


                if (numePagina.getText().equals("Surubelnițe electrice")) {
                    String minTuratie = JOptionPane.showInputDialog("Introduceți turație minimă:"); if(minTuratie==null) {return;}
                    String maxTuratie = JOptionPane.showInputDialog("Introduceți turație maximă:"); if(maxTuratie==null) {return;}

                    String minBaterie = JOptionPane.showInputDialog("Introduceți baterie minimă:"); if(minBaterie==null) {return;}
                    String maxBaterie = JOptionPane.showInputDialog("Introduceți baterie maximă:"); if(maxBaterie==null) {return;}


                    String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret", "Mandrina",
                            "Turatie nominala", "Cap. baterie", "Cuplu maxim", "Trepte viteza"};
                    DefaultTableModel tabelFiltrat = new DefaultTableModel(numeColoana, 0);

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    tabelFiltrat.addRow(numeColoana);

                    for (SurubelnitaElectrica surubelnita : listaSurubelnite) {
                        if (surubelnita.getPret() >= Double.parseDouble(minPret) && surubelnita.getPret() <= Double.parseDouble(maxPret) &&
                                surubelnita.getTuratieNominala()>= Double.parseDouble(minTuratie) && surubelnita.getTuratieNominala() <= Double.parseDouble(maxTuratie) &&
                                surubelnita.getCapacitateBaterie()>=Double.parseDouble(minBaterie) && surubelnita.getCapacitateBaterie() <= Double.parseDouble(maxBaterie)) {
                            tabelFiltrat.addRow(new Object[]{
                                    surubelnita.getMarca(),
                                    surubelnita.getTipAlimentare(),
                                    surubelnita.getPutere(),
                                    surubelnita.getGreutate(),
                                    surubelnita.getPret(),
                                    surubelnita.getTipMandrina(),
                                    surubelnita.getTuratieNominala(),
                                    surubelnita.getCapacitateBaterie(),
                                    surubelnita.getCupluMaxim(),
                                    surubelnita.isTrepteViteza()
                            });
                        }
                    }

                    tabelObiecte.setModel(tabelFiltrat);
                    JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                } else if (numePagina.getText().equals("Fierăstraie pendulare")) {

                    String minLung = JOptionPane.showInputDialog("Introduceți lungime minimă:"); if(minLung==null) {return;}
                    String maxLung = JOptionPane.showInputDialog("Introduceți lungime maximă:"); if(maxLung==null) {return;}

                    String minZgomot = JOptionPane.showInputDialog("Introduceți niv. zgomot minim:"); if(minZgomot==null) {return;}
                    String maxZgomot = JOptionPane.showInputDialog("Introduceți niv. zgomot maxim:"); if (maxZgomot==null) {return;}


                    String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                            "Lungime cursă", "Curse mers în gol", "Tip prindere", "Niv. zgomot", "Viteza reglabilă"};

                    DefaultTableModel tabelFiltrat = new DefaultTableModel();

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    tabelFiltrat.addRow(numeColoana);

                    for (FierastrauPendular fierastrau : listaFierastrau) {
                        if (fierastrau.getPret() >= Double.parseDouble(minPret) && fierastrau.getPret() <= Double.parseDouble(maxPret) &&
                        fierastrau.getLungimeCursa()>= Double.parseDouble(minLung) && fierastrau.getLungimeCursa()<= Double.parseDouble(maxLung)&&
                        fierastrau.getNivelZgomot()>=Double.parseDouble(minZgomot) && fierastrau.getNivelZgomot()<=Double.parseDouble(maxZgomot)) {
                            tabelFiltrat.addRow(new Object[]{
                                    fierastrau.getMarca(),
                                    fierastrau.getTipAlimentare(),
                                    fierastrau.getPutere(),
                                    fierastrau.getGreutate(),
                                    fierastrau.getPret(),
                                    fierastrau.getLungimeCursa(),
                                    fierastrau.getNumarCurseMersGol(),
                                    fierastrau.getTipPrindere(),
                                    fierastrau.getNivelZgomot(),
                                    fierastrau.getVitezaReglabila()
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
                if (numePagina.getText().equals("Surubelnițe electrice")) {
                    scula = listaSurubelnite.get(linieSelectata - 1);
                } else if (numePagina.getText().equals("Fierăstraie pendulare")) {
                    scula = listaFierastrau.get(linieSelectata - 1);
                } else if (numePagina.getText().equals("Scule electrice")) {
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
            FileInputStream fin = new FileInputStream("/Users/alexandrucalin/Desktop/Facultate/AN 2/SEM 1/POO/PROIECT/Proiect_SculeElectrice/src/proiect_SculeElectrice/Instantiere_AlexandruC.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fin));
            String linie;

            while ((linie = br.readLine()) != null) {
                if (linie.startsWith("Șurubelniță electrică:")) {
                    String[] valori = linie.split(":")[1].split(", ");
                    listaSurubelnite.add(new SurubelnitaElectrica(
                            valori[0], valori[1], Double.parseDouble(valori[2]), Double.parseDouble(valori[3]), Double.parseDouble(valori[4]), valori[5],
                            Integer.parseInt(valori[6]), Integer.parseInt(valori[7]), Double.parseDouble(valori[8]), Boolean.parseBoolean(valori[9])
                    ));
                } else if (linie.startsWith("Scule electrice:")) {
                    String[] valori = linie.split(":")[1].split(", ");
                    listaScule.add(new SculeElectrice(
                            valori[0], valori[1], Double.parseDouble(valori[2]), Double.parseDouble(valori[3]), Double.parseDouble(valori[4])
                    ));
                } else if (linie.startsWith("Fierăstrău pendular:")) {
                    String[] valori = linie.split(":")[1].split(", ");
                    listaFierastrau.add(new FierastrauPendular(
                            valori[0], valori[1], Double.parseDouble(valori[2]), Double.parseDouble(valori[3]), Double.parseDouble(valori[4]),
                            Integer.parseInt(valori[5]), Integer.parseInt(valori[6]), valori[7], Integer.parseInt(valori[8]), Boolean.parseBoolean(valori[9])
                    ));
                }
            }
        } catch (IOException e) {
            System.out.println("[EROARE!] " + e.getMessage());
        }

        JFrame frame = new InterfataGrafica_AlexandruC();
        frame.setContentPane(new InterfataGrafica_AlexandruC().dashboard);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
