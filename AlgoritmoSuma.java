/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosuma;

/**
 *
 * @author Ernesto
 */

public class AlgoritmoSuma {

    
    public static void main(String[] args) {
//acumulador para almacenar suma
        int y=0;
        //ciclo for para la suma de los numeros
        for(int x=2; x<=1800; x++)
        {
            //suma
       y=y+x;
       //valor de los numeros
       System.out.println("numero : "+x);
        }
        //suma total desde 2 hasta 1800
         System.out.println("Total suma " + y);
    }//fin main
    
}//fin clase
