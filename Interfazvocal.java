/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contarvocales;

import javax.swing.JOptionPane;

/**
 *
 * @author Wuicho
 */
public class Interfazvocal extends javax.swing.JFrame {

    /**
     * Creates new form Interfazvocal
     */
    public Interfazvocal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CalcularV = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Introduzca frase o palabra:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtPalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });
        getContentPane().add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 230, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("CONTADOR DE VOCALES Y CONSONANTES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 470, -1));

        CalcularV.setBackground(new java.awt.Color(255, 255, 102));
        CalcularV.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        CalcularV.setText("Calcular Vocales");
        CalcularV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularVActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularV, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        Salir.setBackground(new java.awt.Color(255, 255, 102));
        Salir.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 60, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contarvocales/descarga.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 310, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contarvocales/53-535569_wallpaper-merah-fondos-de-color-rojo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 396));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void CalcularVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularVActionPerformed
        int consonante, vocal, otro;
        String palabra = txtPalabra.getText().toLowerCase();

        vocal = 0;
        consonante = 0;
        otro = 0;

        for (int cont = 0; cont < palabra.length(); cont++) {
            if (palabra.charAt(cont) < 'a' || palabra.charAt(cont) > 'z') {
                otro++;
            } else if ((palabra.charAt(cont) == 'a') || (palabra.charAt(cont) == 'e') || (palabra.charAt(cont) == 'i') || (palabra.charAt(cont) == 'o') || (palabra.charAt(cont) == 'u')) {
                vocal++;
            } else {
                consonante++;
            }

        }
        JOptionPane.showMessageDialog(null, "La palabra tiene: " + vocal + " Vocales" + " y " + consonante + " Consonantes");

    }//GEN-LAST:event_CalcularVActionPerformed

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
            java.util.logging.Logger.getLogger(Interfazvocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfazvocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfazvocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfazvocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfazvocal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularV;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
