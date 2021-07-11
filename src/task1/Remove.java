/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Remove {
    
   
    public static void RemovingElement(int arr[], int key)
    {
        int i ,j , n = arr.length;
        
        for(i=0;i<n;i++)
        {
            if(arr[i] == key)
            {
                for(j=i;j<n-1;j++)
                {
                    arr[j] = arr[j+1];
                }
                n--;
                i--;
            }
        }
        System.out.println("After removing the specified element : ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

   