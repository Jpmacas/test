package pruebas;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Johnn
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     1.      1 Se necesita escribir un programa Java que imprima en pantalla los números del 1 al 100,
 sustituyendo los  múltiplo de 3 por la palabra “SOMOS” y los múltiplo de 5 por “BA”. 
Para los números múltiplos de 3  y 5 a la vez sustituir con la combinación de “SOMOS BA”
     */
    
    public static void main(String[] args) {
      
        int c=0;
        String b1="somos";
            String b2="BDA";
        // TODO code application logic here
        for (int i = 3; i < 100;i=i+3) {
            //i=i+2;
            c++;
            if (c==1) {
                System.out.println(b1);
                
            }else if(c==5)
            {
                System.out.println(b2);
                
                c=0;
            }
            
            else
            {System.out.println("-"+i);}
            
        }
       ////////////////////////////////////////////////////////////// 
   /*2.       Escriba un método que decida si dos String son anagramas o no.
Ejemplo: ACUERDO – ECUADOR.
        
        */ 
   
   String p1="ACUERDO";
   String p2="ECUADOR";
        if (p1.equals(b2)) {
            System.out.println(" Es anagrama ");
                   
        }else{
            System.out.println(" no lo es");
        }
   
   /*
   ///////////////////////////////////////////////////////////////////////
   3.       Escriba un método que ordene de mayor a menor el siguiente arreglo utilizando un método de su elección:
int arreglo[]=[50,5,10,36,25,85,23,65];
   */
   //int arreglo[]=[50,5,10,36,25,85,23,65];
   
         int[] numeros = {50,5,10,36,25,85,23,65};
                int[] vec = {50,5,10,36,25,85,23,65};
    Arrays.sort(numeros);
    //for (int numero:numeros)
  System.out.println(Arrays.toString(numeros));
    
        //System.out.println("-"+numeros);
        ///////////////////
        
        burbuja(vec);
    
      
    }
    
 

static void burbuja(int arreglo[])
        
{
  
  
    for(int i = 0; i < arreglo.length - 1; i++)
    {
        for(int j = 0; j < arreglo.length - 1; j++)
        {
            if (arreglo[j] < arreglo[j + 1])
            {
                int tmp = arreglo[j+1];
                arreglo[j+1] = arreglo[j];
                arreglo[j] = tmp;
            }
        }
    }
    for(int i = 0;i < arreglo.length; i++)
    {
        System.out.print("-"+arreglo[i]);//+"\n"
    }
}
   
  
}
