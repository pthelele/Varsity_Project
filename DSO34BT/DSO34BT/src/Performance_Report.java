
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pale
 */
public class Performance_Report extends javax.swing.JFrame {
    
    
        private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
                        Font.BOLD);
        private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                        Font.NORMAL, BaseColor.RED);
        private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
                        Font.BOLD);
        private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                        Font.BOLD);

    private DefaultTableModel model;
    private ArrayList<Staff> staff;
    private ArrayList<String> staffInfo;
    private String searchMethod = "Daily";
    private ArrayList<ServiceClass> listRep;
    private Staff staffHeader;
    
    public Performance_Report() {
        initComponents();
        rdrDay.setSelected(true);
        jReport.setEnabled(false);
        
        ClassDao staffDetails = new ClassDao();
        User user = new User();
        staffHeader = new Staff();
            staff = new ArrayList<Staff>();
           
            try
            {
                staffDetails.openConnection();
                staff = staffDetails.sectAll();
                staffHeader = staffDetails.retrieveEmployee(user.getIdLogger());
                empName.setText(staffHeader.getFname() + " " + staffHeader.getLname());
              
                staffDetails.closeConnection();
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getMessage());
            }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rdrDay = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        rdrByMonth = new javax.swing.JRadioButton();
        rdrSearchByWeek = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        checkEmployee = new javax.swing.JCheckBox();
        empDetails = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetails = new javax.swing.JTable();
        fuelReport = new javax.swing.JButton();
        fileSelecter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        empName = new javax.swing.JLabel();
        jReport = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MnuExit = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Performance Report:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Criteria:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 12))); // NOI18N
        jPanel2.setToolTipText("text");
        jPanel2.setMaximumSize(new java.awt.Dimension(32755, 32755));

        rdrDay.setText("Daily Report");
        rdrDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdrDayActionPerformed(evt);
            }
        });

        rdrByMonth.setText("Monthly Report");
        rdrByMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdrByMonthActionPerformed(evt);
            }
        });

        rdrSearchByWeek.setText("Weekly Report");
        rdrSearchByWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdrSearchByWeekActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/reports.jpeg"))); // NOI18N

        checkEmployee.setText("Search By Employee");
        checkEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEmployeeActionPerformed(evt);
            }
        });

        jLabel4.setText("Employee Names");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdrDay)
                        .addGap(18, 18, 18)
                        .addComponent(rdrSearchByWeek)
                        .addGap(18, 18, 18)
                        .addComponent(rdrByMonth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(checkEmployee)
                        .addGap(111, 111, 111))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(empDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdrDay)
                    .addComponent(rdrSearchByWeek)
                    .addComponent(checkEmployee)
                    .addComponent(rdrByMonth))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(empDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel3)
        );

        jTableDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "employee ID", "Employee Names", "Fuel Type", "Fuel Dispensed", "Amount Generated (R)"
            }
        ));
        jScrollPane1.setViewportView(jTableDetails);

        fuelReport.setText("Display");
        fuelReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelReportActionPerformed(evt);
            }
        });

        fileSelecter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PDF File", "Word Doc", "CSV" }));

        jLabel1.setText("Export To:");

        jLabel2.setText("User:");

        empName.setText("Employee Name");

        jReport.setText("Export");
        jReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(fuelReport, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fileSelecter, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jReport, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(empName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(empName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuelReport)
                    .addComponent(jLabel1)
                    .addComponent(jReport)
                    .addComponent(fileSelecter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jMenu2.setText("Navigation");

        jMenuItem5.setText("Home");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Logout");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Report");

        jMenuItem4.setText("Employee Report");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem3.setText("Service Report");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Summary Report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        MnuExit.setText("Exit");
        MnuExit.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                MnuExitMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenuBar1.add(MnuExit);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEmployeeActionPerformed
       
        if(checkEmployee.isSelected())
        {
            for(int i = 0; i < staff.size(); i ++)
            {
                    empDetails.addItem(staff.get(i).getEmp_number() + ": " + staff.get(i).getFname() + " " + staff.get(i).getLname());
                
            }
        }
        else
        {
            empDetails.removeAllItems();
        }
    }//GEN-LAST:event_checkEmployeeActionPerformed

    private void fuelReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelReportActionPerformed

        
        model = (DefaultTableModel) jTableDetails.getModel();
        model.setRowCount(0);
        ServiceDAO serveDao = new ServiceDAO();
        ArrayList<ServiceClass> list = new ArrayList<>();
        
        try
        {
            serveDao.openConnection();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String date = df.format(jDateChooser1.getDate());
            
            if(searchMethod.equalsIgnoreCase("Daily"))
            {   
                if(checkEmployee.isSelected())
                {
                    list = serveDao.getPerfReport( date ,empDetails.getSelectedItem().toString().substring(0, 5));
                }
                else
                {
                    list = serveDao.getPerfReportByDay(date);
                }
            
            }
            else if(searchMethod.equalsIgnoreCase("Weekly"))
            {
                Calendar calendar = new GregorianCalendar();  
                calendar.setTime(jDateChooser1.getDate());     
                int week = calendar.get(Calendar.WEEK_OF_YEAR) - 1;
                if(checkEmployee.isSelected())
                {
                    list = serveDao.getPerfReportWeek(week, empDetails.getSelectedItem().toString().substring(0, 5));
                }
                else
                {
                    list = serveDao.getPerfReportWeek(week);
                    
                }
                
            }
            else if(searchMethod.equalsIgnoreCase("Monthly"))
            {
                df = new SimpleDateFormat("MMMM");
                String month = df.format(jDateChooser1.getDate());
                
                if(checkEmployee.isSelected())
                {
                    list = serveDao.getPerfReportMonth(month, empDetails.getSelectedItem().toString().substring(0, 5));
                }
                else
                {
                    list = serveDao.getPerfReportMonth(month);
                }
                
            }
            model.setRowCount(list.size());
            
            if(list.size() < 1)
            {
                JOptionPane.showMessageDialog(null, "No records for the specified search");
                jReport.setEnabled(false);
            }
            else
            {
                for(int i = 0; i < list.size(); i++)
                {
                    jTableDetails.setValueAt(list.get(i).getEmpId(), i, 0);
                    jTableDetails.setValueAt(list.get(i).getEmp_fname().substring(0, 1) + " " + list.get(i).getEmp_lname(), i, 1);
                    jTableDetails.setValueAt(list.get(i).getFuel_type(), i, 2);
                    jTableDetails.setValueAt(list.get(i).getFuelDispened(), i, 3);
                    jTableDetails.setValueAt("R " + list.get(i).getFuel_cost(), i, 4);
                    //jTableDetails.setValueAt(list.get(i).getEmpId(), i, 5);
                }
                
                jReport.setEnabled(true);
                listRep = list;
            }
            
            serveDao.closeConnetion();
        }catch(ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection Lost: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_fuelReportActionPerformed

    private void MnuExitMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_MnuExitMenuKeyPressed
        System.exit(1);
    }//GEN-LAST:event_MnuExitMenuKeyPressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        Service_Report serviceReport = new Service_Report();
        this.dispose();
        serviceReport.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       Employee_Report empReport = new Employee_Report();
       this.dispose();
       empReport.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Manager_Panel manP = new Manager_Panel();
        this.dispose();
        manP.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void rdrDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdrDayActionPerformed
        
        rdrDay.setSelected(true);
        rdrSearchByWeek.setSelected(false);
        rdrByMonth.setSelected(false);
        
        searchMethod = "Daily";
    }//GEN-LAST:event_rdrDayActionPerformed

    private void rdrSearchByWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdrSearchByWeekActionPerformed
        
        rdrDay.setSelected(false);
        rdrSearchByWeek.setSelected(true);
        rdrByMonth.setSelected(false);
        
        searchMethod = "Weekly";
    }//GEN-LAST:event_rdrSearchByWeekActionPerformed

    private void rdrByMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdrByMonthActionPerformed
        
        rdrDay.setSelected(false);
        rdrSearchByWeek.setSelected(false);
        rdrByMonth.setSelected(true);
        
        searchMethod = "Monthly";
    }//GEN-LAST:event_rdrByMonthActionPerformed

    private void jReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportActionPerformed
        
         String filePath = "C:\\users\\" + System.getProperty("user.name") +"\\Desktop\\";
            
        try{
            
             String fileN = JOptionPane.showInputDialog("Please enter name of your report file");
                if(!fileN.trim().isEmpty())
                {
                    if(fileSelecter.getSelectedItem().toString().equalsIgnoreCase("PDF File"))
                    {
                          JOptionPane.showMessageDialog(null, "PDF File chosen");
                          filePath = filePath + fileN + ".pdf";
                          
                          
                          
                      try
                      {
                          Document doc = new Document();
                          PdfWriter.getInstance(doc, new FileOutputStream(filePath));
                          doc.open();
                          
                          //Metadata
                          doc.addTitle("Performance Report File");
                          doc.addSubject("For Petrol Station");
                          doc.addKeywords("Performance Report" + new Date());
                          doc.addAuthor(staffHeader.getFname() + " " + staffHeader.getLname());
                          doc.addCreator(staffHeader.getFname() + " " + staffHeader.getLname());
                          
                          Paragraph pageTitle = new Paragraph(" ");
                          addEmptyLine( pageTitle, 1);
                          pageTitle.add(new Paragraph("Performance Report", catFont));
                          addEmptyLine( pageTitle, 1);
                          pageTitle.add(new Paragraph("Performance Report by: " + staffHeader.getFname() + " " + staffHeader.getLname(), smallBold));
                          pageTitle.add(new Paragraph("Date: " + new Date(), smallBold));
                          
                          addEmptyLine( pageTitle, 3);
                         // doc.add(new Paragraph("This is a daily report", smallBold));
                          addEmptyLine( pageTitle, 3);
                          
                          
                           PdfPTable table = new PdfPTable(5);
                           PdfPCell column = new PdfPCell(new Phrase("Employee ID"));
                           column.setHorizontalAlignment(Element.ALIGN_CENTER);
                           table.addCell(column);
                           column = new PdfPCell(new Phrase("Employee Names"));
                           column.setHorizontalAlignment(Element.ALIGN_CENTER);
                           table.addCell(column);
                           column = new PdfPCell(new Phrase("Fuel Type"));
                           column.setHorizontalAlignment(Element.ALIGN_CENTER);
                           table.addCell(column);
                           column = new PdfPCell(new Phrase("Fuel Dispensed"));
                           column.setHorizontalAlignment(Element.ALIGN_CENTER);
                           table.addCell(column);
                           column = new PdfPCell(new Phrase("Amount Generated(R)"));
                           column.setHorizontalAlignment(Element.ALIGN_CENTER);
                           table.addCell(column);
                                   
                           table.setHeaderRows(listRep.size());
                           
                           for (ServiceClass currentService : listRep)
                           {
                               table.addCell(currentService.getEmpId());
                               table.addCell(currentService.getEmp_fname().subSequence(0, 1) +" " + currentService.getEmp_lname());
                               table.addCell(String.valueOf(currentService.getFuel_type()));
                               table.addCell(String.valueOf(currentService.getFuelDispened()));
                               table.addCell(String.valueOf(currentService.getFuel_cost()));
                               
                               
                           }
                           
                           /*Anchor anchor = new Anchor("First Chapter", catFont);
                           anchor.setName("First Chapter");*/
                           Chapter catPart = new Chapter(new Paragraph(), 0);
                 
                           Section subCatPart = catPart.addSection(pageTitle);
                           subCatPart.add(new Paragraph(""));

                           subCatPart.add(table);

                            doc.add(catPart);
                            
                           doc.close();
                           JOptionPane.showMessageDialog(null, "PDF written and saved");
                          
                      }catch(Exception ex)
                      {
                          JOptionPane.showMessageDialog(null, ex.getMessage());
                      }
                    }
                    else if(fileSelecter.getSelectedItem().toString().equalsIgnoreCase("CSV"))
                    {
                           filePath = filePath + fileN + ".xls";
                           File excelReport = new File(filePath);
                           WritableWorkbook wworkbook;
                           wworkbook = Workbook.createWorkbook(excelReport);
                           WritableSheet wsheet = wworkbook.createSheet("Performance Report", 0);
                           //headers
                           
                           Label reporter = new Label(0,0, "Report By: " + staffHeader.getFname().substring(0, 1) + " " + staffHeader.getLname());
                           wsheet.addCell(reporter);
                           // Format date
                           SimpleDateFormat reportDate = new SimpleDateFormat("YYYY-MMMM-dd");
                           
                           Label date = new Label(0,1, "Date: " + reportDate.format(new Date()));
                           wsheet.addCell(date);
                           
                           Label empId = new Label(0,3, "Wmployee ID");
                           wsheet.addCell(empId);
                           Label names = new Label(1,3, "Employee Names");
                           wsheet.addCell(names);
                           Label fuelType = new Label(2,3, "Fuel Type");
                           wsheet.addCell(fuelType);
                           Label tankId = new Label(3,3, "Fuel Dispensed");
                           wsheet.addCell(tankId);
                           Label amtGenerated = new Label(4,3, "Amount Generated(R)");
                           wsheet.addCell(amtGenerated);
                           
                           int x = 4;
                           Label[] perfEmpId = new Label[listRep.size()];
                           Label[]  perfNames = new Label[listRep.size()];
                           Label[] perfFuelType = new Label[listRep.size()];
                           Label[] perfDispensed = new Label[listRep.size()];
                           Label[] perfAmtGen = new Label[listRep.size()];
                            int i = 0;
                           SimpleDateFormat formatReport = new SimpleDateFormat("YYYY-MMMM-dd");
                         
                           for(ServiceClass excelPrint : listRep)
                           {
                               
                               perfEmpId[i] = new Label(0, x, excelPrint.getEmpId());
                               wsheet.addCell(perfEmpId[i]);
                               
                               perfNames[i] = new Label(1, x, String.valueOf(excelPrint.getEmp_fname().subSequence(0, 1) + " " + excelPrint.getEmp_lname()));
                               wsheet.addCell(perfNames[i]);
                               
                               perfFuelType[i] = new Label(2, x, excelPrint.getFuel_type());
                               wsheet.addCell(perfFuelType[i]);
                               
                               perfDispensed[i] = new Label(3, x, String.valueOf(excelPrint.getFuelDispened()));
                               wsheet.addCell(perfDispensed[i]);
                               
                                perfAmtGen[i] = new Label(4, x, String.valueOf(excelPrint.getFuel_cost()));
                               wsheet.addCell(perfAmtGen[i]);
                                x++;
                                i++;
                           }
                           wworkbook.write();
                           wworkbook.close();
                           
                           JOptionPane.showMessageDialog(null, "Excel file Written successfully");
                          
                    }
                    
                    else if(fileSelecter.getSelectedItem().toString().equalsIgnoreCase("Word Doc"))
                    {
                        JOptionPane.showMessageDialog(null, "Word File chosen");
                           filePath = filePath + fileN+ ".docx";
                           
                         XWPFDocument document = new XWPFDocument();
                         
                         XWPFTable tableOne = document.createTable();
                                XWPFTableRow tableOneRowOne = tableOne.getRow(0);
                                tableOneRowOne.getCell(0).setText("Employee ID");
                                tableOneRowOne.addNewTableCell().setText("Employee Names");
                                tableOneRowOne.addNewTableCell().setText("Fuel Type");
                                tableOneRowOne.addNewTableCell().setText("Fuel Dispensed(Litres)");                               
                                tableOneRowOne.addNewTableCell().setText("Amount Generated(R)");

                                for(int i = 0; i < listRep.size(); i++)
                                {
                                    XWPFTableRow tableOneRowTwo = tableOne.createRow();
                                    tableOneRowTwo.getCell(0).setText(listRep.get(i).getEmpId());
                                    tableOneRowTwo.getCell(1).setText(String.valueOf(listRep.get(i).getEmp_fname().substring(0,1) + " " + listRep.get(i).getEmp_lname()));
                                    tableOneRowTwo.getCell(2).setText(String.valueOf(listRep.get(i).getFuel_type()));
                                    tableOneRowTwo.getCell(3).setText(String.valueOf(listRep.get(i).getFuelDispened()));                                    
                                    tableOneRowTwo.getCell(4).setText(String.valueOf(listRep.get(i).getFuel_cost()));
                                }

                                FileOutputStream outStream = new FileOutputStream(filePath);
                                document.write(outStream);
                                outStream.close();
                           
                           
                           JOptionPane.showMessageDialog(null, "Word document Print succesful");
                    }
                    else if(fileSelecter.getSelectedItem().toString().equalsIgnoreCase("text File"))
                    {
                        
                        filePath = filePath + fileN+ ".txt";
                        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)));

                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd");
                        Date date = new Date();
                        String datestring = dateFormat.format(date);
                        
                        bw.newLine();
                        bw.newLine();
                        bw.write("PERFORMANCE REPORT \t\t\t DATE: " +  datestring);
                        bw.newLine();
                        bw.write(staffHeader.getFname() + " "+staffHeader.getFname());
                        bw.newLine();
                        bw.write("Service Date" + "\t" + "Employee Names" +"\t"+ "Fuel Dispensed\tTank ID\tFuel Type" );
                        bw.newLine();
                        
                        for (ServiceClass currentService : listRep) {

                                  bw.write( "\t" + currentService.getServiceDate() + "\t"+ currentService.getEmp_fname().substring(0, 1)+ " " +currentService.getEmp_lname() +"\t"+ currentService.getFuelDispened()+"\t"+currentService.getTankId()+"\t\t\t"+ currentService.getFuel_type());
                                  bw.newLine();
                              }
                             bw.close();
                             JOptionPane.showMessageDialog(null, "Text File Print succesful");
                    }
                }
                else
                {
                    int test = JOptionPane.showConfirmDialog(null, "File name empty, ensure you type alphanumeric characters, Click yes to re-enter");
                    if(test == 0)
                    {
                        jReport.doClick();
                    }
                }
        }catch(HeadlessException | IOException ex)
        {
            
        }catch(WriteException ex)
        {
            JOptionPane.showMessageDialog(null, "File Not written" + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jReportActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Summary_Report sReport = new Summary_Report();
        this.dispose();
        sReport.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Performance_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Performance_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Performance_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Performance_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Performance_Report().setVisible(true);
            }
        });
    }
    
    
      
    public void addEmptyLine(Paragraph par, int num)
    {
      for(int i = 0; i < num; i ++)
      {
          par.add(new Paragraph(" "));
      }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnuExit;
    private javax.swing.JCheckBox checkEmployee;
    private javax.swing.JComboBox empDetails;
    private javax.swing.JLabel empName;
    private javax.swing.JComboBox<String> fileSelecter;
    private javax.swing.JButton fuelReport;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetails;
    private javax.swing.JRadioButton rdrByMonth;
    private javax.swing.JRadioButton rdrDay;
    private javax.swing.JRadioButton rdrSearchByWeek;
    // End of variables declaration//GEN-END:variables
}
