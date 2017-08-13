/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadconstruction;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author fida
 */
public class CatalogueJFrame extends javax.swing.JFrame {

    public static CatalogueJFrame mjf;
    private static Image myPicture = null;
    private int rad = 0;
    private int pos = 0;

    /**
     * Creates new form CatalogueJFrame
     */
    public CatalogueJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Traffice Range 1-10 msa");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Traffice Range 10-150 msa");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setSelectedItem(null);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(jLabel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(132, 132, 132)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(121, 121, 121)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)))
                .addGap(18, 18, 18))
        );

        final DefaultComboBoxModel fruitsName = new DefaultComboBoxModel();
        fruitsName.addElement("CBR 2%");
        fruitsName.addElement("CBR 3%");
        fruitsName.addElement("CBR 4%");
        fruitsName.addElement("CBR 5%");
        fruitsName.addElement("CBR 6%");
        fruitsName.addElement("CBR 7%");
        fruitsName.addElement("CBR 8%");
        fruitsName.addElement("CBR 9%");
        fruitsName.addElement("CBR 10%");
        jComboBox1.setModel(fruitsName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mjf.setVisible(false);
        CalculationJFrame.mjf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jRadioButton2.setSelected(false);
        rad = 0;
        setPic(rad, jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jRadioButton1.setSelected(false);
        rad = 1;
        setPic(rad, jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:

        //jLabel1.setText(jComboBox1.getSelectedIndex()+"");
        setPic(rad, jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(CatalogueJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogueJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogueJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogueJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            //</editor-fold>
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mjf = new CatalogueJFrame();
                mjf.setSize(800, 700);
                mjf.setLocationRelativeTo(null);
                mjf.setTitle(Constants.APP_NAME);
                //mjf.setResizable(false);
                mjf.setVisible(true);

                try {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a1.jpg"));
                } catch (Exception e) {
                }
                jLabel1.setText("");
                jLabel1.setIcon(new ImageIcon(myPicture));

            }
        });
    }

    private void setPic(int r, int p) {

        pos = p;

        switch (p) {
            case 0:
                if (r == 0) {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a1.jpg"));
                } else {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/b1.jpg"));
                }
                break;
            case 1:
                if (r == 0) {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a2.jpg"));
                } else {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/b2.jpg"));
                }
                break;
            case 2:
                if (r == 0) {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a3.jpg"));
                } else {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/b3.jpg"));
                }
                break;
            case 3:
                if (r == 0) {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a4.jpg"));
                } else {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/b4.jpg"));
                }
                break;
            case 4:
                if (r == 0) {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a5.jpg"));
                } else {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/b5.jpg"));
                }
                break;
            case 5:
                if (r == 0) {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a6.jpg"));
                } else {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/b6.jpg"));
                }
                break;
            case 6:
                if (r == 0) {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a7.jpg"));
                } else {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/b7.jpg"));
                }
                break;
            case 7:
                if (r == 0) {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a8.jpg"));
                } else {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/b8.jpg"));
                }
                break;
            case 8:
                if (r == 0) {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/a8.jpg"));
                } else {
                    myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/b9.jpg"));
                }
                break;
            default:
                break;
        }

        jLabel1.setText("");
        jLabel1.setIcon(new ImageIcon(myPicture));

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
