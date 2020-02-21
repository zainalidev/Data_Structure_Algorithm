/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Zain Ali
 */
public class LabTask7 {
        
   public static void main(String[] args) {
        int arr[] = {20, 20, 30, 40, 50, 50, 50};  
		
System.out.print("Array elements are: ");
       for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
		System.out.println("\nThe new length of the array is: "+arrayDupSort(arr));
			
    }
    
    public static int arrayDupSort(int[] arr) {
         int val = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[val-1])
                arr[val++] = arr[i];
        }
	  return val;
}}
