/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.metodos;

/**
 *
 * @author IsaRamón
 */
public class GaussSeidel {
 
    public double[][] A;
    public double[] b;

    
    public  GaussSeidel(double[][] A, double[] b) {
        if (A == null || b == null)
            throw new NullPointerException();
        if (A.length != b.length)
            throw new IllegalArgumentException();
        this.A = A;
        this.b = b;
    }
     
    public boolean proceso() {
        for (int i = 0; i < A.length; i++) {
            double diagonal = Math.abs(A[i][i]);
            double tSum = 0;
            for (int j = 0; j < A.length; j++)
                if (i != j)
                    tSum += Math.abs(A[i][j]);
            if (tSum >= diagonal)
                return false;
        }
        return true;
    }
     
    public double[] solucion(int precision) {

        double[] x = initialize(new double[A.length]);
        for (int k = 0; k < precision; k++)
            for (int i = 0; i < A.length; i++) {
                double x0 = 0;
                for (int j = 0; j < A.length; j++)
                    if (i != j)
                        x0 += A[i][j]*x[j];
                x[i] = (b[i] - x0)/A[i][i];
            }
         
        return x;
    }
 
    private double[] initialize(double[] rc) {
        for (int i = 0; i < rc.length; i++)
            rc[i] = 0;
        return rc;
    }   
}
