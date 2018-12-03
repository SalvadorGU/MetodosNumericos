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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        bntSalir = new javax.swing.JMenuItem();
        mnuGaussJordan = new javax.swing.JMenu();
        mnuMultiplicacionMatrices = new javax.swing.JMenuItem();
        mnuEliminacionGauss = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuinversion = new javax.swing.JMenuItem();
        mnuigaussseidel = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        mnuGaussJordan.setText("Metodos");

        mnuMultiplicacionMatrices.setText("Multiplicacion de Matrices");
        mnuMultiplicacionMatrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMultiplicacionMatricesActionPerformed(evt);
            }
        });
        mnuGaussJordan.add(mnuMultiplicacionMatrices);

        mnuEliminacionGauss.setText("Eliminacion Gaussiana");
        mnuEliminacionGauss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminacionGaussActionPerformed(evt);
            }
        });
        mnuGaussJordan.add(mnuEliminacionGauss);

        jMenuItem1.setText("Gauss-Jordan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuGaussJordan.add(jMenuItem1);

        mnuinversion.setText("Inversion de Matrices");
        mnuinversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuinversionActionPerformed(evt);
            }
        });
        mnuGaussJordan.add(mnuinversion);

        mnuigaussseidel.setText("Gauss-Seidel");
        mnuigaussseidel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuigaussseidelActionPerformed(evt);
            }
        });
        mnuGaussJordan.add(mnuigaussseidel);

        jMenuBar1.add(mnuGaussJordan);

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

    private void mnuigaussseidelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuigaussseidelActionPerformed
     
        FrameSeidel seidel = new FrameSeidel();
        DesktopPane.add(seidel);
        
        tamanoframe = DesktopPane.getSize();
        
        Dimension FrameSize = seidel.getSize();
        seidel.setLocation((tamanoframe.width - FrameSize.width) / 2, (tamanoframe.height - FrameSize.height) / 2);
        
        seidel.setVisible(true);

        
    }//GEN-LAST:event_mnuigaussseidelActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
        FrameGausJordan jordan = new FrameGausJordan();
        DesktopPane.add(jordan);
        
        tamanoframe = DesktopPane.getSize();
        
        Dimension FrameSize = jordan.getSize();
        jordan.setLocation((tamanoframe.width - FrameSize.width) / 2, (tamanoframe.height - FrameSize.height) / 2);
        
        jordan.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuinversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuinversionActionPerformed

        FrameMatrizInversa inversa = new FrameMatrizInversa();
        DesktopPane.add(inversa);
        
        tamanoframe = DesktopPane.getSize();
        
        Dimension FrameSize = inversa.getSize();
        inversa.setLocation((tamanoframe.width - FrameSize.width) / 2, (tamanoframe.height - FrameSize.height) / 2);
        
        inversa.setVisible(true);
        
        

    }//GEN-LAST:event_mnuinversionActionPerformed

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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuEliminacionGauss;
    private javax.swing.JMenu mnuGaussJordan;
    private javax.swing.JMenuItem mnuMultiplicacionMatrices;
    private javax.swing.JMenuItem mnuigaussseidel;
    private javax.swing.JMenuItem mnuinversion;
    // End of variables declaration//GEN-END:variables
}
