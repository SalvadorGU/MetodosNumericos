package metodosnumericoscomputacionales;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author sajos
 */
public class FramePrincipal extends javax.swing.JFrame {

    
    public static Dimension tamanoframe;

    public FramePrincipal() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setContentPane(DesktopPane);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

       

        tamanoframe = DesktopPane.getSize();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        bntSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuMultiplicacionMatrices = new javax.swing.JMenuItem();
        mnuEliminacionGauss = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        bntSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        bntSalir.setText("Salir");
        bntSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalirActionPerformed(evt);
            }
        });
        jMenu1.add(bntSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Metodos");

        mnuMultiplicacionMatrices.setText("Multiplicacion de Matrices");
        mnuMultiplicacionMatrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMultiplicacionMatricesActionPerformed(evt);
            }
        });
        jMenu2.add(mnuMultiplicacionMatrices);

        mnuEliminacionGauss.setText("Eliminacion Gaussiana");
        mnuEliminacionGauss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminacionGaussActionPerformed(evt);
            }
        });
        jMenu2.add(mnuEliminacionGauss);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bntSalirActionPerformed

    private void mnuMultiplicacionMatricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMultiplicacionMatricesActionPerformed

        FrameMultiplicacion framemul = new FrameMultiplicacion();
        DesktopPane.add(framemul);
        
        tamanoframe = DesktopPane.getSize();

        Dimension FrameSize = framemul.getSize();
        framemul.setLocation((tamanoframe.width - FrameSize.width) / 2, (tamanoframe.height - FrameSize.height) / 2);
        

        framemul.setVisible(true);


    }//GEN-LAST:event_mnuMultiplicacionMatricesActionPerformed

    private void mnuEliminacionGaussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEliminacionGaussActionPerformed
        
        FrameEliminacionGauss eliminacion = new FrameEliminacionGauss();
        DesktopPane.add(eliminacion);
        
        tamanoframe = DesktopPane.getSize();

        Dimension FrameSize = eliminacion.getSize();
        eliminacion.setLocation((tamanoframe.width - FrameSize.width) / 2, (tamanoframe.height - FrameSize.height) / 2);
        

        eliminacion.setVisible(true);

        
    }//GEN-LAST:event_mnuEliminacionGaussActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuItem bntSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuEliminacionGauss;
    private javax.swing.JMenuItem mnuMultiplicacionMatrices;
    // End of variables declaration//GEN-END:variables
}
