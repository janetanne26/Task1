/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class Reverse {
    public static void reverseArray(int arr[])
    {
        int i,j,temp;
        for(i=0,j=arr.length-1; i<j; i++,j--)
        {
         temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
            
        }
        System.out.println("Reversed Array :" + Arrays.toString(arr));
    }
}
