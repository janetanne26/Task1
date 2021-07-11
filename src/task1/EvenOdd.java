/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Admin
 */
public class EvenOdd {
    
    public static void numberOfEvenOdd(int arr[])
    {
        int i,even =0,odd=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of Even Integers : " + even);
        System.out.println("Number of Odd Integers : " + odd);
    }
}

