/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;


/**
 *
 * @author Inayat Ali
 */
public class Labtask4 {
  

    public static float average1( float [] i)
    {
        float c=0.0f;
        for(int j=0;j<i.length;j++)
        { c +=i[j];
            
        }
        c=c/i.length;
        return c;
        
    }
    @SuppressWarnings("empty-statement")
    public static void main(String [] arg)
{
    
    float []f1=new float[]{1.1f,3.3f,1.3f};
    float ar=average1(f1);
System.out.println(ar);
            }
}
