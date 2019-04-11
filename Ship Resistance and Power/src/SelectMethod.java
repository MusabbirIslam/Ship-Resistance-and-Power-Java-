
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelectMethod extends javax.swing.JFrame {

    
    public SelectMethod() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Back2Btn = new javax.swing.JButton();
        Next2Btn = new javax.swing.JButton();
        CancelBtn2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        HoltropRadioBtn = new javax.swing.JRadioButton();
        ITTCRadioBtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PREVIEWER");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(208, 208, 254));
        jPanel1.setMinimumSize(new java.awt.Dimension(706, 303));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(62, 92, 130));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10), javax.swing.BorderFactory.createTitledBorder("")));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(209, 253, 209));
        jLabel1.setText("SELECT A METHOD");

        Back2Btn.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        Back2Btn.setText("Back");
        Back2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2BtnActionPerformed(evt);
            }
        });

        Next2Btn.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        Next2Btn.setText("Next");
        Next2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next2BtnActionPerformed(evt);
            }
        });

        CancelBtn2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        CancelBtn2.setText("Exit");
        CancelBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtn2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(208, 208, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10), javax.swing.BorderFactory.createTitledBorder("")));

        buttonGroup1.add(HoltropRadioBtn);
        HoltropRadioBtn.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        HoltropRadioBtn.setText("HOLTROP & MENNEN");
        HoltropRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoltropRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(ITTCRadioBtn);
        ITTCRadioBtn.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        ITTCRadioBtn.setText("ITTC 57 & ITTC 78");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ITTCRadioBtn)
                    .addComponent(HoltropRadioBtn))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HoltropRadioBtn)
                .addGap(18, 18, 18)
                .addComponent(ITTCRadioBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Back2Btn)
                        .addGap(226, 226, 226)
                        .addComponent(CancelBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Next2Btn))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(239, 239, 239))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back2Btn)
                    .addComponent(CancelBtn2)
                    .addComponent(Next2Btn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 35, 25);
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

        setSize(new java.awt.Dimension(813, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HoltropRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoltropRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoltropRadioBtnActionPerformed

    private void Back2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2BtnActionPerformed

        Close(); //Exit Program
SelectOption SOP = new SelectOption();
SOP.setVisible(true);



// TODO add your handling code here:
    }//GEN-LAST:event_Back2BtnActionPerformed

    private void Next2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next2BtnActionPerformed

   if (HoltropRadioBtn.isSelected()) { 
            
    Close();
    HoltropMennenMethod HMM = new HoltropMennenMethod();
         HMM.setVisible(true);}

        else if (ITTCRadioBtn.isSelected()) { 
            
    Close();
    ITTCMethod ITTCM = new ITTCMethod();
           ITTCM.setVisible(true);}
        
        
        else {
            JOptionPane.showMessageDialog(this, "<html> <b>PLEASE SELECT A METHOD!</b> </html>", "PREVIEWER ERROR", JOptionPane.ERROR_MESSAGE);
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_Next2BtnActionPerformed

    private void CancelBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtn2ActionPerformed

System.exit(0);

// TODO add your handling code here:
    }//GEN-LAST:event_CancelBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back2Btn;
    private javax.swing.JButton CancelBtn2;
    private javax.swing.JRadioButton HoltropRadioBtn;
    private javax.swing.JRadioButton ITTCRadioBtn;
    private javax.swing.JButton Next2Btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

private void Close() {
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }
}
