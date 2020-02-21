/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.util.Arrays;

/**
 *
 * @author Zain Ali
 */
public class LabTask5 {
    public static int secondLargest(int [] i)
    {
        Arrays.sort(i);
        for(int j=1;j<i.length;j++){
            if(i[i.length-j]!=i[i.length-j-1])
                return i.length-j;
        }
        return -1;
    }
    public static void main(String []arg)
    {
    int []i={1,2,9,9,10,10,9,7,8,8,8};
    int s=secondLargest(i);
    System.out.println(s);
    }
}
