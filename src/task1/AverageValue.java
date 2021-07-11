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
public class AverageValue {
    public static void findAverage(int arr[])
    {
        int i,sum=0,avg;
        Arrays.sort(arr);
        for(i=1;i<arr.length-1;i++)
        {
            sum += arr[i];
            System.out.println(sum);
        }
        avg = sum / (arr.length-2);
        System.out.println("Average value of an Array : " + avg);
        
    }
}
