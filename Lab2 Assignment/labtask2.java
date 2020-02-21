package lab2;

import java.util.Arrays;
public class labtask2{
	public static void main(String arg[]){
            int [] arr1=new int[10];
            int[] arr2=new int[10];
            for(int i=0;i<10;i++)
                arr1[i]=i;
            for(int i=0;i<10;i++)
                arr2[i]= i;
            
        
            boolean b=Arrays.equals(arr1, arr2);
            System.out.println(b);
	}
}