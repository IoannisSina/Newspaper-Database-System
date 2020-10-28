

import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Date;


public class Chief extends javax.swing.JFrame {

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private String email;
    private String comp;
    private String path="";
    private String eikona="";
    public Chief() {
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJournalist = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblChief = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtComments = new javax.swing.JTextField();
        txtDescribe = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboAvPapers = new javax.swing.JComboBox<>();
        comboUpdatePath = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboEval = new javax.swing.JComboBox<>();
        comboParental = new javax.swing.JComboBox<>();
        spinLength = new javax.swing.JSpinner();
        btnImage = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboArticleEval = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        comboCoop = new javax.swing.JComboBox<>();
        comboArticle = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JTextField();
        btnDisplayOld = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tlbCoop = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        comboAvArticles = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbHello = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        txtNewCategory = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnCoop = new javax.swing.JButton();
        btnPath = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtKeyWords = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtReview = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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

        jRadioButton1.setText("jRadioButton1");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Journalist");
        setMinimumSize(new java.awt.Dimension(671, 709));

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

        tblChief.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Path", "Review", "Images", "Length", "Category", "PaperNO", "Start Page"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChief.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiefMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblChief);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentsActionPerformed(evt);
            }
        });

        txtDescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescribeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("REFRESH ALL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("UPDATE ARTICLE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("With");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Length:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Comments:");

        comboEval.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accept", "Reject", "Resubmit" }));

        spinLength.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnImage.setBackground(new java.awt.Color(51, 153, 255));
        btnImage.setText("IMAGE");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setText("Publicate");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Description:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Papers:");

        comboCoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCoopActionPerformed(evt);
            }
        });

        btnDisplayOld.setBackground(new java.awt.Color(51, 153, 255));
        btnDisplayOld.setText("DISPLAY OLD");
        btnDisplayOld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayOldActionPerformed(evt);
            }
        });

        btnSettings.setBackground(new java.awt.Color(51, 153, 255));
        btnSettings.setText("SETTINGS");
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });

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

        btnInsert.setBackground(new java.awt.Color(51, 153, 255));
        btnInsert.setText("INSERT ARTICLE");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Path:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Journalist:");

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("PUBLICATION");

        comboAvArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAvArticlesActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("INSERT ARTICLE");

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("SIGN OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("EVALUATE ARTICLES");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Parental:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Name:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Images:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Key Words:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Article:");

        lbHello.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbHello.setForeground(new java.awt.Color(255, 0, 51));
        lbHello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHello.setText("WELCOME");

        comboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoryActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(51, 153, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Path:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD COOPARATORS");

        btnUpdate.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdate.setText("UPDATE ARTICLE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCoop.setBackground(new java.awt.Color(51, 153, 255));
        btnCoop.setText("COOPARATE");
        btnCoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoopActionPerformed(evt);
            }
        });

        btnPath.setBackground(new java.awt.Color(51, 153, 255));
        btnPath.setText("PATH");
        btnPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("ADD CATEGORY");

        btnAdd.setBackground(new java.awt.Color(51, 153, 255));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Articles:");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("COOPARATORS");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Title:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Review:");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 0, 51));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSettings))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCoop)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(comboCoop, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                                        .addComponent(btnAdd))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel18))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(comboParental, 0, 134, Short.MAX_VALUE)
                                                            .addComponent(txtNewCategory)))
                                                    .addComponent(txtDescribe))
                                                .addComponent(comboArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(lbHello, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboAvPapers, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(comboAvArticles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtComments, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(comboArticleEval, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEval, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDisplayOld, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboUpdatePath, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(spinLength, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKeyWords))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbHello, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(btnSettings))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comboArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(txtReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(comboCoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCoop)
                            .addComponent(jLabel4)
                            .addComponent(btnImage))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(btnAdd))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtNewCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(comboParental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescribe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(comboAvArticles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtKeyWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsert)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(10, 10, 10)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(btnPath)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnUpdate)
                                            .addComponent(btnDisplayOld))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(comboUpdatePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSubmit))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(comboArticleEval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(comboEval, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel14)
                                                        .addGap(5, 5, 5)
                                                        .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(60, 60, 60)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel5)
                                                            .addComponent(spinLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel7)
                                                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)))))))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboAvPapers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(370, 370, 370))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoryActionPerformed

    }//GEN-LAST:event_comboCategoryActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setVisible(true);
        fc.setCurrentDirectory(new java.io.File("C:/"));
        fc.setDialogTitle("Choose Path");
        //c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(fc.showOpenDialog(btnPath) == JFileChooser.APPROVE_OPTION){
            //
        }
        eikona = fc.getSelectedFile().getAbsolutePath();
        //JOptionPane.showMessageDialog(null, eikona);
    }//GEN-LAST:event_btnImageActionPerformed

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

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String sql = "INSERT INTO arthro"+" VALUES(?,?,?,?,NULL,?,'resubmission',NULL,NULL,?,'',?,NULL)";
        String sql1 = "INSERT INTO lexi_klidi VALUES(?,?)";
        int temp_cat = findCategory(comboCategory.getSelectedItem().toString());
        if(path.equals("")){
            JOptionPane.showMessageDialog(null, "Path can not be empty!");
        }
        else{
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
       catch(Exception ex){JOptionPane.showMessageDialog(null, "Already cooparators");}
       setAndRefresh();
     }
    }//GEN-LAST:event_btnCoopActionPerformed

    private void btnDisplayOldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayOldActionPerformed
        
        if(comboUpdatePath.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "All articles published");
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(comboUpdatePath.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "All articles are published!");
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

    private void tblChiefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiefMouseClicked
         int index = tblChief.getSelectedRow();
           TableModel model = tblChief.getModel();
           String temp_path = model.getValueAt(index, 1).toString();
           String temp_review = model.getValueAt(index, 2).toString();
           String temp_image = model.getValueAt(index, 3).toString();
           String temp_KeyWords = "";
           String sql = "SELECT * FROM lexi_klidi WHERE lex_path=?";
           try{
               pst = conn.prepareStatement(sql);
               pst.setString(1, temp_path);
               rs = pst.executeQuery();
               while(rs.next()){
                   temp_KeyWords += rs.getString("lex_lexeis_klidia")+" ";
               }
           }
           catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
           JOptionPane.showMessageDialog(null, "Path: "+temp_path+"\nImage_path: "+temp_image+"\nReview:  "+temp_review+"\nKey Words:  "+temp_KeyWords);
           
    }//GEN-LAST:event_tblChiefMouseClicked

    private void txtCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentsActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String sql = "UPDATE arthro SET ar_katastash=?,sxolia=? WHERE ar_path=?";
        String sql1 = "UPDATE arthro SET ar_hmerominia=? where ar_path=?";
        String temp_eval;
        if(comboArticleEval.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "No Article to evaluate!");
        }
        else{
        if(comboEval.getSelectedItem().toString().equals("Accept")){
            temp_eval = "accepted";
        }
        else if(comboEval.getSelectedItem().toString().equals("Reject")){
            temp_eval = "rejected";
        }
        else{
            temp_eval = "resubmission";
        }
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, temp_eval);
            pst.setString(2, txtComments.getText());
            pst.setString(3, comboArticleEval.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successful submission");
            txtComments.setText("");
            setAndRefresh();
            
        }
        catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
        
       }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        Login_GUI l = new Login_GUI();
        l.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String sql = "INSERT INTO kathgoria VALUES(?,?,?,?)";
        String sql1 = "SELECT * FROM kathgoria WHERE kat_name=?";
        String tmp="";
        if(txtNewCategory.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Name can not be empty!");
        }
        else{
        try{
            pst = conn.prepareStatement(sql);
            pst.setNull(1, java.sql.Types.INTEGER);
            pst.setString(2, txtNewCategory.getText());
            pst.setString(3, txtDescribe.getText());
            tmp = comboParental.getSelectedItem().toString();
            if(tmp.equals("-")){
                pst.setNull(4, java.sql.Types.INTEGER);
            }
            else{
                int tmpID;
                PreparedStatement temp_pst;
                temp_pst = conn.prepareStatement(sql1);
                temp_pst.setString(1, tmp);
                rs = temp_pst.executeQuery();
                if(rs.next()){
                    tmpID = rs.getInt("kat_id");
                    pst.setInt(4, tmpID);
                }
            }
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successful Addition");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        }
        setAndRefresh();
        txtNewCategory.setText("");
        txtDescribe.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(comboAvArticles.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "No available articles to publicate!");
        }
        else{
        String sql1 = "SELECT * FROM arthro WHERE ar_path=?";
        String sql2 = "SELECT * FROM fyllo WHERE fyl_arithmos=? and fyl_efhmerida=?";
        String sql3 = "UPDATE arthro SET ar_fyl_dim=? WHERE ar_path=?";
        String sql4 = "UPDATE fyllo SET fyl_diathesimes_sel=? WHERE fyl_efhmerida=? and fyl_arithmos=?";
        String sql5 = "UPDATE arthro SET ar_arxh=? WHERE ar_path=?";
        int temp_length = 0;
        int temp_diathesimes = -1;
        int temp_selides = 0;
        try{
            pst = conn.prepareStatement(sql1);
            pst.setString(1, comboAvArticles.getSelectedItem().toString());
            rs = pst.executeQuery();
            if(rs.next()){
                temp_length = rs.getInt("ar_telos");
            }
            
            pst = conn.prepareStatement(sql2);
            pst.setString(1, comboAvPapers.getSelectedItem().toString());
            pst.setString(2, comp);
            rs = pst.executeQuery();
            if(rs.next()){
                temp_diathesimes = rs.getInt("fyl_diathesimes_sel");
                temp_selides = rs.getInt("fyl_selides");
            }
            
            if(temp_diathesimes >= temp_length){
                pst = conn.prepareStatement(sql3);
                pst.setString(1, comboAvPapers.getSelectedItem().toString());
                pst.setString(2, comboAvArticles.getSelectedItem().toString());
                pst.executeUpdate();
                //fix diathesimes
                pst = conn.prepareStatement(sql4);
                pst.setInt(1, temp_diathesimes - temp_length);
                pst.setString(3, comboAvPapers.getSelectedItem().toString());
                pst.setString(2, comp);
                pst.executeUpdate();
                //fix arxh arthrou
                pst = conn.prepareStatement(sql5);
                pst.setInt(1, temp_selides-temp_diathesimes+1);
                pst.setString(2, comboAvArticles.getSelectedItem().toString());
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Successful publication!");
            }
            else{
                JOptionPane.showConfirmDialog(null, "Article does not fit!");
            }
            
        }
        catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
        setAndRefresh();
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void comboCoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCoopActionPerformed
            comboArticle.removeAllItems();
            String sql = "SELECT * FROM arthro INNER JOIN ypovalei on ypo_path=ar_path WHERE ypo_email=? and ypo_path not in"+
                   "(SELECT ypo_path FROM ypovalei WHERE ypo_email=?)";
           try{
               pst = conn.prepareStatement(sql);
               pst.setString(1, email);
               pst.setString(2, comboCoop.getSelectedItem().toString());
               rs = pst.executeQuery();
               while(rs.next()){
                   if(rs.getInt("ar_fyl_dim") == 0)
                    comboArticle.addItem(rs.getString("ar_path"));
               }
           }
           catch(Exception ex){}
    }//GEN-LAST:event_comboCoopActionPerformed

    private void txtDescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescribeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescribeActionPerformed

    private void comboAvArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAvArticlesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAvArticlesActionPerformed
    private void clearAll(){
        txtTitle.setText("");
        path = "";
        txtReview.setText("");
        eikona = "";
        spinLength.setValue(1);
    }
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
    
    private void showArthra(){
        DefaultTableModel model = (DefaultTableModel)tblJournalist.getModel();
        Object[] row = new Object[9];
        model.setRowCount(0);
        try{
            String query = "SELECT * FROM arthro INNER JOIN ypovalei on ar_path = ypo_path WHERE ar_efhmerida=? and ypo_email not like ?"
                    + "and ar_path not in(SELECT ypo_path FROM ypovalei WHERE ypo_email=?)";
            pst = conn.prepareStatement(query);
            pst.setString(1, comp);
            pst.setString(2, email);
            pst.setString(3, email);
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
    
    private void showArthraChief(){
        DefaultTableModel model = (DefaultTableModel)tblChief.getModel();
        Object[] row = new Object[8];
        model.setRowCount(0);
        try{
            String query = "SELECT * FROM arthro INNER JOIN ypovalei on ar_path = ypo_path WHERE ypo_email= ?";
            pst = conn.prepareStatement(query);
            pst.setString(1, email);
            rs = pst.executeQuery();
            while(rs.next()){
                row[0] = rs.getString("ar_titlos");
                row[1] = rs.getString("ar_path");
                row[2] = rs.getString("ar_perilipsh");
                row[3] = rs.getString("ar_eikones");
                row[4] = rs.getString("ar_telos");
                row[5] = rs.getInt("ar_kathgoria");
                if(rs.getInt("ar_fyl_dim") != 0){
                    row[6] = rs.getInt("ar_fyl_dim");
                }
                else{
                    row[6] = "Not Published";
                }
                if(rs.getInt("ar_arxh") != 0){
                    row[7] = rs.getInt("ar_arxh");
                }
                else{
                    row[7] = "Not Published";
                }
                model.addRow(row);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        
            
        }
    }
    
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
    public void initialize(String username){
       lblUsername.setText(username);
       setAndRefresh();
    }
    private void setAndRefresh(){
        clearAll();
        showArthra();
        showArthraChief();
        showCoops();
        comboParental.removeAllItems();
        comboUpdatePath.removeAllItems();
        comboArticle.removeAllItems();
        comboCategory.removeAllItems();
        comboCoop.removeAllItems();
        comboAvArticles.removeAllItems();
        comboAvPapers.removeAllItems();
        comboArticleEval.removeAllItems();
        
        String sql = "SELECT kat_name FROM kathgoria";
        String sql1 = "SELECT * FROM ypovalei INNER JOIN arthro on ypo_path=ar_path WHERE ypo_email=?";
        String sql3 = "SELECT * FROM dimosiografos WHERE dim_efhmerida=? AND dim_email not like ?";
        String sql4 = "SELECT * FROM arthro INNER JOIN ypovalei on ypo_path = ar_path  WHERE ypo_email not like ? and ar_katastash not like 'accepted' "+
                "and ar_efhmerida=?";
        String sql5 = "SELECT * FROM kathgoria";
        String sql6 = "SELECT * FROM arthro WHERE ar_efhmerida=? and ar_katastash='accepted'";
        String sql7 = "SELECT * FROM fyllo WHERE fyl_efhmerida=?";
               
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
                if(rs.getInt("ar_fyl_dim") == 0){
                comboUpdatePath.addItem(rs.getString("ypo_path"));
                //comboArticle.addItem(rs.getString("ypo_path"));
                }
            }
            
            
            //COMBO COOP
            pst = conn.prepareStatement(sql3);
            pst.setString(1, comp);
            pst.setString(2, email);
            rs = pst.executeQuery();
            while(rs.next()){
                comboCoop.addItem(rs.getString("dim_email"));
            }
            
            //COMBO EVALUATE
            pst = conn.prepareStatement(sql4);
            pst.setString(1, email);
            pst.setString(2, comp);
            rs = pst.executeQuery();
            while(rs.next()){
                if (rs.getInt("ar_fyl_dim") == 0){
                   comboArticleEval.addItem(rs.getString("ar_path"));
                }
            }
            
            //COMBO Parental
            pst = conn.prepareStatement(sql5);
            rs = pst.executeQuery();
            comboParental.addItem("-");
            while(rs.next()){
                comboParental.addItem(rs.getString("kat_name"));
            }
            
            //COMBO AvArticles
            pst = conn.prepareStatement(sql6);
            pst.setString(1, comp);
            rs = pst.executeQuery();
            while(rs.next()){
                if(rs.getInt("ar_fyl_dim")==0){
                comboAvArticles.addItem(rs.getString("ar_path"));                        
                }
            }
            
            //Combo AvPapers
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String temp = sdf.format(new Date());
            Date current_date = sdf.parse(temp);
            String temp1;
            Date date2;
            pst = conn.prepareStatement(sql7);
            pst.setString(1, comp);
            rs = pst.executeQuery();
            while(rs.next()){
                temp1 = rs.getString("fyl_kikloforia");
                date2 = sdf.parse(temp1);
                if(date2.compareTo(current_date) >= 0){
                    comboAvPapers.addItem(rs.getString("fyl_arithmos"));
                }
            }
         
            
            
            
            
        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
        
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCoop;
    private javax.swing.JButton btnDisplayOld;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnPath;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboArticle;
    private javax.swing.JComboBox<String> comboArticleEval;
    private javax.swing.JComboBox<String> comboAvArticles;
    private javax.swing.JComboBox<String> comboAvPapers;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboCoop;
    private javax.swing.JComboBox<String> comboEval;
    private javax.swing.JComboBox<String> comboParental;
    private javax.swing.JComboBox<String> comboUpdatePath;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbHello;
    private javax.swing.JLabel lblUsername;
    private java.awt.List list1;
    private java.awt.List list2;
    private java.awt.Panel panel1;
    private javax.swing.JSpinner spinLength;
    private javax.swing.JTable tblChief;
    private javax.swing.JTable tblJournalist;
    private java.awt.TextArea textArea1;
    private javax.swing.JTable tlbCoop;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtDescribe;
    private javax.swing.JTextField txtKeyWords;
    private javax.swing.JTextField txtNewCategory;
    private javax.swing.JTextField txtReview;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
