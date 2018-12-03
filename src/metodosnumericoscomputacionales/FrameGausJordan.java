package metodosnumericoscomputacionales;

import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameGausJordan extends javax.swing.JInternalFrame {

    List<JTextField> listamatrizA;
    List<JTextField> listavectorB;
    List<JLabel> listaetiquetas;

    List<JTextField> listaMatrizResultante;
    List<JTextField> listavectorResultante;
    List<JLabel> listaigualResultado;

    List<JLabel> listasolucion;
    int tamano = 0;

    public FrameGausJordan() {
        initComponents();

        listamatrizA = new ArrayList<>();
        listavectorB = new ArrayList<>();
        listaetiquetas = new ArrayList<>();

        listaMatrizResultante = new ArrayList();
        listavectorResultante = new ArrayList();
        listaigualResultado = new ArrayList();

        listasolucion = new ArrayList<>();
        ;
        this.setTitle("Gauss-Jordan");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlMatrizA = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlB = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lblingrese = new javax.swing.JLabel();
        txtnovariables = new javax.swing.JTextField();
        btnCrearMatriz = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSolucion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlIgual = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnlMatrizResultante = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        pnlIgualR = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pnlVectorBResultante = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        pnlSolucion = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        pnlvaribles = new javax.swing.JPanel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlMatrizA.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(pnlMatrizA);

        pnlB.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane2.setViewportView(pnlB);

        pnlInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbltitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Gauss-Jordan");

        lblingrese.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblingrese.setText("ingrese numero de variables: ");

        btnCrearMatriz.setText("Crear Matriz");
        btnCrearMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMatrizActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSolucion.setText("Solucion");
        btnSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addComponent(lblingrese, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtnovariables))
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addComponent(btnCrearMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo)
                .addGap(18, 18, 18)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblingrese, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnovariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearMatriz)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSolucion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setBorder(null);

        pnlIgual.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnlIgual.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane3.setViewportView(pnlIgual);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlMatrizResultante.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane4.setViewportView(pnlMatrizResultante);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        pnlIgualR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlIgualR.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane5.setViewportView(pnlIgualR);

        pnlVectorBResultante.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane6.setViewportView(pnlVectorBResultante);

        jScrollPane7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        pnlSolucion.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane7.setViewportView(pnlSolucion);

        jScrollPane8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        pnlvaribles.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane8.setViewportView(pnlvaribles);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnCrearMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMatrizActionPerformed

        pnlMatrizA.removeAll();
        pnlB.removeAll();
        pnlIgual.removeAll();

        pnlMatrizResultante.removeAll();
        pnlMatrizResultante.repaint();

        pnlIgualR.removeAll();
        pnlIgualR.repaint();

        pnlVectorBResultante.removeAll();
        pnlVectorBResultante.repaint();

        listamatrizA.clear();
        listavectorB.clear();
        listaetiquetas.clear();

        try {

            tamano = Integer.parseInt(txtnovariables.getText());

            pnlMatrizA.setLayout(new java.awt.GridLayout(tamano, tamano));
            pnlB.setLayout(new java.awt.GridLayout(tamano, 0));
            pnlIgual.setLayout(new java.awt.GridLayout(tamano, 0));

            int flag = tamano;

            for (int i = 0; i < (tamano + 1) * tamano; i++) {

                if (flag == i) {

                    creaciontextfield(listamatrizA, pnlB);
                    etiquetas(pnlIgual, listaetiquetas);
                    flag = flag + (tamano + 1);

                } else {

                    creaciontextfield(listamatrizA, pnlMatrizA);

                }

            }

            txtnovariables.setText("");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ingrese Solo Numeros", "Error", JOptionPane.ERROR_MESSAGE);
            txtnovariables.setText("");

        }


    }//GEN-LAST:event_btnCrearMatrizActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        pnlMatrizA.removeAll();
        pnlMatrizA.repaint();

        pnlB.removeAll();
        pnlB.repaint();

        pnlIgual.removeAll();
        pnlIgual.repaint();

        pnlMatrizResultante.removeAll();
        pnlMatrizResultante.repaint();

        pnlIgualR.removeAll();
        pnlIgualR.repaint();

        pnlVectorBResultante.removeAll();
        pnlVectorBResultante.repaint();

        pnlSolucion.removeAll();
        pnlSolucion.repaint();

        pnlSolucion.removeAll();
        pnlSolucion.repaint();

        pnlvaribles.removeAll();
        pnlvaribles.repaint();

        txtnovariables.setText("");


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionActionPerformed

        int size = tamano + 1;

        try {

            float[][] MatrizA = new float[tamano][size];

            int mA = 0;

            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < size; j++) {

                    MatrizA[i][j] = Float.parseFloat(listamatrizA.get(mA).getText());
                    mA = mA + 1;

                }

            }

            int var = tamano, piv = 0;
            
            for (int a = 0; a < var; a++) {
            pivote(MatrizA, piv, var);

            System.out.println("\tRenglon " + (a + 1) + " entre el pivote");
            mostrarMatriz(MatrizA, var);

            System.out.println("");

            System.out.println("\tHaciendo ceros");
            hacerCeros(MatrizA, piv, var);

           mostrarMatriz(MatrizA, var);
            System.out.println("");
            piv++;
        }
        for (int x = 0; x < var; x++) {
            System.out.println("La variable X" + (x + 1) + " es: " + MatrizA[x][var]);
        }

            System.out.println("/////");
            
              for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < size; j++) {

                    System.out.println(MatrizA[i][j]);
                    

                }

            }
            
           
            
