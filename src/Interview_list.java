import java.awt.HeadlessException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Interview_list extends javax.swing.JFrame {
Connection con ;
  ResultSet rs;
  Statement stmt ;
    
    public Interview_list() {
        initComponents();
        Connect();
    }
    void Connect()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/indogulf","root","");
             stmt = con.createStatement();
             ResultSet r= stmt.executeQuery("Select * from selectforinterview");
             
             while(r.next())
             {
                 jComboBox2.addItem(r.getString("candidateid"));
             }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 450));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("SELECT INTERVIEW LIST CANDIDATES FOR JOB");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 90, 431, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("CANDIDATE ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 150, 138, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("COMPANY NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 190, 120, 23);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(220, 150, 140, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..........SELECT............", "TCS", "INFOSYS", "ACCENTURE", "L&T", "HCL", "KPIT", "WIPRO", "TECH MAHINDRA", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(220, 190, 149, 20);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(530, 150, 148, 23);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("COMPANY LOCATION");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 240, 160, 23);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 240, 149, 23);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(530, 200, 148, 23);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(140, 320, 60, 60);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/endturn.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(530, 330, 50, 50);

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("UNSELECTED");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(210, 350, 119, 25);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("SELECT FOR JOB");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(370, 350, 147, 25);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("    INDO-GULF CONSULTANCY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 30, 600, 50);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jTextField4.setText("SELECT FOR JOB");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(370, 150, 150, 24);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jTextField5.setText("SALARY (IN SR)");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(380, 200, 140, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manpower2.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 704, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Home_Page obj = new Home_Page();
             obj.setVisible(true);
             Home_Page ob=new Home_Page();
             ob.setVisible(false);
             dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       String candidateid = jComboBox2.getSelectedItem().toString();
        try
            {
               String sql1="delete from selectforinterview where candidateid='"+candidateid+"'";
            int m = stmt.executeUpdate(sql1); 
            if(m==1)
            {
                JOptionPane.showMessageDialog(this,"Candidate Removed from Interview List"); 
            }
            }
        
        catch(SQLException ex)
        {
            
           JOptionPane.showMessageDialog(this,ex.getMessage()); 
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
String candidateid = jComboBox2.getSelectedItem().toString();
         String candidatename ="";
        String companyname = jComboBox1.getSelectedItem().toString();
        String selectforjob = jTextField2.getText();
        
        String companylocation = jTextField1.getText();
        String salary = jTextField3.getText();
              String appliedfor=""; 
              DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	java.util.Date date = new java.util.Date();
	String selecteddate = dateFormat.format(date);
        
       
        try
        {
            ResultSet rm=stmt.executeQuery("select * from user where id="+candidateid+"");
            
          if(rm.next())   
          {
              appliedfor = rm.getString("appliedfor");
              candidatename = rm.getString("candidatename");
          }
            
            
            String sql="insert into selecteduser(candidateid,candidatename,appliedfor,selectedfor,selectedcompany,companylocation,date) values ('"+candidateid+"','"+candidatename+"','"+appliedfor+"','"+selectforjob+"','"+companyname+"','"+companylocation+"','"+selecteddate+"')";
            int n = stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Record Save Successfully");
            
            if(n==1)
            {
               String sql1="delete from selectforinterview where candidateid='"+candidateid+"'";
            stmt.executeUpdate(sql1); 
            }
        }
        catch(SQLException ex)
        {
            
           JOptionPane.showMessageDialog(this,ex.getMessage()); 
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char ch=evt.getKeyChar();
      if(Character.isDigit(ch))
      {
        evt.consume();
      }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
      char ch=evt.getKeyChar();
     if(Character.isDigit(ch))
     {
       evt.consume();
     }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char ch=evt.getKeyChar();
     if(!Character.isDigit(ch))
     {
        evt.consume();
     }
    }//GEN-LAST:event_jTextField3KeyTyped

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
            java.util.logging.Logger.getLogger(Interview_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interview_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interview_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interview_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interview_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
