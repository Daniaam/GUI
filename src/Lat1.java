/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danimen
 */
public class Lat1 extends javax.swing.JFrame {

    /**
     * Creates new form Lat1
     */
    public Lat1() {
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

        Nama = new javax.swing.JTextField();
        Kelas = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        Nama1 = new javax.swing.JTextField();
        Kelas1 = new javax.swing.JTextField();
        Alamat1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(170, 50, 270, 30);
        getContentPane().add(Kelas);
        Kelas.setBounds(170, 100, 270, 30);
        getContentPane().add(Alamat);
        Alamat.setBounds(170, 140, 270, 30);

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses);
        Proses.setBounds(260, 190, 100, 30);
        getContentPane().add(Nama1);
        Nama1.setBounds(170, 240, 280, 30);
        getContentPane().add(Kelas1);
        Kelas1.setBounds(170, 290, 280, 30);
        getContentPane().add(Alamat1);
        Alamat1.setBounds(170, 340, 280, 30);

        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 60, 40, 20);

        jLabel2.setText("Kelas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 100, 40, 20);

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 140, 60, 20);

        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 240, 50, 20);

        jLabel5.setText("Kelas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 290, 40, 20);

        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 340, 50, 30);

        setBounds(0, 0, 513, 446);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
      String nama = Nama.getText();
      Nama1.setText(nama);
      String kelas = Kelas.getText();
      Kelas1.setText(kelas);
      String alamat = Alamat.getText();
      Alamat1.setText(alamat);
      
    }//GEN-LAST:event_ProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Lat1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lat1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lat1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lat1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lat1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Alamat1;
    private javax.swing.JTextField Kelas;
    private javax.swing.JTextField Kelas1;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nama1;
    private javax.swing.JButton Proses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
