import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Login extends javax.swing.JFrame {

  Connection con ;
  ResultSet rs;
  Statement stmt ;
  
  private Timer t;
   private final ActionListener a;
   
    public Login() {
        initComponents();
        Connect();
        a=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
          if(jProgressBar1.getValue()<100)
          {
              //jProgressBar1.setBackground(Color.green);
          jProgressBar1.setValue(jProgressBar1.getValue()+3);
          }
          else
          {
          t.stop();
          Home_Page h=new Home_Page();
          h.setVisible(true);
          dispose();
          }
            }
        
        };
        t=new Timer(200,a);
    }
    
    void Connect()
    {
       
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/indogulf","root","");
             stmt = con.createStatement();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 450));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("INDO-GULF CONSULTANCY");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 40, 510, 42);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/about2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 140, 170);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("USER NAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 160, 110, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("PASSWORD");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 220, 120, 22);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(370, 160, 160, 30);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(370, 220, 160, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oAccess.jpg"))); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 280, 113, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete 5.jpg"))); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 280, 110, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/endturn.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(450, 280, 50, 50);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(210, 370, 320, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("REGISTRATION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(210, 330, 123, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib1.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        
        try
        {
          String sql = "select * from admin where adminname='"+username+"' and password='"+password+"'";
          rs = stmt.executeQuery(sql);
          int i = 0;
          while(rs.next())
          {
            i++;  
          }
          if(i==1)
          {
             
              t.start();
               
              if(jProgressBar1.getValue()==99)
              {
               JOptionPane.showMessageDialog(this,"Login Successful");
               Home_Page obj = new Home_Page();
               obj.setVisible(true);
              Login l=new Login();
              l.setVisible(false);
              dispose();
              }
          }
          else
          {
              JOptionPane.showMessageDialog(this,"Invalid Login Credentials , Try Again");
              
               }
        }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       CANDIDATES_REGISTRATION cr = new CANDIDATES_REGISTRATION();
           cr.setVisible(true);
           Login l=new Login();
              l.setVisible(false);
              dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             Login n =   new Login();
             n.setSize(750,450);
                n.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