/*
            pnlMatrizResultante.removeAll();
            pnlVectorBResultante.removeAll();
            pnlIgualR.removeAll();

            listaMatrizResultante.clear();
            listavectorResultante.clear();
            listaigualResultado.clear();

            pnlMatrizResultante.setLayout(new java.awt.GridLayout(tamano, tamano));
            pnlVectorBResultante.setLayout(new java.awt.GridLayout(tamano, 0));
            pnlIgualR.setLayout(new java.awt.GridLayout(tamano, 0));

            int flag = tamano;

            for (int i = 0; i < (tamano + 1) * tamano; i++) {

                if (i == flag) {

                    creaciontextfield(listavectorResultante, pnlVectorBResultante);
                    etiquetas(pnlIgualR, listaigualResultado);
                    flag = flag + (tamano + 1);

                } else {

                    creaciontextfield(listaMatrizResultante, pnlMatrizResultante);

                }

            }

            int indice = 0;

            for (int i = 0; i < MatrizA.length; i++) {
                for (int j = 0; j < MatrizA[i].length; j++) {

                    if (j == tamano) {

                        listavectorResultante.get(indice).setText("" + MatrizA[i][j]);
                        listavectorResultante.get(indice).setEditable(false);
                        indice = indice + 1;

                    } else {

                        listaMatrizResultante.get(indice).setText("" + MatrizA[i][j]);
                        listaMatrizResultante.get(indice).setEditable(false);
                        indice = indice + 1;
                    }
                }

            }

            /*
            
            int indice2 = 0;

            for (int i = 0; i < vector.length; i++) {

                listavectorResultante.get(indice2).setText("" + vector[i]);
                listavectorResultante.get(indice2).setEditable(false);
                indice2 = indice2 + 1;

            }

            double[] solution = new double[vector.length];
            for (int i = vector.length - 1; i >= 0; i--) {
                double sum = 0.0;
                for (int j = i + 1; j < vector.length; j++) {
                    sum += MatrizA[i][j] * solution[j];
                }
                solution[i] = (vector[i] - sum) / MatrizA[i][i];
            }
            
            pnlSolucion.removeAll();
            listasolucion.clear();
            
            pnlvaribles.removeAll();
            List<JLabel> listavariables = new ArrayList<>();
            listavariables.clear();

            pnlvaribles.setLayout(new java.awt.GridLayout(0,vector.length));
            pnlSolucion.setLayout(new java.awt.GridLayout(0, vector.length));

            char[] abc = Abecedario();
            
            for (int i = 0; i < solution.length; i++) {

                etiquetassolucion(pnlSolucion, listasolucion);
                etiquetas(pnlvaribles,listavariables);
                
                

            }

            int indice3 = 0;
            
            

            for (int i = 0; i < solution.length; i++) {
                
                listasolucion.get(i).setText(""+solution[i]);
                listavariables.get(i).setText(""+abc[i]);

                indice3 = indice3 + 1;
                
            }
             */
        } catch (Exception e) {

            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Favor De Verificar la informacion en la matriz", "error", JOptionPane.ERROR_MESSAGE);
            for (int i = 0; i < listamatrizA.size(); i++) {

                listamatrizA.get(i).setText("");
                listamatrizA.get(i).setEditable(true);

            }

            for (int i = 0; i < listavectorB.size(); i++) {

                listavectorB.get(i).setText("");

                listavectorB.get(i).setEditable(true);

            }

            for (int i = 0; i < listaetiquetas.size(); i++) {

                listaetiquetas.get(i).setText("");

            }

        }

    }//GEN-LAST:event_btnSolucionActionPerformed

////////////////////Metodos para poder crear los textFields necesarios segun el usuario los necesite/////////
    public void creaciontextfield(List lista, JPanel panel) {

        Font fuente = new Font("Tahoma", 20, 20);

        JTextField txt = new JTextField();
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setFont(fuente);

        txt.setVisible(true);
        txt.setSize(14, 25);
        panel.add(txt);

        panel.validate();
        lista.add(txt);
    }

    public void etiquetas(JPanel panel, List lista) {

        Font fuente = new Font("Tahoma", 24, 30);

        JLabel txt = new JLabel();
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setFont(fuente);
        txt.setText("=");

        txt.setVisible(true);
        txt.setSize(14, 25);
        panel.add(txt);

        panel.validate();
        lista.add(txt);

    }

    public void etiquetassolucion(JPanel panel, List lista) {

        Font fuente = new Font("Tahoma", 6, 15);

        JLabel txt = new JLabel();
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setFont(fuente);

        txt.setVisible(true);
        txt.setSize(6, 15);
        panel.add(txt);

        panel.validate();
        lista.add(txt);

    }

    public char[] Abecedario() {
        char[] s;
        s = new char[26];
        for (int i = 0; i < 26; i++) {
            s[i] = (char) ('A' + i);
        }
        return s;
    }

    static void pivote(float matriz[][], int piv, int var) {
        float temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }

    static void hacerCeros(float matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }
    
     static void mostrarMatriz(float matriz[][], int var) {
        for (int i = 0; i < var; i++) {
            for (int j = 0; j < (var + 1); j++) {
                System.out.print(" " + matriz[i][j] + " | ");
            }
            System.out.println("");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearMatriz;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSolucion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblingrese;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel pnlB;
    private javax.swing.JPanel pnlIgual;
    private javax.swing.JPanel pnlIgualR;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMatrizA;
    private javax.swing.JPanel pnlMatrizResultante;
    private javax.swing.JPanel pnlSolucion;
    private javax.swing.JPanel pnlVectorBResultante;
    private javax.swing.JPanel pnlvaribles;
    private javax.swing.JTextField txtnovariables;
    // End of variables declaration//GEN-END:variables
}
