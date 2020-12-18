/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;


public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        int opcion;
        boolean op = true;

            while(op){
            System.out.println("****************");
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir"); 
            System.out.println("******Elija su opcion********");
            opcion = entrada.nextInt();
            System.out.println("Su opción fue : "+opcion);
           
            
           
            if(opcion==5){
            System.out.println("Finalizo");
            break;
            }else{
                switch(opcion){
                
                    case 1:
                            System.out.println("Usted Elijió Sumar");
                            System.out.println("Ingresa el primer Valor");
                            n1=entrada.nextInt();
                            System.out.println("Ingresa el segundo Valor");
                            n2=entrada.nextInt();
                                
                            System.out.println("SU RESULTADO ES : ");
                            Suma sum = new Suma(n1,n2);
                            sum.mostrarResultado();

                             break;
                 
                case 2:
                            System.out.println("Usted Elijió Restar");
                            System.out.println("Ingresa el primer Valor");
                            n1=entrada.nextInt();
                            System.out.println("Ingresa el segundo Valor");
                            n2=entrada.nextInt();

                            System.out.println("SU RESULTADO ES : ");
                            Resta res = new Resta(n1,n2);
                            res.mostrarResultado();
                            
                             break;
                
                
                case 3:
                        System.out.println("Usted Elijió  Multiplicar");
                        System.out.println("Ingresa el primer Valor");
                        n1=entrada.nextInt();
                        System.out.println("Ingresa el segundo Valor");
                        n2=entrada.nextInt();

                         System.out.println("SU RESULTADO ES : ");
                        Multiplicacion mul = new Multiplicacion(n1,n2);
                        mul.mostrarResultado();

                          break;
                
                case 4:
                        System.out.println(" Usted Elijió Dividir");
                        System.out.println("Ingresa el primer Valor");
                        n1=entrada.nextInt();
                        System.out.println("Ingresa el segundo Valor");
                        n2=entrada.nextInt();

                        System.out.println("SU RESULTADO ES : ");
                        Division div = new Division(n1,n2);
                        div.mostrarResultado();
                
                         break;
                         
                default: System.out.println("*****Opción no Valida*****");
                }
            
            
            }
        
        
        }
      
       
    }
}
