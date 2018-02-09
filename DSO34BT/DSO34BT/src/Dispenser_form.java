
import java.awt.Color;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.AbstractListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;


public class Dispenser_form extends javax.swing.JFrame {
    
    private String userId;
    private String emp_id; //done
    private String dispenserId; //done
    private String fuel_id;  // done
    private String tank_id; //done
    private String tankName;
    private Staff staffUser;
    

    public String getUserId() {
        return userId;
    }

    
    

   ArrayList<String> lm = new ArrayList<String>();
   int index = 0;
    public Dispenser_form() {
        initComponents();
        
         User userC = new User();
         this.userId = userC.getIdLogger();
        
        
        
        txtLitres.setEditable(false);
        amtInRands.setEditable(false);
        
        
        amtInRands1.setEditable(false);
        txtLitres1.setEditable(false);
        amtInRands2.setEditable(false);
        txtLitres2.setEditable(false);
        
        btnDisp1.setEnabled(false);
        btnDisp2.setEnabled(false);
        btnDisp3.setEnabled(false);
        
          DefaultTableModel model= (DefaultTableModel) tblFuelInfo.getModel();
          model.setRowCount(0);
          
         
         
        
         TankDAO tank = new TankDAO();
         ArrayList<Tank_Class> tClass = new ArrayList<Tank_Class>();
         Tank_Class f_type = new Tank_Class();
         
         //Fuel Objects
        FuelDAO fuel = new FuelDAO();
        Fuel info = new Fuel();
        ArrayList<Fuel> petrol = new ArrayList<Fuel>();
        
        
       
       ClassDao user = new ClassDao();
        staffUser = new Staff();
         
         try
         {
          user.openConnection();
          staffUser = user.retrieveEmployee(userId);
             
          jlblUser.setText(staffUser.getFname() + " " + staffUser.getLname());
          emp_id = staffUser.getEmp_number();
             
             tank.openConn();
             tClass = tank.getFuel();
             
             //Losding tank information
            
             
             fuel.openConn();
             petrol = fuel.getFuelInTank();
             
             model.setRowCount(petrol.size());
             
             for(int i = 0; i < petrol.size(); i++)
             {
                 info = petrol.get(i);
                 tblFuelInfo.setValueAt(info.getFuel_type(), i, 0);
                 tblFuelInfo.setValueAt(info.getFuel_price(), i, 1);
                 
                 jCmbDispense.addItem(info.getFuel_type());
                 jCmbDispense1.addItem(info.getFuel_type());
                 jCmbDispense2.addItem(info.getFuel_type());
             }
             
              for(int i = 0; i < tClass.size(); i ++)
             {
                 f_type = tClass.get(i);                                    
             }
              
              if(staffUser.getJobType().equalsIgnoreCase("Petrol attendant"))
              {
                  FuelPanel.setVisible(false);
                  manTank.setVisible(false);
                  empPanel.setVisible(false);
                  
              }
              else
              {
                  manPanel.setText("Manager Panel");
              }
             
             
            
             
         }catch( SQLException| ClassNotFoundException ex)
         {
             JOptionPane.showMessageDialog(null, "Connect Lost: " + ex.getLocalizedMessage());
         }
       
        
        
        
             
          
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanDispenser = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstService = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        btnStatus1 = new javax.swing.JToggleButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jCmbDispense = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        amtInRands = new javax.swing.JTextField();
        txtLitres = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnDisp1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        amtInRands5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnStatus2 = new javax.swing.JToggleButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jCmbDispense1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        amtInRands1 = new javax.swing.JTextField();
        txtLitres1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnDisp2 = new javax.swing.JButton();
        jTxtAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnStatus3 = new javax.swing.JToggleButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jCmbDispense2 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        amtInRands2 = new javax.swing.JTextField();
        txtLitres2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtxtAmount3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDisp3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFuelInfo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlblUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menue = new javax.swing.JMenu();
        manPanel = new javax.swing.JMenuItem();
        FuelPanel = new javax.swing.JMenuItem();
        manTank = new javax.swing.JMenuItem();
        empPanel = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanDispenser.setBackground(new java.awt.Color(255, 255, 255));
        jPanDispenser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fuel Dispensers:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Dispenser.jpeg"))); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Dispenser.jpeg"))); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Dispenser.jpeg"))); // NOI18N
        jLabel4.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Qeue Service List:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        lstService.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(lstService);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dispenser 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        btnStatus1.setText("status");
        btnStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatus1ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dispense Fuel:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        jLabel5.setText("Fuel Type:");

        jCmbDispense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbDispenseActionPerformed(evt);
            }
        });

        jLabel9.setText("Rands Per Litre:");

        jLabel10.setText("Litres:");

        btnDisp1.setText("Dispense Fuel");
        btnDisp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisp1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Amount (R)");

        amtInRands5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amtInRands5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCmbDispense, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDisp1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLitres, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amtInRands5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amtInRands, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCmbDispense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amtInRands, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(amtInRands5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLitres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(btnDisp1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnStatus1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dispenser 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        btnStatus2.setText("status");
        btnStatus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatus2ActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dispense Fuel:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        jLabel11.setText("Fuel Type:");

        jCmbDispense1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbDispense1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Rands Per Litre");

        jLabel13.setText("Litres");

        btnDisp2.setText("Dispense Fuel");
        btnDisp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisp2ActionPerformed(evt);
            }
        });

        jTxtAmount.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTxtAmountPropertyChange(evt);
            }
        });

        jLabel1.setText("Amount (R)");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(amtInRands1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCmbDispense1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDisp2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLitres1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 11, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCmbDispense1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amtInRands1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtLitres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnDisp2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStatus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnStatus2)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dispenser 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        btnStatus3.setText("status");
        btnStatus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatus3ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dispense Fuel:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N

        jLabel14.setText("Fuel Type:");

        jCmbDispense2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbDispense2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Rands Per Litre");

        jLabel16.setText("Litres");

        jLabel7.setText("Amount (R)");

        btnDisp3.setText("Dispense Fuel");
        btnDisp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisp3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(amtInRands2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCmbDispense2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDisp3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLitres2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 11, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCmbDispense2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amtInRands2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtLitres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnDisp3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStatus3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnStatus3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Petrol Information:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 12))); // NOI18N

        tblFuelInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Petrol Type", "Price Per Litre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFuelInfo);

        jLabel6.setText("Fuel Available");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setText("User:");

        jlblUser.setText("Employee Name");

        javax.swing.GroupLayout jPanDispenserLayout = new javax.swing.GroupLayout(jPanDispenser);
        jPanDispenser.setLayout(jPanDispenserLayout);
        jPanDispenserLayout.setHorizontalGroup(
            jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDispenserLayout.createSequentialGroup()
                .addGroup(jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanDispenserLayout.createSequentialGroup()
                        .addGroup(jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanDispenserLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanDispenserLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanDispenserLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanDispenserLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanDispenserLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanDispenserLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)))
                        .addGroup(jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, Short.MAX_VALUE)))
                    .addGroup(jPanDispenserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jlblUser)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanDispenserLayout.setVerticalGroup(
            jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDispenserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanDispenserLayout.createSequentialGroup()
                        .addGroup(jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jlblUser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanDispenserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanDispenserLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        menue.setText("Menu");

        manPanel.setText("Home");
        manPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manPanelActionPerformed(evt);
            }
        });
        menue.add(manPanel);

        FuelPanel.setText("Fuel Info");
        FuelPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuelPanelActionPerformed(evt);
            }
        });
        menue.add(FuelPanel);

        manTank.setText("Tank Info");
        manTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manTankActionPerformed(evt);
            }
        });
        menue.add(manTank);

        empPanel.setText("Manage Employees");
        empPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empPanelActionPerformed(evt);
            }
        });
        menue.add(empPanel);

        jMenuBar1.add(menue);

        jMenu3.setText("Logout");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Exit");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanDispenser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanDispenser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisp1ActionPerformed
        
        TankDAO fill = new TankDAO();
        
        
        ServiceDAO daoService = new ServiceDAO();
        
        ServiceClass service = new ServiceClass();
        dispenserId = "01";
        
        
        double litres = 0.0;
        double fuel_cost = 0.0;
        double availLitres = 0.0;
        int rowInsert = 0 ;
       
        
        SimpleDateFormat fd = new SimpleDateFormat("YYYY-M-d");
        String date = fd.format(new Date());
       
        DecimalFormat roundNum = new DecimalFormat(".###");
        
         
        try
        {
            
            
            
            //Tank database communication
            litres = Double.parseDouble(amtInRands5.getText()) /  Double.parseDouble(amtInRands.getText());
            litres = Double.parseDouble(roundNum.format(litres));
           
            
            fill.openConn();
            if(Double.parseDouble(amtInRands5.getText()) >= Double.parseDouble(amtInRands.getText()))
            {
                availLitres = fill.getFuelAvail(jCmbDispense.getSelectedItem().toString().trim());
                    if(availLitres > litres)
                    {
                            int row = fill.updateLitres(jCmbDispense.getSelectedItem().toString().trim(), litres);

                            //Check if update was successful
                            if(row > 0)
                            {
                              Tank_Class  tClass = fill.getServiceVals(jCmbDispense.getSelectedItem().toString().trim());
                                fuel_id = tClass.getFuel_id();
                                tank_id = tClass.getTank_id();
                                daoService.openConnection();
                                fuel_cost = Double.parseDouble(amtInRands5.getText());
                               
                                service = new ServiceClass(date, litres, fuel_cost,  fuel_id, emp_id, dispenserId, tank_id);
                                 rowInsert = daoService.insertService(service);

                        //Check if service is in the list box and remove it
                             for(int y = 0; y < lm.size(); y++)
                                {
                                    if(lm.get(y).equalsIgnoreCase("Dispenser 1 occupied"))
                                    {
                                        lm.remove(y);
                                        index = index - 1;
                                        ListModel lModel = new AbstractListModel() {

                                            @Override
                                            public int getSize() {
                                                return lm.size();
                                            }

                                            @Override
                                            public Object getElementAt(int index) {
                                                return lm.get(index);
                                            }
                                        };
                                        lstService.setModel(lModel);
                                        btnStatus1.setEnabled(true);

                                        y = lm.size();
                                    }
                                    
                                     JOptionPane.showMessageDialog(null, "Fuel filled Thank You ");
                                            txtLitres.setText(String.valueOf(litres));
                                            btnDisp1.setEnabled(false);
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "NO Update done");

                             jtxtAmount3.setBackground(Color.white);
                            }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Sorry, The requested amount of petrol is not available");
                    }
            }
            else
            {
                JOptionPane.showMessageDialog(null, jCmbDispense.getSelectedItem().toString().trim() + " is sold at R" +  amtInRands.getText().trim() + " per litre");
            }
            
        }catch(Exception  ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getMessage());
        }
        
       

    }                                        

    private void jCmbDispenseActionPerformed(java.awt.event.ActionEvent evt) {                                             
      FuelDAO fuel = new FuelDAO();
        Fuel info = new Fuel();
        
         amtInRands5.setText("");
        txtLitres.setText("");
        
        try
        {
            fuel.openConn();
            info = fuel.getByFuel(jCmbDispense.getSelectedItem().toString().trim());
            amtInRands.setText(String.valueOf(info.getFuel_price()));
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Error: " + ex.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_btnDisp1ActionPerformed

    private void btnDisp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisp2ActionPerformed
        
        Tank_Class tClass = new Tank_Class();
        TankDAO fill = new TankDAO();
        
        ServiceDAO daoService = new ServiceDAO();
        
        ServiceClass service = new ServiceClass();
        dispenserId = "01";
        
        
        double litres = 0.0;
        double fuel_cost = 0.0;
        double availLitres = 0.0;
        int rowInsert = 0 ;
        SimpleDateFormat fd = new SimpleDateFormat("YYYY-M-d");
        String date = fd.format(new Date());
       
        DecimalFormat roundNum = new DecimalFormat(".###");
        
        
        dispenserId = "02";
        
      
        try
        {
            litres = Double.parseDouble(jTxtAmount.getText()) /  Double.parseDouble(amtInRands1.getText());
            litres = Double.parseDouble(roundNum.format(litres));
            fill.openConn();
            
            if(Double.parseDouble(jTxtAmount.getText()) >= Double.parseDouble(amtInRands1.getText()))
            {
                availLitres = fill.getFuelAvail(jCmbDispense.getSelectedItem().toString().trim());
                    if(availLitres > litres)
                    {
                        int row = fill.updateLitres(jCmbDispense1.getSelectedItem().toString().trim(), litres);

                        if(row > 0)
                        {
                            tClass = fill.getServiceVals(jCmbDispense.getSelectedItem().toString().trim());
                            fuel_id = tClass.getFuel_id();
                            tank_id = tClass.getTank_id();
                                daoService.openConnection();

                                 fuel_cost = Double.parseDouble(jTxtAmount.getText()); 
                                 service = new ServiceClass(date, litres, fuel_cost,  fuel_id, emp_id, dispenserId, tank_id);


                                         rowInsert = daoService.insertService(service);
                         for(int y = 0; y < lm.size(); y++)
                                {
                                    if(lm.get(y).equalsIgnoreCase("Dispenser 2 occupied"))
                                    {
                                        lm.remove(y);
                                        index = index - 1;
                                        ListModel lModel = new AbstractListModel() {

                                            @Override
                                            public int getSize() {
                                                return lm.size();
                                            }

                                            @Override
                                            public Object getElementAt(int index) {
                                                return lm.get(index);
                                            }
                                        };
                                        lstService.setModel(lModel);
                                        btnStatus2.setEnabled(true);

                                        y = lm.size();
                                    }
                                            txtLitres1.setText(String.valueOf(litres));
                                            JOptionPane.showMessageDialog(null, "Fuel filled Thank You");
                                            btnDisp2.setEnabled(false);
                                     jtxtAmount3.setBackground(Color.white);
                                }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, jCmbDispense1.getSelectedItem().toString().trim() + " is sold at R" + amtInRands1.getText().trim() + " per litre");
                        jTxtAmount.setBackground(Color.orange);
                    }
            }
            else
            {
                        JOptionPane.showMessageDialog(null, "Sorry, The requested amount of petrol is not available");
            }

        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getLocalizedMessage());
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Invalid entry, please type in numeric characters in the Amoun(R) field");
            jtxtAmount3.setBackground(Color.orange);
            
        }
        
       

    }                                        

   /* private void jCmbDispenseActionPerformed(java.awt.event.ActionEvent evt) {                                             
      FuelDAO fuel = new FuelDAO();
        Fuel info = new Fuel();
        
         amtInRands5.setText("");
        txtLitres.setText("");
        
        try
        {
            fuel.openConn();
            info = fuel.getByFuel(jCmbDispense.getSelectedItem().toString().trim());
            amtInRands.setText(String.valueOf(info.getFuel_price()));
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Error: " + ex.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_btnDisp2ActionPerformed
*/
    private void btnStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatus1ActionPerformed
        
        lm.add("Dispenser 1 occupied");
        index = index + 1;
         ListModel lModel = new AbstractListModel() {

            @Override
            public int getSize() {
                return lm.size();
            }

            @Override
            public Object getElementAt(int index) {
                return lm.get(index);
            }
        };
         
        lstService.setModel(lModel);
        btnDisp1.setEnabled(true);
        amtInRands5.setText("");
        txtLitres.setText("");
        amtInRands.setEnabled(true);
        btnStatus1.setEnabled(false);
    }//GEN-LAST:event_btnStatus1ActionPerformed

    private void btnStatus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatus2ActionPerformed
        lm.add("Dispenser 2 occupied");
        
        index = index + 1;
         ListModel lModel = new AbstractListModel() {

            @Override
            public int getSize() {
                return lm.size();
            }

            @Override
            public Object getElementAt(int index) {
                return lm.get(index);
            }
        };
        lstService.setModel(lModel);
        btnDisp2.setEnabled(true);
        btnStatus2.setEnabled(false);
        txtLitres1.setText("");
    }//GEN-LAST:event_btnStatus2ActionPerformed

    private void btnStatus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatus3ActionPerformed
        
        jtxtAmount3.setText("");
        txtLitres2.setText("");
        
        lm.add("Dispenser 3 occupied");
        index = index + 1;
         ListModel lModel = new AbstractListModel() {

            @Override
            public int getSize() {
                return lm.size();
            }

            @Override
            public Object getElementAt(int index) {
                return lm.get(index);
            }
        };
        lstService.setModel(lModel);
        btnDisp3.setEnabled(true);
        btnStatus3.setEnabled(false);
    }//GEN-LAST:event_btnStatus3ActionPerformed

    private void btnDisp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisp3ActionPerformed
        
        Tank_Class tClass = new Tank_Class();
        TankDAO fill = new TankDAO();
        
        ServiceDAO daoService = new ServiceDAO();
        
        ServiceClass service = new ServiceClass();
        dispenserId = "01";
        
        
        double litres = 0.0;
        double fuel_cost = 0.0;
        double availLitres = 0.0;
        int rowInsert = 0 ;
        SimpleDateFormat fd = new SimpleDateFormat("YYYY-M-d");
        String date = fd.format(new Date());
       
        DecimalFormat roundNum = new DecimalFormat(".###");
        
        
        dispenserId = "03";
        
        try
        {
            litres = Double.parseDouble(jtxtAmount3.getText()) /  Double.parseDouble(amtInRands1.getText());
            litres = Double.parseDouble(roundNum.format(litres));
            fill.openConn();
            if(Double.parseDouble(jtxtAmount3.getText().trim()) >= Double.parseDouble(amtInRands2.getText().trim()))
            {

                availLitres = fill.getFuelAvail(jCmbDispense.getSelectedItem().toString().trim());
                    if(availLitres > litres)
                    {
                                int row = fill.updateLitres(jCmbDispense2.getSelectedItem().toString().trim(), litres);

                            if(row > 0)
                            {
                                tClass = fill.getServiceVals(jCmbDispense.getSelectedItem().toString().trim());
                                    fuel_id = tClass.getFuel_id();
                                    tank_id = tClass.getTank_id();
                                        daoService.openConnection();

                                         fuel_cost = Double.parseDouble(jtxtAmount3.getText()); 
                                         service = new ServiceClass(date, litres, fuel_cost,  fuel_id, emp_id, dispenserId, tank_id);


                                         rowInsert = daoService.insertService(service);

                                    for(int y = 0; y < lm.size(); y++)
                                       {
                                           if(lm.get(y).equalsIgnoreCase("Dispenser 3 occupied"))
                                           {
                                               lm.remove(y);
                                               index = index - 1;
                                               ListModel lModel = new AbstractListModel() {

                                                   @Override
                                                   public int getSize() {
                                                       return lm.size();
                                                   }

                                                   @Override
                                                   public Object getElementAt(int index) {
                                                       return lm.get(index);
                                                   }
                                               };
                                               lstService.setModel(lModel);
                                               btnStatus3.setEnabled(true);

                                               y = lm.size();
                                           }
                                           txtLitres2.setText(String.valueOf(litres));
                                           

                                            jtxtAmount3.setBackground(Color.white);
                                       }
                                    
                                    JOptionPane.showMessageDialog(null, "Fuel filled Thank You");
                            }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Sorry, The requested amount of petrol is not avilable");
                    }
            }
                    else
                    {
                        JOptionPane.showMessageDialog(null, jCmbDispense1.getSelectedItem().toString().trim() + " is sold at R " + amtInRands2.getText().trim());
                    }

            
            
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getLocalizedMessage());
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Invalid entry, please type in numeric characters in the Amoun(R) field");
            jtxtAmount3.setBackground(Color.orange);
            
        }
        
    

    }//GEN-LAST:event_btnDisp3ActionPerformed
