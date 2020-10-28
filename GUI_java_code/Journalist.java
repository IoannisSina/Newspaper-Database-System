

import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Journalist extends javax.swing.JFrame {

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private String email;
    private String comp;
    private String path="";
    private String eikona="";
    public Journalist() {
        setResizable(false);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        list2 = new java.awt.List();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panel1 = new java.awt.Panel();
        list1 = new java.awt.List();
        textArea1 = new java.awt.TextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJournalist = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnImage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox<>();
        txtReview = new javax.swing.JTextField();
        spinLength = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPath = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtKeyWords = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboCoop = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboArticle = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnCoop = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        comboUpdatePath = new javax.swing.JComboBox<>();
        btnDisplayOld = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tlbCoop = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbHello = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        panel1.setBackground(new java.awt.Color(0, 255, 255));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Journalist");
        setMinimumSize(new java.awt.Dimension(657, 496));

        tblJournalist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Path", "Review", "Images", "State", "Length", "Category", "PaperNO", "Start Page"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJournalist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJournalistMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblJournalist);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Images:");

        btnInsert.setBackground(new java.awt.Color(51, 153, 255));
        btnInsert.setText("INSERT ARTICLE");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnImage.setBackground(new java.awt.Color(51, 153, 255));
        btnImage.setText("IMAGE");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Title:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category:");

        comboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoryActionPerformed(evt);
            }
        });

        spinLength.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Length:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Review:");

        btnPath.setBackground(new java.awt.Color(51, 153, 255));
        btnPath.setText("PATH");
        btnPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Path:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Key Words:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtKeyWords, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(txtReview, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinLength, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnPath))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImage)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtKeyWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Journalist:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("With");

        comboCoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCoopActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD COOPARATORS");

        comboArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboArticleActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Article:");

        btnCoop.setBackground(new java.awt.Color(51, 153, 255));
        btnCoop.setText("COOPARATE");
        btnCoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCoop, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCoop, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnCoop)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnUpdate.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdate.setText("UPDATE ARTICLE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Path:");

        btnDisplayOld.setBackground(new java.awt.Color(51, 153, 255));
        btnDisplayOld.setText("DISPLAY OLD");
        btnDisplayOld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayOldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("REFRESH ALL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDisplayOld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboUpdatePath, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDisplayOld))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUpdatePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        tlbCoop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Path", "Email coop"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tlbCoop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlbCoopMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tlbCoop);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("COOPARATORS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        lbHello.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbHello.setForeground(new java.awt.Color(255, 0, 51));
        lbHello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHello.setText("WELCOME");

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("SIGN OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnSettings.setBackground(new java.awt.Color(51, 153, 255));
        btnSettings.setText("SETTINGS");
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 0, 0));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(btnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHello, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHello, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSettings)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoryActionPerformed

    }//GEN-LAST:event_comboCategoryActionPerformed
    //PATH OF ARTICLE
    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setVisible(true);
        fc.setCurrentDirectory(new java.io.File("C:/"));
        fc.setDialogTitle("Choose Path");
        if(fc.showOpenDialog(btnPath) == JFileChooser.APPROVE_OPTION){
            //
        }
        eikona = fc.getSelectedFile().getAbsolutePath();
    }//GEN-LAST:event_btnImageActionPerformed
    //PATH OF IMAGES
    private void btnPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setVisible(true);
        fc.setCurrentDirectory(new java.io.File("C:/"));
        fc.setDialogTitle("Choose Path");
        //c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(fc.showOpenDialog(btnPath) == JFileChooser.APPROVE_OPTION){
            //
        }
        path = fc.getSelectedFile().getAbsolutePath();

    }//GEN-LAST:event_btnPathActionPerformed
    //INSERT ARTICLE
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String sql = "INSERT INTO arthro"+" VALUES(?,?,?,?,NULL,?,'resubmission',NULL,NULL,?,'',?,NULL)";
        String sql1 = "INSERT INTO lexi_klidi VALUES(?,?)";
        if(path.equals("")){
            JOptionPane.showMessageDialog(null, "Path can not be empty!");
        }
        else{
        int temp_cat = findCategory(comboCategory.getSelectedItem().toString());
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, path);
            pst.setString(2, txtTitle.getText());
            pst.setString(3, txtReview.getText());
            pst.setString(4, eikona);
            pst.setInt(5, (int)spinLength.getValue());
            pst.setInt(6, temp_cat);
            pst.setString(7, comp);
            pst.executeUpdate();
            insertYpovalei();
            pst = conn.prepareStatement(sql1);
            pst.setString(1, path);
            pst.setString(2, txtKeyWords.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successful Insertion!");
            clearAll();

        }
        catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
        showArthra();
        setAndRefresh();
    }
    }//GEN-LAST:event_btnInsertActionPerformed
    //BUTTON COOPARATE WITH OTHERS FOR ARTICLE
    private void btnCoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoopActionPerformed
       String sql = "INSERT INTO ypovalei VALUES(?,?,NULL)";
       if(comboArticle.getSelectedItem() == null){
           JOptionPane.showMessageDialog(null, "No available article to cooparate!");
       }
       else{
       try{
           pst = conn.prepareStatement(sql);
           pst.setString(1, comboCoop.getSelectedItem().toString());
           pst.setString(2, comboArticle.getSelectedItem().toString());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Successful Cooparation");
       }
       catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
    }
       setAndRefresh();
    }//GEN-LAST:event_btnCoopActionPerformed
    //PUTS OLD INFO IN TEXTFIELDS
    private void btnDisplayOldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayOldActionPerformed
        if(comboUpdatePath.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "All articles are accepted!");
        }
        else{
        String sql = "SELECT * FROM arthro WHERE ar_path=?";
        String temp_sql = "SELECT * FROM kathgoria WHERE kat_id=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, comboUpdatePath.getSelectedItem().toString());
            rs = pst.executeQuery();
            if(rs.next()){
                txtTitle.setText(rs.getString("ar_titlos"));
                path = comboUpdatePath.getSelectedItem().toString();
                txtReview.setText(rs.getString("ar_perilipsh"));
                eikona = rs.getString("ar_eikones");
                spinLength.setValue(rs.getInt("ar_telos"));
                
                PreparedStatement temp;
                ResultSet temp_rs;
                temp = conn.prepareStatement(temp_sql);
                temp.setInt(1, rs.getInt("ar_kathgoria"));
                temp_rs = temp.executeQuery();
                if(temp_rs.next()){
                    comboCategory.setSelectedItem(temp_rs.getString("kat_name"));
                }
                
            }
        }
        catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
        
        }
    }//GEN-LAST:event_btnDisplayOldActionPerformed
    //UPDATES ARTICLES
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(comboUpdatePath.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "All articles are accepted!");
        }
        else{
        String sql = "UPDATE arthro SET ar_path=?, ar_titlos=?, ar_perilipsh=?, ar_eikones=?, ar_telos=?, ar_kathgoria=? WHERE ar_path=?";
        String sql1 = "INSERT INTO lexi_klidi VALUES(?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, path);
            pst.setString(2, txtTitle.getText());
            pst.setString(3, txtReview.getText());
            pst.setString(4, eikona);
            pst.setInt(5, (int)spinLength.getValue());
            pst.setInt(6, findCategory(comboCategory.getSelectedItem().toString()));
            pst.setString(7, comboUpdatePath.getSelectedItem().toString());
            pst.executeUpdate();
            if(!txtKeyWords.getText().equals("")){
                pst = conn.prepareStatement(sql1);
                pst.setString(1, path);
                pst.setString(2, txtKeyWords.getText());
                pst.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Successful Update!");
            clearAll();
        }
        catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
        
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setAndRefresh();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        Settings s = new Settings();
        s.setInfo(email, comp);
        s.setVisible(true);
    }//GEN-LAST:event_btnSettingsActionPerformed
    //SHOWS INFO FOR TABLES ROWS
    private void tblJournalistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJournalistMouseClicked
           int index = tblJournalist.getSelectedRow();
           TableModel model = tblJournalist.getModel();
           String temp_path = model.getValueAt(index, 1).toString();
           String temp_review = model.getValueAt(index, 2).toString();
           String temp_image = model.getValueAt(index, 3).toString();
           String sql1= "SELECT * FROM arthro WHERE ar_path=?";
           String temp_KeyWords = "";
           String temp_txt="";
           String sql = "SELECT * FROM lexi_klidi WHERE lex_path=?";
           try{
               pst = conn.prepareStatement(sql1);
               pst.setString(1, temp_path);
               rs = pst.executeQuery();
               if(rs.next()){
                   temp_txt = rs.getString("sxolia");
                   if(rs.wasNull()){
                       temp_txt = "No comment";
                   }
                }
               pst = conn.prepareStatement(sql);
               pst.setString(1, temp_path);
               rs = pst.executeQuery();
               while(rs.next()){
                   temp_KeyWords += rs.getString("lex_lexeis_klidia")+" ";
               }
           }
           catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
           JOptionPane.showMessageDialog(null, "Path: "+temp_path+"\nImage_path: "+temp_image+"\nReview:  "+temp_review+"\nKey Words:  "+temp_KeyWords+"\nSxolia:  "+temp_txt);
           
    }//GEN-LAST:event_tblJournalistMouseClicked
    //SHOWS INFO FOR TABLES ROW
    private void tlbCoopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlbCoopMouseClicked
           int index = tlbCoop.getSelectedRow();
           TableModel model = tlbCoop.getModel();
           String temp_name="";
           String temp_path = model.getValueAt(index, 0).toString();
           String temp_email = model.getValueAt(index, 1).toString();
           String sql = "SELECT * FROM dimosiografos WHERE dim_email=?";
           try{
               pst = conn.prepareStatement(sql);
               pst.setString(1, temp_email);
               rs = pst.executeQuery();
               if(rs.next()){
                   temp_name = rs.getString("dim_onoma") +" "+ rs.getString("dim_epitheto");
               }
           }
           catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex);
           }
           JOptionPane.showMessageDialog(null, "Path: "+temp_path+"\nCoop_name: "+temp_name);
    }//GEN-LAST:event_tlbCoopMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        setVisible(false);
        Login_GUI l = new Login_GUI();
        l.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboCoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCoopActionPerformed
            //comboArticle.removeAllItems();
            String sql = "SELECT * FROM arthro INNER JOIN ypovalei on ypo_path=ar_path WHERE ypo_email=? and ar_katastash not like 'accepted' and ar_path not in"+
                   "(SELECT ypo_path FROM ypovalei WHERE ypo_email =?)";
           try{
               pst = conn.prepareStatement(sql);
               pst.setString(1, email);
               pst.setString(2, comboCoop.getSelectedItem().toString());
               rs = pst.executeQuery();
               while(rs.next()){
                   comboArticle.addItem(rs.getString("ar_path"));
               }
           }
           catch(Exception ex){}
    }//GEN-LAST:event_comboCoopActionPerformed

    private void comboArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboArticleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboArticleActionPerformed
    private void clearAll(){
        txtTitle.setText("");
        path = "";
        txtReview.setText("");
        eikona = "";
        spinLength.setValue(1);
    }
    //INSERTS INTO YPOVALEI
    private void insertYpovalei(){
            PreparedStatement temp_pst;
            Connection temp_conn = DBconnect.GetConnection();
            String sql1= "INSERT INTO ypovalei VALUES(?,?,NULL)";
            try{
                temp_pst = temp_conn.prepareStatement(sql1);
                temp_pst.setString(1, email);
                temp_pst.setString(2, path);
                temp_pst.executeUpdate();
            }
            catch(Exception ex)
            {JOptionPane.showMessageDialog(null, ex);}
    }
    //GIVE CATEGORY NAME RETURNS ITS ID
    private int findCategory(String name){
            PreparedStatement temp_pst;
            ResultSet temp_rs;
            int temp_id=-1;
            Connection temp_conn = DBconnect.GetConnection();
            try{
            String temp = "SELECT * FROM kathgoria WHERE kat_name=? ";
            temp_pst = temp_conn.prepareStatement(temp);
            temp_pst.setString(1, name);
            temp_rs = temp_pst.executeQuery();
            if(temp_rs.next()){
            temp_id = temp_rs.getInt("kat_id");}
            
            }
            catch(Exception ex)
            {JOptionPane.showMessageDialog(null, ex);}
            return temp_id;
    }
    //DISPLAYS INFO ON TABLEJOURNALIST
    private void showArthra(){
        DefaultTableModel model = (DefaultTableModel)tblJournalist.getModel();
        Object[] row = new Object[9];
        model.setRowCount(0);
        try{
            String query = "SELECT * FROM arthro INNER JOIN ypovalei on ar_path = ypo_path WHERE ypo_email=?";
            pst = conn.prepareStatement(query);
            pst.setString(1, email);
            rs = pst.executeQuery();
            while(rs.next()){
                row[0] = rs.getString("ar_titlos");
                row[1] = rs.getString("ar_path");
                row[2] = rs.getString("ar_perilipsh");
                row[3] = rs.getString("ar_eikones");
                row[4] = rs.getString("ar_katastash");
                row[5] = rs.getString("ar_telos");
                row[6] = rs.getInt("ar_kathgoria");
                if(rs.getInt("ar_fyl_dim") != 0){
                    row[7] = rs.getInt("ar_fyl_dim");
                }
                else{
                    row[7] = "Not Published";
                }
                if(rs.getInt("ar_arxh") != 0){
                    row[8] = rs.getInt("ar_arxh");
                }
                else{
                    row[8] = "Not Published";
                }
                model.addRow(row);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
            
        }
    }
    //DISPLAYS INFO ON TABLE COOP
    private void showCoops(){
        DefaultTableModel model = (DefaultTableModel)tlbCoop.getModel();
        model.setRowCount(0);
        Object[] row = new Object[2];
        String sql="SELECT * FROM ypovalei WHERE ypo_email not like ? and ypo_path in"+
                "(SELECT ypo_path FROM ypovalei WHERE ypo_email=?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, email);
            rs = pst.executeQuery();
            while(rs.next()){
                row[0] = rs.getString("ypo_path");
                row[1] = rs.getString("ypo_email");
                model.addRow(row);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    //SETS INITIAL VARIABLES
    public void setInfo(String email, String company, Connection con){
        this.email = email;
        this.comp = company;
        this.conn = con;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Journalist().setVisible(true);
            }
        });
    }
    //CALLED FROM LOGIN JFRAME
    public void initialize(String username){
       lblUsername.setText(username);
       setAndRefresh();
    }
    //SETS ALL FIELDS 
    private void setAndRefresh(){
        clearAll();
        showArthra();
        showCoops();
        comboUpdatePath.removeAllItems();
        comboArticle.removeAllItems();
        comboCategory.removeAllItems();
        comboCoop.removeAllItems();
        
        String sql = "SELECT kat_name FROM kathgoria";
        String sql1 = "SELECT ypo_path FROM ypovalei INNER JOIN arthro on ypo_path=ar_path WHERE ypo_email=? and ar_katastash not like 'accepted'";
        String sql3 = "SELECT * FROM dimosiografos WHERE dim_efhmerida=? AND dim_email not like ?";
        try{
            
            //COMBOBOX CATEGORY
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                comboCategory.addItem(rs.getString("kat_name"));
            }
            
            //COMBOBOX PATH
            pst = conn.prepareStatement(sql1);
            pst.setString(1, email);
            rs = pst.executeQuery();
            while(rs.next()){
                comboUpdatePath.addItem(rs.getString("ypo_path"));
            }
            
            
            //COMBO COOP
            pst = conn.prepareStatement(sql3);
            pst.setString(1, comp);
            pst.setString(2, email);
            rs = pst.executeQuery();
            while(rs.next()){
                comboCoop.addItem(rs.getString("dim_email"));
            }
            
            
            
        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
        
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoop;
    private javax.swing.JButton btnDisplayOld;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnPath;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboArticle;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboCoop;
    private javax.swing.JComboBox<String> comboUpdatePath;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbHello;
    private javax.swing.JLabel lblUsername;
    private java.awt.List list1;
    private java.awt.List list2;
    private java.awt.Panel panel1;
    private javax.swing.JSpinner spinLength;
    private javax.swing.JTable tblJournalist;
    private java.awt.TextArea textArea1;
    private javax.swing.JTable tlbCoop;
    private javax.swing.JTextField txtKeyWords;
    private javax.swing.JTextField txtReview;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
