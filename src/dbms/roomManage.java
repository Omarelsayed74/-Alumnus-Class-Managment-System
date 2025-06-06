/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbms;

import static dbms.roomDiscover.tq;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.* ;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Yaseen
 */
public class roomManage extends javax.swing.JFrame {

    /**
     * Creates new form roomManage
     */
    
    Connection c = dbms.Dbms.DBcon();
    PreparedStatement st = null;
    ResultSet rs;
    
    public static Attendance at = new Attendance();
    public static CreateNew cn = new CreateNew();
    public static makeQuiz mq = new makeQuiz();
    public static showMessage sm = new showMessage();
    public static showGrades sg = new showGrades();
    public roomManage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CreateSession = new javax.swing.JButton();
        AddAdmin = new javax.swing.JButton();
        CreateNews = new javax.swing.JButton();
        roomName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 17));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/output-onlinepngtools.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CreateSession.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        CreateSession.setForeground(new java.awt.Color(17, 17, 17));
        CreateSession.setText("Create session");
        CreateSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateSessionActionPerformed(evt);
            }
        });
        CreateSession.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CreateSessionKeyPressed(evt);
            }
        });

        AddAdmin.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        AddAdmin.setForeground(new java.awt.Color(17, 17, 17));
        AddAdmin.setText("Add Admin");
        AddAdmin.setActionCommand("AddAdmin");
        AddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAdminActionPerformed(evt);
            }
        });
        AddAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AddAdminKeyPressed(evt);
            }
        });

        CreateNews.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        CreateNews.setForeground(new java.awt.Color(17, 17, 17));
        CreateNews.setText("Create News");
        CreateNews.setActionCommand("AddAdmin");
        CreateNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewsActionPerformed(evt);
            }
        });
        CreateNews.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CreateNewsKeyPressed(evt);
            }
        });

        roomName.setFont(new java.awt.Font("OCR A Std", 0, 36)); // NOI18N
        roomName.setText("Room");

        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jButton1.setText("Create Quiz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jButton2.setText("Show Messages");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jButton3.setText("Grades");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roomName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 201, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CreateSession, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(AddAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CreateNews, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(198, 198, 198))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roomName)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateSession, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateNews, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String RC() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int length = 10;
        while (sb.length() < length) {
            int index = (int) (random.nextFloat() * chars.length());
            char c = chars.charAt(index);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        String randomChars = sb.toString();
        return randomChars ;
    }
    private void CreateSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateSessionActionPerformed
        String x = RC();
        String[] options = {"Yes", "No"};
        int choice = JOptionPane.showOptionDialog(null, "Session ID : " + x, "Share Session ID ?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);    
        try {
            st = c.prepareStatement("INSERT INTO SESSION (sid, admin, rid) VALUES (?,?,?)");
            st.setString(1, x);
            st.setString(2, Dbms.userData.getUser());
            st.setString(3, Dbms.currentRoom.getRoom());
            st.executeUpdate();
            Dbms.currentSession.setSession(x);
            String share = "Join our ACMS Session!\nSession Code : "+x;
            if (choice == JOptionPane.OK_OPTION) {
                try {
                    String url = "https://wa.me/?text=" + URLEncoder.encode(share, "UTF-8");
                    Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(this, "Shared successfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        at.setVisible(true);
    }//GEN-LAST:event_CreateSessionActionPerformed

    private void CreateSessionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateSessionKeyPressed

    }//GEN-LAST:event_CreateSessionKeyPressed

    private void AddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAdminActionPerformed
        String Username = JOptionPane.showInputDialog(null, "Enter username", "Add Admin", JOptionPane.QUESTION_MESSAGE);
        try {
            st = c.prepareStatement("INSERT INTO ROOM_ADMINS (rid , uun , role) VALUES (? , ? , ?)");
            st.setString(1, Dbms.currentRoom.getRoom());
            st.setString(2, Username);
            st.setString(3, "Admin");
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added successfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_AddAdminActionPerformed

    private void AddAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddAdminKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAdminKeyPressed

    private void CreateNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewsActionPerformed
        cn.setVisible(true);
    }//GEN-LAST:event_CreateNewsActionPerformed

    private void CreateNewsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateNewsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewsKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mq.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sm.refresh();
        sm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JComboBox<String> comboBox = new JComboBox<>();
        ArrayList<String> ou = new ArrayList();
        try{
            st = c.prepareStatement("SELECT * FROM quiz WHERE rid = (?) ORDER BY creationDate DESC");
            st.setString(1, Dbms.currentRoom.getRoom());
            rs = st.executeQuery();        
            while(rs.next()){
                ou.add(rs.getString("qid"));
                comboBox.addItem(rs.getString("title"));
            }
        }catch(SQLException exc){
            System.out.println(exc);
        }
        // Set the OCR font
        Font ocrFont = new Font("OCR A Extended", Font.PLAIN, 18);
        comboBox.setFont(ocrFont);

        JPanel panel = new JPanel();
        JLabel aslabel = new JLabel("Select a Quiz to show grades : ");
        aslabel.setFont(ocrFont);
        panel.add(aslabel);
        panel.add(comboBox);
        panel.setFont(ocrFont);

        int result = JOptionPane.showOptionDialog(null, panel, "Available Quizzes",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

        if (result == JOptionPane.OK_OPTION) {
            int selectedOption = comboBox.getSelectedIndex();
            sg.qid = ou.get(selectedOption);
            sg.qn.setText((String)comboBox.getSelectedItem());
            sg.refresh();
            sg.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(roomManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roomManage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton AddAdmin;
    private javax.swing.JButton CreateNews;
    private javax.swing.JButton CreateSession;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel roomName;
    // End of variables declaration//GEN-END:variables
}
