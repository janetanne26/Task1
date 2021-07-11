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
    
 public class MaxMin {
    public static void findMaxMin(int arr[])
    {
        Arrays.sort(arr);
        System.out.println("Minimum value of an array : " + arr[0]);
        System.out.println("Maximum value of an array : " + arr[arr.length - 1]);
        
    }
}

