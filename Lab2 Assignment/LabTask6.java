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
public class LabTask6{
    public static void main(String [] arg){
    
        int[][] arr={{3,2,1},{7,8,9},{4,3,5}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int x=0;x<3;x++)
                    for(int k=0;k<3;k++)
                    {
                        if(arr[i][j]<arr[x][k])
                        {
                            int temp=arr[i][j];
                            arr[i][j]=arr[x][k];
                            arr[x][k]=temp;
                        
                        }
                    
                    }
           }
        }

        for(int s=0;s<3;s++)
        {  for(int q=0;q<3;q++)
            System.out.print(arr[s][q]+" ");
        
        System.out.println();
        }
    }
    
    
}
