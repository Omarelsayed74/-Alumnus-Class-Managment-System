/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author h.d
 */
public class setQuestions extends javax.swing.JFrame {

    /**
     * Creates new form Set_Questions
     */
    public setQuestions() {
        initComponents();
        counter = 0;
    }
    static int counter;
    Connection c = dbms.Dbms.DBcon();
    PreparedStatement st = null;// to insert and apdate on the database.(Updates)
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QStatmentTextArea = new javax.swing.JTextArea();
        O1TextField = new javax.swing.JTextField();
        O2TextField = new javax.swing.JTextField();
        O3TextField = new javax.swing.JTextField();
        O4TextField = new javax.swing.JTextField();
        CATextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(17, 17, 17));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/output-onlinepngtools.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel1.setText("Question 1");

        QStatmentTextArea.setColumns(20);
        QStatmentTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        QStatmentTextArea.setRows(5);
        jScrollPane1.setViewportView(QStatmentTextArea);

        O1TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        O2TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        O3TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        O3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O3TextFieldActionPerformed(evt);
            }
        });

        O4TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        O4TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O4TextFieldActionPerformed(evt);
            }
        });

        CATextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CATextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel2.setText("Option 1");

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel3.setText("Option 2");

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel4.setText("Option 3");

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel5.setText("Option 4");

        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel6.setText("Correct answer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(O1TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(O2TextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(O3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(O4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(O1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(O2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(O3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(O4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CATextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void O3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_O3TextFieldActionPerformed

    private void CATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CATextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CATextFieldActionPerformed

    private void O4TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O4TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_O4TextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(counter == makeQuiz.QuesNo - 2){
            jButton1.setText("Create");
        }
        if(counter < makeQuiz.QuesNo - 1){
            submit(makeQuiz.QuesNo, makeQuiz.qid);
            counter++;
        }
        else{
            JOptionPane.showMessageDialog(this, "Quiz created Successfully!");
            makeQuiz.SQU.setVisible(false);
            roomManage.mq.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void submit(int numberOfQuestion, String qid){
        System.out.println(numberOfQuestion);
        System.out.println("qid = "+qid);

            String QS = QStatmentTextArea.getText();
            String O1 = O1TextField.getText();
            String O2 = O2TextField.getText();
            String O3 = O3TextField.getText();
            String O4 = O4TextField.getText();
            String CA = CATextField.getText(); 
            System.out.println(CA);
            String Quiz_id = qid;
            try{
                Integer.parseInt(CA);
                System.out.println("CA = " + CA);
            }catch(Exception ex){
                System.out.println(ex);
//                JOptionPane.showMessageDialog(this, "The Correct answer field is not valid");
                return;
            }
            if(Integer.parseInt(CA) < 1 || Integer.parseInt(CA) > 4){
//                JOptionPane.showMessageDialog(this, "The Correct answer field is not valid");
                return;
            }
            try{
                st = c.prepareStatement("INSERT INTO QUESTIONS (qid, statement, option1, option2, option3, option4, coi) VALUES (?,?,?,?,?,?,CAST(? AS INT))");
                st.setString(1, Quiz_id);
                st.setString(2, QS);
                st.setString(3, O1);
                st.setString(4, O2);
                st.setString(5, O3);
                st.setString(6, O4);
                st.setString(7, CA);
                st.executeUpdate();
            }catch(SQLException ex){
                System.out.println(ex);
                JOptionPane.showConfirmDialog(this, "ERORR");
            }
            
            jLabel1.setText("Question " + (counter+2));
            ClearFields();
    }
    private void ClearFields(){
        O1TextField.setText("");
        O2TextField.setText("");
        O3TextField.setText("");
        O4TextField.setText("");
        CATextField.setText("");
        QStatmentTextArea.setText("");
    }
    private boolean isFieldFilled(){
        System.out.println("Q SSSSSSS = "+QStatmentTextArea.getText() == "");
//        System.out.println("Q QQQQQQQ = "+QStatmentTextArea.getText().equals(""));
        if(QStatmentTextArea.getText().equals(""))
            return false;
        else if(O1TextField.getText() == "")
            return false;
        else if(O2TextField.getText() == "")
            return false;
        else if(O3TextField.getText() == "")
            return false;
        else if(O4TextField.getText() == "")
            return false;
        else if(CATextField.getText() == "")
            return false;
        else
            return true;
    }
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
            java.util.logging.Logger.getLogger(setQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CATextField;
    private javax.swing.JTextField O1TextField;
    private javax.swing.JTextField O2TextField;
    private javax.swing.JTextField O3TextField;
    private javax.swing.JTextField O4TextField;
    private javax.swing.JTextArea QStatmentTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
