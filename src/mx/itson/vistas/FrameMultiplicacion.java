package mx.itson.vistas;

import java.awt.Dimension;
import java.awt.Font;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FrameMultiplicacion extends javax.swing.JInternalFrame {

    private List<JTextField> listA;
    private List<JTextField> listB;

    public int columnasA = 0;
    public int filasA = 0;
    public int columnasB = 0;
    public int filasB = 0;

    public FrameMultiplicacion() {

        initComponents();

        listA = new ArrayList<>();
        listB = new ArrayList<>();
        this.setTitle("Multiplicacion de Matrices");

       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlinfoA = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BntCrearMatrizA = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtFilasA = new javax.swing.JTextField();
        TxtColumnasA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PnlMatrizA = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnlMatrizResultante = new javax.swing.JPanel();
        btnmultiplicar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pnlinfoB = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BntCrearMatrizB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtFilasB = new javax.swing.JTextField();
        TxtColumnasB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PnlMatrizB = new javax.swing.JPanel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1122, 600));
        setMinimumSize(new java.awt.Dimension(1122, 600));
        setPreferredSize(new java.awt.Dimension(1122, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlinfoA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matriz A");

        BntCrearMatrizA.setText("Crear");
        BntCrearMatrizA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntCrearMatrizAActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese Tamaño :");

        jLabel3.setText("filas:");

        jLabel4.setText("columnas:");

        javax.swing.GroupLayout pnlinfoALayout = new javax.swing.GroupLayout(pnlinfoA);
        pnlinfoA.setLayout(pnlinfoALayout);
        pnlinfoALayout.setHorizontalGroup(
            pnlinfoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinfoALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlinfoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlinfoALayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFilasA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtColumnasA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BntCrearMatrizA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlinfoALayout.setVerticalGroup(
            pnlinfoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinfoALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(pnlinfoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFilasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TxtColumnasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BntCrearMatrizA)
                .addContainerGap())
        );

        PnlMatrizA.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(PnlMatrizA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(pnlinfoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlinfoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlMatrizResultanteLayout = new javax.swing.GroupLayout(pnlMatrizResultante);
        pnlMatrizResultante.setLayout(pnlMatrizResultanteLayout);
        pnlMatrizResultanteLayout.setHorizontalGroup(
            pnlMatrizResultanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        pnlMatrizResultanteLayout.setVerticalGroup(
            pnlMatrizResultanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(pnlMatrizResultante);

        btnmultiplicar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnmultiplicar.setText("Multiplicar");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnmultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlinfoB.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Matriz B");

        BntCrearMatrizB.setText("Crear");
        BntCrearMatrizB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntCrearMatrizBActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ingrese Tamaño :");

        jLabel7.setText("filas:");

        jLabel8.setText("columnas:");

        javax.swing.GroupLayout pnlinfoBLayout = new javax.swing.GroupLayout(pnlinfoB);
        pnlinfoB.setLayout(pnlinfoBLayout);
        pnlinfoBLayout.setHorizontalGroup(
            pnlinfoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinfoBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlinfoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlinfoBLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFilasB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtColumnasB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BntCrearMatrizB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlinfoBLayout.setVerticalGroup(
            pnlinfoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinfoBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(pnlinfoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFilasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TxtColumnasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BntCrearMatrizB)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlMatrizBLayout = new javax.swing.GroupLayout(PnlMatrizB);
        PnlMatrizB.setLayout(PnlMatrizBLayout);
        PnlMatrizBLayout.setHorizontalGroup(
            PnlMatrizBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        PnlMatrizBLayout.setVerticalGroup(
            PnlMatrizBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(PnlMatrizB);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(pnlinfoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlinfoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BntCrearMatrizAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntCrearMatrizAActionPerformed

        if (TxtFilasA.getText().equals("") || TxtColumnasA.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Favor de llenar la dimension de la matriz", "", JOptionPane.ERROR_MESSAGE);
            TxtFilasA.setText("");
            TxtColumnasA.setText("");
            
        }else{
        
        
        PnlMatrizA.removeAll();
        listA.clear();
        int col = 0;
        int fil = 0;

        try {

            col = Integer.parseInt(TxtColumnasA.getText());
            fil = Integer.parseInt(TxtFilasA.getText());

        } catch (NumberFormatException error) {

            JOptionPane.showMessageDialog(null, "Favor de Ingresar Solo Numeros", "Error", JOptionPane.ERROR_MESSAGE);
            TxtFilasA.setText("");
            TxtColumnasA.setText("");

        }

        columnasA = col;
        filasA = fil;

        PnlMatrizA.setLayout(new java.awt.GridLayout(filasA, columnasA + 1));

        for (int i = 0; i < col * fil; i++) {

            creaciontextfield(listA, PnlMatrizA);

        }
        }

    }//GEN-LAST:event_BntCrearMatrizAActionPerformed

    private void BntCrearMatrizBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntCrearMatrizBActionPerformed

        if (TxtFilasB.getText().equals("") || TxtColumnasB.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Favor de llenar la dimension de la matriz", "", JOptionPane.ERROR_MESSAGE);
            TxtFilasB.setText("");
            TxtColumnasB.setText("");
            
        
        } else {

            PnlMatrizB.removeAll();
            listB.clear();

            int col = Integer.parseInt(TxtColumnasB.getText());
            int fil = Integer.parseInt(TxtFilasB.getText());

            columnasB = col;
            filasB = fil;

            PnlMatrizB.setLayout(new java.awt.GridLayout(filasB, columnasB + 1));

            for (int i = 0; i < col * fil; i++) {

                creaciontextfield(listB, PnlMatrizB);

            }

        }


    }//GEN-LAST:event_BntCrearMatrizBActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicarActionPerformed

        double matrizA[][] = null;
        double matrizB[][] = null;

        if (columnasA != filasB) {

            JOptionPane.showMessageDialog(null, "LAS MATRICES NO SE PUEDEN MULTIPLICAR", "Error", JOptionPane.ERROR_MESSAGE);
                PnlMatrizA.removeAll();
            PnlMatrizB.removeAll();
            PnlMatrizA.repaint();
            PnlMatrizB.repaint();
            

        } else {
            try {

                matrizA = new double[filasA][columnasA];

                int mA = 0;

                for (int i = 0; i < filasA; i++) {
                    for (int j = 0; j < columnasA; j++) {

                        matrizA[i][j] = Double.parseDouble(listA.get(mA).getText());
                        mA = mA + 1;

                    }

                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Favor de Verificar Informacion en la matriz A", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
                for (int i = 0; i < listA.size(); i++) {

                    listA.get(i).setText("");

                }

            }

            try {

                matrizB = new double[filasB][columnasB];

                int mB = 0;

                for (int i = 0; i < filasB; i++) {
                    for (int j = 0; j < columnasB; j++) {

                        matrizB[i][j] = Double.parseDouble(listB.get(mB).getText());
                        mB = mB + 1;

                    }

                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Favor de verificar informacion en la matriz B", "Error", JOptionPane.ERROR_MESSAGE);
                for (int i = 0; i < listB.size(); i++) {

                    listB.get(i).setText("");

                }

            }

        }

       
        double MatrizResultante[][] = new double[filasA][columnasB];
        int Columna1 = matrizA[0].length;
        for (int x = 0; x < MatrizResultante.length; x++) {
            for (int y = 0; y < MatrizResultante[x].length; y++) {
                for (int z = 0; z < Columna1; z++) {
                    MatrizResultante[x][y] += matrizA[x][z] * matrizB[z][y];
                }
            }
        }
        
        List<JTextField> listaR = new ArrayList<>();

        crearMatriz(pnlMatrizResultante, listaR, filasA, columnasB);

        int indice = 0;

        for (int i = 0; i < MatrizResultante.length; i++) {
            for (int j = 0; j < MatrizResultante[i].length; j++) {

                listaR.get(indice).setText("" + MatrizResultante[i][j]);
               
                indice = indice + 1;

            }

        }

    }//GEN-LAST:event_btnmultiplicarActionPerformed

    public void creaciontextfield(List lista, JPanel panel) {
        Font fuente = new Font("Tahoma", 24, 30);

        JTextField txt = new JTextField();
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setFont(fuente);

        txt.setVisible(true);
        txt.setSize(14, 25);
        panel.add(txt);

        panel.validate();
        lista.add(txt);
    }

    public void crearMatriz(JPanel panel, List lista, int filas, int columnas) {

        panel.removeAll();
        lista.clear();

        int col = columnas;
        int fil = filas;

        panel.setLayout(new java.awt.GridLayout(filas, columnas + 1));

        for (int i = 0; i < col * fil; i++) {

            creaciontextfield(lista, panel);

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntCrearMatrizA;
    private javax.swing.JButton BntCrearMatrizB;
    private javax.swing.JPanel PnlMatrizA;
    private javax.swing.JPanel PnlMatrizB;
    private javax.swing.JTextField TxtColumnasA;
    private javax.swing.JTextField TxtColumnasB;
    private javax.swing.JTextField TxtFilasA;
    private javax.swing.JTextField TxtFilasB;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlMatrizResultante;
    private javax.swing.JPanel pnlinfoA;
    private javax.swing.JPanel pnlinfoB;
    // End of variables declaration//GEN-END:variables
}
