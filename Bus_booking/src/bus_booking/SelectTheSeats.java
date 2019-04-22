/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_booking;

/**
 *
 * @author Thasni
 */

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SelectTheSeats extends javax.swing.JFrame {
    
String[] booknow = new String[52];

        String bbus;
        String bdate;
        String seatno;
        String refseatno;
        static String refno;
        
    /**
     * Creates new form NewJFrame
     */
    public SelectTheSeats() {
        
        bbus=CheckSeat.setbusid();
        bdate=CheckSeat.setdate();
        
        initComponents();        
        Connection con;
        ResultSet rs;
        PreparedStatement pst;
        String sql;
        
        sql = "select seat_no from seat where bus_id='"+bbus+"' AND date='"+bdate+"'";
        
        try
        { 
        con=DbConnection.ConnectDb();
        pst=con.prepareStatement(sql); 
        rs=pst.executeQuery();
        
        while (rs.next())
        {
            String sno=rs.getString("seat_no");

            if("s1".equals(sno)){jToggleButton1.setEnabled(false);jToggleButton1.setBackground(Color.cyan);}
            if("s2".equals(sno)){jToggleButton2.setEnabled(false);jToggleButton2.setBackground(Color.cyan);} 
            if("s3".equals(sno)){jToggleButton3.setEnabled(false);jToggleButton3.setBackground(Color.cyan);} 
            if("s4".equals(sno)){jToggleButton4.setEnabled(false);jToggleButton4.setBackground(Color.cyan);}  
            if("s5".equals(sno)){jToggleButton5.setEnabled(false);jToggleButton5.setBackground(Color.cyan);}  
            if("s6".equals(sno)){jToggleButton6.setEnabled(false);jToggleButton6.setBackground(Color.cyan);}
            if("s7".equals(sno)){jToggleButton7.setEnabled(false);jToggleButton7.setBackground(Color.cyan);} 
            if("s8".equals(sno)){jToggleButton8.setEnabled(false);jToggleButton8.setBackground(Color.cyan);} 
            if("s9".equals(sno)){jToggleButton9.setEnabled(false);jToggleButton9.setBackground(Color.cyan);}  
            if("s10".equals(sno)){jToggleButton10.setEnabled(false);jToggleButton10.setBackground(Color.cyan);} 
            if("s11".equals(sno)){jToggleButton11.setEnabled(false);jToggleButton11.setBackground(Color.cyan);}
            if("s12".equals(sno)){jToggleButton12.setEnabled(false);jToggleButton12.setBackground(Color.cyan);} 
            if("s13".equals(sno)){jToggleButton13.setEnabled(false);jToggleButton13.setBackground(Color.cyan);} 
            if("s14".equals(sno)){jToggleButton14.setEnabled(false);jToggleButton14.setBackground(Color.cyan);}  
            if("s15".equals(sno)){jToggleButton15.setEnabled(false);jToggleButton15.setBackground(Color.cyan);} 
            if("s16".equals(sno)){jToggleButton16.setEnabled(false);jToggleButton16.setBackground(Color.cyan);}
            if("s17".equals(sno)){jToggleButton17.setEnabled(false);jToggleButton17.setBackground(Color.cyan);} 
            if("s18".equals(sno)){jToggleButton18.setEnabled(false);jToggleButton18.setBackground(Color.cyan);} 
            if("s19".equals(sno)){jToggleButton19.setEnabled(false);jToggleButton19.setBackground(Color.cyan);}  
            if("s20".equals(sno)){jToggleButton20.setEnabled(false);jToggleButton20.setBackground(Color.cyan);} 
            if("s21".equals(sno)){jToggleButton21.setEnabled(false);jToggleButton21.setBackground(Color.cyan);}
            if("s22".equals(sno)){jToggleButton22.setEnabled(false);jToggleButton22.setBackground(Color.cyan);} 
            if("s23".equals(sno)){jToggleButton23.setEnabled(false);jToggleButton23.setBackground(Color.cyan);} 
            if("s24".equals(sno)){jToggleButton24.setEnabled(false);jToggleButton24.setBackground(Color.cyan);}  
            if("s25".equals(sno)){jToggleButton25.setEnabled(false);jToggleButton25.setBackground(Color.cyan);} 
            if("s26".equals(sno)){jToggleButton26.setEnabled(false);jToggleButton26.setBackground(Color.cyan);}
            if("s27".equals(sno)){jToggleButton27.setEnabled(false);jToggleButton27.setBackground(Color.cyan);} 
            if("s28".equals(sno)){jToggleButton28.setEnabled(false);jToggleButton28.setBackground(Color.cyan);} 
            if("s29".equals(sno)){jToggleButton29.setEnabled(false);jToggleButton29.setBackground(Color.cyan);}  
            if("s30".equals(sno)){jToggleButton30.setEnabled(false);jToggleButton30.setBackground(Color.cyan);} 
            if("s31".equals(sno)){jToggleButton31.setEnabled(false);jToggleButton31.setBackground(Color.cyan);}
            if("s32".equals(sno)){jToggleButton32.setEnabled(false);jToggleButton32.setBackground(Color.cyan);} 
            if("s33".equals(sno)){jToggleButton33.setEnabled(false);jToggleButton33.setBackground(Color.cyan);} 
            if("s34".equals(sno)){jToggleButton34.setEnabled(false);jToggleButton34.setBackground(Color.cyan);}  
            if("s35".equals(sno)){jToggleButton35.setEnabled(false);jToggleButton35.setBackground(Color.cyan);} 
            if("s36".equals(sno)){jToggleButton36.setEnabled(false);jToggleButton36.setBackground(Color.cyan);}
            if("s37".equals(sno)){jToggleButton37.setEnabled(false);jToggleButton37.setBackground(Color.cyan);} 
            if("s38".equals(sno)){jToggleButton38.setEnabled(false);jToggleButton38.setBackground(Color.cyan);} 
            if("s39".equals(sno)){jToggleButton39.setEnabled(false);jToggleButton39.setBackground(Color.cyan);}  
            if("s40".equals(sno)){jToggleButton40.setEnabled(false);jToggleButton40.setBackground(Color.cyan);} 
            if("s41".equals(sno)){jToggleButton41.setEnabled(false);jToggleButton41.setBackground(Color.cyan);}
            if("s42".equals(sno)){jToggleButton42.setEnabled(false);jToggleButton42.setBackground(Color.cyan);} 
            if("s43".equals(sno)){jToggleButton43.setEnabled(false);jToggleButton43.setBackground(Color.cyan);} 
            if("s44".equals(sno)){jToggleButton44.setEnabled(false);jToggleButton44.setBackground(Color.cyan);}  
            if("s45".equals(sno)){jToggleButton45.setEnabled(false);jToggleButton45.setBackground(Color.cyan);} 
            if("s46".equals(sno)){jToggleButton46.setEnabled(false);jToggleButton46.setBackground(Color.cyan);}
            if("s47".equals(sno)){jToggleButton47.setEnabled(false);jToggleButton47.setBackground(Color.cyan);} 
            if("s48".equals(sno)){jToggleButton48.setEnabled(false);jToggleButton48.setBackground(Color.cyan);} 
            if("s49".equals(sno)){jToggleButton49.setEnabled(false);jToggleButton49.setBackground(Color.cyan);}  
            if("s50".equals(sno)){jToggleButton50.setEnabled(false);jToggleButton50.setBackground(Color.cyan);} 
            if("s51".equals(sno)){jToggleButton51.setEnabled(false);jToggleButton51.setBackground(Color.cyan);}
            if("s52".equals(sno)){jToggleButton52.setEnabled(false);jToggleButton52.setBackground(Color.cyan);}  
        }

        } 
        catch(SQLException | HeadlessException ex)
        {
        JOptionPane.showMessageDialog(null,ex);
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
        jPanel3 = new javax.swing.JPanel();
        jButton58 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton37 = new javax.swing.JToggleButton();
        jToggleButton38 = new javax.swing.JToggleButton();
        jToggleButton39 = new javax.swing.JToggleButton();
        jToggleButton40 = new javax.swing.JToggleButton();
        jToggleButton41 = new javax.swing.JToggleButton();
        jToggleButton42 = new javax.swing.JToggleButton();
        jToggleButton43 = new javax.swing.JToggleButton();
        jToggleButton44 = new javax.swing.JToggleButton();
        jToggleButton45 = new javax.swing.JToggleButton();
        jToggleButton46 = new javax.swing.JToggleButton();
        jToggleButton47 = new javax.swing.JToggleButton();
        jToggleButton48 = new javax.swing.JToggleButton();
        jToggleButton49 = new javax.swing.JToggleButton();
        jToggleButton50 = new javax.swing.JToggleButton();
        jToggleButton51 = new javax.swing.JToggleButton();
        jToggleButton52 = new javax.swing.JToggleButton();
        jButton59 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel1.setText("BOOK MY BUS");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton58.setBackground(new java.awt.Color(255, 51, 51));
        jButton58.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jButton58.setText("D");
        jButton58.setName("sd"); // NOI18N
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton1.setText("1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton2.setText("2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton3.setText("3");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton4.setText("4");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton5.setText("5");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton6.setText("6");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton7.setText("7");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton8.setText("8");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton9.setText("9");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton10.setText("10");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton11.setText("11");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton12.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton12.setText("12");
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton13.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton13.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton13.setText("13");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });

        jToggleButton14.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton14.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton14.setText("14");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton15.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton15.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton15.setText("15");
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton16.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton16.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton16.setText("16");
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton17.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton17.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton17.setText("17");
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        jToggleButton18.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton18.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton18.setText("18");
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButton19.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton19.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton19.setText("19");
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton19ActionPerformed(evt);
            }
        });

        jToggleButton20.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton20.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton20.setText("20");
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        jToggleButton21.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton21.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton21.setText("21");
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });

        jToggleButton22.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton22.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton22.setText("22");
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton22ActionPerformed(evt);
            }
        });

        jToggleButton23.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton23.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton23.setText("23");
        jToggleButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton23ActionPerformed(evt);
            }
        });

        jToggleButton24.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton24.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton24.setText("24");
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton24ActionPerformed(evt);
            }
        });

        jToggleButton25.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton25.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton25.setText("25");
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton25ActionPerformed(evt);
            }
        });

        jToggleButton26.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton26.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton26.setText("26");
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });

        jToggleButton27.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton27.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton27.setText("27");
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton27ActionPerformed(evt);
            }
        });

        jToggleButton28.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton28.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton28.setText("28");
        jToggleButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton28ActionPerformed(evt);
            }
        });

        jToggleButton29.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton29.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton29.setText("29");
        jToggleButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton29ActionPerformed(evt);
            }
        });

        jToggleButton30.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton30.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton30.setText("30");
        jToggleButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton30ActionPerformed(evt);
            }
        });

        jToggleButton31.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton31.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton31.setText("31");
        jToggleButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton31ActionPerformed(evt);
            }
        });

        jToggleButton32.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton32.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton32.setText("32");
        jToggleButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton32ActionPerformed(evt);
            }
        });

        jToggleButton33.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton33.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton33.setText("33");
        jToggleButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton33ActionPerformed(evt);
            }
        });

        jToggleButton34.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton34.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton34.setText("34");
        jToggleButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton34ActionPerformed(evt);
            }
        });

        jToggleButton35.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton35.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton35.setText("35");
        jToggleButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton35ActionPerformed(evt);
            }
        });

        jToggleButton36.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton36.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton36.setText("36");
        jToggleButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton36ActionPerformed(evt);
            }
        });

        jToggleButton37.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton37.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton37.setText("37");
        jToggleButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton37ActionPerformed(evt);
            }
        });

        jToggleButton38.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton38.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton38.setText("38");
        jToggleButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton38ActionPerformed(evt);
            }
        });

        jToggleButton39.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton39.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton39.setText("39");
        jToggleButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton39ActionPerformed(evt);
            }
        });

        jToggleButton40.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton40.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton40.setText("40");
        jToggleButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton40ActionPerformed(evt);
            }
        });

        jToggleButton41.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton41.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton41.setText("41");
        jToggleButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton41ActionPerformed(evt);
            }
        });

        jToggleButton42.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton42.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton42.setText("42");
        jToggleButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton42ActionPerformed(evt);
            }
        });

        jToggleButton43.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton43.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton43.setText("43");
        jToggleButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton43ActionPerformed(evt);
            }
        });

        jToggleButton44.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton44.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton44.setText("44");
        jToggleButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton44ActionPerformed(evt);
            }
        });

        jToggleButton45.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton45.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton45.setText("45");
        jToggleButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton45ActionPerformed(evt);
            }
        });

        jToggleButton46.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton46.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton46.setText("46");
        jToggleButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton46ActionPerformed(evt);
            }
        });

        jToggleButton47.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton47.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton47.setText("47");
        jToggleButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton47ActionPerformed(evt);
            }
        });

        jToggleButton48.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton48.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton48.setText("48");
        jToggleButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton48ActionPerformed(evt);
            }
        });

        jToggleButton49.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton49.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton49.setText("49");
        jToggleButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton49ActionPerformed(evt);
            }
        });

        jToggleButton50.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton50.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton50.setText("50");
        jToggleButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton50ActionPerformed(evt);
            }
        });

        jToggleButton51.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton51.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton51.setText("51");
        jToggleButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton51ActionPerformed(evt);
            }
        });

        jToggleButton52.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButton52.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jToggleButton52.setText("52");
        jToggleButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton52ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jToggleButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jToggleButton37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton40))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jToggleButton38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jToggleButton47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jButton58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jToggleButton12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButton15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButton16)))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton46))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jToggleButton51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton50, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jToggleButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton44)
                                .addGap(6, 6, 6)
                                .addComponent(jToggleButton52)))))
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jToggleButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToggleButton40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jToggleButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );

        jButton59.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jButton59.setText("Submit");
        jButton59.setName("submit"); // NOI18N
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel2.setText("Select the Seats");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton59)
                .addContainerGap(145, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        
        for(int i=0 ; i<=51 ; i++){
            if(booknow[i] != null){
                refseatno=booknow[i];
                break;
            }
            
        }
        
        refno=bbus+bdate+refseatno;
       
                
        Connection conn;
        PreparedStatement pstins;
        String sqlins;
        sqlins = "INSERT INTO `seat`(`bus_id`, `date`,`ref_no`, `seat_no`) VALUES (?,?,?,?)";
        
        for(int i=0 ; i<=51 ; i++){
            if(booknow[i] != null){
                
                seatno=booknow[i];
                    
                try
                { 
                    conn=DbConnection.ConnectDb();
                    pstins = conn.prepareStatement(sqlins);
                    pstins.setString(1,bbus);
                    pstins.setString(2,bdate);
                    pstins.setString(3,refno);
                    pstins.setString(4,seatno);
                    pstins.execute();
                    
                }
                 catch (SQLException ex) {
                    Logger.getLogger(SelectTheSeats.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
                
        }
//<<<<<<< HEAD
      
//=======
        
        if(refseatno != null){
            new CustomersDetails().setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select The Seats","Access Denied",JOptionPane.ERROR_MESSAGE);
        }
        
//>>>>>>> 460ca886baeb68dcc99177e83baed804799c919e
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton2.isSelected()){
            booknow[1]="s2";
            jToggleButton2.setBackground(Color.BLUE);
        }
        else{
            booknow[1]=null;
            jToggleButton2.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected()){
            booknow[0]="s1";
            jToggleButton1.setBackground(Color.BLUE);
        }
        else{
            booknow[0]=null;
            jToggleButton1.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton22.isSelected()){
            booknow[21]="s22";
            jToggleButton22.setBackground(Color.BLUE);
        }
        else{
            booknow[21]=null;
            jToggleButton22.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton22ActionPerformed

    private void jToggleButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton36ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton36.isSelected()){
            booknow[35]="s36";
            jToggleButton36.setBackground(Color.BLUE);
        }
        else{
            booknow[35]=null;
            jToggleButton36.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton36ActionPerformed

    private void jToggleButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton49ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton49.isSelected()){
            booknow[48]="s49";
            jToggleButton49.setBackground(Color.BLUE);
        }
        else{
            booknow[48]=null;
            jToggleButton49.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton49ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton3.isSelected()){
            booknow[2]="s3";
            jToggleButton3.setBackground(Color.BLUE);
        }
        else{
            booknow[2]=null;
            jToggleButton3.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton4.isSelected()){
            booknow[3]="s4";
            jToggleButton4.setBackground(Color.BLUE);
        }
        else{
            booknow[3]=null;
            jToggleButton4.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton5.isSelected()){
            booknow[4]="s5";
            jToggleButton5.setBackground(Color.BLUE);
        }
        else{
            booknow[4]=null;
            jToggleButton5.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton6.isSelected()){
            booknow[5]="s6";
            jToggleButton6.setBackground(Color.BLUE);
        }
        else{
            booknow[5]=null;
            jToggleButton6.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton7.isSelected()){
            booknow[6]="s7";
            jToggleButton7.setBackground(Color.BLUE);
        }
        else{
            booknow[6]=null;
            jToggleButton7.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton8.isSelected()){
            booknow[7]="s8";
            jToggleButton8.setBackground(Color.BLUE);
        }
        else{
            booknow[7]=null;
            jToggleButton8.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton9.isSelected()){
            booknow[8]="s9";
            jToggleButton9.setBackground(Color.BLUE);
        }
        else{
            booknow[8]=null;
            jToggleButton9.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton10.isSelected()){
            booknow[9]="s10";
            jToggleButton10.setBackground(Color.BLUE);
        }
        else{
            booknow[9]=null;
            jToggleButton10.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton11.isSelected()){
            booknow[10]="s11";
            jToggleButton11.setBackground(Color.BLUE);
        }
        else{
            booknow[10]=null;
            jToggleButton11.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton12.isSelected()){
            booknow[11]="s12";
            jToggleButton12.setBackground(Color.BLUE);
        }
        else{
            booknow[11]=null;
            jToggleButton12.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton13.isSelected()){
            booknow[12]="s13";
            jToggleButton13.setBackground(Color.BLUE);
        }
        else{
            booknow[12]=null;
            jToggleButton13.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton14.isSelected()){
            booknow[13]="s14";
            jToggleButton14.setBackground(Color.BLUE);
        }
        else{
            booknow[13]=null;
            jToggleButton14.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton15.isSelected()){
            booknow[14]="s15";
            jToggleButton15.setBackground(Color.BLUE);
        }
        else{
            booknow[14]=null;
            jToggleButton15.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton16.isSelected()){
            booknow[15]="s16";
            jToggleButton16.setBackground(Color.BLUE);
        }
        else{
            booknow[15]=null;
            jToggleButton16.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton17.isSelected()){
            booknow[16]="s17";
            jToggleButton17.setBackground(Color.BLUE);
        }
        else{
            booknow[16]=null;
            jToggleButton17.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton17ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton18.isSelected()){
            booknow[17]="s18";
            jToggleButton18.setBackground(Color.BLUE);
        }
        else{
            booknow[17]=null;
            jToggleButton18.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jToggleButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton19ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton19.isSelected()){
            booknow[18]="s19";
            jToggleButton19.setBackground(Color.BLUE);
        }
        else{
            booknow[18]=null;
            jToggleButton19.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton19ActionPerformed

    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton20.isSelected()){
            booknow[19]="s20";
            jToggleButton20.setBackground(Color.BLUE);
        }
        else{
            booknow[19]=null;
            jToggleButton20.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton20ActionPerformed

    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton21.isSelected()){
            booknow[20]="s21";
            jToggleButton21.setBackground(Color.BLUE);
        }
        else{
            booknow[20]=null;
            jToggleButton21.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton23ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton23.isSelected()){
            booknow[22]="s23";
            jToggleButton23.setBackground(Color.BLUE);
        }
        else{
            booknow[22]=null;
            jToggleButton23.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton23ActionPerformed

    private void jToggleButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton24ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton24.isSelected()){
            booknow[23]="s24";
            jToggleButton24.setBackground(Color.BLUE);
        }
        else{
            booknow[23]=null;
            jToggleButton24.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton24ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton25.isSelected()){
            booknow[24]="s25";
            jToggleButton25.setBackground(Color.BLUE);
        }
        else{
            booknow[24]=null;
            jToggleButton25.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton26.isSelected()){
            booknow[25]="s26";
            jToggleButton26.setBackground(Color.BLUE);
        }
        else{
            booknow[25]=null;
            jToggleButton26.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton26ActionPerformed

    private void jToggleButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton27ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton27.isSelected()){
            booknow[26]="s27";
            jToggleButton27.setBackground(Color.BLUE);
        }
        else{
            booknow[26]=null;
            jToggleButton27.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jToggleButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton28ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton28.isSelected()){
            booknow[27]="s28";
            jToggleButton28.setBackground(Color.BLUE);
        }
        else{
            booknow[27]=null;
            jToggleButton28.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton28ActionPerformed

    private void jToggleButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton29ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton29.isSelected()){
            booknow[28]="s29";
            jToggleButton29.setBackground(Color.BLUE);
        }
        else{
            booknow[28]=null;
            jToggleButton29.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton29ActionPerformed

    private void jToggleButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton30ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton30.isSelected()){
            booknow[29]="s30";
            jToggleButton30.setBackground(Color.BLUE);
        }
        else{
            booknow[29]=null;
            jToggleButton30.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton30ActionPerformed

    private void jToggleButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton31ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton31.isSelected()){
            booknow[30]="s31";
            jToggleButton31.setBackground(Color.BLUE);
        }
        else{
            booknow[30]=null;
            jToggleButton31.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton31ActionPerformed

    private void jToggleButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton32ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton32.isSelected()){
            booknow[31]="s32";
            jToggleButton32.setBackground(Color.BLUE);
        }
        else{
            booknow[31]=null;
            jToggleButton32.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton32ActionPerformed

    private void jToggleButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton33ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton33.isSelected()){
            booknow[32]="s33";
            jToggleButton33.setBackground(Color.BLUE);
        }
        else{
            booknow[32]=null;
            jToggleButton33.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton33ActionPerformed

    private void jToggleButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton34ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton34.isSelected()){
            booknow[33]="s34";
            jToggleButton34.setBackground(Color.BLUE);
        }
        else{
            booknow[33]=null;
            jToggleButton34.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton34ActionPerformed

    private void jToggleButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton35ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton35.isSelected()){
            booknow[34]="s35";
            jToggleButton35.setBackground(Color.BLUE);
        }
        else{
            booknow[34]=null;
            jToggleButton35.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton35ActionPerformed

    private void jToggleButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton37ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton37.isSelected()){
            booknow[36]="s37";
            jToggleButton37.setBackground(Color.BLUE);
        }
        else{
            booknow[36]=null;
            jToggleButton37.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton37ActionPerformed

    private void jToggleButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton38ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton38.isSelected()){
            booknow[37]="s38";
            jToggleButton38.setBackground(Color.BLUE);
        }
        else{
            booknow[37]=null;
            jToggleButton38.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton38ActionPerformed

    private void jToggleButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton39ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton39.isSelected()){
            booknow[38]="s39";
            jToggleButton39.setBackground(Color.BLUE);
        }
        else{
            booknow[38]=null;
            jToggleButton39.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton39ActionPerformed

    private void jToggleButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton40ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton40.isSelected()){
            booknow[39]="s40";
            jToggleButton40.setBackground(Color.BLUE);
        }
        else{
            booknow[39]=null;
            jToggleButton40.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton40ActionPerformed

    private void jToggleButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton41ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton41.isSelected()){
            booknow[40]="s41";
            jToggleButton41.setBackground(Color.BLUE);
        }
        else{
            booknow[40]=null;
            jToggleButton41.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton41ActionPerformed

    private void jToggleButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton42ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton42.isSelected()){
            booknow[41]="s42";
            jToggleButton42.setBackground(Color.BLUE);
        }
        else{
            booknow[41]=null;
            jToggleButton42.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton42ActionPerformed

    private void jToggleButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton43ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton43.isSelected()){
            booknow[42]="s43";
            jToggleButton43.setBackground(Color.BLUE);
        }
        else{
            booknow[42]=null;
            jToggleButton43.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton43ActionPerformed

    private void jToggleButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton44ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton44.isSelected()){
            booknow[43]="s44";
            jToggleButton44.setBackground(Color.BLUE);
        }
        else{
            booknow[43]=null;
            jToggleButton44.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton44ActionPerformed

    private void jToggleButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton45ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton45.isSelected()){
            booknow[44]="s45";
            jToggleButton45.setBackground(Color.BLUE);
        }
        else{
            booknow[44]=null;
            jToggleButton45.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton45ActionPerformed

    private void jToggleButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton46ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton46.isSelected()){
            booknow[45]="s46";
            jToggleButton46.setBackground(Color.BLUE);
        }
        else{
            booknow[45]=null;
            jToggleButton46.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton46ActionPerformed

    private void jToggleButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton47ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton47.isSelected()){
            booknow[46]="s47";
            jToggleButton47.setBackground(Color.BLUE);
        }
        else{
            booknow[46]=null;
            jToggleButton47.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton47ActionPerformed

    private void jToggleButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton48ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton48.isSelected()){
            booknow[49]="s48";
            jToggleButton48.setBackground(Color.BLUE);
        }
        else{
            booknow[49]=null;
            jToggleButton48.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton48ActionPerformed

    private void jToggleButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton50ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton50.isSelected()){
            booknow[49]="s50";
            jToggleButton50.setBackground(Color.BLUE);
        }
        else{
            booknow[49]=null;
            jToggleButton50.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton50ActionPerformed

    private void jToggleButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton51ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton51.isSelected()){
            booknow[50]="s51";
            jToggleButton51.setBackground(Color.BLUE);
        }
        else{
            booknow[50]=null;
            jToggleButton51.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton51ActionPerformed

    private void jToggleButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton52ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton52.isSelected()){
            booknow[51]="s52";
            jToggleButton52.setBackground(Color.BLUE);
        }
        else{
            booknow[51]=null;
            jToggleButton52.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton52ActionPerformed

    public static String getRefno() {
        return refno;
    }

    public static void setRefno(String refno) {
        SelectTheSeats.refno = refno;
    } 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SelectTheSeats().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    private javax.swing.JToggleButton jToggleButton36;
    private javax.swing.JToggleButton jToggleButton37;
    private javax.swing.JToggleButton jToggleButton38;
    private javax.swing.JToggleButton jToggleButton39;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton40;
    private javax.swing.JToggleButton jToggleButton41;
    private javax.swing.JToggleButton jToggleButton42;
    private javax.swing.JToggleButton jToggleButton43;
    private javax.swing.JToggleButton jToggleButton44;
    private javax.swing.JToggleButton jToggleButton45;
    private javax.swing.JToggleButton jToggleButton46;
    private javax.swing.JToggleButton jToggleButton47;
    private javax.swing.JToggleButton jToggleButton48;
    private javax.swing.JToggleButton jToggleButton49;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton50;
    private javax.swing.JToggleButton jToggleButton51;
    private javax.swing.JToggleButton jToggleButton52;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables





}
