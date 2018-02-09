
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Login_Form extends javax.swing.JFrame {
    private static String IDNO;
    private String user;
    private String jobtype;
    private Dispenser_form df;

    
    
    

    public Login_Form(String IDNO) {
        this.IDNO = idLogin.getText().trim();
        
    }

    public String getIDNO() {
        return IDNO;
    }

    public String getUser() {
        return user;
    }

    public String getJobtype() {
        return jobtype;
    }
    
    
    

    
    public Login_Form() {
        initComponents();
        
        
        
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd");
         Date date = new Date();
         String datestring = dateFormat.format(date);
         
        //dateText.setText(datestring);
        ClassDao connect = new ClassDao();
         
        
       try
       {
                     
            connect.openConnection();                                
            lblDtatus.setText("Connected"); 
           
            
           
            
           
       }catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null, e.getMessage());
           lblDtatus.setText("Not Connected");
       }catch(ClassNotFoundException ex)
       {
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtLoginPassword = new javax.swing.JPasswordField();
        idLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDtatus = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnLogin.setText("Login");
        btnLogin.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnLogin.setMaximumSize(new java.awt.Dimension(40, 218));
        btnLogin.setMinimumSize(new java.awt.Dimension(35, 15));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtLoginPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLoginPasswordKeyTyped(evt);
            }
        });

        idLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idLoginActionPerformed(evt);
            }
        });
        idLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idLoginKeyTyped(evt);
            }
        });

        jLabel3.setText("Password :");

        jLabel2.setText("ID Number :");

        lblDtatus.setText("Status");

        btnReset.setText("Clear");
        btnReset.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnReset.setMaximumSize(new java.awt.Dimension(40, 218));
        btnReset.setMinimumSize(new java.awt.Dimension(35, 15));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblDtatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                    .addComponent(txtLoginPassword)
                    .addComponent(idLogin))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDtatus))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jMenu1.setText("Exit");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Forgot Password");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
      System.exit(1);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void idLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idLoginKeyTyped
       
        if(idLogin.getText().length() > 12)
        {
            evt.consume();
        }
    }//GEN-LAST:event_idLoginKeyTyped

    private void txtLoginPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginPasswordKeyTyped
        if(txtLoginPassword.getText().length() > 11)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtLoginPasswordKeyTyped

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ClassDao dao = new ClassDao();
        
      
        try
        {
            long idNum = Long.parseLong(idLogin.getText());
            if(!txtLoginPassword.getText().trim().isEmpty())
            {
                

                     dao.openConnection();
                    Staff stff = dao.loginSearch(idLogin.getText());
                if(stff != null)
                {
                     if(stff.getIdNumber().equals(idLogin.getText()))
                    {
                        
                        if(stff.getPassword().equals(txtLoginPassword.getText()))
                        {
                            User user = new User(idLogin.getText(), stff.getFname(), stff.getLname());
                            if(stff.getJobType().equalsIgnoreCase("Manager"))
                            {
                                
                                Manager_Panel manager = new Manager_Panel(idLogin.getText().trim());
                                manager = new Manager_Panel();
                                this.dispose();
                                manager.setVisible(true);
                            }
                            else if(stff.getJobType().equalsIgnoreCase("Petrol Attendant"))
                            {
                                User logonInfo = new User();
                                logonInfo.setIdLogger(idLogin.getText().trim());
                                
                               // Petrol_attendant attendant = new Petrol_attendant(idLogin.getText());
                               
                               Petrol_attendant attendant = new Petrol_attendant();
                               //attendant.setUserId(idLogin.getText().trim());
                               
                                this.dispose();
                                attendant.setVisible(true);
                                
                                
                                  
                            }
                            else if(stff.getJobType().equalsIgnoreCase("Cleaner"))
                            {
                                Cleaner_form cleanerFrm = new Cleaner_form();
                                //cleanerFrm.setIdNum(idLogin.getText());
                                
                                
                                
                                 this.hide();
                                 cleanerFrm.setVisible(true);
                                 
                                Staff st = dao.retrieveEmployee(idLogin.getText());
                                Cleaner_form.txtName.setText(st.getFname());
                                Cleaner_form.txtAddress.setText(st.getAddress());
                                Cleaner_form.txtCell.setText(st.getCellphone());
                                Cleaner_form.txtSurname.setText(st.getLname());
                                Cleaner_form.txtEmail.setText(st.getEmail());
                                
                                        
                                
                                
                                 
                            }
                            else if(idLogin.getText().toString().trim().equals("9408075779088"))
                            {
                                if(txtLoginPassword.getText().toString().trim().equalsIgnoreCase("password"))
                                {
                                    Manager_Panel manager = new Manager_Panel(idLogin.getText().trim());
                                    manager = new Manager_Panel();
                                    this.dispose();
                                    manager.setVisible(true);
                                }
                            }
                           
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Your Password isinvalid");
                            txtLoginPassword.setBackground(Color.orange);
                        }
                    }
                     else
                     {
                         JOptionPane.showMessageDialog(null, "ID number does not exist in our system, \nplease ensure you eneterd the correct ID");
                         idLogin.setBackground(Color.orange);
                     }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Ivalid entry for ID, please ensure you entered a 13 digit ID number");
                    txtLoginPassword.setBackground(Color.orange);
                } 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter your password in the password field");
                txtLoginPassword.setBackground(Color.orange);
            }
        }catch(NumberFormatException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "ID must be numeric: " + e.getMessage());
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + e.getMessage());
        }catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + e.getMessage());
        }catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null, "ID number does not exist, ensure you have entered the correct ID number");
            idLogin.setBackground(Color.orange);
        }
        
                
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        
        ForGot_Password fPass = new ForGot_Password();
        this.dispose();
        fPass.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void idLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idLoginActionPerformed
        
    }//GEN-LAST:event_idLoginActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        idLogin.setText(null);
        txtLoginPassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    public static javax.swing.JTextField idLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDtatus;
    private javax.swing.JPasswordField txtLoginPassword;
    // End of variables declaration//GEN-END:variables
}
