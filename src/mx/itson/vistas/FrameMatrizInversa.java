/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.vistas;

import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sajos
 */
public class FrameMatrizInversa extends javax.swing.JInternalFrame {

    List<JTextField> listamatrizA;
    List<JTextField> listavectorB;
    List<JLabel> listaetiquetas;
    List<JTextField> listA;
    List<JTextField> listaB;

    List<JTextField> listaMatrizResultante;
    List<JTextField> listavectorResultante;
    List<JLabel> listaigualResultado;

    List<JLabel> listasolucion;
    int tamano = 0;

    public FrameMatrizInversa() {
        initComponents();

        listaB = new ArrayList<>();
        listA = new ArrayList<>();
        listamatrizA = new ArrayList<>();
        listavectorB = new ArrayList<>();
        listaetiquetas = new ArrayList<>();

        listaMatrizResultante = new ArrayList();
        listavectorResultante = new ArrayList();
        //
        listasolucion = new ArrayList<>();
 
        this.setTitle("Matriz Inversa");

        lblX.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jScrollPane6 = new javax.swing.JScrollPane();
        pnlVectorBResultante = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        pnlSolucion = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        pnlvaribles = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();

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
        lbltitulo.setText("Matriz Inversa");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        pnlVectorBResultante.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane6.setViewportView(pnlVectorBResultante);

        jScrollPane7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        pnlSolucion.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane7.setViewportView(pnlSolucion);

        jScrollPane8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        pnlvaribles.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane8.setViewportView(pnlvaribles);

        lblX.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("X");

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
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            int d = listamatrizA.size();
            for (int i = 0; i < tamano * tamano; i++) {

                creaciontextfield(listamatrizA, pnlMatrizA, d);

            }
            for (int i = 0; i < tamano; i++) {
                creaciontextfield(listavectorB, pnlB, d);
                etiquetas(pnlIgual, listaetiquetas);

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

        

        pnlVectorBResultante.removeAll();
        pnlVectorBResultante.repaint();

        pnlSolucion.removeAll();
        pnlSolucion.repaint();

        pnlSolucion.removeAll();
        pnlSolucion.repaint();

        pnlvaribles.removeAll();
        pnlvaribles.repaint();

        txtnovariables.setText("");
        lblX.setVisible(false);


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionActionPerformed
       
        lblX.setVisible(true);
        
        DecimalFormat DC = new DecimalFormat("#.###");

        int size = tamano;

        try {
            
            
            double[][] MatrizA = null;
            double[][] vector = null;

            for (int i = 0; i < listamatrizA.size(); i++) {

                if (listamatrizA.get(i).getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Favor De llenar todos los campos");
                    break;

                } else {

                    listamatrizA.get(i).setEditable(false);

                }

            }

            for (int i = 0; i < listavectorB.size(); i++) {

                if (listavectorB.get(i).getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Favor De llenar todos los campos");
                    break;

                } else {
                    listavectorB.get(i).setEditable(false);
                }

            }

            MatrizA = new double[size][size];

            int mA = 0;

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {

                    MatrizA[i][j] = Double.parseDouble(listamatrizA.get(mA).getText());
                    mA = mA + 1;

                }

            }

            vector = new double[size][1];

            int v = 0;

            for (int i = 0; i < size; i++) {

                vector[i][0] = Double.parseDouble(listavectorB.get(v).getText());
                v = v + 1;

            }

            pnlMatrizResultante.removeAll();
            pnlVectorBResultante.removeAll();
            //pnlIgualR.removeAll();

            listaMatrizResultante.clear();
            listavectorResultante.clear();
            //listaigualResultado.clear();

            tamano = size;

            pnlMatrizResultante.setLayout(new java.awt.GridLayout(tamano, tamano));
            pnlVectorBResultante.setLayout(new java.awt.GridLayout(tamano, 0));
            //pnlIgualR.setLayout(new java.awt.GridLayout(tamano, 0));

            int d = listaMatrizResultante.size();

            for (int i = 0; i < tamano * tamano; i++) {

                creaciontextfield(listaMatrizResultante, pnlMatrizResultante, d);

            }
            for (int i = 0; i < tamano; i++) {
                creaciontextfield(listavectorResultante, pnlVectorBResultante, d);
                //etiquetas(pnlIgualR, listaigualResultado);

            }
            double o[][] = invert(MatrizA);

            double MatrizResultante[][] = new double[size][1];
            int Columna1 = MatrizA[0].length;
            for (int x = 0; x < MatrizResultante.length; x++) {
                for (int y = 0; y < MatrizResultante[x].length; y++) {
                    for (int z = 0; z < Columna1; z++) {
                        MatrizResultante[x][y] += o[x][z] * vector[z][y];
                    }
                }
            }

            int indice = 0;

            for (int i = 0; i < MatrizA.length; i++) {
                for (int j = 0; j < MatrizA[i].length; j++) {

                    listaMatrizResultante.get(indice).setText("" + DC.format(o[i][j]));
                    listaMatrizResultante.get(indice).setEditable(false);
                    indice = indice + 1;

                }

            }

            int indice2 = 0;

            for (int i = 0; i < vector.length; i++) {

                listavectorResultante.get(indice2).setText("" + vector[i][0]);
                listavectorResultante.get(indice2).setEditable(false);
                indice2 = indice2 + 1;

            }

            pnlSolucion.removeAll();
            listasolucion.clear();

            pnlvaribles.removeAll();
            List<JLabel> listavariables = new ArrayList<>();
            listavariables.clear();

            pnlvaribles.setLayout(new java.awt.GridLayout(0, vector.length));
            pnlSolucion.setLayout(new java.awt.GridLayout(0, vector.length));

            char[] abc = Abecedario();

            for (int i = 0; i < MatrizA.length; i++) {

                etiquetassolucion(pnlSolucion, listasolucion);
                etiquetas(pnlvaribles, listavariables);

            }

            int indice3 = 0;

            for (int i = 0; i < MatrizResultante.length; i++) {

                listasolucion.get(i).setText("" + DC.format(MatrizResultante[i][0]));
                listavariables.get(i).setText("" + abc[i]);

                indice3 = indice3 + 1;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSolucionActionPerformed

    public void creaciontextfield(List lista, JPanel panel, int d) {

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

    public static double[][] invert(double a[][]) {

        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i][i] = 1;
        }

        // Transform the matrix into an upper triangle
        gaussian(a, index);

        // Update the matrix b[i][j] with the ratios stored
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];
                }
            }
        }

        // Perform backward substitutions
        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }

                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }

    public static void gaussian(double a[][], int index[]) {

        int n = index.length;
        double c[] = new double[n];

        // Initialize the index
        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }

        // Find the rescaling factors, one from each row
        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) {
                    c1 = c0;
                }
            }
            c[i] = c1;
        }

        // Search the pivoting element from each column
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {

                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }

            // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];

                // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;

                // Modify other elements accordingly
                for (int l = j + 1; l < n; ++l) {
                    a[index[i]][l] -= pj * a[index[j]][l];
                }
            }
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblingrese;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel pnlB;
    private javax.swing.JPanel pnlIgual;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMatrizA;
    private javax.swing.JPanel pnlMatrizResultante;
    private javax.swing.JPanel pnlSolucion;
    private javax.swing.JPanel pnlVectorBResultante;
    private javax.swing.JPanel pnlvaribles;
    private javax.swing.JTextField txtnovariables;
    // End of variables declaration//GEN-END:variables
}