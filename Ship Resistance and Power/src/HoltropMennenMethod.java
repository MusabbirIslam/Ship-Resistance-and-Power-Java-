// ---------------------------------- Author: Shaikat Ray ---------------------------------- \\

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

// ---------------------------------- JFreeChart Import ---------------------------------- \\ 

import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

// ---------------------------------- JFreeChart Import Ends ---------------------------------- \\ 


public class HoltropMennenMethod extends javax.swing.JFrame {


    public HoltropMennenMethod() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BACKbutton = new javax.swing.JButton();
        RELOADbutton = new javax.swing.JButton();
        CLEARbutton = new javax.swing.JButton();
        EXITbutton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LWLtxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtxtField = new javax.swing.JTextField();
        CBtxtField = new javax.swing.JTextField();
        DtxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        VtxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CMtxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CWtxtField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ABTtxtField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        LCBtxtField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CSTERNtxtField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TFtxtField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        HBtxtField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        RHOtxtField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        NUtxtField = new javax.swing.JTextField();
        TDtxtField = new javax.swing.JTextField();
        CBTOtxtField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        ATtxtField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        SHSAtxtField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        SHBSAtxtField = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        RSAtxtField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        SKSAtxtField = new javax.swing.JTextField();
        SBSAtxtField = new javax.swing.JTextField();
        HBSAtxtField = new javax.swing.JTextField();
        SFSAtxtField = new javax.swing.JTextField();
        DSAtxtField = new javax.swing.JTextField();
        BKSAtxtField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        RSAK2txtField = new javax.swing.JTextField();
        SHSAK2txtField = new javax.swing.JTextField();
        SHBSAK2txtField = new javax.swing.JTextField();
        SKSAK2txtField = new javax.swing.JTextField();
        SBSAK2txtField = new javax.swing.JTextField();
        HBSAK2txtField = new javax.swing.JTextField();
        SFSAK2txtField = new javax.swing.JTextField();
        DSAK2txtField = new javax.swing.JTextField();
        BKSAK2txtField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        RTresult = new javax.swing.JTextField();
        EFPOWresult = new javax.swing.JTextField();
        DELIPOWresult = new javax.swing.JTextField();
        SHAFTPOWresult = new javax.swing.JTextField();
        BRAKEPOWresult = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        CALCall = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        DISTresult = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(62, 92, 130));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10), javax.swing.BorderFactory.createTitledBorder("")));

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(209, 253, 209));
        jLabel13.setText("WELCOME TO HOLTROP & MENNEN METHOD");

        BACKbutton.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        BACKbutton.setText("BACK");
        BACKbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKbuttonActionPerformed(evt);
            }
        });

        RELOADbutton.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        RELOADbutton.setText("RELOAD");
        RELOADbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RELOADbuttonActionPerformed(evt);
            }
        });

        CLEARbutton.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        CLEARbutton.setText("CLEAR");

        EXITbutton.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        EXITbutton.setText("EXIT");
        EXITbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITbuttonActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USER INPUTS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel1.setText("LENGTH W.L :");

        LWLtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LWLtxtFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel3.setText("BREADTH :");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel4.setText("BLOCK CO :");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel5.setText("DRAUGHT :");

        BtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtxtFieldActionPerformed(evt);
            }
        });

        DtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DtxtFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel6.setText("SPEED :");

        VtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VtxtFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel7.setText("M");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel8.setText("M");

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel9.setText("M");

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel12.setText("M/S");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel2.setText("MIDSHIP CO :");

        CMtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMtxtFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel10.setText("WP AREA CO :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CMtxtField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VtxtField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DtxtField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtxtField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LWLtxtField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBtxtField)
                    .addComponent(CWtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LWLtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(BtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(DtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(VtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CMtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CWtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PRINCIPAL PARTICULARS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N
        jPanel4.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel14.setText("TS AREA BB :");

        jLabel15.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel15.setText("LCB :");

        LCBtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LCBtxtFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel16.setText("C.STERN :");

        jLabel20.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel20.setText("DRAUGHT F:");

        TFtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFtxtFieldActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel21.setText("C.A. ABT :");

        HBtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HBtxtFieldActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel22.setText("WATER DENS :");

        jLabel23.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel23.setText("KVIS WATER :");

        jLabel24.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel24.setText("THRUS T.D :");

        jLabel25.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel25.setText("CBTO :");

        CBTOtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTOtxtFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel11.setText("KG/M3");

        jLabel63.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel63.setText("IA. TRANSOM :");

        ATtxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATtxtFieldActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel19.setText("M²/S");

        jLabel64.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel64.setText("M²");
        jLabel64.setToolTipText("");

        jLabel65.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel65.setText("%");
        jLabel65.setToolTipText("");

        jLabel68.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel68.setText("M");
        jLabel68.setToolTipText("");

        jLabel69.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel69.setText("M");
        jLabel69.setToolTipText("");

        jLabel70.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel70.setText("M²");
        jLabel70.setToolTipText("");

        jLabel71.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel71.setText("M²");
        jLabel71.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel63)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel16)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel14)
                            .addComponent(jLabel22)
                            .addComponent(jLabel15))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ABTtxtField)
                    .addComponent(LCBtxtField)
                    .addComponent(NUtxtField)
                    .addComponent(CSTERNtxtField)
                    .addComponent(TDtxtField)
                    .addComponent(CBTOtxtField)
                    .addComponent(TFtxtField)
                    .addComponent(HBtxtField)
                    .addComponent(ATtxtField)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(RHOtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel19)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71))
                .addGap(122, 122, 122))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(RHOtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(NUtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ABTtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(LCBtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(CSTERNtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(CBTOtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(TDtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TFtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(HBtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ATtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel71)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OTHER INPUTS", jPanel4);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N

        jLabel40.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel40.setText("RUDDER :");

        jLabel41.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel41.setText("SHAFT :");

        jLabel42.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel42.setText("S. BRACKET :");

        jLabel43.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel43.setText("SKEG :");

        jLabel17.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel17.setText("ST. BOSS :");

        jLabel18.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel18.setText("HU. BOSS :");

        jLabel26.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel26.setText("STAB. FINS :");

        jLabel44.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel44.setText("DOME :");

        jLabel45.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel45.setText("B. KEEL :");

        jLabel37.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel37.setText("M²");

        jLabel46.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel46.setText("M²");

        jLabel47.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel47.setText("M²");

        jLabel48.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel48.setText("M²");

        jLabel49.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel49.setText("M²");

        jLabel50.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel50.setText("M²");

        jLabel51.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel51.setText("M²");

        jLabel52.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel52.setText("M²");

        jLabel53.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel53.setText("M²");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel40)
                    .addComponent(jLabel26)
                    .addComponent(jLabel44)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(HBSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SFSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BKSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SHSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SHBSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SKSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SBSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel48))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel52)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel49)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel43)
                                    .addComponent(SKSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(SBSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(HBSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(SFSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(RSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SHSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SHBSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(DSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BKSAtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel46)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SURFACE AREAS", jPanel6);

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N

        jLabel54.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel54.setText("RUDDER :");

        jLabel55.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel55.setText("SHAFT :");

        jLabel56.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel56.setText("S. BRACKET :");

        jLabel57.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel57.setText("SKEG :");

        jLabel58.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel58.setText("ST. BOSS :");

        jLabel59.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel59.setText("HU. BOSS :");

        jLabel60.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel60.setText("STAB. FINS :");

        jLabel61.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel61.setText("DOME :");

        jLabel62.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel62.setText("B. KEEL :");

        SHBSAK2txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHBSAK2txtFieldActionPerformed(evt);
            }
        });

        SKSAK2txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SKSAK2txtFieldActionPerformed(evt);
            }
        });

        SBSAK2txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBSAK2txtFieldActionPerformed(evt);
            }
        });

        HBSAK2txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HBSAK2txtFieldActionPerformed(evt);
            }
        });

        SFSAK2txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SFSAK2txtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RSAK2txtField)
                    .addComponent(SHSAK2txtField)
                    .addComponent(SHBSAK2txtField)
                    .addComponent(SKSAK2txtField)
                    .addComponent(SBSAK2txtField)
                    .addComponent(HBSAK2txtField)
                    .addComponent(SFSAK2txtField)
                    .addComponent(DSAK2txtField)
                    .addComponent(BKSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(RSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SHSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SHBSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57)
                    .addComponent(SKSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(SBSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HBSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SFSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(DSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(BKSAK2txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(1+K2) VALUES", jPanel10);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OUTPUTS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N

        RTresult.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N

        EFPOWresult.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N

        DELIPOWresult.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        DELIPOWresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELIPOWresultActionPerformed(evt);
            }
        });

        SHAFTPOWresult.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N

        BRAKEPOWresult.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        BRAKEPOWresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRAKEPOWresultActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel27.setText("TOTAL RESISTANCE :");

        jLabel28.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel28.setText("KN");

        jLabel29.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel29.setText("EFFECTIVE POWER :");

        jLabel30.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel30.setText("DELIVERED POWER :");

        jLabel31.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel31.setText("SHAFT POWER :");

        jLabel32.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel32.setText("BRAKE POWER :");

        jLabel33.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel33.setText("KW");

        jLabel34.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel34.setText("KW");

        jLabel35.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel35.setText("KW");

        jLabel36.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel36.setText("KW");

        CALCall.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        CALCall.setText("CALCULATE");
        CALCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCallActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel38.setText("DISPLACEMENT :");

        DISTresult.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N

        jLabel39.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel39.setText("M.TON");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel38))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(EFPOWresult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel33))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(RTresult)
                                            .addComponent(DISTresult, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel39)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel31))
                                            .addComponent(jLabel30))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(SHAFTPOWresult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel35))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(DELIPOWresult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel34))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(40, 40, 40)
                                        .addComponent(BRAKEPOWresult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel36)))
                                .addGap(36, 36, 36))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(CALCall)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(jLabel39))
                    .addComponent(DISTresult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RTresult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(EFPOWresult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DELIPOWresult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SHAFTPOWresult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(BRAKEPOWresult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(CALCall)
                .addGap(35, 35, 35))
        );

        jTabbedPane2.addTab("RESSISTANCE & POWER", jPanel5);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 20))); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(458, 315));

        jTabbedPane3.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel13);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTabbedPane3.addTab("SPEED VS RESISTANCE GRAPH", jPanel12);

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "SPEED (M/S)", "RESISTANCE (KN)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("SPEED VS RESISTANCE DATA", jPanel11);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("SPEED VS RESISTANCE DATA & GRAPH", jPanel7);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(BACKbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RELOADbutton))
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CLEARbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EXITbutton))
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BACKbutton)
                    .addComponent(RELOADbutton)
                    .addComponent(CLEARbutton)
                    .addComponent(EXITbutton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1288, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LWLtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LWLtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LWLtxtFieldActionPerformed

    private void BtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtxtFieldActionPerformed

    private void VtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VtxtFieldActionPerformed

    private void DtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DtxtFieldActionPerformed

    private void CMtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMtxtFieldActionPerformed

    private void SHBSAK2txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHBSAK2txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SHBSAK2txtFieldActionPerformed

    private void SKSAK2txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKSAK2txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SKSAK2txtFieldActionPerformed

    private void SBSAK2txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBSAK2txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SBSAK2txtFieldActionPerformed

    private void HBSAK2txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HBSAK2txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HBSAK2txtFieldActionPerformed

    private void SFSAK2txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SFSAK2txtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SFSAK2txtFieldActionPerformed

    private void LCBtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LCBtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LCBtxtFieldActionPerformed

    private void EXITbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EXITbuttonActionPerformed

    private void BACKbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKbuttonActionPerformed

        Close(); //Exit Program
  
        SelectMethod SM = new SelectMethod();

        SM.setVisible(true);
        

// TODO add your handling code here:
    }//GEN-LAST:event_BACKbuttonActionPerformed

    private void RELOADbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RELOADbuttonActionPerformed
  
        Close();
        
        HoltropMennenMethod HMM = new HoltropMennenMethod();
        
        HMM.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_RELOADbuttonActionPerformed

    private void HBtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HBtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HBtxtFieldActionPerformed

    private void TFtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFtxtFieldActionPerformed

    private void ATtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ATtxtFieldActionPerformed

    private void CALCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCallActionPerformed

        
        // ---------------------------------- Variable Declaration ---------------------------------- \\

        double RHO, V, S, CF, L, T, B, CB, VDIS, DIST, CM, CW, g, ABT, RF, RN, NU, C14, CP, LCB,

        CSTERN, LR, RSA, SBSA, SKSA, SHBSA, HBSA, SHSA, SFSA, DSA, BKSA, SUMSAPP, RSAK2, SBSAK2,

        SKSAK2, SHBSAK2, HBSAK2, SHSAK2, SFSAK2, DSAK2, BKSAK2, K2EQ, M1, M2, M3, M4, M5, M6, M7,

        M8, M9, SUMK2SAPP, FN, IE, C1, C2, C3, C5, C7, C15, C16, C17, m1, m3, m4, TF, HB,

        LAMDA, AT, PB, FNI, FNT, C6, CA, C4, EP, QPC, DP, TE, ME, SP, BP,

        RT, K1, RAPP, RBT, TD, CBTO, RW0P4, RW0P5, RW, RB, RTR, RA; 
        
        // ---------------------------------- Variable Declaration Ends ---------------------------------- \\
        
        
         // ---------------------------------- Values For Graph ---------------------------------- \\
         
         Double[] VG = {5.0,10.0,15.0,20.0,25.0,30.0,35.0,40.0,50.0};
         
         DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
         
         // ---------------------------------- Values For Graph End ---------------------------------- \\
         
        
        // ---------------------------------- Table Data ---------------------------------- \\
         
         String col[] = {"Speed","Resistance"};
         
         DefaultTableModel model =new DefaultTableModel(null,col);
         
         jTable1.setModel(model);
         
         // ---------------------------------- Table Data Ends ---------------------------------- \\
        
        
        try{
            
            
        // ---------------------------------- Input Data ---------------------------------- \\
        
        RHO = Double.parseDouble(RHOtxtField.getText());                // Density of Sea Water or Fresh Water

        V = Double.parseDouble (VtxtField.getText());                   // Speed of Ship

        L = Double.parseDouble (LWLtxtField.getText());                 // Lenght on Water Line of Ship

        B = Double.parseDouble(BtxtField.getText());                    // Breadth of Ship

        T = Double.parseDouble (DtxtField.getText());                   // Draught of Ship

        CB = Double.parseDouble(CBtxtField.getText());                  // Block Coefficient

        CM = Double.parseDouble(CMtxtField.getText());                  // MidShip Area Coefficient

        CW = Double.parseDouble(CWtxtField.getText());                  // Water Plane Area Coefficient

        ABT = Double.parseDouble(ABTtxtField.getText());                // Transverse Sectional Area of the Bulb

        NU = Double.parseDouble(NUtxtField.getText());                  // Kinematic Viscosity of Water

        LCB = Double.parseDouble(LCBtxtField.getText());                // Longitudinal Centre of Buoyancy in %

        CSTERN = Double.parseDouble(CSTERNtxtField.getText());          // Stern Shape Coefficient

        TD = Double.parseDouble(TDtxtField.getText());                  // Thruster Tunnel Diameter

        CBTO = Double.parseDouble(CBTOtxtField.getText());              // Bow Thruster Tunnel Opening Coefficient

        RSA = Double.parseDouble(RSAtxtField.getText());                // Rudder Surface Area

        SHSA = Double.parseDouble(SHSAtxtField.getText());              // Shaft Surface Area

        SHBSA = Double.parseDouble(SHBSAtxtField.getText());            // Shaft Bracket Surface Area

        SKSA = Double.parseDouble(SKSAtxtField.getText());              // Skeg Surface Area

        SBSA = Double.parseDouble(SBSAtxtField.getText());              // Strut Bossings Surface Area

        HBSA = Double.parseDouble(HBSAtxtField.getText());              // Hull Bossings Surface Area

        SFSA = Double.parseDouble(SFSAtxtField.getText());              // Stabilizer Fins Surface Area

        DSA  = Double.parseDouble(DSAtxtField.getText());               // Dome Surface Area

        BKSA = Double.parseDouble(BKSAtxtField.getText());              // Bilge Keel Surface Area

        RSAK2 = Double.parseDouble(RSAK2txtField.getText());            // (1+K2) of Rudder

        SHSAK2 = Double.parseDouble(SHSAK2txtField.getText());          // (1+K2)of Shaft

        SHBSAK2 = Double.parseDouble(SHBSAK2txtField.getText());        // (1+K2)of Shaft Bracket

        SKSAK2 = Double.parseDouble(SKSAK2txtField.getText());          // (1+K2)of Skeg

        SBSAK2 = Double.parseDouble(SBSAK2txtField.getText());          // (1+K2)of Strut Bossings

        HBSAK2 = Double.parseDouble(HBSAK2txtField.getText());          // (1+K2)of Hull Bossings

        SFSAK2 = Double.parseDouble(SFSAK2txtField.getText());          // (1+K2)of Stabilizer Fins

        DSAK2 = Double.parseDouble(DSAK2txtField.getText());            // (1+K2)of Dome

        BKSAK2 = Double.parseDouble(BKSAK2txtField.getText());           // (1+K2)of Bilge Keel

        TF = Double.parseDouble(TFtxtField.getText());                   // Draught at Forward of Ship

        HB = Double.parseDouble(HBtxtField.getText());                  // Centre of Area of ABT above the Keel

        AT = Double.parseDouble(ATtxtField.getText());                  // Immersed Area of Transom at Rest
        
        // ---------------------------------- Input Data Ends ---------------------------------- \\
        
        
        // ---------------------------------- Calculation Iteration For Graph ---------------------------------- \\
        
        for(int i = 0; i <= VG.length;i++)
        {
            
            if(i > 0)
                
            {
                V = VG [i-1];
            }
            
        // ---------------------------------- Calculation Iteration For Graph Ends ---------------------------------- \\
            
        
        // ---------------------------------- Formulae For Total Resistance Paramenters Start ---------------------------------- \\

        CP = (CB / CM);                                                 // Prismitic Coefficient

        VDIS = (L * B * T * CB);                                        // Volume of Displacement of Ship in Cubic Meter

        DIST = (L * B * T * CB * RHO);                                  // Displacement of Ship in Metric Ton

        g = 9.81;                                                       // Gravitational Acceleration    
        
        RN = (RHO * V * L) / NU;                                        // Reynold's Number

        CF = 0.075 / (Math.pow((Math.log10(RN) - 2),2));                // Frictional Coefficient
        
        PB = (0.56 * Math.sqrt(ABT)) / (TF - (1.5 * HB));               // Measure of the Emergence of the Bow
        
        SUMSAPP = (RSA + SHSA + SHBSA + SKSA + SBSA + HBSA + SFSA + DSA + BKSA);                    // Total Wetted Surface Area of Appendages

        FNI = V / (Math.sqrt(((g * (TF - HB - (0.25 * (Math.sqrt(ABT))))) + (0.15 * (V * V)))));    // Froude Number Based on the Immersion

        FNT = V / (Math.sqrt(((2 * g * AT)/(B + (B * CW)))));           // Froude Number Based on the Transom Immersion

        M1 = RSA * RSAK2;                                               // Rudder Surafce Area * (1+K2) of Rudder

        M2 = SHSA * SHSAK2;                                             // Shaft Surface Area * (1+K2)of Shaft

        M3 = SHBSA * SHBSAK2;                                           // Shaft Bracket Surface Area * (1+K2)of Shaft Bracket

        M4 = SKSA * SKSAK2;                                             // Skeg Surface Area * (1+K2)of Skeg

        M5 = SBSA * SBSAK2;                                             // Strut Bossings Surface Area * (1+K2)of Strut Bossings

        M6 = HBSA * HBSAK2;                                             // Hull Bossings Surface Area * (1+K2)of Hull Bossings

        M7 = SFSA * SFSAK2;                                             // Stabilizer Fins Surface Area * (1+K2)of Stabilizer Fins

        M8 = DSA * DSAK2;                                               // Dome Surface Area * (1+K2)of Dome

        M9 = BKSA * BKSAK2;                                             // Bilge Keel Surface Area * (1+K2)of Bilge Keel

        SUMK2SAPP = (M1 + M2 + M3 + M4 + M5 + M6 + M7 + M8 + M9);       // Total Surface Area * (1+K2)

        K2EQ = (SUMK2SAPP / SUMSAPP);                                   // Equivalent (1+K2)value

        FN = (V / (Math.sqrt(g * L)));                                  // Froude Number      
        

        // ---------------------------------- LAMDA Selection Starts ---------------------------------- \\

        if ((L / B ) < 12)

        {
            LAMDA = (1.446 * CP) - (0.03 * (L / B));
        }

        else {

            LAMDA = (1.446 * CP) - 0.36;}
        
        // ---------------------------------- LAMDA Selection Ends ---------------------------------- \\
  

        // ---------------------------------- C7 Selection Starts ---------------------------------- \\

        if ((B / L) < 0.11)

        {
            C7 = 0.229577 * (Math.pow((B / L),0.33333));
        }

        else if ((B / L) > 0.11 && (B / L) < 0.25)

        {
            C7 = (B / L);
        }

        else {

            C7 = 0.5 - ((0.0625 * L) / B);}
        
        // ---------------------------------- C7 Selection Ends ---------------------------------- \\
        
        

        LR = (1 - CP + ((0.06 * CP * LCB) / (4 * CP - 1))) * L;                                     // Length of the Run

        IE = 1 + (89 * (Math.exp((-(Math.pow((L / B),0.80856))) * (Math.pow((1 - CW),0.30484))

            * (Math.pow((1 - CP - (0.0225 * LCB)),0.6367)) * (Math.pow((LR / B),0.34574))

            * (Math.pow(((100 * VDIS) / (L * L * L)),0.16302)))));                                  // Half Angle of Entrance of the Waterline at the Fore End

        C3 = (0.56 * (Math.pow(ABT,1.5))) / ((B * T) * ((0.31 * (Math.sqrt(ABT))) + TF - HB));

        C1 = 2223105 * (Math.pow(C7,3.78613)) * (Math.pow((T / B),1.07961)) * (Math.pow((90 - IE),-1.37565));

        C2 = Math.exp((- 1.89 * (Math.sqrt(C3))));

        C5 = 1 - ((0.8 * AT) / (B * T * CM));

        
        // ---------------------------------- C4 Selection Starts ---------------------------------- \\

        if ((TF / L) <= 0.04)

        {
        C4 = (TF / L);
        }

        else {

        C4 = 0.04;}

        // ---------------------------------- C4 Selection Ends ---------------------------------- \\
        

        CA = (0.006 * (Math.pow((L + 100),-0.16))) - 0.00205 + (0.003 * (Math.sqrt(L / 7.5)) * (Math.pow(CB,4)) * C2 * (0.04 - C4));
        

        // ---------------------------------- C15 Starts Here ---------------------------------- \\

        if (((L * L * L) / VDIS) < 512 )

        {
            C15 = - 1.69385;
        }

        else if (((L * L * L) / VDIS) > 512 && ((L * L * L) / VDIS) < 1726.91)

        {
            C15 = - 1.69385 + (((L / (Math.pow(VDIS,(1 / 3))))- 8) / 2.36);
        }

        else {

            C15 = 0;
        }

        // ---------------------------------- C15 Selection Ends ---------------------------------- \\
        

        // ---------------------------------- C16 Selection Starts ---------------------------------- \\

        if (CP < 0.8)

        {
            C16 = (8.07981 * CP) - (13.8673 * CP * CP) + (6.984388 * CP * CP * CP);
        }

        else {

            C16 = 1.73014 - (0.7067 * CP);}

        // ---------------------------------- C16 Selection Ends ---------------------------------- \\
        

        // ---------------------------------- C6 Selection Starts ---------------------------------- \\

        if (FNT >= 5)

        {
            C6 = 0;
        }

        else {

            C6 = 0.2 * ( 1 - (0.2 * FNT));}

        // ---------------------------------- C6 Selection Ends ---------------------------------- \\
        

        C17 = 6919.3 * (Math.pow(CM,-1.3346)) * (Math.pow((VDIS / (L * L * L)),2.00977)) * (Math.pow(((L / B )- 2),1.40692));

        m1 = (0.0140407 * (L / T)) - ((1.75254 * (Math.pow(VDIS,(1/3)))) / L) - (4.79323 * (B / L)) - C16;

        m3 = (- 7.2035) * (Math.pow((B / L),0.326869)) * (Math.pow((T / B),0.605375));

        m4 = C15 * 0.4 * (Math.exp(((- 0.034) * (Math.pow(FN,-3.29)))));

        RW0P4 = C1 * C2 * C5 * VDIS * RHO * g * (Math.exp(( m1 * (Math.pow(0.4,-0.90))) + (m4 * (Math.cos((LAMDA * (Math.pow(0.4,-2))))))));

        RW0P5 = C17 * C2 * C5 * VDIS * RHO * g * (Math.exp(( m3 * (Math.pow(0.55,-0.90))) + (m4 * (Math.cos((LAMDA * (Math.pow(0.55,-2))))))));

        S = L *(2 * T + B) * ((Math.sqrt(CM)) * (0.453 + (0.4425 * CB)

            - (0.2862 * CM) - (0.003467 * (B / T)) + (0.3696 * CW)))

        + (2.38 * (ABT / CB));                                                  // Wetted Surface Area of Ship Hull

        C14 = 1 + (0.011 * CSTERN);

        RBT = RHO * (V * V) * 3.1416 * (TD * TD) * CBTO;                        // Resistance of Bow Thruster Tunnel Openings
        

        RF = 0.5 * RHO * (V * V) * S * CF;

        K1 = 0.93 + (0.487118 * C14 * (Math.pow((B / L),1.06806)) * (Math.pow((T / L),0.46106))

            * (Math.pow((L / LR),0.121563)) * (Math.pow(((L * L * L) / VDIS),0.36486))

            * (Math.pow((1 - CP),-0.604247)));

        RAPP = (0.5 * RHO * (V * V) * SUMSAPP * K2EQ * CF) + RBT;
        

        // ---------------------------------- RW Selection Starts ---------------------------------- \\

        if (FN < 0.40)

        {
            RW = C1 * C2 * C5 * VDIS * RHO * g * (Math.exp(((m1 * Math.pow(FN,-0.9)) + (m4 * (Math.cos((LAMDA * (Math.pow(FN,-2)))))))));
        }

        else if (FN > 0.40 && FN < 0.55)

        {
            RW = RW0P4 + ((((10 * FN) - 4) * (RW0P5 - RW0P4)) / 1.5);
        }

        else {

            RW = C17 * C2 * C5 * VDIS * RHO * g * (Math.exp(( m3 * (Math.pow(FN,-0.9))) + (m4 * (Math.cos((LAMDA * (Math.pow(FN,-2))))))));}
        
        // ---------------------------------- RW Selection Ends ---------------------------------- \\
        

        RB = (0.11 * (Math.exp((- 3) * (Math.pow(PB,-2)))) * (FNI * FNI * FNI) * ((Math.pow(ABT,1.5)) * RHO * g)) / (1 + (FNI * FNI));

        RTR = 0.5 * RHO * (V * V) * AT * C6;

        RA = 0.5 * RHO * S * (V * V) * CA;
        
        // ---------------------------------- Formulae For Total Resistance Paramenters End ---------------------------------- \\

        
        // ---------------------------------- Total Resistance ---------------------------------- \\

        RT = (RF * K1) + RAPP + RW + RB + RTR + RA;

        /*

        RT =    Total Resistance

        RF =    Frictional Resistance

        K1 =    Form Factor (1+K1)

        RAPP =  Resistance of Appendages

        RW =    Wave Making & Wave Breaking Resistance

        RB =    Additional Pressure Resistance of Bulbous Bow Near the Water Surface

        RTR =   Additional Pressure Resistance of Immerged Transom Stern

        RA =    Model Ship Correlation Resistance

        */
        
        // ---------------------------------- Total Resistance Ends ---------------------------------- \\
        
        
        // ---------------------------------- Propulsive Factors ---------------------------------- \\
        
        QPC = 0.6;                                          // Quasi Propulsive Coefficient
        
        TE = 0.985;                                         // Transmission Efficieny
        
        ME = 0.98;                                          // Mechanical Efficiency 
        
        EP = RT * V;                                        // Effective Power
        
        DP = EP / QPC;                                      // Delivered Power
        
        SP = DP / TE;                                       // Shaft Power
        
        BP = SP / ME;                                       // Brake Power
        
        // ---------------------------------- Propulsive Factors End ---------------------------------- \\
        
        
        if(i==0)
            
        {
            
        // ---------------------------------- Show Results ---------------------------------- \\
            
            DISTresult.setText(String.valueOf(DIST));
            
            RTresult.setText (String.valueOf(RT));

            EFPOWresult.setText(String.valueOf(EP));
            
            DELIPOWresult.setText(String.valueOf(DP));
            
            SHAFTPOWresult.setText(String.valueOf(SP));
            
            BRAKEPOWresult.setText(String.valueOf(BP));
            
        // ---------------------------------- Results End ---------------------------------- \\
            
        }

        
        // ---------------------------------- Line Chart Plot Starts ---------------------------------- \\
        
        dataset.addValue( RT , "resistance" , String.valueOf(V) );
        
        model.insertRow(i,new Object[]{String.valueOf(V),String.valueOf(RT)});
        
        }
        
        jPanel13.removeAll();
        jPanel13.revalidate();                
        
        JFreeChart lineChart = ChartFactory.createBarChart3D(
                
         "Speed Vs Resistance",
                
         "Speed","Resistance",
         
         dataset,
         
         PlotOrientation.VERTICAL,
         
         true,true,false);
        
        ChartPanel chartPanel = new ChartPanel( lineChart );
        
        chartPanel.setPreferredSize( new java.awt.Dimension( 500 , 325 ) );
        
        jPanel13.setLayout(new java.awt.BorderLayout());
        
        jPanel13.add(chartPanel,BorderLayout.CENTER);
        jPanel13.repaint();
         
        }
        
        // ---------------------------------- Line Chart Plot Ends ---------------------------------- \\
        
        
        
        catch(Exception ex)
            
        {
            JOptionPane.showMessageDialog(this, "Please Enter All Data Accurately");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_CALCallActionPerformed

    private void BRAKEPOWresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRAKEPOWresultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRAKEPOWresultActionPerformed

    private void DELIPOWresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELIPOWresultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELIPOWresultActionPerformed

    private void CBTOtxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTOtxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTOtxtFieldActionPerformed

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
            java.util.logging.Logger.getLogger(HoltropMennenMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoltropMennenMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoltropMennenMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoltropMennenMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoltropMennenMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ABTtxtField;
    private javax.swing.JTextField ATtxtField;
    private javax.swing.JButton BACKbutton;
    private javax.swing.JTextField BKSAK2txtField;
    private javax.swing.JTextField BKSAtxtField;
    private javax.swing.JTextField BRAKEPOWresult;
    private javax.swing.JTextField BtxtField;
    private javax.swing.JButton CALCall;
    private javax.swing.JTextField CBTOtxtField;
    private javax.swing.JTextField CBtxtField;
    private javax.swing.JButton CLEARbutton;
    private javax.swing.JTextField CMtxtField;
    private javax.swing.JTextField CSTERNtxtField;
    private javax.swing.JTextField CWtxtField;
    private javax.swing.JTextField DELIPOWresult;
    private javax.swing.JTextField DISTresult;
    private javax.swing.JTextField DSAK2txtField;
    private javax.swing.JTextField DSAtxtField;
    private javax.swing.JTextField DtxtField;
    private javax.swing.JTextField EFPOWresult;
    private javax.swing.JButton EXITbutton;
    private javax.swing.JTextField HBSAK2txtField;
    private javax.swing.JTextField HBSAtxtField;
    private javax.swing.JTextField HBtxtField;
    private javax.swing.JTextField LCBtxtField;
    private javax.swing.JTextField LWLtxtField;
    private javax.swing.JTextField NUtxtField;
    private javax.swing.JButton RELOADbutton;
    private javax.swing.JTextField RHOtxtField;
    private javax.swing.JTextField RSAK2txtField;
    private javax.swing.JTextField RSAtxtField;
    private javax.swing.JTextField RTresult;
    private javax.swing.JTextField SBSAK2txtField;
    private javax.swing.JTextField SBSAtxtField;
    private javax.swing.JTextField SFSAK2txtField;
    private javax.swing.JTextField SFSAtxtField;
    private javax.swing.JTextField SHAFTPOWresult;
    private javax.swing.JTextField SHBSAK2txtField;
    private javax.swing.JTextField SHBSAtxtField;
    private javax.swing.JTextField SHSAK2txtField;
    private javax.swing.JTextField SHSAtxtField;
    private javax.swing.JTextField SKSAK2txtField;
    private javax.swing.JTextField SKSAtxtField;
    private javax.swing.JTextField TDtxtField;
    private javax.swing.JTextField TFtxtField;
    private javax.swing.JTextField VtxtField;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

private void Close() {
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }
}


