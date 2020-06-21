package FxCurrency;

import java.text.DecimalFormat;


 class Main extends javax.swing.JFrame {

/**
* Creates new form Main
*/
public Main() {
initComponents();
}

/**
* This method is called from within the constructor to initialize the form.
* WARNING: Do NOT modify this code. The content of this method is always
* regenerated by the Form Editor.
*/
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {

jLabel1 = new javax.swing.JLabel();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();
NisField = new javax.swing.JTextField();
DollarField = new javax.swing.JTextField();
EuroField = new javax.swing.JTextField();
GbpField = new javax.swing.JTextField();
jPanel1 = new javax.swing.JPanel();
jLabel2 = new javax.swing.JLabel();
DollarToEuroField = new javax.swing.JTextField();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
DollarToGBPField = new javax.swing.JTextField();
jLabel5 = new javax.swing.JLabel();
DollarToYenField = new javax.swing.JTextField();
jLabel6 = new javax.swing.JLabel();
DollarToNISField = new javax.swing.JTextField();
YenField = new javax.swing.JTextField();
jButton6 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setBackground(new java.awt.Color(255, 255, 255));

jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel1.setText("FX Currency Converter");

jButton2.setText("$");

jButton3.setText("NIS");

jButton4.setText("Euro");

jButton5.setText("GBP");

NisField.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
NisFieldKeyReleased(evt);
}
});

DollarField.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
DollarFieldKeyReleased(evt);
}
});

EuroField.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
EuroFieldKeyReleased(evt);
}
});

GbpField.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
GbpFieldKeyReleased(evt);
}
});

jPanel1.setBackground(new java.awt.Color(255, 255, 255));
jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

jLabel2.setText("FX Rates:");

DollarToEuroField.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
DollarToEuroFieldKeyReleased(evt);
}
});

jLabel3.setText("$/Euro");

jLabel4.setText("$/GBP");

DollarToGBPField.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
DollarToGBPFieldKeyReleased(evt);
}
});

jLabel5.setText("$/YEN");

DollarToYenField.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
DollarToYenFieldKeyReleased(evt);
}
});

jLabel6.setText("$/NIS");

DollarToNISField.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
DollarToNISFieldKeyReleased(evt);
}
});

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel2)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(64, 64, 64)
.addComponent(jLabel3))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(45, 45, 45)
.addComponent(DollarToEuroField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(19, 19, 19)
.addComponent(jLabel4))
.addComponent(DollarToGBPField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(19, 19, 19)
.addComponent(jLabel5))
.addComponent(DollarToYenField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(19, 19, 19)
.addComponent(jLabel6))
.addComponent(DollarToNISField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(37, 37, 37)
.addComponent(jLabel2)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addContainerGap(24, Short.MAX_VALUE)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jLabel6)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(DollarToNISField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jLabel5)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(DollarToYenField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jLabel4)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(DollarToGBPField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jLabel3)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(DollarToEuroField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(18, 18, 18))
);

YenField.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
YenFieldKeyReleased(evt);
}
});

