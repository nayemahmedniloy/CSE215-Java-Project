//CSE215 Project by Md. Nayem Ahmed Niloy
//Project Name: Universal Managment and Printing Tool
package TollManagmentSystem;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TollManagmentSystem extends javax.swing.JFrame {

    public TollManagmentSystem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    String tollGate;
    String NID;
    String registrationNumber;
    String licenseNumber;
    String name;
    String laneID;
    String tollCollector;
    int vehicleFare;
    String vehicleType;
    String passageType;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nid_number = new javax.swing.JTextField();
        registration_number = new javax.swing.JTextField();
        license_number = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        lane_id = new javax.swing.JTextField();
        vehicle_class = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        calculate_fare = new javax.swing.JButton();
        receipt_print = new javax.swing.JButton();
        toll_collector = new javax.swing.JTextField();
        passageBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        toll_gate = new javax.swing.JComboBox<>();
        reset_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        save_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Toll Managment System");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("NID No :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Registration Number :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("License Number :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Lane ID :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Passage: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Vehicle Class :");

        vehicle_class.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vehicle_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bike", "Car/Jeep", "Pick-up/Luxury jeep/Prado", "Microbus", "Minibus", "Medium Bus", "Bus", "Truck (up to 5 tonnes)", "Truck (5 to 8 tonnes)", "Truck (8 to 11 tonnes)", "Truck (three axle)", "Trailer (4 axle)", "Trailer (4 axle above)" }));
        vehicle_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_classActionPerformed(evt);
            }
        });

        text_area.setColumns(20);
        text_area.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        text_area.setRows(5);
        jScrollPane1.setViewportView(text_area);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Toll Collector :");

        calculate_fare.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        calculate_fare.setText("Calculate Fare");
        calculate_fare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_fareActionPerformed(evt);
            }
        });

        receipt_print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        receipt_print.setText("Print Receipt");
        receipt_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receipt_printActionPerformed(evt);
            }
        });

        passageBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        passageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passageBoxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Toll Gate :");

        jLabel12.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Developed By Md.Nayem Ahmed Niloy");

        toll_gate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        toll_gate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toll Plaza 1", "Toll Plaza 2", "Toll Plaza 3", "Toll Plaza 4", "Toll Plaza 5", " " }));
        toll_gate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toll_gateActionPerformed(evt);
            }
        });

        reset_button.setBackground(new java.awt.Color(204, 255, 204));
        reset_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset_button.setText("Reset");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        exit_button.setBackground(new java.awt.Color(255, 153, 153));
        exit_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit_button.setText("Exit");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        save_button.setBackground(new java.awt.Color(204, 204, 255));
        save_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nid_number)
                                    .addComponent(toll_collector)
                                    .addComponent(registration_number)
                                    .addComponent(toll_gate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lane_id)
                                    .addComponent(passageBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(license_number)
                                    .addComponent(Name)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vehicle_class, 0, 1, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(calculate_fare)
                                            .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 70, Short.MAX_VALUE)))))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(receipt_print))))
                        .addContainerGap(308, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(save_button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toll_gate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toll_collector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nid_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registration_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(license_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lane_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehicle_class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calculate_fare)
                            .addComponent(receipt_print))
                        .addGap(5, 5, 5)
                        .addComponent(save_button))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_button)
                    .addComponent(exit_button))
                .addGap(95, 95, 95)
                .addComponent(jLabel12)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calculate_fareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_fareActionPerformed

        vehicle_classActionPerformed(evt);
        printingMethod();
    }//GEN-LAST:event_calculate_fareActionPerformed

    private void vehicle_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_classActionPerformed
        
        if(vehicle_class.getSelectedIndex()==0){
            vehicleFare=100;
            vehicleType="Bike";
        }
        if(vehicle_class.getSelectedIndex()==1){
            vehicleFare=750;
            vehicleType="Car/Jeep";
        }
        if(vehicle_class.getSelectedIndex()==2){
            vehicleFare=1200;
            vehicleType="Pick-up/Luxury jeep/Prado";
        }
        if(vehicle_class.getSelectedIndex()==3){
            vehicleFare=1300;
            vehicleType="Microbus";
        }
        if(vehicle_class.getSelectedIndex()==4){
            vehicleFare=1400;
            vehicleType="Minibus";
        }
        if(vehicle_class.getSelectedIndex()==5){
            vehicleFare=2000;
            vehicleType="Medium Bus";
        }
        if(vehicle_class.getSelectedIndex()==6){
            vehicleFare=2400;
            vehicleType="Bus";
        }
        if(vehicle_class.getSelectedIndex()==7){
            vehicleFare=1600;
            vehicleType="Truck(upto 5 tonnes)";
        }
        if(vehicle_class.getSelectedIndex()==8){
            vehicleFare=2100;
            vehicleType="Truck(5 to 8 tonnes)";
        }
        if(vehicle_class.getSelectedIndex()==9){
            vehicleFare=2800;
            vehicleType="Truck(8 to 11 tonnes)";
        }
        if(vehicle_class.getSelectedIndex()==10){
            vehicleFare=5500;
            vehicleType="Truck(three axle)";
        }
        if(vehicle_class.getSelectedIndex()==11){
            vehicleFare=6000;
            vehicleType="Truck(4 axle)";
        }
        if(vehicle_class.getSelectedIndex()==12){
            vehicleFare=7500;
            vehicleType="Truck(4axle above)";
        }
    }//GEN-LAST:event_vehicle_classActionPerformed

    private void passageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passageBoxActionPerformed
        
        if(passageBox.getSelectedIndex()==0){
            passageType="Single";
        }
        if(passageBox.getSelectedIndex()==1){
            passageType="Double";
        }
    }//GEN-LAST:event_passageBoxActionPerformed

    private void toll_gateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toll_gateActionPerformed
       
        if(toll_gate.getSelectedIndex()==0){
            tollGate="Toll Plaza 1";
        }
        if(toll_gate.getSelectedIndex()==1){
            tollGate="Toll Plaza 2";
        }
        if(toll_gate.getSelectedIndex()==2){
            tollGate="Toll Plaza 3";
        }
        if(toll_gate.getSelectedIndex()==3){
            tollGate="Toll Plaza 4";
        }
        if(toll_gate.getSelectedIndex()==4){
            tollGate="Toll Plaza 5";
        }
    }//GEN-LAST:event_toll_gateActionPerformed

    private void receipt_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receipt_printActionPerformed
        try {
           
            text_area.print();
        } catch (PrinterException ex) {
            Logger.getLogger(TollManagmentSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_receipt_printActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
       
        nid_number.setText(null);
        registration_number.setText(null);
        license_number.setText(null);
        Name.setText(null);
        lane_id.setText(null);
        text_area.setText(null);
        toll_gate.setSelectedIndex(0);
        passageBox.setSelectedIndex(0);
        vehicle_class.setSelectedIndex(0);
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        try {
            FileWriter filewriter = new FileWriter("C:/Users/nayem/Desktop/CSE215P_Nayem.txt",true);
            filewriter.write(NID+" "+registrationNumber+" "+licenseNumber+" "+name+" "+" "+tollCollector+" "+laneID+" "+vehicleType+" "+vehicleFare+" \n");
            filewriter.write("\n");
            filewriter.flush();
            filewriter.close();
        } catch (IOException ex) {
            Logger.getLogger(TollManagmentSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_save_buttonActionPerformed

    public void printingMethod(){
        NID=nid_number.getText();
        registrationNumber=registration_number.getText();
        licenseNumber=license_number.getText();
        name=Name.getText();
        laneID=lane_id.getText();
        tollCollector=toll_collector.getText();
   
        SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        Date d = new Date();
        
        text_area.setText(text_area.getText()+"\n");
        text_area.setText(text_area.getText()+"\t               National Highways Authority of Bangladesh \n");
        text_area.setText(text_area.getText()+"\t                       Welcome to Padma Bridge \n");
        text_area.setText(text_area.getText()+"\t        Receipt for Toll as per notification of Bangladesh Govt. \n");
        text_area.setText(text_area.getText()+"\n");
        text_area.setText(text_area.getText()+"  Date: "+date.format(d)+"\t\t\t\t\t       Time: "+time.format(d)+"\n");
        text_area.setText(text_area.getText()+"  Toll Gate: "+tollGate+"\n");
        text_area.setText(text_area.getText()+"  Toll Collector: "+tollCollector+"\n");
        text_area.setText(text_area.getText()+"  Lane ID: " + laneID+"\n");
        text_area.setText(text_area.getText()+"  Passage: " + passageType+"\n");
        text_area.setText(text_area.getText()+"  NID: "+NID+"\n");
        text_area.setText(text_area.getText()+"  Reg. Number: "+registrationNumber+"\n");
        text_area.setText(text_area.getText()+"  License Number: "+licenseNumber+"\n");
        text_area.setText(text_area.getText()+"  Name: "+name+"\n");
        text_area.setText(text_area.getText()+"  Vehicle Class: "+vehicleType+"\n");
        text_area.setText(text_area.getText()+"  Toll Fare: "+vehicleFare+" BDT(Only)\n");
        text_area.setText(text_area.getText()+"\n");
        text_area.setText(text_area.getText()+"\n");
        text_area.setText(text_area.getText()+"            Ambulance, Towaway Crane, Route Patrol Services are availavle at toll plaza \n \t   free of cost on the toll road from km 102 to 144. \n");
        text_area.setText(text_area.getText()+"\n");
        text_area.setText(text_area.getText()+"\t                              *** Helpline: 999 ***");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TollManagmentSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JButton calculate_fare;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lane_id;
    private javax.swing.JTextField license_number;
    private javax.swing.JTextField nid_number;
    private javax.swing.JComboBox<String> passageBox;
    private javax.swing.JButton receipt_print;
    private javax.swing.JTextField registration_number;
    private javax.swing.JButton reset_button;
    private javax.swing.JButton save_button;
    private javax.swing.JTextArea text_area;
    private javax.swing.JTextField toll_collector;
    private javax.swing.JComboBox<String> toll_gate;
    private javax.swing.JComboBox<String> vehicle_class;
    // End of variables declaration//GEN-END:variables
}
