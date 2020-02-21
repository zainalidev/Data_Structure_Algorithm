
package javaapplication1;

/**
 *
 * @author 18SW39
 */
public class ClassTask {
    
    public static int linearSearch(int[] array, int target){    
        for(int i=0;i<array.length;i++){    
            if(array[i] == target){    
                return i;    
            }    
        }    
        return -1;    
    }
  public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int target = 50;    
        System.out.println("Element "+target +" is found at index: "+linearSearch(a1, target));    
    }        
    
}
