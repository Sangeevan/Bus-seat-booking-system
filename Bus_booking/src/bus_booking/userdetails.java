/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_booking;

import java.awt.HeadlessException;
import java.sql.Connection;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thasni
 */
public class userdetails extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public userdetails() {
        initComponents();
        showDetails();
    }
    
    public ArrayList<show> showList(){
        ArrayList<show> showList= new ArrayList<>();
        try{
            Connection conn = DbConnection.ConnectDb();
            String Sql="Select * from employee ";
            PreparedStatement pst = conn.prepareStatement(Sql);
            ResultSet rs = pst.executeQuery();
            show show;
            
            while(rs.next()){
                show = new show(rs.getString("emp_id"),rs.getString("emp_name"),rs.getString("emp_nic"),rs.getString("emp_phone"),rs.getString("emp_address"),rs.getString("emp_mail"),rs.getString("emp_password"));
                
                showList.add(show);
            }
            
        }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        } 
        return showList;
    }
    
    
    void showDetails(){
        //userdetails ud = new userdetails();
        ArrayList<show> list = showList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[7];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getEmp_id();
            row[1]=list.get(i).getEmp_name();
            row[2]=list.get(i).getEmp_nic();
            row[3]=list.get(i).getEmp_phone();
            row[4]=list.get(i).getEmp_address();
            row[5]=list.get(i).getEmp_mail();
            row[6]=list.get(i).getEmp_password();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tEmpID = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        lMessage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tEmpNIC = new javax.swing.JTextField();
        tEmpName = new javax.swing.JTextField();
        tEmpPhone = new javax.swing.JTextField();
        tEmpAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tEmpMail = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tEmpPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel1.setText("BOOK MY BUS");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.setActionCommand("Search");
        jButton2.setName("searchorupdate"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Employee NIC", "Employee Phone", "Employee Address", "Employee Mail", "Employee Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setText("Employee ID :");

        tEmpID.setText(" ");
        tEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpIDActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jButton5.setText("update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lMessage.setForeground(new java.awt.Color(255, 0, 0));
        lMessage.setText(" ");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setText("Employee NIC :");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setText("Employee Name :");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel6.setText("Employee Address :");

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel7.setText("Employee Phone :");

        tEmpNIC.setText(" ");
        tEmpNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpNICActionPerformed(evt);
            }
        });

        tEmpName.setText(" ");
        tEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpNameActionPerformed(evt);
            }
        });

        tEmpPhone.setText(" ");
        tEmpPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpPhoneActionPerformed(evt);
            }
        });

        tEmpAddress.setText(" ");
        tEmpAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpAddressActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel8.setText("Employee Mail :");

        tEmpMail.setText(" ");
        tEmpMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpMailActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel9.setText("Control User Details");

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel10.setText("Employee Password :");

        tEmpPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmpPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tEmpName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEmpNIC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEmpPhone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEmpAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEmpMail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEmpPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(lMessage))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmpMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tEmpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton5)
                            .addComponent(jButton4))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus_booking/Bus.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new admin().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpIDActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         
       try{
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    if(jTable1.getSelectedRow()==-1){
        if(jTable1.getRowCount()==0){
            lMessage.setText("Table is empty");
        }else{JOptionPane.showMessageDialog(null,"Please Select one in Table","Access Denied",JOptionPane.ERROR_MESSAGE);
        
    }
    }
        else{

            Connection conn = DbConnection.ConnectDb();
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row,0).toString());

            String sql  = "UPDATE employee  SET emp_id=?,emp_name=?,emp_nic=?,emp_phone=?,emp_address=?,emp_mail=?,emp_password=? WHERE emp_id = '"+value+"'";


            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,tEmpID.getText());
            pst.setString(2,tEmpName.getText());           
            pst.setString(3,tEmpNIC.getText());
            pst.setString(4,tEmpPhone.getText());
            pst.setString(5,tEmpAddress.getText());
            pst.setString(6,tEmpMail.getText());
            pst.setString(7,tEmpPassword.getText());
            
            
            pst.executeUpdate();
                   
            model.setRowCount(0);
            showDetails();
            JOptionPane.showMessageDialog(null, "Updated successfully");
            
            tEmpID.setText(null);
        tEmpName.setText(null);
        tEmpNIC.setText(null);
        tEmpPhone.setText(null);
        tEmpAddress.setText(null);
        tEmpMail.setText(null);
        tEmpPassword.setText(null);
            
        }
    }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,e);
        } 
        

    // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
        
        if(jTable1.getSelectedRow()==-1){
        if(jTable1.getRowCount()==0){
            lMessage.setText("Table is empty");
        }else{JOptionPane.showMessageDialog(null,"Please Select one in Table","Access Denied",JOptionPane.ERROR_MESSAGE);
        
    }
    }
       
   
    else{
         try{
            Connection conn = DbConnection.ConnectDb();
        int row=jTable1.getSelectedRow();
        String value=(jTable1.getModel().getValueAt(row, 0).toString());
        String sql="DELETE FROM employee where emp_id= '"+value+"'";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.executeUpdate();
        model.setRowCount(0);
        showDetails();
        JOptionPane.showMessageDialog(null, "Deleted successfully");
        
        
       // model.removeRow(jTable1.getSelectedRow());
        
    
        tEmpID.setText(null);
        tEmpName.setText(null);
        tEmpNIC.setText(null);
        tEmpPhone.setText(null);
        tEmpAddress.setText(null);
        tEmpMail.setText(null);
        tEmpPassword.setText(null);
    }
    
    //}
    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        
        
      
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tEmpNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpNICActionPerformed

    private void tEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpNameActionPerformed

    private void tEmpPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpPhoneActionPerformed

    private void tEmpAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpAddressActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        tEmpID.setText(model.getValueAt(jTable1.getSelectedRow(),0).toString());
        tEmpName.setText(model.getValueAt(jTable1.getSelectedRow(),1).toString());
        tEmpNIC.setText(model.getValueAt(jTable1.getSelectedRow(),2).toString());
        tEmpPhone.setText(model.getValueAt(jTable1.getSelectedRow(),3).toString());
        tEmpAddress.setText(model.getValueAt(jTable1.getSelectedRow(),4).toString()); 
        tEmpMail.setText(model.getValueAt(jTable1.getSelectedRow(),5).toString());
        tEmpPassword.setText(model.getValueAt(jTable1.getSelectedRow(),6).toString());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void tEmpMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpMailActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try { DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    if(tEmpID.getText().trim().isEmpty()|| tEmpName.getText().trim().isEmpty()||tEmpNIC.getText().trim().isEmpty()||tEmpPhone.getText().trim().isEmpty()||tEmpAddress.getText().trim().isEmpty()||tEmpMail.getText().trim().isEmpty()|| tEmpPassword.getText().trim().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Please Fill All the Details","Access Denied",JOptionPane.ERROR_MESSAGE);
        }
    
        
    else{
    
        model.addRow(new Object[]{tEmpID.getText(),tEmpName.getText(),tEmpNIC.getText(),tEmpPhone.getText(),tEmpAddress.getText(),tEmpMail.getText(),tEmpPassword.getText()});    
        Connection conn = DbConnection.ConnectDb();
            String sql  = "INSERT INTO employee(emp_id, emp_name, emp_nic, emp_phone, emp_address, emp_mail, emp_password) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            
      
           pst.setString(1,tEmpID.getText());
           pst.setString(2,tEmpName.getText());
           pst.setString(3,tEmpNIC.getText());
           pst.setString(4,tEmpPhone.getText());
           pst.setString(5,tEmpAddress.getText());
           pst.setString(6,tEmpMail.getText());
           pst.setString(7,tEmpPassword.getText());
           pst.execute();
           model.setRowCount(0);
           showDetails();
           
          

          JOptionPane.showMessageDialog(this, "Success !");
            tEmpID.setText(null);
            tEmpName.setText(null);
            tEmpNIC.setText(null);
            tEmpPhone.setText(null);
            tEmpAddress.setText(null);
            tEmpMail.setText(null);
            tEmpPassword.setText(null);

                 }
        }
    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
//, TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tEmpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmpPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmpPasswordActionPerformed

    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        //listed();
        
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
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JLabel lMessage;
    private javax.swing.JTextField tEmpAddress;
    private javax.swing.JTextField tEmpID;
    private javax.swing.JTextField tEmpMail;
    private javax.swing.JTextField tEmpNIC;
    private javax.swing.JTextField tEmpName;
    private javax.swing.JTextField tEmpPassword;
    private javax.swing.JTextField tEmpPhone;
    // End of variables declaration//GEN-END:variables
}