jButton6.setText("Yen");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(DollarField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(EuroField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
.addComponent(GbpField))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(YenField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(NisField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(layout.createSequentialGroup()
.addGap(136, 136, 136)
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(0, 0, Short.MAX_VALUE))
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
.addContainerGap())
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(20, 20, 20)
.addComponent(jLabel1)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton2)
.addComponent(jButton4)
.addComponent(jButton5))
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(DollarField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(EuroField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(GbpField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(layout.createSequentialGroup()
.addComponent(jButton6)
.addGap(18, 18, 18)
.addComponent(YenField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jButton3)
.addGap(18, 18, 18)
.addComponent(NisField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(38, 38, 38)
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(60, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

private void DollarFieldKeyReleased(java.awt.event.KeyEvent evt) {
// TODO add your handling code here:

double dollar = 0;
try {
dollar = Double.parseDouble(DollarField.getText().toString());
} catch (Exception e) {
}

// double euro = Double.parseDouble(EuroField.getText().toString());
// double yen = Double.parseDouble(YenField.getText().toString());
// double gbp = Double.parseDouble(GbpField.getText().toString());
// double nis = Double.parseDouble(NisField.getText().toString());
double euro = dollar * 0.89;
double yen = dollar * 108.56;
double gbp = dollar * 0.79;
double nis = dollar * 3.47;
EuroField.setText(new DecimalFormat("##.####").format(euro) + "");
YenField.setText(new DecimalFormat("##.####").format(yen) + "");
GbpField.setText(new DecimalFormat("##.####").format(gbp) + "");
NisField.setText(new DecimalFormat("##.####").format(nis) + "");

double dollarToEuro = dollar / euro;
double dollarToGbp = dollar / gbp;
double yenToDollar = yen / dollar;
double nisToDollar = nis / dollar;

DollarToEuroField.setText(new DecimalFormat("##.####").format(dollarToEuro) + "");
DollarToYenField.setText(new DecimalFormat("##.####").format(yenToDollar) + "");
DollarToGBPField.setText(new DecimalFormat("##.####").format(dollarToGbp) + "");
DollarToNISField.setText(new DecimalFormat("##.####").format(nisToDollar) + "");


}   

private void EuroFieldKeyReleased(java.awt.event.KeyEvent evt) {
// TODO add your handling code here:
double euro = 0;
try {
euro = Double.parseDouble(EuroField.getText().toString());
} catch (Exception e) {
}

// double euro = Double.parseDouble(EuroField.getText().toString());
// double yen = Double.parseDouble(YenField.getText().toString());
// double gbp = Double.parseDouble(GbpField.getText().toString());
// double nis = Double.parseDouble(NisField.getText().toString());
double dollar = euro * 1.12;
double yen = euro * 121.65;
double gbp = euro * 0.89;
double nis = euro * 3.89;
DollarField.setText(new DecimalFormat("##.####").format(dollar) + "");
YenField.setText(new DecimalFormat("##.####").format(yen) + "");
GbpField.setText(new DecimalFormat("##.####").format(gbp) + "");
NisField.setText(new DecimalFormat("##.####").format(nis) + "");

double dollarToEuro = dollar / euro;
double dollarToGbp = dollar / gbp;
double yenToDollar = yen / dollar;
double nisToDollar = nis / dollar;

DollarToEuroField.setText(new DecimalFormat("##.####").format(dollarToEuro) + "");
DollarToYenField.setText(new DecimalFormat("##.####").format(yenToDollar) + "");
DollarToGBPField.setText(new DecimalFormat("##.####").format(dollarToGbp) + "");
DollarToNISField.setText(new DecimalFormat("##.####").format(nisToDollar) + "");

}   

private void GbpFieldKeyReleased(java.awt.event.KeyEvent evt) {   
// TODO add your handling code here:
double gbp = 0;
try {
gbp = Double.parseDouble(GbpField.getText().toString());
} catch (Exception e) {
}

// double euro = Double.parseDouble(EuroField.getText().toString());
// double yen = Double.parseDouble(YenField.getText().toString());
// double gbp = Double.parseDouble(GbpField.getText().toString());
// double nis = Double.parseDouble(NisField.getText().toString());
double dollar = gbp * 1.26;
double yen = gbp * 136.69;
double euro = gbp * 1.12;
double nis = gbp * 4.37;
DollarField.setText(new DecimalFormat("##.####").format(dollar) + "");
YenField.setText(new DecimalFormat("##.####").format(yen) + "");
EuroField.setText(new DecimalFormat("##.####").format(euro) + "");
NisField.setText(new DecimalFormat("##.####").format(nis) + "");

double dollarToEuro = dollar / euro;
double dollarToGbp = dollar / gbp;
double yenToDollar = yen / dollar;
double nisToDollar = nis / dollar;

DollarToEuroField.setText(new DecimalFormat("##.####").format(dollarToEuro) + "");
DollarToYenField.setText(new DecimalFormat("##.####").format(yenToDollar) + "");
DollarToGBPField.setText(new DecimalFormat("##.####").format(dollarToGbp) + "");
DollarToNISField.setText(new DecimalFormat("##.####").format(nisToDollar) + "");


}

private void YenFieldKeyReleased(java.awt.event.KeyEvent evt) {   
// TODO add your handling code here:

double yen = 0;
try {
yen = Double.parseDouble(YenField.getText().toString());
} catch (Exception e) {
}

// double euro = Double.parseDouble(EuroField.getText().toString());
// double yen = Double.parseDouble(YenField.getText().toString());
// double gbp = Double.parseDouble(GbpField.getText().toString());
// double nis = Double.parseDouble(NisField.getText().toString());
System.out.println("" + yen + " " + yen * 0.0082);
double dollar = yen * 0.0092;
double gbp = yen * 0.0073;
double euro = yen * 0.0082;
double nis = yen * 0.032;
DollarField.setText(new DecimalFormat("##.####").format(dollar) + "");
GbpField.setText(new DecimalFormat("##.####").format(gbp) + "");
EuroField.setText(new DecimalFormat("##.#####").format(euro) + "");
NisField.setText(new DecimalFormat("##.####").format(nis) + "");

double dollarToEuro = dollar / euro;
double dollarToGbp = dollar / gbp;
double yenToDollar = yen / dollar;
double nisToDollar = nis / dollar;

DollarToEuroField.setText(new DecimalFormat("##.####").format(dollarToEuro) + "");
DollarToYenField.setText(new DecimalFormat("##.####").format(yenToDollar) + "");
DollarToGBPField.setText(new DecimalFormat("##.####").format(dollarToGbp) + "");
DollarToNISField.setText(new DecimalFormat("##.####").format(nisToDollar) + "");

}

private void NisFieldKeyReleased(java.awt.event.KeyEvent evt) {   
// TODO add your handling code here:

double nis = 0;
try {
nis = Double.parseDouble(NisField.getText().toString());
} catch (Exception e) {
}

// double euro = Double.parseDouble(EuroField.getText().toString());
// double yen = Double.parseDouble(YenField.getText().toString());
// double gbp = Double.parseDouble(GbpField.getText().toString());
// double nis = Double.parseDouble(NisField.getText().toString());
double dollar = nis * 0.29;
double yen = nis * 31.32;
double euro = nis * 0.26;
double gbp = nis * 0.23;
DollarField.setText(new DecimalFormat("##.####").format(dollar) + "");
YenField.setText(new DecimalFormat("##.####").format(yen) + "");
EuroField.setText(new DecimalFormat("##.####").format(euro) + "");
GbpField.setText(new DecimalFormat("##.####").format(gbp) + "");

double dollarToEuro = dollar / euro;
double dollarToGbp = dollar / gbp;
double yenToDollar = yen / dollar;
double nisToDollar = nis / dollar;

DollarToEuroField.setText(new DecimalFormat("##.####").format(dollarToEuro) + "");
DollarToYenField.setText(new DecimalFormat("##.####").format(yenToDollar) + "");
DollarToGBPField.setText(new DecimalFormat("##.####").format(dollarToGbp) + "");
DollarToNISField.setText(new DecimalFormat("##.####").format(nisToDollar) + "");

}

private void DollarToEuroFieldKeyReleased(java.awt.event.KeyEvent evt) {
// TODO add your handling code here:

double dollar = 0;
double euro = 0;
try {
dollar = Double.parseDouble(DollarField.getText().toString());
euro = Double.parseDouble(DollarToEuroField.getText().toString());

} catch (Exception e) {

}
euro = dollar / euro;
EuroField.setText(new DecimalFormat("##.####").format(euro) + "");


}   

private void DollarToGBPFieldKeyReleased(java.awt.event.KeyEvent evt) {   
// TODO add your handling code here:
double dollar = 0;
double gbp = 0;
try {
dollar = Double.parseDouble(DollarField.getText().toString());
gbp = Double.parseDouble(DollarToGBPField.getText().toString());

} catch (Exception e) {

}
gbp = dollar / gbp;
GbpField.setText(new DecimalFormat("##.####").format(gbp) + "");

}

private void DollarToYenFieldKeyReleased(java.awt.event.KeyEvent evt) {   
// TODO add your handling code here:
double dollar = 0;
double yen = 0;
try {
dollar = Double.parseDouble(DollarField.getText().toString());
yen = Double.parseDouble(DollarToYenField.getText().toString());

} catch (Exception e) {

}
yen = dollar * yen;
YenField.setText(new DecimalFormat("##.####").format(yen) + "");

}

private void DollarToNISFieldKeyReleased(java.awt.event.KeyEvent evt) {   
// TODO add your handling code here:
double dollar = 0;
double nis = 0;
try {
dollar = Double.parseDouble(DollarField.getText().toString());
nis = Double.parseDouble(DollarToNISField.getText().toString());

} catch (Exception e) {

}
nis = dollar * nis;
NisField.setText(new DecimalFormat("##.####").format(nis) + "");

}

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
java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new MainFrame().setVisible(true);
}
});
}

// Variables declaration - do not modify   
private javax.swing.JTextField DollarField;
private javax.swing.JTextField DollarToEuroField;
private javax.swing.JTextField DollarToGBPField;
private javax.swing.JTextField DollarToNISField;
private javax.swing.JTextField DollarToYenField;
private javax.swing.JTextField EuroField;
private javax.swing.JTextField GbpField;
private javax.swing.JTextField NisField;
private javax.swing.JTextField YenField;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JButton jButton4;
private javax.swing.JButton jButton5;
private javax.swing.JButton jButton6;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JPanel jPanel1;
// End of variables declaration   
}