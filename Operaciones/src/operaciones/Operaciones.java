
package operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int X,Y;
        double M,N;
        int suma1;
        double suma2,suma3,sumat, diferencia1 ,diferencia2,producto1,producto2,productot,cociente1,cociente2,cociente3,resto1,resto2,resto3,C=2,doble;
        
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para X : "));
            System.out.println("El valor de X es : "+X);
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para Y  : "));
            System.out.println("El valor de Y es : "+Y);
        M = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para M : "));
            System.out.println("El valor de M es : "+M);
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para N  : "));
            System.out.println("El valor de N es : "+N+"\n");
            
            //Sumas 
            System.out.println("SUMAS \n");
            
            suma1=X+Y;
            System.out.println("La suma de X+Y es :"+suma1+ " \n");
            
            suma2=N+M;
             System.out.println("La suma de M+N es :"+suma2+ " \n");
             
             suma3=X+N;
              System.out.println("La suma de X+N es :"+suma3+ " \n");
              
              sumat=suma1+suma2+suma3;
              System.out.println("La suma de todas las variables es :"+sumat+ " \n");
            
              //Restas 
               System.out.println("DIFERENCIAS \n");
               
            diferencia1=X-Y;
            System.out.println("La diferencia de X-Y es :"+diferencia1+ " \n");
            
            diferencia2=N-M;
             System.out.println("La diferencia de N-M es :"+diferencia2+ " \n");
             
             //Multiplicaciones
             System.out.println("PRODUCTOS \n");
             
            producto1=X*Y;
            System.out.println("El producto de X*Y es :"+producto1+ " \n");
            
            producto2=N*M;
            System.out.println("El producto de N*M es :"+producto2+ " \n");
            
            productot=producto1*producto2;
            System.out.println("El producto de todas las variabloes es :"+productot+ " \n");
            
            //Divisiones 
            System.out.println("COCIENTES  \n");
            
            cociente1=X/Y;
            System.out.println("El cociente de X/Y es :"+cociente1+ " \n");
            
            cociente2=N/M;
            System.out.println("El cociente de N/M es :"+cociente2+ " \n");
            
            cociente3=Y/M;
            System.out.println("El cociente de Y/M es :"+cociente3+ " \n");
            
            //Restos 
            System.out.println("RESTOS  \n");
            
            resto1=X%Y;
             System.out.println("El resto de X%Y es :"+resto1+ " \n");
            
            resto2=N%M;
            System.out.println("El resto de N%M es :"+resto2+ " \n");
             
            resto3=Y%M;
             System.out.println("El resto de Y%M es :"+resto3+ " \n");
             
             //Doble de las variables 
             System.out.println("EL DOBLE DE LAS VARIABLES   \n");
             
             doble=X*C;
             System.out.println("El doble de X es  :"+doble+ " \n");
             doble=Y*C;
             System.out.println("El doble de Y es  :"+doble+ " \n");
             doble=M*C;
             System.out.println("El doble de M es  :"+doble+ " \n");
             doble=N*C;
             System.out.println("El doble de N es  :"+doble+ " \n");
    }
    
}
