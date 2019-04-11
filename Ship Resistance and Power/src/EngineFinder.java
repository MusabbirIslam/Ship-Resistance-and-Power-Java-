 

import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import java.sql.*;
 import java.util.*;
import javax.swing.table.DefaultTableCellRenderer;
 import javax.swing.table.DefaultTableModel;



public class EngineFinder extends javax.swing.JFrame {


    
    public EngineFinder() {
        initComponents();
       DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)engineDetailsTable.getTableHeader().getDefaultRenderer();
       renderer.setHorizontalAlignment(JLabel.CENTER);
       renderer.setVerticalAlignment(JLabel.CENTER);
        
    }
   
    
    
   public Connection getConnection()
   {
       Connection con = null;
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost/engine_database", "root","1234");
           return con;
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       return con;
   }
   
    public ArrayList <DatabaseData> ListUsers(String Search)
   {
       ArrayList <DatabaseData> usersList = new ArrayList <DatabaseData>();
     
       Statement st;
       ResultSet rs;
       
       try {
           
           
           String engineSearch=powerSearchTxtField.getText();
           engineSearch=engineSearch.substring(0,engineSearch.length()-1);
           engineSearch=engineSearch.concat("_");
           System.out.println(engineSearch);
           Connection con = getConnection();
           
           st = con.createStatement();
           String searchQuery = (" SELECT * FROM `engine_list` WHERE `MinHP` AND `MaxHP` LIKE '"+engineSearch+"'");
           rs = st.executeQuery(searchQuery);
           
           DatabaseData eDetails;
           
           while(rs.next())
           {
               eDetails = new DatabaseData (
                                             
                                             rs.getString("MinHP"),
                                             rs.getString("MaxHP"),
                                             rs.getString("EngModel"),
                                             rs.getString("EngManufacturer"),
                                             rs.getString("EngRPM"),
                                             rs.getString("EngWL")
                                             );
               
               usersList.add(eDetails);
           }
           
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       return usersList;
   }
    
    public void findUsers()
    {
    ArrayList<DatabaseData> users = ListUsers(powerSearchTxtField.getText());
    
    if(users.size()==0)
    {
        JOptionPane.showMessageDialog(this, "No Engine found with given data");
    }
    else
    {
    DefaultTableModel model = new DefaultTableModel();
    
    model.setColumnIdentifiers(new Object[] {"Available HP", "Maximum HP", "Model", "Manufacturer", "R.P.M", "Web Link"});
    
       Object[] row = new Object[6];
       for
               (int i = 0; i < users.size(); i++)
       {
        
           row[0] = users.get(i).getminHP();
           
           row[1] = users.get(i).getengineRPM();
           
           row[2] = users.get(i).getmaxHP();
           
           row[3] = users.get(i).getengineModel();
           
           row[4] = users.get(i).getengineManufacturer();
           
           row[5] = users.get(i).getengineWebLink();

           
      
           
           model.addRow(row);
       }
       
       
       engineDetailsTable.setModel(model);
       engineDetailsTable.setShowHorizontalLines(true);
       engineDetailsTable.setShowVerticalLines(true);
       
    }
     
      
    }
    
    
    
         
    //Don't edit this codes
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        engineDetailsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        engineDetailsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Back6Btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CancelBtn6 = new javax.swing.JButton();
        inputPowerPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        powerSearchTxtField = new javax.swing.JTextField();
        getEngineBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        unitConPanel = new javax.swing.JPanel();
        kwToHPtxtField = new javax.swing.JTextField();
        conKWtoHPBtn = new javax.swing.JButton();
        kwTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        WinputTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        WtoHPoutputTxtFeild = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        WtoHPConBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PREVIEWER");
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(62, 92, 130));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10), javax.swing.BorderFactory.createTitledBorder("")));

        engineDetailsPanel.setBackground(new java.awt.Color(208, 208, 254));
        engineDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENGINE DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N
        engineDetailsPanel.setPreferredSize(new java.awt.Dimension(878, 141));

        engineDetailsTable.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        engineDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        engineDetailsTable.setShowHorizontalLines(true);
        engineDetailsTable.setShowVerticalLines(true);
        engineDetailsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(engineDetailsTable);
        if (engineDetailsTable.getColumnModel().getColumnCount() > 0) {
            engineDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            engineDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            engineDetailsTable.getColumnModel().getColumn(2).setResizable(false);
            engineDetailsTable.getColumnModel().getColumn(3).setResizable(false);
            engineDetailsTable.getColumnModel().getColumn(4).setResizable(false);
            engineDetailsTable.getColumnModel().getColumn(5).setResizable(false);
            engineDetailsTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout engineDetailsPanelLayout = new javax.swing.GroupLayout(engineDetailsPanel);
        engineDetailsPanel.setLayout(engineDetailsPanelLayout);
        engineDetailsPanelLayout.setHorizontalGroup(
            engineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        engineDetailsPanelLayout.setVerticalGroup(
            engineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(209, 253, 209));
        jLabel2.setText("WELCOME TO ENGINE FINDER");

        Back6Btn.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        Back6Btn.setText("Back");
        Back6Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back6BtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jButton1.setText("Reload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CancelBtn6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        CancelBtn6.setText("Exit");
        CancelBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtn6ActionPerformed(evt);
            }
        });

        inputPowerPanel.setBackground(new java.awt.Color(208, 208, 254));
        inputPowerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "POWER INPUT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N
        inputPowerPanel.setMinimumSize(new java.awt.Dimension(407, 121));
        inputPowerPanel.setPreferredSize(new java.awt.Dimension(407, 121));

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel11.setText("POWER:");

        powerSearchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerSearchTxtFieldActionPerformed(evt);
            }
        });

        getEngineBtn.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        getEngineBtn.setText("Engine");
        getEngineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEngineBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel12.setText("HP");

        javax.swing.GroupLayout inputPowerPanelLayout = new javax.swing.GroupLayout(inputPowerPanel);
        inputPowerPanel.setLayout(inputPowerPanelLayout);
        inputPowerPanelLayout.setHorizontalGroup(
            inputPowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPowerPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel11)
                .addGap(50, 50, 50)
                .addComponent(powerSearchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPowerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getEngineBtn)
                .addGap(189, 189, 189))
        );
        inputPowerPanelLayout.setVerticalGroup(
            inputPowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPowerPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(inputPowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(powerSearchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(24, 24, 24)
                .addComponent(getEngineBtn))
        );

        unitConPanel.setBackground(new java.awt.Color(208, 208, 254));
        unitConPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UNIT CONVERTER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N

        kwToHPtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kwToHPtxtFieldActionPerformed(evt);
            }
        });

        conKWtoHPBtn.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        conKWtoHPBtn.setText("Convert");
        conKWtoHPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conKWtoHPBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel3.setText("KW");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("=");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel5.setText("HP");

        WinputTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WinputTxtFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel1.setText("W ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("=");

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel10.setText("HP");

        WtoHPConBtn.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        WtoHPConBtn.setText("Convert");
        WtoHPConBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WtoHPConBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout unitConPanelLayout = new javax.swing.GroupLayout(unitConPanel);
        unitConPanel.setLayout(unitConPanelLayout);
        unitConPanelLayout.setHorizontalGroup(
            unitConPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitConPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(unitConPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kwTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WinputTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(unitConPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 51, Short.MAX_VALUE)
                .addGroup(unitConPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, unitConPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13)
                        .addComponent(WtoHPoutputTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, unitConPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kwToHPtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)))
                .addGroup(unitConPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WtoHPConBtn)
                    .addGroup(unitConPanelLayout.createSequentialGroup()
                        .addComponent(conKWtoHPBtn)
                        .addGap(1, 1, 1)))
                .addGap(14, 14, 14))
        );
        unitConPanelLayout.setVerticalGroup(
            unitConPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitConPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(unitConPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WinputTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(WtoHPoutputTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1)
                    .addComponent(WtoHPConBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(unitConPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kwTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(kwToHPtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(conKWtoHPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Back6Btn)
                        .addGap(409, 409, 409)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelBtn6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(engineDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(unitConPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(inputPowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(332, 332, 332))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(unitConPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(engineDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back6Btn)
                    .addComponent(jButton1)
                    .addComponent(CancelBtn6))
                .addGap(28, 28, 28))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1148, 697));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void powerSearchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerSearchTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powerSearchTxtFieldActionPerformed

    private void getEngineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEngineBtnActionPerformed

        findUsers();

        // TODO add your handling code here:
    }//GEN-LAST:event_getEngineBtnActionPerformed

    private void Back6BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back6BtnActionPerformed

        Close(); //Exit Program
        SelectOption SOP2 = new SelectOption();
        SOP2.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_Back6BtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Close();
        EngineFinder EF = new EngineFinder();
        EF.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CancelBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtn6ActionPerformed

        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_CancelBtn6ActionPerformed

    private void WtoHPConBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WtoHPConBtnActionPerformed

        double Win, WtoHPout;
        Win = Double.parseDouble(WinputTxtField.getText() );

        WtoHPout = (Win * 0.00134102) ;

        WtoHPoutputTxtFeild.setText(String.valueOf(WtoHPout));
    }//GEN-LAST:event_WtoHPConBtnActionPerformed

    private void WinputTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WinputTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WinputTxtFieldActionPerformed

    private void conKWtoHPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conKWtoHPBtnActionPerformed

        double KWinput, KWtoHPoutput;
        KWinput = Double.parseDouble (kwTxtField.getText() );
        KWtoHPoutput = (KWinput * 1.341022089595);
        kwToHPtxtField.setText(String.valueOf(KWtoHPoutput));

        // TODO add your handling code here:
    }//GEN-LAST:event_conKWtoHPBtnActionPerformed

    private void kwToHPtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kwToHPtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kwToHPtxtFieldActionPerformed

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
            java.util.logging.Logger.getLogger(EngineFinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EngineFinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EngineFinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EngineFinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EngineFinder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back6Btn;
    private javax.swing.JButton CancelBtn6;
    private javax.swing.JTextField WinputTxtField;
    private javax.swing.JButton WtoHPConBtn;
    private javax.swing.JTextField WtoHPoutputTxtFeild;
    private javax.swing.JButton conKWtoHPBtn;
    private javax.swing.JPanel engineDetailsPanel;
    private javax.swing.JTable engineDetailsTable;
    private javax.swing.JButton getEngineBtn;
    private javax.swing.JPanel inputPowerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kwToHPtxtField;
    private javax.swing.JTextField kwTxtField;
    private javax.swing.JTextField powerSearchTxtField;
    private javax.swing.JPanel unitConPanel;
    // End of variables declaration//GEN-END:variables

private void Close() {
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }


}
