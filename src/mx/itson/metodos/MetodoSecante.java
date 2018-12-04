/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.metodos;

import javax.swing.JTextArea;
/**
 * 
 * @author Ramón Castro
 */
public class MetodoSecante {

    public double raiz(Funcion f, double x0, double x1, double error, JTextArea txtArea) {
        String resultado = "";
        double raiz;
        double x2 = 0;
        int k = 0;
        double e = 100;
        while (e > error) {
            x2 = x1 - f.evaluate(x1) * (x1 - x0) / (f.evaluate(x1) - f.evaluate(x0));
            e = geterrorPorcentual(x1, x2);
            x0 = x1;
            x1 = x2;

            resultado+="x" + (k + 1) + " = " + x0 + "\n";
            resultado+="x" + (k + 2) + " = " + x1 + "\n";
            k++;
            System.out.println("");
            resultado+="Iteracion: " + k + "\n";
            System.out.println("");
            resultado+="Raiz: " + x2 + "\n";
        }
        raiz = x2;
        txtArea.setText(resultado);
        return raiz;
    }

    /**
     * Obtener error porcentual
     *
     * @param p parametro primario
     * @param p2 parametro secundario
     * @return el error
     */
    public double geterrorPorcentual(double p, double p2) {
        double error = Math.abs((p - p2) / p) * 100;
        return error;
    }

}
