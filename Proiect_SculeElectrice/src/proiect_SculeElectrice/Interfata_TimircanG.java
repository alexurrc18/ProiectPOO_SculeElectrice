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

import static proiect_SculeElectrice.InterfataGrafica_AlexandruC.listaFierastrau;

public class Interfata_TimircanG {
    private JButton rotopercutorButton;
    private JButton compactorButton;
    private JButton sculeElectriceButton;
    private JTable table1;
    private JButton adaugareButton;
    private JButton filtrareButton;
    private JButton stergereButton;
    private JButton editareButton;
    private JButton activitateButton;
    private JPanel Meniu;

    private String numePagina;

    public String getNumePagina() {
        return numePagina;
    }

    public void setNumePagina(String numePagina) {
        this.numePagina = numePagina;
    }


    static ArrayList<Compactor> listaCompactoare = new ArrayList<>();

    static ArrayList<Rotopercutor> listaRotopercutoare = new ArrayList<>();

    static ArrayList<SculeElectrice> listaScule = new ArrayList<>();

    public Interfata_TimircanG() {
        rotopercutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                        "Turatii", "Inaltime", "Percutie", "Impact", "Prindere"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);
                for (Rotopercutor rotopercutor : listaRotopercutoare) {
                    tabel.addRow(new Object[]{
                            rotopercutor.getMarca(),
                            rotopercutor.getTipAlimentare(),
                            rotopercutor.getPutere(),
                            rotopercutor.getGreutate(),
                            rotopercutor.getPret(),
                            rotopercutor.getTuratii(),
                            rotopercutor.getInaltime(),
                            rotopercutor.getPercutie(),
                            rotopercutor.getImpact(),
                            rotopercutor.getPrindere()
                    });
                }

