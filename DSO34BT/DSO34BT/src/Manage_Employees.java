
/*import static Manager_Form.validateEmail;
import static Manager_Form.validateEmail;*/
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Manage_Employees extends javax.swing.JFrame {

    private Date hire_date = new Date();
   private String id;
   private String pass;
    
    public Manage_Employees() {
        initComponents();
        btnUpdate.setEnabled(false);
        
        User user = new User();
        id = user.getIdLogger();
        
       ClassDao staffDao = new ClassDao();
       Staff staff = new Staff();
       
       try
       {
           staffDao.openConnection();
           staff = staffDao.retrieveEmployee(id);
           jLblUser.setText(staff.getFname() + " " + staff.getLname());
           staffDao.closeConnection();
       }catch(ClassNotFoundException | SQLException ex)
       {
           JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getMessage());
       }
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        registerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        txtIdNumber = new javax.swing.JTextField();
        txtCellnumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtJobs = new javax.swing.JComboBox();
        btnInsert = new javax.swing.JButton();
        txtEmployeeName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressArea = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        btnRemoveEmp = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtEmp_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtCell = new javax.swing.JTextField();
        emailAdd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addRess = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        txtIDNumber = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cmbJob_Types1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        passwordChange = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPass = new javax.swing.JPasswordField();
        txtConPass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLblUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jManPanel = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Employees:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        registerPanel.setBackground(new java.awt.Color(255, 255, 255));
        registerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Staff:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 12))); // NOI18N
        registerPanel.setToolTipText("");

        jLabel2.setText("Name:");

        jLabel3.setText("Surname:");

        jLabel4.setText("ID Number :");

        jLabel5.setText("Cell Number:");

        jLabel6.setText("Email:");

        jLabel7.setText("Job Type :");

        jLabel8.setText("Address :");

        txtSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurnameKeyTyped(evt);
            }
        });

        txtIdNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdNumberKeyTyped(evt);
            }
        });

        txtCellnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCellnumberKeyTyped(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtJobs.setBackground(new java.awt.Color(204, 204, 204));
        txtJobs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Petrol Attendant", "Manager", "Cleaner" }));

        btnInsert.setText("Register");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        txtEmployeeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmployeeNameKeyTyped(evt);
            }
        });

        addressArea.setColumns(20);
        addressArea.setRows(5);
        addressArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressAreaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(addressArea);

        btnReset.setText("Clear");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel28.setText("Hire Date:");

        jDateChooser1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDateChooser1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel28)
                            .addComponent(jLabel8))
                        .addGap(11, 11, 11)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCellnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCellnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtJobs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnInsert))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remove Employee:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        btnRemoveEmp.setText("Remove Employee");
        btnRemoveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEmpActionPerformed(evt);
            }
        });

        jLabel27.setText("Employee ID :");

        txtEmp_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmp_idKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(txtEmp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveEmp)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtEmp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveEmp))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Personal Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 12))); // NOI18N

        jLabel12.setText("First Name:");

        jLabel13.setText("Last Name :");

        jLabel14.setText("Cellphone :");

        jLabel15.setText("Email:");

        txtFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFNameKeyTyped(evt);
            }
        });

        txtLName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLNameKeyTyped(evt);
            }
        });

        txtCell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCellKeyTyped(evt);
            }
        });

        emailAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailAddKeyTyped(evt);
            }
        });

        jLabel17.setText("Address:");

        addRess.setColumns(20);
        addRess.setRows(5);
        addRess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addRessKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(addRess);

        jLabel18.setText("ID Number:");

        txtIDNumber.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtIDNumberInputMethodTextChanged(evt);
            }
        });
        txtIDNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNumberActionPerformed(evt);
            }
        });
        txtIDNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDNumberKeyTyped(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
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
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFName, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(txtLName)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCell, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(searchBtn))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Employee:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        jLabel24.setText("Search Employee :");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/search.jpeg"))); // NOI18N
        jLabel31.setText("jLabel31");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Job Type:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        cmbJob_Types1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cleaner", "Petrol Attendant", "Manager" }));

        jLabel1.setText("Employee ID:");

        jButton1.setText("Promote");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbJob_Types1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbJob_Types1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jButton1))
        );

        passwordChange.setBackground(new java.awt.Color(255, 255, 255));
        passwordChange.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password Change:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 12))); // NOI18N

        jLabel22.setText("O ld Password :");

        jLabel23.setText("New Password :");

        jLabel21.setText("Confirm Password :");

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        txtOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOldPasswordKeyTyped(evt);
            }
        });

        txtNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewPassKeyTyped(evt);
            }
        });

        txtConPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConPassKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout passwordChangeLayout = new javax.swing.GroupLayout(passwordChange);
        passwordChange.setLayout(passwordChangeLayout);
        passwordChangeLayout.setHorizontalGroup(
            passwordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordChangeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(passwordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(passwordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNewPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtConPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(passwordChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passwordChangeLayout.setVerticalGroup(
            passwordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(passwordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(passwordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(passwordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtConPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChange)
                .addContainerGap())
        );

        jLabel9.setText("User:");

        jLblUser.setText("Employee Name");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(passwordChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLblUser)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLblUser))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(passwordChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu1.setText("Menu");

        jManPanel.setText("Manager Panel");
        jManPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManPanelActionPerformed(evt);
            }
        });
        jMenu1.add(jManPanel);

        jMenuItem5.setText("Fuel Info");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem1.setText("Tank INfo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem6.setText("Dispensers");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Logout");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Exit");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyTyped

        if(txtSurname.getText().length() > 34)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtSurnameKeyTyped

    private void txtIdNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdNumberKeyTyped

        if(txtIdNumber.getText().length() > 12)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdNumberKeyTyped

    private void txtCellnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellnumberKeyTyped

        if(txtCellnumber.getText().length() > 9)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCellnumberKeyTyped

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped

        if( txtEmail.getText().length() > 44)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        String fname = "", lname;
        long idNumber, cellNumber;
        String emailAdd, passCode = "";
        String job_type;
        String homeAdd;
        ClassDao insert = new ClassDao();
        Random newPass = new Random();

        try
        {

            boolean status = testName(txtEmployeeName.getText());
            if( status == true)
            {
                fname = txtEmployeeName.getText();
                txtEmployeeName.setBackground(Color.white);
                if(!txtEmployeeName.getText().isEmpty())
                {
                    status = testName(txtSurname.getText());
                    if( status == true)
                    {
                        lname = txtSurname.getText();
                        txtSurname.setBackground(Color.white);
                        if(!txtIdNumber.getText().isEmpty())
                        {
                            txtIdNumber.setBackground(Color.white);
                            if(!txtCellnumber.getText().isEmpty())
                            {
                                txtCellnumber.setBackground(Color.white);
                                if(validateEmail(txtEmail.getText()) == true)
                                {
                                    txtEmail.setBackground(Color.white);
                                    txtCellnumber.setBackground(Color.white);
                                    txtIdNumber.setBackground(Color.white);

                                    if(!addressArea.getText().isEmpty())
                                    {
                                        addressArea.setBackground(Color.white);
                                        homeAdd = addressArea.getText().trim();
                                        emailAdd = txtEmail.getText().trim();
                                        job_type = txtJobs.getSelectedItem().toString().trim();
                                        idNumber = Long.parseLong(txtIdNumber.getText()); // integer variable holds less than 13 digits

                                        cellNumber = Long.parseLong(txtCellnumber.getText());

                                        insert.openConnection();
                                        String[] aplhas = {"A","B","C","D","E"};
                                        StringBuilder sb = new StringBuilder();
                                        char[] password = new char[12];
                                        char[] validchars = {'A','B','C','D','E','F','G','H','I','J','K','L','M','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
                                        Random rand = new Random(System.nanoTime());
                                        for (int i = 0; i < 6; i++) 
                                        {
                                            password[i] = validchars[rand.nextInt(validchars.length)];
                                            passCode = passCode + password[i];
                                        }
                                        
                                        DateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
                                        
                                        String hireDate =dateF.format(hire_date);
                                          

                                        int rows = insert.inserUsers(lname.trim(), fname.trim().trim(), txtIdNumber.getText().trim(),txtCellnumber.getText().trim() , emailAdd, passCode, job_type, homeAdd, hireDate);
                                        JOptionPane.showMessageDialog(null,"Employee Added Successfully:\nPassword: \"" + passCode + "\" Note that password can be changed anytime");
                                        txtEmployeeName.setText("");
                                        txtSurname.setText("");
                                        txtIdNumber.setText("");
                                        txtCellnumber.setText("");
                                        txtEmail.setText("");
                                        addressArea.setText("");

                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(null, "Address Must be filled in");
                                        addressArea.setBackground(Color.orange);
                                    }

                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Invalid email address, Enter valid email");
                                    txtEmail.setBackground(Color.orange);

                                }

                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Please Ensure that cellphon field is not empty");
                                txtCellnumber.setBackground(Color.orange);
                            }

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Please ensure that your ID is fileed in", "Password Empty", 3);
                            txtIdNumber.setBackground(Color.red);
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Surname must only contain alphabetical characters");
                        txtSurname.setBackground(Color.orange);
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Name must only contain alphabetical characters");
                    txtEmployeeName.setBackground(Color.orange);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Name must only contain alphabetical characters and Can not be empty", "Incorrect Name Characters", 3);
                txtEmployeeName.setBackground(Color.orange);
            }
        }catch(ClassNotFoundException | SQLException | HeadlessException ex)
        {
            JOptionPane.showMessageDialog(null,"Connection Lost: " + ex.getMessage());

        }catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Incorrect value entry, ID field requires numeric characters");
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtEmployeeNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNameKeyTyped

        if(txtEmployeeName.getText().length() > 24)
        {
            evt.consume();
        }
        ClassDao dao = new ClassDao();
    }//GEN-LAST:event_txtEmployeeNameKeyTyped

    private void addressAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressAreaKeyTyped

        if( addressArea.getText().length() > 49)
        {
            evt.consume();
        }
    }//GEN-LAST:event_addressAreaKeyTyped

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtEmployeeName.setText("");
        txtSurname.setText("");
        txtIdNumber.setText("");
        txtCellnumber.setText("");
        txtEmail.setText("");
        addressArea.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRemoveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEmpActionPerformed
        ClassDao connOpen = new ClassDao();

        if(!txtEmp_id.getText().isEmpty())
        {

            
                try
                {
                    int empId = Integer.parseInt(txtEmp_id.getText());
                    connOpen.openConnection();
                     int test = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove employee #" + txtEmp_id.getText());
                     if(test == 0)
                     {
                        int row = connOpen.removeEmp(txtEmp_id.getText());
                        if(row > 0)
                        {
                            JOptionPane.showMessageDialog(null, "Employee " + txtEmp_id.getText() + " removed");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Employee not removed please make sure the employee id is correct");
                        }
                        
                     }
                    
                    txtEmp_id.setBackground(Color.white);
                    txtEmp_id.setText("");
                    connOpen.closeConnection();
                }catch(ClassNotFoundException | SQLException | HeadlessException ec)
                {
                    JOptionPane.showMessageDialog(null, ec.getMessage());
                }catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(null, "Numeric Error: Emplyee id must be numeric" + ex.getMessage());
                     txtEmp_id.setBackground(Color.orange);
                }
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "employee Id field empty, please enter valid employee id");
            txtEmp_id.setBackground(Color.orange);
        }

    }//GEN-LAST:event_btnRemoveEmpActionPerformed

    private void txtEmp_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmp_idKeyTyped
        if( txtEmp_id.getText().length() > 4)
        {
            evt.consume();
        }

    }//GEN-LAST:event_txtEmp_idKeyTyped

    private void txtFNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNameKeyTyped

        if( txtFName.getText().length() > 24)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtFNameKeyTyped

    private void txtLNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLNameKeyTyped

        if( txtLName.getText().length() > 34)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtLNameKeyTyped

    private void txtCellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellKeyTyped

        if( txtCell.getText().length() > 9)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCellKeyTyped

    private void emailAddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailAddKeyTyped

        if( emailAdd.getText().length() > 45)
        {

            evt.consume();
        }
    }//GEN-LAST:event_emailAddKeyTyped

    private void txtIDNumberInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtIDNumberInputMethodTextChanged

    }//GEN-LAST:event_txtIDNumberInputMethodTextChanged

    private void txtIDNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNumberActionPerformed
        //txtCell.setText("0813564839");

    }//GEN-LAST:event_txtIDNumberActionPerformed

    private void txtIDNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDNumberKeyTyped
        if(txtIDNumber.getText().length() > 12)
        {
            evt.consume();
        }

    }//GEN-LAST:event_txtIDNumberKeyTyped

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        ClassDao dao = new ClassDao();
        int row = 0;
        try
        {
            dao.openConnection();
            if(!txtFName.getText().trim().isEmpty())
            {
                if(!txtLName.getText().trim().isEmpty())
                {
                    if(!txtCell.getText().trim().isEmpty() && txtCell.getText().trim().length() == 10)
                    {
                        if(!emailAdd.getText().trim().isEmpty())
                        {
                            if(!addRess.getText().trim().isEmpty())
                            {
                               long idNUm = Long.parseLong(txtIDNumber.getText());
                                if(idNUm > 0)
                               {
                                    
                                   int upTest = JOptionPane.showConfirmDialog(null, "Are you sure you want update employee");
                                   
                                   if(upTest == 0)
                                   {
                                      row = dao.updateMethod(txtIDNumber.getText(), txtFName.getText(), txtLName.getText(), emailAdd.getText(), txtCell.getText(), addRess.getText());
                                        if(row > 0)
                                        {
                                         JOptionPane.showMessageDialog(null,  "Employee updated successfully");
                                         txtIDNumber.setText("");
                                         txtFName.setText("");
                                         txtLName.setText("");
                                         emailAdd.setText("");
                                         txtCell.setText("");
                                         addRess.setText("");
                                         btnUpdate.setEnabled(false);
                                        }
                                        else
                                    {
                                        JOptionPane.showMessageDialog(null, "No update done");
                                    }
                                   }
                                     
                               }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Address area is empty, PLease suppply address");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "email address field should not be empty");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please provide cellphone number in the cellphone field");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please provide surname in the surname field");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please provide your name in the name field");
            }

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, row + "Row updated "+ ex.getMessage());
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        ClassDao dao = new ClassDao();
        Staff staff = new Staff();
        try {
            dao.openConnection();
            if(!txtIDNumber.getText().trim().isEmpty() && txtIDNumber.getText().trim().length() == 13)
            {
               long number = Long.parseLong(txtIDNumber.getText().trim());
               staff = dao.retrieveEmployee(txtIDNumber.getText().trim());
               
                if(staff == null)
                {
                    if(number < 0)
                    {
                        JOptionPane.showMessageDialog(null, "Error an ID number field must only contain numeric characters");
                    }
                    else
                    {
                       String id =txtIDNumber.getText();
                     Staff s = dao.retrieveEmployee(id);
                     txtFName.setText(s.getFname());
                     txtLName.setText(s.getLname());
                     emailAdd.setText(s.getEmail());
                     txtCell.setText(s.getCellphone());
                     addRess.setText(s.getAddress());
                     btnUpdate.setEnabled(true); 
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Employee does not exist");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ID number invalid, please make sure you enter a 13 digit ID number");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
             JOptionPane.showMessageDialog(null, "Connection Error: " + ex.getMessage());
        }catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "ID number field must be numeric " + ex.getMessage() );
        }catch(NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null, "Employee does not exist");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        //JOptionPane.showMessageDialog(null, "LOL");
        ListEmployees list = new ListEmployees();
        this.setVisible(false);
        list.setVisible(true);

    }//GEN-LAST:event_jLabel31MouseClicked

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        ClassDao daoConn = new ClassDao();
        long idNum = Long.parseLong(id);

        txtNewPass.setBackground(Color.white);
        txtConPass.setBackground(Color.white);

        txtOldPassword.setBackground(Color.white);
        try {
            daoConn.openConnection();

            if(!txtOldPassword.getText().isEmpty())
            {

                if(!txtNewPass.getText().isEmpty())
                {

                    if(txtNewPass.getText().equals(txtConPass.getText()))
                    {

                        String msg = daoConn.passwordChange(String.valueOf(idNum), txtNewPass.getText(), txtOldPassword.getText());
                        if(msg.equals("Old Password is not valid"))
                        {
                            txtOldPassword.setBackground(Color.orange);
                            JOptionPane.showMessageDialog(null, msg);

                        }
                        
                        else
                        {

                            txtOldPassword.setText("");
                            txtNewPass.setText("");
                            txtConPass.setText("");
                            
                            JOptionPane.showMessageDialog(null, msg);

                        }
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Password Confirmation Failed");
                        txtConPass.setBackground(Color.orange);
                        txtNewPass.setBackground(Color.orange);
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "New Pssword field is empty");
                    txtNewPass.setBackground(Color.orange);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Old password field is empty");
                txtOldPassword.setBackground(Color.orange);
            }

        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null,  ex.getLocalizedMessage());

        }

    }//GEN-LAST:event_btnChangeActionPerformed

    private void txtOldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldPasswordKeyTyped

        if( txtOldPassword.getText().length() > 15)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtOldPasswordKeyTyped

    private void txtNewPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPassKeyTyped

        if( txtNewPass.getText().length() > 15)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNewPassKeyTyped

    private void txtConPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConPassKeyTyped

        if( txtConPass.getText().length() > 15)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtConPassKeyTyped

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
       
        
        String date = jDateChooser1.getDateFormatString();
        
       
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDateChooser1AncestorAdded
        
    }//GEN-LAST:event_jDateChooser1AncestorAdded

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
         
        
        hire_date = jDateChooser1.getDate();
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         String datF = dateFormat.format(hire_date);
        
         try
         {
             Date dateVar = dateFormat.parse(datF);
              //JOptionPane.showMessageDialog(null, dateFormat.format(dateVar));
         }catch(ParseException | HeadlessException ex)
         {
             JOptionPane.showMessageDialog(null, ex.getMessage());
         }
        
        
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Login_Form login = new Login_Form() ;
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jManPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManPanelActionPerformed
        
        Manager_Panel manP = new Manager_Panel();
        this.dispose();
        manP.setVisible(true);
       
    }//GEN-LAST:event_jManPanelActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         Fuel_Info fuel = new Fuel_Info();
        this.dispose();
        fuel.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        Dispenser_form dispForm = new Dispenser_form();
        this.dispose();
        dispForm.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Tank_Info tankInfo = new Tank_Info();
        this.dispose();
        tankInfo.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
        System.exit(1);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
       System.exit(1);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void addRessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addRessKeyTyped
        if((addRess.getText().length() > 85))
        {
            evt.consume();
        }
    }//GEN-LAST:event_addRessKeyTyped

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
            java.util.logging.Logger.getLogger(Manage_Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Employees().setVisible(true);
            }
        });
    }

    
     public boolean testName(String name)
	{
		
		if(name.matches("[a-zA-Z]+"))
		{
			return true;
		}
		else{
			return false;
		}
	}
     
     public boolean testId(String number)
    {
        boolean status;
        if(number.matches("0-9+"))
        {
            status = true;
        }
        else
        {
            status = false;
        }
        
        return status;
        
    }
     
      public static boolean validateEmail(String email)
    {
       boolean status = false;
       String EMAIL_PATTERN = "^[_A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; // "^(.+)@(.+)$";
       Pattern pattern = Pattern.compile(EMAIL_PATTERN);
       Matcher matcher = pattern.matcher(email);
      
      
    
            if (matcher.matches())
           {
               status = true;
           }
           else
           {
               status = false;
           }
        
       return status;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addRess;
    private javax.swing.JTextArea addressArea;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRemoveEmp;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbJob_Types1;
    private javax.swing.JTextField emailAdd;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblUser;
    private javax.swing.JMenuItem jManPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel passwordChange;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField txtCell;
    private javax.swing.JTextField txtCellnumber;
    private javax.swing.JPasswordField txtConPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmp_id;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtIDNumber;
    private javax.swing.JTextField txtIdNumber;
    private javax.swing.JComboBox txtJobs;
    private javax.swing.JTextField txtLName;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
