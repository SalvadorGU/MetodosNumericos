/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.metodos;
/**
 *
 * @author Ramón Castro
 */
import javax.swing.JTable;
import javax.swing.JTextField;

public class MinimosCuadrados {
    
    
    public void minimosCuadrados(int n,int x, JTable tblDatos, JTextField txtResultado ){

        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        for(int i = 0;i<n;i++){
            sumX += Double.parseDouble(tblDatos.getValueAt(i, 0).toString());
            sumY += Double.parseDouble(tblDatos.getValueAt(i, 1).toString());
            sumXY += Double.parseDouble(tblDatos.getValueAt(i, 0).toString())*Double.parseDouble(tblDatos.getValueAt(i, 1).toString());
            sumX2 += Math.pow(Double.parseDouble(tblDatos.getValueAt(i, 0).toString()),2);
        }
        double m = 0, b = 0;
        m = (n*(sumXY)-(sumX)*(sumY))/(n*(sumX2)-Math.pow(sumX, 2));
        b = (sumY*sumX2-sumX*sumXY)/(n*(sumX2)-Math.pow(sumX, 2));
        double y = 0;
        y = m*x + b;
        
        String resultado = "";
        resultado = "X: "+x+"\t"+" Y: "+y;
        txtResultado.setText(resultado);
        
    }
}
