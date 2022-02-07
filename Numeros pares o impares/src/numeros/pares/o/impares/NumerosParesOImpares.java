/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros.pares.o.impares;

import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class NumerosParesOImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero : "));
        
        while(numero != 0) {
             if(numero %2 == 0) {
                 System.out.print("El numero "+numero+" es PAR");
                 
                  }
             else{
                 System.out.print("El numero "+numero+" es IMPAR");
                 
             }
            
             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero : ")); 
        }
    }
    
}
