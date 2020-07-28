/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.view;


import model.Personal;
import util.database;
import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.Information;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Personal;

/**
 *
 * @author John Brix Pomoy
 */
public class PersonalInformation extends javax.swing.JFrame {

    /**
     * Creates new form SimpleCRUD
     */

    public PersonalInformation() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        //Onload Data
        arrangedDataInTable();
        
        
   
    }
    
    //mouse dragged
         int xMouse;
         int yMouse;
    
 
 public void arrangedDataInTable() {
        
        Information information = new Information();
        ArrayList<Personal> list = information.displayInformation();       
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];

        //arranged in specific row
        for (int x = 0; x < list.size(); x++) {
            row[0] = list.get(x).getId();
            row[1] = list.get(x).getFirstname();
            row[2] = list.get(x).getLastname();
            row[3] = list.get(x).getAge();
            row[4] = list.get(x).getGender();
            
            //Your model = table
            model.addRow(row);

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

        backround = new javax.swing.JPanel();
        iconified = new javax.swing.JLabel();
        systemExit = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new rojerusan.RSTableMetro();
        insert = new rojerusan.RSMaterialButtonRectangle();
        update = new rojerusan.RSMaterialButtonRectangle();
        delete = new rojerusan.RSMaterialButtonRectangle();
        Clear = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("John Brix Pomoy");
        setUndecorated(true);
        getContentPane().setLayout(null);

        backround.setBackground(new java.awt.Color(51, 51, 51));
        backround.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backroundMouseDragged(evt);
            }
        });
        backround.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backroundMousePressed(evt);
            }
        });
        backround.setLayout(null);

        iconified.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        iconified.setForeground(new java.awt.Color(255, 255, 255));
        iconified.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconified.setText("-");
        iconified.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconifiedMouseClicked(evt);
            }
        });
        backround.add(iconified);
        iconified.setBounds(850, 40, 30, 30);

        systemExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        systemExit.setForeground(new java.awt.Color(255, 255, 255));
        systemExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemExit.setText("X");
        systemExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                systemExitMouseClicked(evt);
            }
        });
        backround.add(systemExit);
        systemExit.setBounds(880, 40, 30, 30);

        age.setBackground(new java.awt.Color(51, 51, 51));
        age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        age.setOpaque(false);
        backround.add(age);
        age.setBounds(100, 260, 110, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");
        backround.add(jLabel2);
        jLabel2.setBounds(20, 180, 70, 30);

        firstName.setBackground(new java.awt.Color(51, 51, 51));
        firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstName.setForeground(new java.awt.Color(255, 255, 255));
        firstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        firstName.setOpaque(false);
        backround.add(firstName);
        firstName.setBounds(100, 180, 110, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");
        backround.add(jLabel3);
        jLabel3.setBounds(20, 220, 70, 30);

        lastName.setBackground(new java.awt.Color(51, 51, 51));
        lastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastName.setForeground(new java.awt.Color(255, 255, 255));
        lastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        backround.add(lastName);
        lastName.setBounds(100, 220, 110, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 33)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 51));
        jLabel4.setText("PERSONAL INFORMATION");
        backround.add(jLabel4);
        jLabel4.setBounds(250, 50, 420, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age: ");
        backround.add(jLabel5);
        jLabel5.setBounds(30, 260, 60, 30);

        gender.setBackground(new java.awt.Color(153, 255, 51));
        gender.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        backround.add(gender);
        gender.setBounds(100, 300, 110, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender:");
        backround.add(jLabel6);
        jLabel6.setBounds(30, 300, 60, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID:");
        backround.add(jLabel7);
        jLabel7.setBounds(50, 140, 40, 30);

        id.setEditable(false);
        id.setBackground(new java.awt.Color(51, 51, 51));
        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        id.setOpaque(false);
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        backround.add(id);
        id.setBounds(100, 140, 50, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Age", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table.setColorFilasForeground1(new java.awt.Color(0, 153, 51));
        table.setColorFilasForeground2(new java.awt.Color(0, 153, 51));
        table.setColorSelBackgound(new java.awt.Color(0, 153, 51));
        table.setRowHeight(25);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        backround.add(jScrollPane2);
        jScrollPane2.setBounds(350, 140, 530, 230);

        insert.setBackground(new java.awt.Color(0, 204, 0));
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        backround.add(insert);
        insert.setBounds(10, 410, 90, 40);

        update.setBackground(new java.awt.Color(0, 204, 0));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        backround.add(update);
        update.setBounds(100, 410, 90, 40);

        delete.setBackground(new java.awt.Color(0, 204, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        backround.add(delete);
        delete.setBounds(190, 410, 90, 40);

        Clear.setBackground(new java.awt.Color(0, 204, 0));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        backround.add(Clear);
        Clear.setBounds(280, 410, 90, 40);

        getContentPane().add(backround);
        backround.setBounds(0, -36, 960, 540);

        setSize(new java.awt.Dimension(913, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
       
      
    }//GEN-LAST:event_genderActionPerformed
public void getInformation (int index){
    //UI Related
    
    Information information = new Information();
    //get the value from information displayInformation method
    id.setText(Integer.toString(information.displayInformation().get(index).getId()));
    firstName.setText(information.displayInformation().get(index).getFirstname());
    lastName.setText(information.displayInformation().get(index).getLastname());
    age.setText(Integer.toString(information.displayInformation().get(index).getAge()) );
    
    

   
}    public void ClearingInput(){
          id.setText("");
          firstName.setText("");
          lastName.setText("");
          age.setText("");
    }
    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
   JOptionPane.showMessageDialog(rootPane, "You cannot edit this or input a value its for update purpose");
    }//GEN-LAST:event_idMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();
           //method
        getInformation(index);
    }//GEN-LAST:event_tableMouseClicked

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        //GetText
      String FirstName = firstName.getText();
      String LastName = lastName.getText();
      String Ages = age.getText();
      String Gender = String.valueOf(gender.getSelectedItem());
      //condition
      Boolean needFirstname = !firstName.getText().equals("");
      Boolean needLastname =  !lastName.getText().equals("");
      Boolean needAge =!age.getText().equals("");
      //gender doesnt need because its already declared as "Male"
      
     
      
      
      if (needFirstname && needLastname && needAge)
      {
      //model
      Personal personal = new Personal ();
      personal.setFirstname(FirstName);
      personal.setLastname(LastName);
      personal.setAge(Integer.parseInt(Ages));
      personal.setGender(Gender);
      //dao    
      Information information = new Information();
      information.saveInformation(personal);
      
      //RefreshData
      arrangedDataInTable();
      JOptionPane.showMessageDialog(rootPane, "Has been Created");
      
      //cleared setText
      ClearingInput();
      
      }
      else 
      {
          JOptionPane.showMessageDialog(rootPane, "Complete the blank Information");   
      }    
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       //GetText
      String ID = id.getText();
      String FirstName = firstName.getText();
      String LastName = lastName.getText();
      String Ages =age.getText();
      String Gender = String.valueOf(gender.getSelectedItem());
      //condition
      Boolean needID =!id.getText().equals("");
      Boolean needFirstname = !firstName.getText().equals("");
      Boolean needLastname =  !lastName.getText().equals("");
      Boolean needAge =!age.getText().equals("");
      //gender doesnt need because its already declared as "Male"
     
      if (needFirstname && needLastname && needAge && needID)
      {
      //model
      Personal personal = new Personal ();
      personal.setFirstname(FirstName);
      personal.setLastname(LastName);
      personal.setAge(Integer.parseInt(Ages));
      personal.setGender(Gender);
      personal.setId(Integer.parseInt(ID));
      //dao    
      Information information = new Information();
      information.updateInformation(personal);
      
      arrangedDataInTable();
      JOptionPane.showMessageDialog(rootPane, "Has been updated!");
      
      //cleared setText
      ClearingInput();
      }
      else 
      {
          JOptionPane.showMessageDialog(rootPane, "Complete the blank Information");   
      }    
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
           //GetText
      String ID = id.getText();
      //condition
      Boolean needID =!id.getText().equals("");
     
      
      if (needID)
      {
      //model 
      Personal personal = new Personal ();
      personal.setId(Integer.parseInt(ID) );
      //dao    
      Information information = new Information ();
      information.deleteInformation(personal);
      
      //refreshData
      arrangedDataInTable();
      JOptionPane.showMessageDialog(rootPane, "Has been Deleted");
      //cleared setText
      ClearingInput();
      }
      else
      {
      JOptionPane.showMessageDialog(rootPane, "Please Select a index row and delete properly");    
      }    
    }//GEN-LAST:event_deleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
         ClearingInput();
       JOptionPane.showMessageDialog(rootPane, "Cleared");   
    }//GEN-LAST:event_ClearActionPerformed

    private void iconifiedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconifiedMouseClicked
        //fade

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_iconifiedMouseClicked

    private void systemExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemExitMouseClicked
        for (double i= 1.0; i>=0.0; i = i-0.1 ){
            String val = i+"";
            float f =Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(30);
            }catch (Exception e){

            }
        }

        System.exit(0);
    }//GEN-LAST:event_systemExitMouseClicked

    private void backroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backroundMousePressed
       xMouse= evt.getX();
    yMouse= evt.getY();
    }//GEN-LAST:event_backroundMousePressed

    private void backroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backroundMouseDragged
      int x =evt.getXOnScreen();
       int y =evt.getYOnScreen();
        System.out.println(x +","+ y);
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backroundMouseDragged

 
            
            
            
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
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle Clear;
    private javax.swing.JTextField age;
    private javax.swing.JPanel backround;
    private rojerusan.RSMaterialButtonRectangle delete;
    private javax.swing.JTextField firstName;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel iconified;
    private javax.swing.JTextField id;
    private rojerusan.RSMaterialButtonRectangle insert;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel systemExit;
    private rojerusan.RSTableMetro table;
    private rojerusan.RSMaterialButtonRectangle update;
    // End of variables declaration//GEN-END:variables

    
}