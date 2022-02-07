/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuatro.variables.enteras;

import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class CuatroVariablesEnteras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A,B,C,D ,f,j;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para A : "));
            System.out.println("El valor de A es : "+A);
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para B  : "));
            System.out.println("El valor de B es : "+B);
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para C : "));
            System.out.println("El valor de C es : "+C);
        D = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para D  : "));
            System.out.println("El valor de D es : "+D+"\n");
            
            System.out.println("PROCESO \n");
            
            f=A;
            j=B;
            A=D;
            B=C;
            C=f;
            D=j;
            
             System.out.println("A toma el valor de D -> A = "+A);
             System.out.println("B toma el valor de C -> B = "+B);
             System.out.println("C toma el valor de A -> C = "+C);
             System.out.println("D toma el valor de B -> D = "+D);
            
            
        
    }
    
}