/*
    private void jCmbDispenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbDispenseActionPerformed
      FuelDAO fuel = new FuelDAO();
        Fuel info = new Fuel();
        
         amtInRands5.setText("");
        txtLitres.setText("");
        
        try
        {
            fuel.openConn();
            info = fuel.getByFuel(jCmbDispense.getSelectedItem().toString().trim());
            amtInRands.setText(String.valueOf(info.getFuel_price()));
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Error: " + ex.getLocalizedMessage());
        }
        
       
       
            
    }//GEN-LAST:event_jCmbDispenseActionPerformed
*/
    private void amtInRands5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amtInRands5KeyTyped
        
        
        
    }//GEN-LAST:event_amtInRands5KeyTyped

    private void jTxtAmountPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTxtAmountPropertyChange
        
    }//GEN-LAST:event_jTxtAmountPropertyChange

    private void jCmbDispense2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbDispense2ActionPerformed
        FuelDAO fuel = new FuelDAO();
        Fuel info = new Fuel();
        
        try
        {
            fuel.openConn();
            info = fuel.getByFuel(jCmbDispense2.getSelectedItem().toString().trim());
            amtInRands2.setText(String.valueOf(info.getFuel_price()));
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Error: " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jCmbDispense2ActionPerformed

    private void jCmbDispense1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbDispense1ActionPerformed
        
        FuelDAO fuel = new FuelDAO();
        Fuel info = new Fuel();
        
        try
        {
            fuel.openConn();
            info = fuel.getByFuel(jCmbDispense1.getSelectedItem().toString().trim());
            amtInRands1.setText(String.valueOf(info.getFuel_price()));
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Error: " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jCmbDispense1ActionPerformed

    private void FuelPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuelPanelActionPerformed
        Fuel_Info fuelPane = new Fuel_Info();
        this.dispose();
        fuelPane.setVisible(true);
    }//GEN-LAST:event_FuelPanelActionPerformed

    private void manPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manPanelActionPerformed
        if(staffUser.getJobType().equalsIgnoreCase("Manager"))
        {
           Manager_Panel manPanel = new Manager_Panel();
            this.dispose();
            manPanel.setVisible(true); 
        }
        else
        {
            Petrol_attendant pa = new Petrol_attendant();
            this.dispose();
            pa.setVisible(true);
        }
        
    }//GEN-LAST:event_manPanelActionPerformed

    private void empPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPanelActionPerformed
        Manage_Employees manEmp = new Manage_Employees();
        this.dispose();
        manEmp.setVisible(true);
    }//GEN-LAST:event_empPanelActionPerformed

    private void manTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manTankActionPerformed
        Tank_Info tinfo = new Tank_Info();
        this.dispose();;
        tinfo.setVisible(true);
    }//GEN-LAST:event_manTankActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        
        Login_Form login = new Login_Form();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jMenu4MouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dispenser_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FuelPanel;
    private javax.swing.JTextField amtInRands;
    private javax.swing.JTextField amtInRands1;
    private javax.swing.JTextField amtInRands2;
    private javax.swing.JTextField amtInRands5;
    private javax.swing.JButton btnDisp1;
    private javax.swing.JButton btnDisp2;
    private javax.swing.JButton btnDisp3;
    private javax.swing.JToggleButton btnStatus1;
    private javax.swing.JToggleButton btnStatus2;
    private javax.swing.JToggleButton btnStatus3;
    private javax.swing.JMenuItem empPanel;
    private javax.swing.JComboBox jCmbDispense;
    private javax.swing.JComboBox jCmbDispense1;
    private javax.swing.JComboBox jCmbDispense2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanDispenser;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtAmount;
    private javax.swing.JLabel jlblUser;
    private javax.swing.JTextField jtxtAmount3;
    private javax.swing.JList lstService;
    private javax.swing.JMenuItem manPanel;
    private javax.swing.JMenuItem manTank;
    private javax.swing.JMenu menue;
    private javax.swing.JTable tblFuelInfo;
    private javax.swing.JTextField txtLitres;
    private javax.swing.JTextField txtLitres1;
    private javax.swing.JTextField txtLitres2;
    // End of variables declaration//GEN-END:variables
}
