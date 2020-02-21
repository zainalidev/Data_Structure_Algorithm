
package javaapplication1;

/**
 *
 * @author 18SW39
 */
public class ClassTask2 {
    
    public static void binarySearch(int arr[], int target){  
        int p=0,q=arr.length-1;
        int mid = (p + q)/2;  
        while( p <= q ){  
        if ( arr[mid] < target ){  
        p = mid + 1;     
        }else if ( arr[mid] == target ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
        }else{  
         q = mid - 1;  
      }  
      mid = (p + q)/2;  
   }  
   if ( p > q ){  
      System.out.println("Element is not found!");  
   }  
 }  
    public static void main(String args[])
    {
     int[] array={1,2,3,5,7,8,10,22,34,66,77,88};
     int target=77
        binarySearch(array,target);
    }
}
