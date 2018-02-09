import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListEmployees extends javax.swing.JFrame {
    
     private static String idNum;
    private String reportDate;
    private User user;
    private ClassDao empDetails;
    private Staff staff;
      
    private String searchMethod = "emp id";
   
    public ListEmployees() {
        initComponents();
        rdrButtons();
        
           user = new User();
        this.idNum = user.getIdLogger();
        
        empDetails = new ClassDao();
         staff = new Staff();
        
        try
        {
            empDetails.openConnection();
            staff = empDetails.retrieveEmployee(idNum);
            jLabel3.setText(staff.getFname() + " " + staff.getLname());
            
            empDetails.closeConnection();
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getMessage());
        }
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListEmployees = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rdrEmpId = new javax.swing.JRadioButton();
        rdrLName = new javax.swing.JRadioButton();
        rdrFName = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearchValue = new javax.swing.JTextField();
        jBtnListAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuReturn = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mnuExit1 = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Search:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        tblListEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Surname", "ID Number", "Cellphone", "Address", "Hire Date", "Gender", "email", "dob", "Job Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListEmployees);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Criteria:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(1, 1, 1))); // NOI18N

        rdrEmpId.setBackground(new java.awt.Color(255, 255, 255));
        rdrEmpId.setText("Search by Employee ID");
        rdrEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdrEmpIdActionPerformed(evt);
            }
        });

        rdrLName.setBackground(new java.awt.Color(255, 255, 255));
        rdrLName.setText("Search By Last Name");
        rdrLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdrLNameActionPerformed(evt);
            }
        });

        rdrFName.setBackground(new java.awt.Color(255, 255, 255));
        rdrFName.setText("Search By First Name");
        rdrFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdrFNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Search Value");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearchValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchValueActionPerformed(evt);
            }
        });
        txtSearchValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchValueKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdrEmpId)
                        .addGap(18, 18, 18)
                        .addComponent(rdrLName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(rdrFName))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdrEmpId)
                    .addComponent(rdrLName)
                    .addComponent(rdrFName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap())
        );

        jBtnListAll.setText("List All");
        jBtnListAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnListAllActionPerformed(evt);
            }
        });

        jLabel1.setText("User: ");

        jLabel3.setText("Employee Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addComponent(jBtnListAll, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(462, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnListAll)
                .addGap(26, 26, 26))
        );

        mnuReturn.setText("Back");
        mnuReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuReturnMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuReturn);
        jMenuBar1.add(jMenu2);

        mnuExit1.setText("Main Window");
        mnuExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuExit1MouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuExit1);

        mnuExit.setText("Exit");
        mnuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdrEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdrEmpIdActionPerformed
        rdrEmpId.setSelected(true);
        rdrLName.setSelected(false);
        rdrFName.setSelected(false);
        searchMethod = "emp id";
        txtSearchValue.setText("");
          DefaultTableModel model= (DefaultTableModel) tblListEmployees.getModel();
                 model.setRowCount(0);
    }//GEN-LAST:event_rdrEmpIdActionPerformed

    private void rdrLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdrLNameActionPerformed
       rdrEmpId.setSelected(false);
        rdrLName.setSelected(true);
        rdrFName.setSelected(false);
        searchMethod = "last name";
       txtSearchValue.setText("");
         DefaultTableModel model= (DefaultTableModel) tblListEmployees.getModel();
                 model.setRowCount(0);
      
    }//GEN-LAST:event_rdrLNameActionPerformed

    private void rdrFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdrFNameActionPerformed
        
        rdrEmpId.setSelected(false);
        rdrLName.setSelected(false);
        rdrFName.setSelected(true);
        searchMethod = "first name";
       txtSearchValue.setText("");
          DefaultTableModel model= (DefaultTableModel) tblListEmployees.getModel();
                 model.setRowCount(0);
       
    }//GEN-LAST:event_rdrFNameActionPerformed

    private void mnuReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuReturnMouseClicked
        
        Manage_Employees emp = new Manage_Employees();
        this.setVisible(false);
        emp.show();
    }//GEN-LAST:event_mnuReturnMouseClicked

    private void mnuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuExitMouseClicked
        System.exit(1);
    }//GEN-LAST:event_mnuExitMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    
      
        
        
          if(!txtSearchValue.getText().trim().isEmpty())
          {
             if(searchMethod.equalsIgnoreCase("emp id"))
         {
             ClassDao search = new ClassDao();
             Staff name = new Staff();
             
           try
           {
              search.openConnection();
                 int empId = Integer.parseInt(txtSearchValue.getText().trim());
                 
                 name = search.retrieveEmployees(txtSearchValue.getText().trim());
                  
                 DefaultTableModel model= (DefaultTableModel) tblListEmployees.getModel();
                 model.setRowCount(0);
                 model.setRowCount(1);
                 
                  this.tblListEmployees.setValueAt(name.getEmp_number(), 0, 0);
                this.tblListEmployees.setValueAt(name.getFname(),0,1);
                this.tblListEmployees.setValueAt(name.getLname(),0,2);
                this.tblListEmployees.setValueAt(name.getIdNumber(),0,3);
                this.tblListEmployees.setValueAt(name.getCellphone(),0,4);
                this.tblListEmployees.setValueAt(name.getAddress(),0,5);
                this.tblListEmployees.setValueAt(name.getHireDate(),0,6);
                this.tblListEmployees.setValueAt(name.getSex().substring(0,1),0,7);
                //this.tblListEmployees.setValueAt(newRow.getPassword(),y,8);
                this.tblListEmployees.setValueAt(name.getEmail(),0,8);
                this.tblListEmployees.setValueAt(name.getBirthday(),0,9);
                this.tblListEmployees.setValueAt(name.getJobType(),0,10);
           }catch(Exception x)
           {
               JOptionPane.showMessageDialog(null, "Please ensure that employee id is numeric/n"+x.getMessage());
           }
           
        }
        else if(searchMethod.equalsIgnoreCase("first name"))
        {
            ClassDao search = new ClassDao();
            ArrayList<Staff> names = new   ArrayList<Staff>();
           
          
            Staff newRow = new Staff();
            try
            {
                 search.openConnection();
                
                names = search.searchByFName(txtSearchValue.getText());
                 DefaultTableModel model= (DefaultTableModel) tblListEmployees.getModel();
                 model.setRowCount(0);
                 model.setRowCount(names.size());
               for(int y = 0; y < names.size(); y ++)
               {
                   //JOptionPane.showMessageDialog(null, names.size());
                   
                   newRow = names.get(y);
                this.tblListEmployees.setValueAt(newRow.getEmp_number(), y, 0);
                this.tblListEmployees.setValueAt(newRow.getFname(),y,1);
                this.tblListEmployees.setValueAt(newRow.getLname(),y,2);
                this.tblListEmployees.setValueAt(newRow.getIdNumber(),y,3);
                this.tblListEmployees.setValueAt(newRow.getCellphone(),y,4);
                this.tblListEmployees.setValueAt(newRow.getAddress(),y,5);
                this.tblListEmployees.setValueAt(newRow.getHireDate(),y,6);
                this.tblListEmployees.setValueAt(newRow.getSex(),y,7);
                //this.tblListEmployees.setValueAt(newRow.getPassword(),y,8);
                this.tblListEmployees.setValueAt(newRow.getEmail(),y,8);
                this.tblListEmployees.setValueAt(newRow.getBirthday(),y,9);
                this.tblListEmployees.setValueAt(newRow.getJobType(),y,10);
           
               }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "ooooo " + e.getMessage());
            }
        }
         if(searchMethod.equalsIgnoreCase("last name"))
        {
              ClassDao search = new ClassDao();
            try {
                search.openConnection();
                 ArrayList<Staff> names = new   ArrayList<Staff>();
                    
               Staff newRow = new Staff();
                names = search.searchByLName(txtSearchValue.getText());
                
                DefaultTableModel model= (DefaultTableModel) tblListEmployees.getModel();
                 model.setRowCount(0);
                 model.setRowCount(names.size());
                
               for(int y = 0; y < names.size(); y ++)
               {
                  
                   
                   newRow = names.get(y);
                this.tblListEmployees.setValueAt(newRow.getEmp_number(), y, 0);
                this.tblListEmployees.setValueAt(newRow.getFname(),y,1);
                this.tblListEmployees.setValueAt(newRow.getLname(),y,2);
                this.tblListEmployees.setValueAt(newRow.getIdNumber(),y,3);
                this.tblListEmployees.setValueAt(newRow.getCellphone(),y,4);
                this.tblListEmployees.setValueAt(newRow.getAddress(),y,5);
                this.tblListEmployees.setValueAt(newRow.getHireDate(),y,6);
                this.tblListEmployees.setValueAt(newRow.getSex(),y,7);
                //this.tblListEmployees.setValueAt(newRow.getPassword(),y,8);
                this.tblListEmployees.setValueAt(newRow.getEmail(),y,8);
                this.tblListEmployees.setValueAt(newRow.getBirthday(),y,9);
                this.tblListEmployees.setValueAt(newRow.getJobType(),y,10);
         
               }
                
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        
        } 
          }
          else
          {
              JOptionPane.showConfirmDialog(null, "Search fiel is empty");
          }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void mnuExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuExit1MouseClicked
        Login_Form tstConn = new Login_Form();
        this.dispose();
        tstConn.setVisible(true);
    }//GEN-LAST:event_mnuExit1MouseClicked

    private void jBtnListAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnListAllActionPerformed

        
        ClassDao allEmp = new ClassDao();
        ArrayList<Staff> listEmp = new ArrayList<Staff>();
        Staff staff = new Staff();
        try
        {
            allEmp.openConnection();
            listEmp = allEmp.sectAll();
             DefaultTableModel model= (DefaultTableModel) tblListEmployees.getModel();
                 model.setRowCount(listEmp.size());
                 
                 for(int y = 0; y < listEmp.size(); y ++)
                 {
                     staff = listEmp.get(y);
                        this.tblListEmployees.setValueAt(staff.getEmp_number(), y, 0);
                        this.tblListEmployees.setValueAt(staff.getFname(),y,1);
                        this.tblListEmployees.setValueAt(staff.getLname(),y,2);
                        this.tblListEmployees.setValueAt(staff.getIdNumber(),y,3);
                        this.tblListEmployees.setValueAt(staff.getCellphone(),y,4);
                        this.tblListEmployees.setValueAt(staff.getAddress(),y,5);
                        this.tblListEmployees.setValueAt(staff.getHireDate(),y,6);
                        this.tblListEmployees.setValueAt(staff.getSex(),y,7);
                        //this.tblListEmployees.setValueAt(newRow.getPassword(),y,8);
                        this.tblListEmployees.setValueAt(staff.getEmail(),y,8);
                this.tblListEmployees.setValueAt(staff.getBirthday(),y,9);
                this.tblListEmployees.setValueAt(staff.getJobType(),y,10);
                 }
            
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Connection Error: " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jBtnListAllActionPerformed

    private void txtSearchValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchValueActionPerformed

    private void txtSearchValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchValueKeyTyped
        
        if(rdrEmpId.isSelected())
        {
            if(txtSearchValue.getText().length() > 5)
            {
                evt.consume();
            }
        }
        else if(rdrLName.isSelected())
        {
            if(txtSearchValue.getText().length() > 35)
            {
                evt.consume();
            }
        }
        else if(rdrFName.isSelected())
        {
            if(txtSearchValue.getText().length() > 25)
            {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtSearchValueKeyTyped

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListEmployees().setVisible(true);
            }
        });
    }
    
    public void rdrButtons()
    {
        rdrEmpId.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jBtnListAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnuExit;
    private javax.swing.JMenu mnuExit1;
    private javax.swing.JMenu mnuReturn;
    private javax.swing.JRadioButton rdrEmpId;
    private javax.swing.JRadioButton rdrFName;
    private javax.swing.JRadioButton rdrLName;
    private javax.swing.JTable tblListEmployees;
    private javax.swing.JTextField txtSearchValue;
    // End of variables declaration//GEN-END:variables
}