                table1.setModel(tabel);
                adaugareButton.setEnabled(true);
                editareButton.setEnabled(true);
                stergereButton.setEnabled(true);
                filtrareButton.setEnabled(true);
                activitateButton.setEnabled(true);
                setNumePagina("Rotopercutor");
            }
        });
        compactorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                        "combustibil", "Adancime", "Frecventa", "Motorizare", "Siguranta"};
                DefaultTableModel tabel = new DefaultTableModel(numeColoana, 0);

                tabel.setColumnIdentifiers(numeColoana);

                tabel.addRow(numeColoana);
                for (Compactor compactor: listaCompactoare) {
                    tabel.addRow(new Object[]{
                            compactor.getMarca(),
                            compactor.getTipAlimentare(),
                            compactor.getPutere(),
                            compactor.getGreutate(),
                            compactor.getPret(),
                            compactor.getCombustibil(),
                            compactor.getAdancime(),
                            compactor.getFrecventa(),
                            compactor.getMotorizare(),
                            compactor.isSiguranta()
                    });
                }
                table1.setModel(tabel);
                adaugareButton.setEnabled(true);
                editareButton.setEnabled(true);
                stergereButton.setEnabled(true);
                filtrareButton.setEnabled(true);
                activitateButton.setEnabled(true);
                setNumePagina("Compactor");
            }
        });

        sculeElectriceButton.addActionListener(new ActionListener() {
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


                table1.setModel(tabel);
                adaugareButton.setEnabled(true);
                editareButton.setEnabled(true);
                stergereButton.setEnabled(true);
                filtrareButton.setEnabled(true);
                table1.setEnabled(true);
                activitateButton.setEnabled(true);
                setNumePagina("Scule electrice");
            }
        });


        adaugareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tabel = (DefaultTableModel) table1.getModel();

                String marca = JOptionPane.showInputDialog("[STRING] Nume marca:"); if(marca==null) return;
                String tipAlimentare=JOptionPane.showInputDialog("[STRING] Tip Alimentare:"); if(tipAlimentare==null) return;
                String putere = JOptionPane.showInputDialog("[DOUBLE] Putere:"); if(putere==null) return;
                String greutate = JOptionPane.showInputDialog("[DOUBLE] Greutate:"); if(greutate==null) return;
                String pret = JOptionPane.showInputDialog("[DOUBLE] Pret:"); if(pret==null) return;

                if (getNumePagina().equals("Compactor")) {
                    String combustibil = JOptionPane.showInputDialog("[STRING] Combustibil:");
                    if (combustibil== null) return;
                    String adancime = JOptionPane.showInputDialog("[INT] Adancime:");
                    if (adancime == null) return;
                    String frecventa= JOptionPane.showInputDialog("[INT] Frecventa:");
                    if (frecventa == null) return;
                    String motorizare = JOptionPane.showInputDialog("[INT] Motorizare:");
                    if (motorizare == null) return;
                    String siguranta = JOptionPane.showInputDialog("[Boolean] Siguranta:");
                    if (siguranta == null) return;

                    listaCompactoare.add(new Compactor(combustibil, Integer.parseInt(adancime), Integer.parseInt(frecventa),
                            Integer.parseInt(motorizare), Boolean.parseBoolean(siguranta),

                            marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));

                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                            combustibil, Integer.parseInt(adancime), Integer.parseInt(frecventa), Integer.parseInt(motorizare), Boolean.parseBoolean(siguranta)
                    });

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");


                } else if (getNumePagina().equals("Rotopercutor")) {
                    String turatie = JOptionPane.showInputDialog("[INT] Turatie:");
                    if (turatie== null) return;
                    String inaltime = JOptionPane.showInputDialog("[INT] Inaltime:");
                    if (inaltime == null) return;
                    String percutie = JOptionPane.showInputDialog("[INT] Precutie:");
                    if (percutie== null) return;
                    String impact = JOptionPane.showInputDialog("[INT] Impact:");
                    if (impact == null) return;
                    String prindere = JOptionPane.showInputDialog("[STRING] Prindere:");
                    if (prindere == null) return;

                    listaRotopercutoare.add(new Rotopercutor(
                            Integer.parseInt(turatie), Integer.parseInt(inaltime), Integer.parseInt(percutie), Integer.parseInt(impact), prindere,

                            marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));

                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret),
                            Integer.parseInt(turatie), Integer.parseInt(inaltime), Integer.parseInt(percutie), Integer.parseInt(impact), prindere

                    });

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");

                } else {
                    listaScule.add(new SculeElectrice(marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)));
                    tabel.addRow(new Object[]{marca, tipAlimentare, Double.parseDouble(putere), Double.parseDouble(greutate), Double.parseDouble(pret)});

                    JOptionPane.showMessageDialog(null, "Elementul a fost adaugat cu succes!");}



                table1.repaint();
                table1.revalidate();

            }
        });
        filtrareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String minPret = JOptionPane.showInputDialog("Introduceți prețul minim:"); if(minPret==null) {return;}
                String maxPret = JOptionPane.showInputDialog("Introduceți prețul maxim:"); if(maxPret==null) {return;}


                if (getNumePagina().equals("Rotopercutor")) {
                    String minInaltime = JOptionPane.showInputDialog("Introduceți inaltimea minima:"); if(minInaltime==null) {return;}
                    String maxInalitime = JOptionPane.showInputDialog("Introduceți inaltimea maxima:"); if(maxInalitime==null) {return;}


                    String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                            "Turatii", "Inaltime", "Percutie", "Impact", "Prindere"};
                    DefaultTableModel tabelFiltrat = new DefaultTableModel(numeColoana, 0);

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    tabelFiltrat.addRow(numeColoana);

                    for (Rotopercutor rotopercutor : listaRotopercutoare) {
                        if ((rotopercutor.getPret() >= Double.parseDouble(minPret) && rotopercutor.getPret() <= Double.parseDouble(maxPret)) &&
                                (rotopercutor.getInaltime()>= Integer.parseInt(minInaltime) && rotopercutor.getInaltime() <= Integer.parseInt(maxInalitime))){
                            tabelFiltrat.addRow(new Object[]{
                                    rotopercutor.getMarca(),
                                    rotopercutor.getTipAlimentare(),
                                    rotopercutor.getPutere(),
                                    rotopercutor.getGreutate(),
                                    rotopercutor.getPret(),
                                    rotopercutor.getTuratii(),
                                    rotopercutor.getInaltime(),
                                    rotopercutor.getPercutie(),
                                    rotopercutor.getImpact(),
                                    rotopercutor.getPrindere()
                            });
                        }
                    }

                    table1.setModel(tabelFiltrat);
                    JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                } else if (getNumePagina().equals("Compactor")) {

                    String minAdancime = JOptionPane.showInputDialog("Introduceți adancimea minima:"); if(minAdancime==null) {return;}
                    String maxAdancime = JOptionPane.showInputDialog("Introduceți adancimea maxima:"); if(maxAdancime==null) {return;}


                    String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret",
                            "combustibil", "Adancime", "Frecventa", "Motorizare", "Siguranta"};

                    DefaultTableModel tabelFiltrat = new DefaultTableModel();

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    tabelFiltrat.addRow(numeColoana);

                    for (Compactor compactor : listaCompactoare) {
                        if ((compactor.getPret() >= Double.parseDouble(minPret) && compactor.getPret() <= Integer.parseInt(maxPret)) &&
                                (compactor.getAdancime()>= Integer.parseInt(minAdancime) && compactor.getAdancime()<= Integer.parseInt(maxAdancime))){
                            tabelFiltrat.addRow(new Object[]{
                                    compactor.getMarca(),
                                    compactor.getTipAlimentare(),
                                    compactor.getPutere(),
                                    compactor.getGreutate(),
                                    compactor.getPret(),
                                    compactor.getCombustibil(),
                                    compactor.getAdancime(),
                                    compactor.getFrecventa(),
                                    compactor.getMotorizare(),
                                    compactor.isSiguranta()
                            });
                        }
                    }
                    table1.setModel(tabelFiltrat);
                    JOptionPane.showMessageDialog(null, "Filtrarea a fost aplicată!");
                } else {

                    String minGreutate = JOptionPane.showInputDialog("Introduceți greutate minimă:"); if(minGreutate==null){return;}
                    String maxGreutate = JOptionPane.showInputDialog("Introduceți greutate maximă:"); if(maxGreutate==null){return;}


                    String[] numeColoana = {"Marca", "Alimentare", "Putere", "Greutate", "Pret"};

                    DefaultTableModel tabelFiltrat = new DefaultTableModel();
                    tabelFiltrat.addRow(numeColoana);

                    tabelFiltrat.setColumnIdentifiers(numeColoana);
                    for (SculeElectrice scula : listaScule) {
                        if ((scula.getPret() >= Double.parseDouble(minPret) && scula.getPret() <= Double.parseDouble(maxPret)) &&
                                (scula.getGreutate() >= Double.parseDouble(minGreutate) && scula.getGreutate() <= Double.parseDouble(maxGreutate))) {
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

                    if (getNumePagina().equals("Compactor")) {
                        listaCompactoare.remove(linieSelectata - 1);
                    } else if (getNumePagina().equals("Rotopercutor")) {
                        listaRotopercutoare.remove(linieSelectata - 1);
                    } else if (getNumePagina().equals("Scule electrice")) {
                        listaScule.remove(linieSelectata-1);
                    }

                    tabel.removeRow(linieSelectata);

                    JOptionPane.showMessageDialog(null, "Elementul a fost șters cu succes!");
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
                if (getNumePagina().equals("Rotopercutor")) {
                    optiuni = new String[]{"Marca", "TipAlimentare", "Putere", "Greutate", "Pret", "Turatii",
                            "Inaltime", "Percutie", "Impact", "Prindere"};

                } else if (getNumePagina().equals("Compactor")) {
                    optiuni = new String[]{"Marca", "Tip Alimentare", "Putere", "Greutate", "Preț", "Combustibil", "Adancime",
                            "Frecventa", "Motorizare", "Siguranta"};

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

                if (getNumePagina().equals("Rotopercutor")) {
                    Rotopercutor rotopercutor = listaRotopercutoare.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> rotopercutor.setMarca(valoareNoua);
                        case "TipAlimentare" -> rotopercutor.setTipAlimentare(valoareNoua);
                        case "Putere" -> rotopercutor.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> rotopercutor.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> rotopercutor.setPret(Double.parseDouble(valoareNoua));
                        case "Turatii" -> rotopercutor.setTuratii(Integer.parseInt(valoareNoua));
                        case "Inaltime" -> rotopercutor.setInaltime(Integer.parseInt(valoareNoua));
                        case "Percutie" -> rotopercutor.setPercutie(Integer.parseInt(valoareNoua));
                        case "Impact" -> rotopercutor.setImpact(Integer.parseInt(valoareNoua));
                        case "Prindere" -> rotopercutor.setPrindere(valoareNoua);
                    }
                } else if (getNumePagina().equals("Compactor")) {
                    Compactor compactor = listaCompactoare.get(linieSelectata - 1);
                    switch (atributSelectat) {
                        case "Marca" -> compactor.setMarca(valoareNoua);
                        case "TipAlimentare" -> compactor.setTipAlimentare(valoareNoua);
                        case "Putere" -> compactor.setPutere(Double.parseDouble(valoareNoua));
                        case "Greutate" -> compactor.setGreutate(Double.parseDouble(valoareNoua));
                        case "Preț" -> compactor.setPret(Double.parseDouble(valoareNoua));
                        case "Combustibil" -> compactor.setCombustibil(valoareNoua);
                        case "Adancime" -> compactor.setAdancime(Integer.parseInt(valoareNoua));
                        case "Frecventa" -> compactor.setFrecventa(Integer.parseInt(valoareNoua));
                        case "Motorizare" -> compactor.setMotorizare(Integer.parseInt(valoareNoua));
                        case "Siguranta" -> compactor.setSiguranta(Boolean.parseBoolean(valoareNoua));
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
                if (getNumePagina().equals("Compactor")) {
                    scula = listaCompactoare.get(linieSelectata - 1);
                } else if (getNumePagina().equals("Rotopercutor")) {
                    scula = listaRotopercutoare.get(linieSelectata - 1);
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
            FileInputStream fin = new FileInputStream("/Users/alexandrucalin/Desktop/Facultate/AN 2/SEM 1/POO/PROIECT/Proiect_SculeElectrice/src/proiect_SculeElectrice/fisier_Timircan.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fin));
            String linie;

            while ((linie = br.readLine()) != null) {
                if (linie.startsWith("Rotopercutor:")) {
                    String[] valori = linie.split(": ")[1].split(", ");
                    listaRotopercutoare.add(new Rotopercutor(
                            Integer.parseInt(valori[0]), Integer.parseInt(valori[1]), Integer.parseInt(valori[2]), Integer.parseInt(valori[3]),
                            valori[4], valori[5], valori[6], Double.parseDouble(valori[7]), Double.parseDouble(valori[8]), Double.parseDouble(valori[9])
                    ));
                } else if (linie.startsWith("Scule electrice:")) {
                    String[] valori = linie.split(": ")[1].split(", ");
                    listaScule.add(new SculeElectrice(
                            valori[0], valori[1], Double.parseDouble(valori[2]), Double.parseDouble(valori[3]), Double.parseDouble(valori[4])
                    ));
                } else if (linie.startsWith("Compactor:")) {
                    String[] valori = linie.split(": ")[1].split(", ");
                    listaCompactoare.add(new Compactor(
                            valori[0], Integer.parseInt(valori[1]), Integer.parseInt(valori[2]), Integer.parseInt(valori[3]), Boolean.parseBoolean(valori[4]),
                            valori[5], valori[6], Double.parseDouble(valori[7]), Double.parseDouble(valori[8]), Double.parseDouble(valori[9])
                    ));
                }
            }
        } catch (IOException e) {
            System.out.println("[EROARE!] " + e.getMessage());
        }


        JFrame frame = new JFrame();
        frame.setContentPane(new Interfata_TimircanG().Meniu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

