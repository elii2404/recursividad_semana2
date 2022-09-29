/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura._de_datos.Trabajo_en_clase;

/**
 *
 * @author Usuario
 */
public class Recursividad {
    static int arr []={12,34,64,2,3};
    
    
    public static int factorial(int n){
    
    if(n==0){
        return 1;
    }
    else{
        //System.out.println(n);
        return n*factorial(n-1);
    }
    }
    
    //encontrarMax(arr,0,0)
    public static int encontrarMax(int[]numeros, int indice, int max){
        if (indice != numeros.length){
            
            if (numeros[indice]>max){
                max=encontrarMax(numeros, indice + 1, numeros[indice]);
                System.out.println("\n");
                System.out.print(max);
                System.out.println(" ");
                System.out.print(numeros[indice]);
            } else{
                max = encontrarMax(numeros, indice + 1, max);
                System.out.println("\n");
                System.out.print(max);
                System.out.println(" ");
                System.out.print(numeros[indice]);
            }
            
        }
        System.out.println("\n");
        return max;
    }
}
        
        
    
//}
