/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appaeroclub;

import appaeroclub.metier.membres;
import cell.TableActionCellEditor;
import cell.TableActionCellRender;
import cell.TableActionEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logique.logiqueMembres;

public class AppAero extends javax.swing.JFrame {

    /**
     * Creates new form AppAero
     */
    logiqueMembres gestionMembre = new logiqueMembres();

    public AppAero() {
        initComponents();
        
                TableActionEvent event = new TableActionEvent() {
            @Override
            public void onView(int row) {
                jTabbedPane1.setSelectedIndex(1);
            }

            @Override
            public void onEdit(int row) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void onDelete(int row) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxMembre1 = new javax.swing.JComboBox<>();
        jTextFieldMembre1 = new javax.swing.JTextField();
        jTextFieldMembre2 = new javax.swing.JTextField();
        jTextFieldMembre3 = new javax.swing.JTextField();
        jTextFieldMembre4 = new javax.swing.JTextField();
        jTextFieldMembre5 = new javax.swing.JTextField();
        jTextFieldMembre6 = new javax.swing.JTextField();
        jTextFieldMembre7 = new javax.swing.JTextField();
        jTextFieldMembre8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextFieldMembre10 = new javax.swing.JTextField();
        jTextFieldMembre11 = new javax.swing.JTextField();
        jTextFieldMembre12 = new javax.swing.JTextField();
        jTextFieldMembre13 = new javax.swing.JTextField();
        jTextFieldMembre14 = new javax.swing.JTextField();
        jTextFieldMembre15 = new javax.swing.JTextField();
        jTextFieldMembre16 = new javax.swing.JTextField();
        jTextFieldMembre17 = new javax.swing.JTextField();
        jTextFieldMembre18 = new javax.swing.JTextField();
        jTextFieldMembre19 = new javax.swing.JTextField();
        jTextFieldMembre20 = new javax.swing.JTextField();
        jTextFieldMembre21 = new javax.swing.JTextField();
        jTextFieldMembre22 = new javax.swing.JTextField();
        jTextFieldMembre23 = new javax.swing.JTextField();
        jTextFieldMembre24 = new javax.swing.JTextField();
        jTextFieldMembre25 = new javax.swing.JTextField();
        jTextFieldMembre26 = new javax.swing.JTextField();
        jTextFieldMembre27 = new javax.swing.JTextField();
        jTextFieldMembre28 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(300, 600));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabel1.setText("Bienvenue sur l'application Aeroclub");

        jLabel2.setText("Cette application permet de modifier");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", null, jPanel3, "");
        jPanel3.getAccessibleContext().setAccessibleName("");

        jLabel3.setText("Civilité :");

        jLabel4.setText("Nom :");

        jLabel5.setText("Prénom :");

        jLabel6.setText("Adresse :");

        jLabel7.setText("Code Postal :");

        jLabel8.setText("Ville :");

        jLabel9.setText("Téléphone fix :");

        jLabel10.setText("Téléphone portable :");

        jLabel11.setText("Email :");

        jComboBoxMembre1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M.", "Mme.", "Mlle." }));
        jComboBoxMembre1.setToolTipText("");
        jComboBoxMembre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMembre1ActionPerformed(evt);
            }
        });

        jButton1.setText("Modifier");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("rechercher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextFieldMembre12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre12ActionPerformed(evt);
            }
        });

        jTextFieldMembre13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre13ActionPerformed(evt);
            }
        });

        jTextFieldMembre14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre14ActionPerformed(evt);
            }
        });

        jTextFieldMembre15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre15ActionPerformed(evt);
            }
        });

        jTextFieldMembre16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre16ActionPerformed(evt);
            }
        });

        jTextFieldMembre17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre17ActionPerformed(evt);
            }
        });

        jTextFieldMembre18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre18ActionPerformed(evt);
            }
        });

        jTextFieldMembre19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre19ActionPerformed(evt);
            }
        });

        jTextFieldMembre20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre20ActionPerformed(evt);
            }
        });

        jTextFieldMembre21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre21ActionPerformed(evt);
            }
        });

        jTextFieldMembre22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre22ActionPerformed(evt);
            }
        });

        jTextFieldMembre23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre23ActionPerformed(evt);
            }
        });

        jTextFieldMembre24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre24ActionPerformed(evt);
            }
        });

        jTextFieldMembre25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre25ActionPerformed(evt);
            }
        });

        jTextFieldMembre26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre26ActionPerformed(evt);
            }
        });

        jTextFieldMembre27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre27ActionPerformed(evt);
            }
        });

        jTextFieldMembre28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMembre28ActionPerformed(evt);
            }
        });

        jLabel13.setText("Date VM :");

        jLabel14.setText("Validité VM :");

        jLabel15.setText("Date SEP :");

        jLabel16.setText("Validité SEP :");

        jLabel17.setText("Numéro de Badge :");

        jLabel18.setText("Profession :");

        jLabel19.setText("Date de Naissance :");

        jLabel20.setText("Lieu de Naissance :");

        jLabel21.setText("Carte Fédérale :");

        jLabel22.setText("Date Attestation :");

        jLabel23.setText("Date théorique BB :");

        jLabel24.setText("Date théorique PPLa :");

        jLabel25.setText("Date BB :");

        jLabel26.setText("Date PPLA :");

        jLabel27.setText("Date Entree :");

        jLabel28.setText("Membre Actif :");

        jLabel29.setText("Membre Inscrit :");

        jLabel30.setText("Niveau de sécurité :");

        jLabel31.setText("Numéro de qualification :");

        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMembre14)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(26, 26, 26))
                            .addComponent(jComboBoxMembre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMembre1)
                            .addComponent(jTextFieldMembre2)
                            .addComponent(jTextFieldMembre3)
                            .addComponent(jTextFieldMembre4)
                            .addComponent(jTextFieldMembre5)
                            .addComponent(jTextFieldMembre6)
                            .addComponent(jTextFieldMembre7)
                            .addComponent(jTextFieldMembre8)
                            .addComponent(jTextFieldMembre10, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextFieldMembre11, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextFieldMembre12, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextFieldMembre13, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addGap(129, 129, 129)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMembre17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldMembre16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldMembre15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldMembre18)
                            .addComponent(jTextFieldMembre19)
                            .addComponent(jTextFieldMembre20)
                            .addComponent(jTextFieldMembre21)
                            .addComponent(jTextFieldMembre22)
                            .addComponent(jTextFieldMembre23)
                            .addComponent(jTextFieldMembre24)
                            .addComponent(jTextFieldMembre25)
                            .addComponent(jTextFieldMembre26)
                            .addComponent(jTextFieldMembre27)
                            .addComponent(jTextFieldMembre28))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton3)
                        .addGap(127, 127, 127))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxMembre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMembre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldMembre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldMembre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldMembre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldMembre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldMembre6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldMembre7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldMembre8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMembre23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMembre10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMembre11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMembre12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMembre13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMembre14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMembre28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel31))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "prenom", "nom", "email", "Admin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel5);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1000, 650));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Accueil");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Membres");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        try {
            jTabbedPane1.setSelectedIndex(4);
            DefaultTableModel model = gestionMembre.getAllMembres();
            jTable1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AppAero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        logiqueMembres membre = new logiqueMembres();
        Object num_civilite = jComboBoxMembre1.getSelectedItem();
        int num_qualif = Integer.parseInt(jTextFieldMembre28.getText());
        String nom = jTextFieldMembre1.getText();
        String prenom = jTextFieldMembre2.getText();
        String adresse = jTextFieldMembre3.getText();
        String codePostal = jTextFieldMembre4.getText();
        String ville = jTextFieldMembre5.getText();
        String tel = jTextFieldMembre6.getText();
        String portable = jTextFieldMembre7.getText();
        String email = jTextFieldMembre8.getText();
        int numSecu = Integer.parseInt(jTextFieldMembre27.getText());
        SimpleDateFormat dateVM = new SimpleDateFormat(jTextFieldMembre10.getText());
        String validiteVM = jTextFieldMembre11.getText();
        SimpleDateFormat dateSEP = new SimpleDateFormat(jTextFieldMembre12.getText());
        String validiteSEP = jTextFieldMembre13.getText();
        String numBadge = jTextFieldMembre14.getText();
        String profession = jTextFieldMembre15.getText();
        SimpleDateFormat dateNaissance = new SimpleDateFormat(jTextFieldMembre16.getText());
        String lieuNaissance = jTextFieldMembre17.getText();
        String carteFederale = jTextFieldMembre18.getText();
        SimpleDateFormat dateAttestation = new SimpleDateFormat(jTextFieldMembre19.getText());
        SimpleDateFormat dateTheoriqueBB = new SimpleDateFormat(jTextFieldMembre20.getText());
        SimpleDateFormat dateTheoriquePPLA = new SimpleDateFormat(jTextFieldMembre21.getText());
        SimpleDateFormat dateBB = new SimpleDateFormat(jTextFieldMembre22.getText());
        SimpleDateFormat datePPLA = new SimpleDateFormat(jTextFieldMembre23.getText());
        SimpleDateFormat dateEntree = new SimpleDateFormat(jTextFieldMembre24.getText());
        String membreActif = jTextFieldMembre25.getText();
        String membreInscrit = jTextFieldMembre26.getText();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id = jTextField10.getText();
        int idMembre = Integer.parseInt(id);
        logiqueMembres afficherDataMembre = new logiqueMembres();
        String[] dataMembre = afficherDataMembre.afficherMembre(idMembre);
        if (dataMembre == null) {
            JOptionPane.showMessageDialog(null, "Aucun membre !");
        } else {
            switch (dataMembre[1]) {
                case "M." ->
                    jComboBoxMembre1.setSelectedItem("M.");
                case "Mme." ->
                    jComboBoxMembre1.setSelectedItem("Mme.");
                case "'Mlle.'" ->
                    jComboBoxMembre1.setSelectedItem("Mlle.");
            }

            jTextFieldMembre1.setText(dataMembre[3]);
            jTextFieldMembre2.setText(dataMembre[4]);
            jTextFieldMembre3.setText(dataMembre[5]);
            jTextFieldMembre4.setText(dataMembre[6]);
            jTextFieldMembre5.setText(dataMembre[7]);
            jTextFieldMembre6.setText(dataMembre[8]);
            jTextFieldMembre7.setText(dataMembre[9]);
            jTextFieldMembre8.setText(dataMembre[10]);
            jTextFieldMembre10.setText(dataMembre[13]);
            jTextFieldMembre11.setText(dataMembre[14]);
            jTextFieldMembre12.setText(dataMembre[15]);
            jTextFieldMembre13.setText(dataMembre[16]);
            jTextFieldMembre14.setText(dataMembre[17]);
            jTextFieldMembre15.setText(dataMembre[18]);
            jTextFieldMembre16.setText(dataMembre[19]);
            jTextFieldMembre17.setText(dataMembre[20]);
            jTextFieldMembre18.setText(dataMembre[21]);
            jTextFieldMembre19.setText(dataMembre[22]);
            jTextFieldMembre20.setText(dataMembre[23]);
            jTextFieldMembre21.setText(dataMembre[24]);
            jTextFieldMembre22.setText(dataMembre[25]);
            jTextFieldMembre23.setText(dataMembre[26]);
            jTextFieldMembre24.setText(dataMembre[27]);
            jTextFieldMembre25.setText(dataMembre[28]);
            jTextFieldMembre26.setText(dataMembre[29]);
            jTextFieldMembre27.setText(dataMembre[12]);
            jTextFieldMembre28.setText(dataMembre[2]);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldMembre12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre12ActionPerformed

    private void jTextFieldMembre13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre13ActionPerformed

    private void jTextFieldMembre15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre15ActionPerformed

    private void jTextFieldMembre16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre16ActionPerformed

    private void jTextFieldMembre17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre17ActionPerformed

    private void jTextFieldMembre18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre18ActionPerformed

    private void jTextFieldMembre19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre19ActionPerformed

    private void jTextFieldMembre20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre20ActionPerformed

    private void jTextFieldMembre21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre21ActionPerformed

    private void jTextFieldMembre22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre22ActionPerformed

    private void jTextFieldMembre23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre23ActionPerformed

    private void jTextFieldMembre24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre24ActionPerformed

    private void jTextFieldMembre25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre25ActionPerformed

    private void jTextFieldMembre26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre26ActionPerformed

    private void jTextFieldMembre27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre27ActionPerformed

    private void jTextFieldMembre28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMembre28ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validateFields()) {
            int idMembre = Integer.parseInt(jTextField10.getText());
            logiqueMembres afficherDataMembre = new logiqueMembres();
            String[] dataMembre = afficherDataMembre.afficherMembre(idMembre);
            if (dataMembre == null) {
                JOptionPane.showMessageDialog(null, "Aucun membre !");
            } else {
                membres membre = new membres();

                membre.setNumMembre(idMembre);

                String civilite = (String) jComboBoxMembre1.getSelectedItem();
                membre.setNumCivilite(civilite);
                membre.setNom(jTextFieldMembre1.getText());
                membre.setPrenom(jTextFieldMembre2.getText());
                membre.setAdresse(jTextFieldMembre3.getText());
                membre.setCodePostal(jTextFieldMembre4.getText());
                membre.setVille(jTextFieldMembre5.getText());
                membre.setTel(jTextFieldMembre6.getText());
                membre.setPortable(jTextFieldMembre7.getText());
                membre.setEmail(jTextFieldMembre8.getText());

                membre.setNumSecu(Integer.parseInt(jTextFieldMembre27.getText()));

                String DateVM = jTextFieldMembre10.getText();
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    if (!DateVM.isEmpty()) {
                        Date parsedDateVM = dateFormat.parse(jTextFieldMembre10.getText());
                        membre.setDateVM(new java.sql.Date(parsedDateVM.getTime()));
                    }

                    Date parsedDateSEP = dateFormat.parse(jTextFieldMembre13.getText());
                    membre.setDateSEP(new java.sql.Date(parsedDateSEP.getTime()));

                    Date parsedDateNaissance = dateFormat.parse(jTextFieldMembre16.getText());
                    membre.setDateNaissance(new java.sql.Date(parsedDateNaissance.getTime()));

                    Date parsedDateAttestation = dateFormat.parse(jTextFieldMembre19.getText());
                    membre.setDateAttestation(new java.sql.Date(parsedDateAttestation.getTime()));

                    Date parsedDateTheoriqueBB = dateFormat.parse(jTextFieldMembre20.getText());
                    membre.setDateTheoriqueBB(new java.sql.Date(parsedDateTheoriqueBB.getTime()));

                    Date parsedDateTheoriquePPLA = dateFormat.parse(jTextFieldMembre21.getText());
                    membre.setDateTheoriquePPLA(new java.sql.Date(parsedDateTheoriquePPLA.getTime()));

                    Date parsedDateBB = dateFormat.parse(jTextFieldMembre22.getText());
                    membre.setDateBB(new java.sql.Date(parsedDateBB.getTime()));

                    Date parsedDatePPLA = dateFormat.parse(jTextFieldMembre23.getText());
                    membre.setDatePPLA(new java.sql.Date(parsedDatePPLA.getTime()));

                    Date parsedDateEntree = dateFormat.parse(jTextFieldMembre24.getText());
                    membre.setDateEntree(new java.sql.Date(parsedDateEntree.getTime()));

                } catch (ParseException e) {
                    // Gérer l'erreur de parsing de la date
                    e.printStackTrace();
                }

                membre.setValiditeVM(jTextFieldMembre11.getText());
                membre.setValiditeSEP(jTextFieldMembre13.getText());
                membre.setNumBadge(jTextFieldMembre14.getText());
                membre.setProfession(jTextFieldMembre15.getText());
                membre.setLieuNaissance(jTextFieldMembre17.getText());
                membre.setCarteFederale(jTextFieldMembre18.getText());
                membre.setMembreActif(jTextFieldMembre25.getText());
                membre.setMembreInscrit(jTextFieldMembre26.getText());
                this.gestionMembre.mettreAJourMembre(membre);
                JOptionPane.showMessageDialog(null, "Membre mis à jour avec succès !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez remplir correctement tous les champs !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldMembre14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMembre14ActionPerformed

    }//GEN-LAST:event_jTextFieldMembre14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int idMembre = Integer.parseInt(jTextField10.getText());

        // Affichage d'une boîte de dialogue de confirmation
        int confirmation = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir supprimer ce membre ?", "Confirmation de suppression", JOptionPane.YES_NO_OPTION);

        // Vérification de la réponse de l'utilisateur
        if (confirmation == JOptionPane.YES_OPTION) {
            // Si l'utilisateur a confirmé, supprimez le membre
            this.gestionMembre.deleteMembre(idMembre);
            JOptionPane.showMessageDialog(null, "Membre supprimé avec succès !");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBoxMembre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMembre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMembre1ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppAero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppAero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppAero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppAero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppAero().setVisible(true);
            }
        });
    }

    private boolean validateFields() {
        if (jTextFieldMembre1.getText().isEmpty() || jTextFieldMembre2.getText().isEmpty()
                || jTextFieldMembre3.getText().isEmpty() || jTextFieldMembre4.getText().isEmpty()
                || jTextFieldMembre5.getText().isEmpty() || jTextFieldMembre6.getText().isEmpty()
                || jTextFieldMembre7.getText().isEmpty() || jTextFieldMembre8.getText().isEmpty()
                || jTextFieldMembre27.getText().isEmpty() || jTextFieldMembre10.getText().isEmpty()
                || jTextFieldMembre13.getText().isEmpty() || jTextFieldMembre16.getText().isEmpty()
                || jTextFieldMembre19.getText().isEmpty() || jTextFieldMembre20.getText().isEmpty()
                || jTextFieldMembre21.getText().isEmpty() || jTextFieldMembre22.getText().isEmpty()
                || jTextFieldMembre23.getText().isEmpty() || jTextFieldMembre24.getText().isEmpty()
                || jTextFieldMembre11.getText().isEmpty() || jTextFieldMembre13.getText().isEmpty()
                || jTextFieldMembre14.getText().isEmpty() || jTextFieldMembre15.getText().isEmpty()
                || jTextFieldMembre17.getText().isEmpty() || jTextFieldMembre18.getText().isEmpty()
                || jTextFieldMembre25.getText().isEmpty() || jTextFieldMembre26.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBoxMembre1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextFieldMembre1;
    private javax.swing.JTextField jTextFieldMembre10;
    private javax.swing.JTextField jTextFieldMembre11;
    private javax.swing.JTextField jTextFieldMembre12;
    private javax.swing.JTextField jTextFieldMembre13;
    private javax.swing.JTextField jTextFieldMembre14;
    private javax.swing.JTextField jTextFieldMembre15;
    private javax.swing.JTextField jTextFieldMembre16;
    private javax.swing.JTextField jTextFieldMembre17;
    private javax.swing.JTextField jTextFieldMembre18;
    private javax.swing.JTextField jTextFieldMembre19;
    private javax.swing.JTextField jTextFieldMembre2;
    private javax.swing.JTextField jTextFieldMembre20;
    private javax.swing.JTextField jTextFieldMembre21;
    private javax.swing.JTextField jTextFieldMembre22;
    private javax.swing.JTextField jTextFieldMembre23;
    private javax.swing.JTextField jTextFieldMembre24;
    private javax.swing.JTextField jTextFieldMembre25;
    private javax.swing.JTextField jTextFieldMembre26;
    private javax.swing.JTextField jTextFieldMembre27;
    private javax.swing.JTextField jTextFieldMembre28;
    private javax.swing.JTextField jTextFieldMembre3;
    private javax.swing.JTextField jTextFieldMembre4;
    private javax.swing.JTextField jTextFieldMembre5;
    private javax.swing.JTextField jTextFieldMembre6;
    private javax.swing.JTextField jTextFieldMembre7;
    private javax.swing.JTextField jTextFieldMembre8;
    // End of variables declaration//GEN-END:variables

}
