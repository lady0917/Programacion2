package programacion2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author general
 */
public class programacion {
   public static int mayor_entre_tres(int num1, int num2, int num3)
   {
       int mayor = 0;
       
       if(num1 > num2)
       {
           if(num1 > 3)           {// num1 > num 2 y num1 >3
               mayor = num1;
           }
           else           {//num1 > num2  num3 > num1
               
             mayor = num3;
           }           
       }
       
       else   
       {
           //num2> num1
           
           if( num2 >num3)
           {
               //num2>num1 y num2>num3
               mayor =num2;
               
               
           }
           else
           {
               mayor =num3;
               
           }
       }
       return mayor;
       }
   
   public static double promedio(int n1, int n2, int n3, int n4, int n5)
           
   {
       double promedio;
       
       promedio = (n1 + n2 + n3 + n4 + n5) /5.0;
       
       return promedio;
   }
   
   public static void main(String [] args)
   {
        System.out.println(mayor_entre_tres (15, 12, 9));
        System.out.println(mayor_entre_tres (16, 21, 6));
        System.out.println(mayor_entre_tres (8, 6, 4));
        System.out.println(mayor_entre_tres (11, 2, 1));
        
        System.out.println(promedio (15,12,9,3,4));
         
   }
           
          
}
