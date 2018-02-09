
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tank_Info extends javax.swing.JFrame {
    
      private static DefaultTableModel model;
  
    
    public Tank_Info() {
        initComponents();
        
        int fuelIndex;
        int tankIndex;
         
        
        
        
        txtCapacity.setEditable(false);
        txtLitresToFill.setEditable(false);
        txtLitresAvail.setEditable(false);
            
            cmbFuelAdd.setEnabled(false);
        
            TankDAO tankInfo = new TankDAO();
            Tank_Class list = new Tank_Class();
            ArrayList<Tank_Class> data = new ArrayList<Tank_Class>();
            
             User user = new User();
             Staff staff = new Staff();
             
             ClassDao job = new ClassDao();
             
            try
            {
                job.openConnection();
                staff = job.retrieveEmployee(user.getIdLogger());
                
                jLblUser.setText(staff.getFname() + " " + staff.getLname());
                
                tankInfo.openConn();
              
                data = tankInfo.getIdFuelType();
                
                for(int y = 0; y < data.size(); y ++)
                {
                    
                   cmbID.addItem(data.get(y).getTank_id() + ": " + data.get(y).getFuel_type() );
                   jCmbTankId.addItem(data.get(y).getTank_id());
                   cmbTankId.addItem(data.get(y).getTank_id());
                   cmbFuelType1.addItem(data.get(y).getTank_id());
                   
                }
                    
                
            }catch(ClassNotFoundException | SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getLocalizedMessage());
            }catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(null, "Error Null Pointer experienced: " + ex.getMessage());
            }
            
            
            
           
      
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tankDetails = new javax.swing.JTable();
        btnList = new javax.swing.JButton();
        cmbTankId = new javax.swing.JComboBox();
        jPanelAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVolume = new javax.swing.JTextField();
        btnAddTank = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTankName = new javax.swing.JTextField();
        jCheckToAddFuel = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        cmbFuelAdd = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbID = new javax.swing.JComboBox<>();
        btnRemoveTank = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanelFill = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCapacity = new javax.swing.JTextField();
        txtLitresAvail = new javax.swing.JTextField();
        txtLitresToFill = new javax.swing.JTextField();
        btnFill = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tankFType = new javax.swing.JComboBox<>();
        progressBLevel = new javax.swing.JProgressBar();
        cmbFuelType1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTankName = new javax.swing.JTextField();
        jbtnUpdate = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jCmbTankId = new javax.swing.JComboBox<>();
        jCmbFuel = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLblUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menue1 = new javax.swing.JMenu();
        manPanel1 = new javax.swing.JMenuItem();
        FuelPanel1 = new javax.swing.JMenuItem();
        manTank1 = new javax.swing.JMenuItem();
        empPanel1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tank Mangement:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Tank Info:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        jLabel1.setText("Tankl ID:");

        tankDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tank Name", "Tank Volume", "Fuel Level", "Fuel Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tankDetails);

        btnList.setText("List All");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        cmbTankId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTankIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbTankId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTankId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnList)
                .addContainerGap())
        );

        jPanelAdd.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Tank:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/guage.jpeg"))); // NOI18N

        jLabel5.setText("Volume(Litres):");

        txtVolume.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVolumeKeyTyped(evt);
            }
        });

        btnAddTank.setText("Add Tank");
        btnAddTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTankActionPerformed(evt);
            }
        });

        jLabel3.setText("Tank Name:");

        txtTankName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTankNameKeyTyped(evt);
            }
        });

        jCheckToAddFuel.setText("Check To Add Fuel:");
        jCheckToAddFuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckToAddFuelMouseClicked(evt);
            }
        });
        jCheckToAddFuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckToAddFuelActionPerformed(evt);
            }
        });

        jLabel6.setText("Fuel Type:");

        javax.swing.GroupLayout jPanelAddLayout = new javax.swing.GroupLayout(jPanelAdd);
        jPanelAdd.setLayout(jPanelAddLayout);
        jPanelAddLayout.setHorizontalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTankName)
                            .addGroup(jPanelAddLayout.createSequentialGroup()
                                .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckToAddFuel)
                            .addComponent(cmbFuelAdd, 0, 134, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddTank, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanelAddLayout.setVerticalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckToAddFuel)
                .addGap(16, 16, 16)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbFuelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnAddTank)
                .addGap(35, 35, 35))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remove Tank:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        jLabel8.setText("Tank ID:");

        cmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDActionPerformed(evt);
            }
        });

        btnRemoveTank.setText("Remove");
        btnRemoveTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTankActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/deletePic.JPG"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bigDelete.JPG"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/deletePic.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cmbID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveTank)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveTank))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFill.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFill.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fill Tank:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/guage.jpeg"))); // NOI18N

        jLabel14.setText("Tank ID:");

        jLabel15.setText("Tank Capacity (litres):");

        jLabel16.setText("FuelAvailable (litres):");

        jLabel17.setText("Fuel Trailing (litres):");

        btnFill.setText("Fill Tank");
        btnFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillActionPerformed(evt);
            }
        });

        jLabel4.setText("Fuel Type:");

        tankFType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tankFTypeActionPerformed(evt);
            }
        });

        progressBLevel.setForeground(new java.awt.Color(255, 102, 0));
        progressBLevel.setStringPainted(true);

        cmbFuelType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuelType1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFillLayout = new javax.swing.GroupLayout(jPanelFill);
        jPanelFill.setLayout(jPanelFillLayout);
        jPanelFillLayout.setHorizontalGroup(
            jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFillLayout.createSequentialGroup()
                        .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLitresToFill, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLitresAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addComponent(progressBLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFillLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFuelType1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tankFType, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanelFillLayout.createSequentialGroup()
                .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFillLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(jPanelFillLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFillLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFill, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanelFillLayout.setVerticalGroup(
            jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFillLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFillLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFillLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFuelType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFillLayout.createSequentialGroup()
                        .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tankFType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLitresAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtLitresToFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnFill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progressBLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Tank:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        jLabel7.setText("Tank ID:");

        jLabel13.setText("Tank Name:");

        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jLabel20.setText("Fuel Type:");

        jCmbTankId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbTankIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCmbTankId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTankName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCmbFuel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCmbTankId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jCmbFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnUpdate)
                .addContainerGap())
        );

        jLabel18.setText("User:");

        jLblUser.setText("Employee Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanelFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLblUser)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLblUser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        menue1.setText("Menu");

        manPanel1.setText("Manager Panel");
        manPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manPanel1ActionPerformed(evt);
            }
        });
        menue1.add(manPanel1);

        FuelPanel1.setText("Fuel Info");
        FuelPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuelPanel1ActionPerformed(evt);
            }
        });
        menue1.add(FuelPanel1);

        manTank1.setText("Dispensers");
        manTank1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manTank1ActionPerformed(evt);
            }
        });
        menue1.add(manTank1);

        empPanel1.setText("Manage Employees");
        empPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empPanel1ActionPerformed(evt);
            }
        });
        menue1.add(empPanel1);

        jMenuBar1.add(menue1);

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
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTankActionPerformed

        double volume = 0.0;
        int row = 0;
        TankDAO tankFill = new TankDAO();
        FuelDAO fuel = new FuelDAO();
        Fuel fuelInfo = new Fuel();
        
        
        try
        {
            tankFill.openConn();
            volume = Double.parseDouble(txtVolume.getText());
            if(volume > 4999 && volume <15001)
            {
                if(!txtTankName.getText().trim().isEmpty())
                {
                    if(jCheckToAddFuel.isSelected())
                    {
                        fuel.openConn();
                        fuelInfo = fuel.getByFuel(cmbFuelAdd.getSelectedItem().toString().trim());
                        String f_id = fuelInfo.getFuel_id();
                        row = tankFill.addFuelType(txtTankName.getText().toString(), Double.parseDouble(txtVolume.getText().toString()), f_id);
                        if(row > 0)
                         {
                            JOptionPane.showMessageDialog(null, row + " Tank added succesfully");
                            txtTankName.setText("");
                            txtVolume.setText("");
                         }
                        else
                        {
                            JOptionPane.showMessageDialog(null, row + " Tank added, please ensure you enter the coreect details");
                        }
                        
                    }
                    else
                    {
                         row = tankFill.AddTank(txtTankName.getText(), Double.parseDouble(txtVolume.getText()));
                         if(row > 0)
                         {
                            JOptionPane.showMessageDialog(null, row + " Tank added succesfully");
                            txtTankName.setText("");
                            txtVolume.setText("");
                         }
                    }
                   
                    
                    
                    Tank_Class tankID = new Tank_Class(); 
                    tankID = tankFill.selectMax();
                     
                    if(!jCheckToAddFuel.isSelected())
                    {
                        cmbTankId.addItem(tankID.getTank_id());
                    cmbID.addItem(tankID.getTank_id() + ": Fuel Not Assgined");
                    cmbFuelType1.addItem(tankID.getTank_id());
                    }
                    else
                    {
                        String fuelName = cmbFuelAdd.getSelectedItem().toString();
                        cmbTankId.addItem(tankID.getTank_id());
                        cmbID.addItem(tankID.getTank_id() + ": " + cmbFuelAdd.getSelectedItem());
                        cmbFuelType1.addItem(tankID.getTank_id());
                        cmbFuelAdd.removeItem(fuelName);
                    }
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "It is mandtory to enter a descriptive name for the tank");
                    txtTankName.setBackground(Color.ORANGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Minimum tank volume is 5000\nand the maximum is 15000");
                txtVolume.setBackground(Color.ORANGE);
            }
            tankFill.closeConnection();
        fuel.closeConn();
        
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Error: " + ex.getMessage());
        }catch(NumberFormatException ex)
        {
            txtVolume.setBackground(Color.orange);
            JOptionPane.showMessageDialog(null, "Numeric Entry on the \"Volume(Litres)\" is required");
        }
        
    }//GEN-LAST:event_btnAddTankActionPerformed

    private void btnRemoveTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTankActionPerformed
        
        int rowUpdate = 0;
        
        TankDAO tank = new TankDAO();
        try
        {
            tank.openConn();
            int index = 0;
            
            String fuel = cmbID.getSelectedItem().toString().substring(3);
            
           int test = JOptionPane.showConfirmDialog(rootPane, "Are You sure you want to remove \"Tank: " + cmbID.getSelectedItem().toString().substring(0,2) + " \"");   
            
           if(test == 0) //0 means yes
           {
               index = cmbID.getSelectedIndex();
               rowUpdate = tank.removeTank(cmbID.getSelectedItem().toString().substring(0,2));
               if(rowUpdate > 0)
            {
                tank.closeConnection();
                JOptionPane.showMessageDialog(null, "Tank: " + cmbID.getSelectedItem().toString().substring(0,2) + " removed");                
                 
                cmbID.removeItemAt(index);
                cmbTankId.removeItemAt(index);
                cmbFuelType1.removeItemAt(index);
                jCmbTankId.removeItemAt(index);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Connection Error Tank: " + cmbID.getSelectedItem().toString().substring(0,2) + " Could not be  removed");
            }
           }
           else
           {
               
               JOptionPane.showMessageDialog(rootPane, "Tank: " + cmbID.getSelectedItem().toString().substring(0,2) + " not removed");
           }
           
           tank.closeConnection();
            
        }catch(ClassNotFoundException | SQLException | HeadlessException ec)
        {
            JOptionPane.showMessageDialog(null, "Tank Not removed: " + ec.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_btnRemoveTankActionPerformed

    private void cmbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIDActionPerformed
        
    }//GEN-LAST:event_cmbIDActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        
        Tank_Class tClass = new Tank_Class();
        TankDAO tank = new TankDAO();
        ArrayList<Tank_Class> classTank = new ArrayList<Tank_Class>();
        DefaultTableModel model;
        model = (DefaultTableModel) tankDetails.getModel();
        model.setRowCount(0);
        
        try
        {
            
            tank.openConn();
            classTank = tank.getAllTankInfo();            
            model.setRowCount(classTank.size());
            
            for(int i = 0; i < classTank.size(); i ++)
            {
                tClass = classTank.get(i);
                this.tankDetails.setValueAt(tClass.getTank_name(), i, 0);
             this.tankDetails.setValueAt(tClass.getTank_volume(), i, 1);
             this.tankDetails.setValueAt(tClass.getFuel_level(), i, 2);
            this.tankDetails.setValueAt(tClass.getFuel_type(), i, 3);
                
                //tankDetails.setValueAt(tClass.getFuel_id(), i, 4);
            }
            
            tank.closeConnection();
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnListActionPerformed

    private void txtVolumeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVolumeKeyTyped
        if(txtVolume.getText().length() > 4)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtVolumeKeyTyped

    private void txtTankNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTankNameKeyTyped
        if(txtTankName.getText().length() > 14)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtTankNameKeyTyped

    private void jCheckToAddFuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckToAddFuelMouseClicked

        
        if(jCheckToAddFuel.isSelected())
        {
            FuelDAO fuel = new FuelDAO();
            ArrayList<Fuel> list = new ArrayList<>();
            Fuel  info = new Fuel();
            
            TankDAO tankInfo = new TankDAO();
            Tank_Class tank = new Tank_Class();
            ArrayList<Tank_Class> tankList = new ArrayList<Tank_Class>();
            
            ArrayList<String> comboBoxVals = new ArrayList<String>();
            
            try
            {
                fuel.openConn();
                tankInfo.openConn();
                
                list = fuel.getFuelType();
                
                for(int i = 0; i < list.size(); i ++)
                {
                   comboBoxVals.add(list.get(i).getFuel_type());
                }
                
                tankList = tankInfo.getAllTankInfo();
                
                for(int i = 0; i < comboBoxVals.size(); i ++)
                {
                    
                    for(int y = 0; y < tankList.size(); y ++)
                    {
                        tank = tankList.get(y);
                        if(comboBoxVals.get(i).equalsIgnoreCase(tank.getFuel_type()))
                        {
                            
                            comboBoxVals.remove(i);
                        }
                        
                    }
                }
                cmbFuelAdd.setEnabled(true);
                for(int u = 0; u < comboBoxVals.size(); u ++)
                {
                    cmbFuelAdd.addItem(comboBoxVals.get(u));
                }
                
                
                fuel.closeConn();
                tankInfo.closeConnection();
            }catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
            }catch(IndexOutOfBoundsException ex)
            {
                JOptionPane.showMessageDialog(null, "All fuel type have been assigned to tanks");
                jCheckToAddFuel.doClick();
            }catch(ClassNotFoundException e)
            {
                JOptionPane.showMessageDialog(null, "Class Not Found " + e.getLocalizedMessage());
            }
        }
        else
        {
            cmbFuelAdd.removeAllItems();
            cmbFuelAdd.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckToAddFuelMouseClicked

    private void btnFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillActionPerformed
                
        double amtFill = 0.0;
        TankDAO tank = new TankDAO();
        Tank_Class tInfo = new Tank_Class();
        int updateRow = 0;
        
      JOptionPane.showMessageDialog(null, "Fuel Selected is: " + tankFType.getSelectedItem()+ "\nTank Selected is: " + cmbFuelType1.getSelectedItem());
       
      
        try
        {
           tank.openConn();
            amtFill = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter amount of fuel to fill tank"));
            
            if(amtFill/Double.parseDouble(txtLitresToFill.getText().trim()) * 100 >= 50)
            {
                if(amtFill <= Double.parseDouble(txtLitresToFill.getText().trim()))
                {
                    updateRow = tank.addFuelTotoTank(cmbFuelType1.getSelectedItem().toString().trim(), amtFill);
                    if(updateRow > 0)
                    {
                        tank.assignPetrol(cmbFuelType1.getSelectedItem().toString().trim(), tankFType.getSelectedItem().toString().trim());
                        JOptionPane.showMessageDialog(null, "Tank: " + cmbFuelType1.getSelectedItem().toString().trim() + " filled successfully with\n"
                                + " " + tankFType.getSelectedItem().toString().trim());
                        //cmbFuelAdd.removeItemAt(cmbFuelAdd.getSelectedIndex());
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Database Error: Update unsuccessful");
                        
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Fuel amount entered exceeds fuel that is trailing in the tank., \nMake sure you enter fuel that is below or equal to " + txtLitresToFill.getText().trim() + " litres");
                    btnFill.doClick();
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter fuel amount that is atleast 50% of trailing fuel");
                btnFill.doClick();
            }
           tank.closeConnection();
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Errore: " + ex.getMessage());
        }catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Invalid entry for fuel amount Please ensure you enter numeric characters");
        }catch(HeadlessException ex)
        {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnFillActionPerformed

    private void tankFTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tankFTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tankFTypeActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Login_Form login = new Login_Form();
        this.dispose();
        login.show();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void manPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manPanel1ActionPerformed
        Manager_Panel manPanel = new Manager_Panel();
        this.dispose();
        manPanel.setVisible(true);
    }//GEN-LAST:event_manPanel1ActionPerformed

    private void FuelPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuelPanel1ActionPerformed
        Fuel_Info fuelPane = new Fuel_Info();
        this.dispose();
        fuelPane.setVisible(true);
    }//GEN-LAST:event_FuelPanel1ActionPerformed

    private void empPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPanel1ActionPerformed
        Manage_Employees empMan = new Manage_Employees();
        this.dispose();
        empMan.setVisible(true);
    }//GEN-LAST:event_empPanel1ActionPerformed

    private void manTank1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manTank1ActionPerformed
        
       FuelDAO tankTest = new FuelDAO();
        ArrayList<Fuel> tank = new ArrayList<Fuel>();
        ArrayList<String> fuelAvail = new ArrayList<String>();
        try
        {
            tankTest.openConn();
            tank = tankTest.getFuelInTank();
            
           if(tank.size() > 0)
           {
               Dispenser_form dispForm = new Dispenser_form();
               this.dispose();
               dispForm.setVisible(true);
           }
           else
           {
               int test = JOptionPane.showConfirmDialog(null, "Fuel tanks are empty, click yes to fill tanks with fuel");
               if(test == 0)
               {
                   Tank_Info tInfo = new Tank_Info();
                   this.dispose();
                   tInfo.setVisible(true);
               }
               else
               {
                   
               }
           }
            
            
            
            
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_manTank1ActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        TankDAO updateTank = new TankDAO();
        Tank_Class tankInfo = new Tank_Class();
        int rowUpdate = 0;
        model = (DefaultTableModel) tankDetails.getModel();
        try
        {
            updateTank.openConn();
            boolean nameCheck;
            boolean numCheck;
            
                if(!jTankName.getText().trim().isEmpty())
                {
                    nameCheck = testName(jTankName.getText().trim());
                    int test = JOptionPane.showConfirmDialog(null, "Are you sure you want to update \"Tank: " + jCmbTankId.getSelectedItem().toString().trim() + "\" ");
                    if(test == 0)
                    {
                        rowUpdate = updateTank.updateTank(jCmbTankId.getSelectedItem().toString().trim(), jTankName.getText().trim(), jCmbFuel.getSelectedItem().toString().trim());
                        if(rowUpdate > 0)
                        {
                            JOptionPane.showMessageDialog(null, "Tank: " + jCmbTankId.getSelectedItem().toString().trim() + " successfully updated");
                            model.setRowCount(0);
                            
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Tank: " + jCmbTankId.getSelectedItem().toString().trim() + " update failed");
                        }
                    }
                }   
                else
                {
                    JOptionPane.showMessageDialog(null, "Tank Name fielsis empty, please enter the alphanumeric characters for the tank name");
                }
            
            
        }catch(ClassNotFoundException | SQLException  ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getLocalizedMessage());
        }catch(HeadlessException ex)
        {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jCmbTankIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbTankIdActionPerformed
        
        TankDAO checkLevel = new TankDAO();
        Tank_Class tClass = new Tank_Class();
        ArrayList<Fuel> fuel = new ArrayList<Fuel>();
        FuelDAO fuelAccess = new FuelDAO();
        
        
        try
        {
            checkLevel.openConn();
            tClass = checkLevel.getTanksById(jCmbTankId.getSelectedItem().toString().trim());
            
            if(tClass.getFuel_level() > 0.0)
            {
                jCmbFuel.removeAllItems();
                jCmbFuel.setEnabled(false);
            }
            else
            {
                fuelAccess.openConn();
                
                fuel = fuelAccess.getFuelType();
                
                
                 jCmbFuel.setEnabled(true); 
                 for(int i = 0; i < fuel.size(); i ++)
                 {
                     jCmbFuel.addItem(fuel.get(i).getFuel_type());
                 }
            }
            
            checkLevel.closeConnection();
        }catch(Exception ex)
        {
            
        }
        
    }//GEN-LAST:event_jCmbTankIdActionPerformed

    private void cmbTankIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTankIdActionPerformed
        DefaultTableModel model= (DefaultTableModel) tankDetails.getModel();
        
        if(cmbTankId.getSelectedItem().toString() == null)
        {
          
        }
        else
        {
             
                model.setRowCount(1); 


                 TankDAO dao = new TankDAO();
                 Tank_Class dataB = new Tank_Class();


                 try
                 {
                     dao.openConn();
                     //dataB = dao.getTanksById(cmbTankId.getSelectedItem().toString());
                     dataB = dao.getFuelInfoType(cmbTankId.getSelectedItem().toString());
                     this.tankDetails.setValueAt(dataB.getTank_name(), 0, 0);
                     this.tankDetails.setValueAt(dataB.getTank_volume(), 0, 1);
                     this.tankDetails.setValueAt(dataB.getFuel_level(), 0, 2);
                    this.tankDetails.setValueAt(dataB.getFuel_type(), 0, 3);
                    
                    dao.closeConnection();
                 }catch(SQLException | ClassNotFoundException ex)
                 {
                     JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getMessage());
                 }catch(NullPointerException ex)
                 {
                     JOptionPane.showMessageDialog(null, "No records found, combobox may be empty");
                 }
        }
    }//GEN-LAST:event_cmbTankIdActionPerformed

    private void jCheckToAddFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckToAddFuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckToAddFuelActionPerformed

    private void cmbFuelType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuelType1ActionPerformed
        
        Tank_Class values = new Tank_Class();
        TankDAO tank = new TankDAO();
        ArrayList<Tank_Class> fuelInfo = new ArrayList<Tank_Class>();
   
        DecimalFormat roundNum = new DecimalFormat(".##");
        
         FuelDAO fuel = new FuelDAO();
            ArrayList<Fuel> list = new ArrayList<>();
            Fuel  info = new Fuel();
            
            TankDAO tankInfo = new TankDAO();
            Tank_Class tankC = new Tank_Class();
            ArrayList<Tank_Class> tankList = new ArrayList<Tank_Class>();
            
            ArrayList<String> comboBoxVals = new ArrayList<String>();
            
            try{
                 
            if(cmbFuelType1.getSelectedItem().toString().trim() == null)
            {
                   
            }
            else
            {
                
                tank.openConn();
                 values = tank.getAllTankInfo(cmbFuelType1.getSelectedItem().toString().trim());
                 
                    txtCapacity.setText(String.valueOf(values.getTank_volume()));
                    double fuelToFill = values.getTank_volume() - values.getFuel_level();
                    txtLitresToFill.setText(String.valueOf(roundNum.format(fuelToFill)));
                    double fuelLevel = Double.parseDouble(roundNum.format(values.getFuel_level()));
                    txtLitresAvail.setText(String.valueOf(fuelLevel));
                    double percFill = (fuelToFill / values.getTank_volume()) * 100;
                    double perc = 100 - percFill;
                    int progressLevel = (int) perc;
                    
                   
                    if(percFill < 25)
                    {
                        btnFill.setEnabled(false);

                    }
                    else
                    {
                       btnFill.setEnabled(true); 
                    }


                   
                   
                    if(values.getFuel_type().trim().equalsIgnoreCase("Fuel Not Assigned"))
                    {
                        tankFType.removeAllItems();
                        
                         fuel.openConn();
                         tankInfo.openConn();

                        list = fuel.getFuelType();

                        for(int i = 0; i < list.size(); i ++)
                        {
                           comboBoxVals.add(list.get(i).getFuel_type());
                        }

                        tankList = tankInfo.getAllTankInfo();

                        for(int i = 0; i < comboBoxVals.size(); i ++)
                        {

                            for(int y = 0; y < tankList.size(); y ++)
                            {
                                tankC = tankList.get(y);
                                if(comboBoxVals.get(i).equalsIgnoreCase(tankC.getFuel_type()))
                                {

                                    comboBoxVals.remove(i);
                                }

                            }


                        }
                            
                        for(int y = 0; y < comboBoxVals.size(); y ++)
                        {
                            tankFType.addItem(comboBoxVals.get(y));
                        }

                    }
                    else
                    {
                        tankFType.removeAllItems();
                        
                        
                        tankFType.addItem(values.getFuel_type());
                       
                    }



                    progressBLevel.setValue(progressLevel);
                    if(progressLevel <= 35)
                    {
                        progressBLevel.setForeground(Color.red);
                       
                    }
                    else if(progressLevel <= 65)
                    {
                        progressBLevel.setForeground(Color.orange);
                    }
                    else if(progressLevel > 65)
                    {
                        progressBLevel.setForeground(Color.green);
                        
                    }
                
            }
           
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Failure Lost" + ex.getMessage());
        }catch(IndexOutOfBoundsException ex)
        {
             JOptionPane.showMessageDialog(null, "All  fuel types have been assignedd to tanks");
             btnFill.setEnabled(false);
        }
        
    }//GEN-LAST:event_cmbFuelType1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tank_Info().setVisible(true);
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

      public boolean testNumber(String num)
      {
          if(num.matches("[0-9]+"))
          {
              return true;
          }
          else
          {
              return false;
          }
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FuelPanel1;
    private javax.swing.JButton btnAddTank;
    private javax.swing.JButton btnFill;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRemoveTank;
    private javax.swing.JComboBox cmbFuelAdd;
    private javax.swing.JComboBox<String> cmbFuelType1;
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JComboBox cmbTankId;
    private javax.swing.JMenuItem empPanel1;
    private javax.swing.JCheckBox jCheckToAddFuel;
    private javax.swing.JComboBox<String> jCmbFuel;
    private javax.swing.JComboBox<String> jCmbTankId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblUser;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JPanel jPanelFill;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTankName;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JMenuItem manPanel1;
    private javax.swing.JMenuItem manTank1;
    private javax.swing.JMenu menue1;
    private javax.swing.JProgressBar progressBLevel;
    private javax.swing.JTable tankDetails;
    private javax.swing.JComboBox<String> tankFType;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtLitresAvail;
    private javax.swing.JTextField txtLitresToFill;
    private javax.swing.JTextField txtTankName;
    private javax.swing.JTextField txtVolume;
    // End of variables declaration//GEN-END:variables
}
