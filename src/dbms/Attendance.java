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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author omare
 */
public class Attendance extends javax.swing.JFrame {

    /**
     * Creates new form Attendance
     */
    
    Connection c = dbms.Dbms.DBcon();
    PreparedStatement st = null;
    ResultSet rs;
 

    public Attendance() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jt1.getModel();
        model.setRowCount(0);
    }
    
    

    
        
    public static void exportToCSV(JTable table, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            TableModel model = table.getModel();
            int rowCount = model.getRowCount();
            int columnCount = model.getColumnCount();

            // Write column headers
            for (int column = 0; column < columnCount; column++) {
                writer.append(model.getColumnName(column));
                if (column < columnCount - 1) {
                    writer.append(',');
                }
            }
            writer.append('\n');

            // Write table data
            for (int row = 0; row < rowCount; row++) {
                for (int column = 0; column < columnCount; column++) {
                    Object value = model.getValueAt(row, column);
                    writer.append(value.toString());
                    if (column < columnCount - 1) {
                        writer.append(',');
                    }
                }
                writer.append('\n');
            }

            System.out.println("Table data exported to CSV successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        roomName = new javax.swing.JLabel();
        jj1 = new javax.swing.JPanel();
        DispNames = new javax.swing.JButton();
        DownAttend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 17));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        roomName.setFont(new java.awt.Font("OCR A Std", 0, 36)); // NOI18N
        roomName.setText("Attendance List");

        DispNames.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        DispNames.setForeground(new java.awt.Color(17, 17, 17));
        DispNames.setText("Refresh");
        DispNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DispNamesActionPerformed(evt);
            }
        });
        DispNames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DispNamesKeyPressed(evt);
            }
        });

        DownAttend.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        DownAttend.setForeground(new java.awt.Color(17, 17, 17));
        DownAttend.setText("Download as CSV");
        DownAttend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownAttendActionPerformed(evt);
            }
        });
        DownAttend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DownAttendKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jj1Layout = new javax.swing.GroupLayout(jj1);
        jj1.setLayout(jj1Layout);
        jj1Layout.setHorizontalGroup(
            jj1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jj1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jj1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DownAttend, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DispNames, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jj1Layout.setVerticalGroup(
            jj1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jj1Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(DispNames, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DownAttend, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jt1.setAutoCreateRowSorter(true);
        jt1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Student Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(roomName, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomName)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DownAttendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownAttendActionPerformed
        exportToCSV(jt1, "output.csv");     
        JOptionPane.showMessageDialog(null, "Done Successfully");
    }//GEN-LAST:event_DownAttendActionPerformed

    private void DownAttendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DownAttendKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DownAttendKeyPressed
    
    private void DispNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DispNamesActionPerformed
        DefaultTableModel model = (DefaultTableModel) jt1.getModel();
        model.setRowCount(0);
        try {
            st = c.prepareStatement("SELECT * FROM attend_session as a, users as u WHERE (a.attendant = u.username) and sid = ?");
            st.setString(1, Dbms.currentSession.getSession());
            System.out.println(Dbms.currentSession.getSession());
            rs = st.executeQuery();
            while(rs.next()){               
                String attendant = rs.getString("firstName")+" "+rs.getString("lastName");
                System.out.println(attendant); 
                Object att =attendant;
                Object[] row = { att };
                model.addRow(row);
            };
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_DispNamesActionPerformed

    private void DispNamesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DispNamesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DispNamesKeyPressed

    /**
     * @param args the command line arguments
     */
        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }
    
    

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DispNames;
    private javax.swing.JButton DownAttend;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jj1;
    private javax.swing.JTable jt1;
    private javax.swing.JLabel roomName;
    // End of variables declaration//GEN-END:variables
}
