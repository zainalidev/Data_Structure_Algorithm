/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.util.Arrays;


public class Labtask3 {
    @SuppressWarnings("empty-statement")
    public static void main(String [] arg)
    {
     String [] str=new String[]{"Inayat","Sheraz","Ali","Jawad","Jabbar"};
     String [] str1={"Ali","Sheraz","Inayat","Ali","Jawad","Jabbar"};
     String [] str2=new String[15];
         Arrays.sort(str);
         for(String s:str)
         System.out.print(s);
         
         System.out.println();
         //checking equality
         boolean b=Arrays.equals(str, str1);
         System.out.println(b);
         
         //array copying
         str2=Arrays.copyOf(str, 10);
         for(String s:str2)
         System.out.print(s);
         
         //array copied range
         str2=Arrays.copyOfRange(str,0, 4);
         for(String s:str2)
         System.out.print(s);
         
         //Array filling
         Arrays.fill(str2, "hi");     
         System.out.println();
         for(String s:str2)
         System.out.print(s);
     
         // array filling in range
          Arrays.fill(str2,0,2, "hill");     
         System.out.println();
         for(String s:str2)
         System.out.print(s);
         
         
    }
}
