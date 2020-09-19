
package IncomeTaxWages1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Income_Tax_Wages1 extends javax.swing.JFrame {

    double Wages;
    double Tax;
    double Salary;
    double Gross;
    double Deducted;
    public Income_Tax_Wages1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        netpay = new javax.swing.JTextField();
        deduction = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        grossPay = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        untaxedIncome = new javax.swing.JTextField();
        taxableWages = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        payment = new javax.swing.JComboBox<>();
        Calculator = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        reference = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        employee = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jobtitle = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ninumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        taxcode = new javax.swing.JComboBox<>();
        taxcode1 = new javax.swing.JComboBox<>();
        cobTaxPeriod1 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Net Pay:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, 40));

        netpay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(netpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 220, 30));

        deduction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(deduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 220, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Deduction:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Gross Pay:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 40));

        grossPay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(grossPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 220, 30));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Reference");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, 40));

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField16.setText("jTextField1");
        jPanel7.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 220, 30));

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField17.setText("jTextField1");
        jPanel7.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 220, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Reference");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Reference");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 40));

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField18.setText("jTextField1");
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 220, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 440, 190));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Date:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 40));

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 440, 190));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Payment:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Untaxed Income:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));

        untaxedIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(untaxedIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 68, 190, 30));

        taxableWages.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(taxableWages, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 200, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Taxable Wages:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, 30));

        payment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1200", "1750", "2250", "2750", "3250" }));
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        jPanel3.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 200, 30));

        Calculator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Calculator.setText("Calculate");
        Calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculatorActionPerformed(evt);
            }
        });
        jPanel3.add(Calculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        Reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel3.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel3.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 440, 200));

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Reference No:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 30));

        reference.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(reference, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Employer:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 30));

        employer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(employer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 220, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Employee:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));

        employee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 220, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Job Tittle:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 30));

        jobtitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jobtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 220, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 430, 190));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Tax Period:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Tax Code:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("NI Number:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 40));

        ninumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ninumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ninumberActionPerformed(evt);
            }
        });
        jPanel5.add(ninumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("NI Code:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, 40));

        taxcode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        taxcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TC1200", "TC1750", "TC2250", "TC2750", "TC3250" }));
        jPanel5.add(taxcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 200, 30));

        taxcode1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        taxcode1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIC17700", "NIC17701", "NIC17702", "NIC17703", "NIC17704", "NIC17705" }));
        jPanel5.add(taxcode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, 30));

        cobTaxPeriod1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cobTaxPeriod1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jPanel5.add(cobTaxPeriod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 200, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 440, 190));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Income Tax And Wages Calculator");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 640, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 880, 70));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Income Tax and Wages  Summary");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 900, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ninumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ninumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ninumberActionPerformed
private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
      frame = new JFrame("Exit");
      if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Income Tax and Wages Calculator",
              JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
      System.exit(0);
      }
    }//GEN-LAST:event_ExitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
       reference.setText(null);
       employer.setText(null);
       employee.setText(null);
       jobtitle.setText(null);
       untaxedIncome.setText(null);
       taxableWages.setText(null);
       ninumber.setText(null);
       grossPay.setText(null);
       deduction.setText(null);
       netpay.setText(null);
       payment.setSelectedIndex(0);
       taxcode.setSelectedIndex(0);
       taxcode1.setSelectedIndex(0);
     cobTaxPeriod1.setSelectedIndex(0);
    }//GEN-LAST:event_ResetActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
     if(payment.getSelectedItem().equals("1200"))
    {
    untaxedIncome.setText("1200");
    taxableWages.setText("0");
    grossPay.setText("1200");
    deduction.setText("0");
   
    }
    
    else if(payment.getSelectedItem().equals("1750"))
            {
        
    untaxedIncome.setText("1200");
    Wages = Double.parseDouble(untaxedIncome.getText());
    Tax = 1750-1200;
    String WageTax = String.format("%.2f",Tax);
    taxableWages.setText(WageTax);
    grossPay.setText("1750");
    Salary = (Tax * 20)/100;
     String Deduction = String.format("%.2f",Salary);
     deduction.setText(Deduction);
    
    }
    else if(payment.getSelectedItem().equals("2250"))
            {
        
    untaxedIncome.setText("1200");
    Wages = Double.parseDouble(untaxedIncome.getText());
    Tax = 2250-1200;
    String WageTax = String.format("%.2f",Tax);
    taxableWages.setText(WageTax);
    grossPay.setText("2250");
    Salary = (Tax * 25)/100;
     String Deduction = String.format("%.2f",Salary);
     deduction.setText(Deduction);
    
    }
    
   else if(payment.getSelectedItem().equals("2750"))
           {
        
    untaxedIncome.setText("1200");
    Wages = Double.parseDouble(untaxedIncome.getText());
    Tax = 2750-1200;
    String WageTax = String.format("%.2f",Tax);
    taxableWages.setText(WageTax);
    grossPay.setText("2750");
    Salary = (Tax * 30)/100;
     String Deduction = String.format("%.2f",Salary);
     deduction.setText(Deduction);
    }
   
   else if(payment.getSelectedItem().equals("3250"))
           {
        
    untaxedIncome.setText("1200");
    Wages = Double.parseDouble(untaxedIncome.getText());
    Tax = 3250-1200;
    String WageTax = String.format("%.2f",Tax);
    taxableWages.setText(WageTax);
    grossPay.setText("3250");
    Salary = (Tax * 20)/100;
     String Deduction = String.format("%.2f",Salary);
     deduction.setText(Deduction);
    }
   
    else if(payment.getSelectedItem().equals("0"))
    {
    untaxedIncome.setText("0");
    taxableWages.setText("0");
     grossPay.setText("0");
     
    }  

    
    }//GEN-LAST:event_paymentActionPerformed

    private void CalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculatorActionPerformed
      double  Pay;
      Gross = Double.parseDouble(grossPay.getText());
      Deducted = Double.parseDouble(deduction.getText());
      Pay = Gross - Deducted;
      String Wages = String.format("%.2f", Pay);
      netpay.setText(Wages);
      String g = String.format("%.2f",  Gross);
      grossPay.setText(g);
      String d = String.format("%.2f", Deducted);
      deduction.setText(d);
    }//GEN-LAST:event_CalculatorActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Income_Tax_Wages1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculator;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Reset;
    private javax.swing.JComboBox<String> cobTaxPeriod1;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField deduction;
    private javax.swing.JTextField employee;
    private javax.swing.JTextField employer;
    private javax.swing.JTextField grossPay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jobtitle;
    private javax.swing.JTextField netpay;
    private javax.swing.JTextField ninumber;
    private javax.swing.JComboBox<String> payment;
    private javax.swing.JTextField reference;
    private javax.swing.JTextField taxableWages;
    private javax.swing.JComboBox<String> taxcode;
    private javax.swing.JComboBox<String> taxcode1;
    private javax.swing.JTextField untaxedIncome;
    // End of variables declaration//GEN-END:variables
}
