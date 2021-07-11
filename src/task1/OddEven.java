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
public class OddEven {
    public static void OddEven(int arr[],int n){
        int[] b=new int[n];
    int j = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] % 2 == 0)
        {
            b[j] = arr[i];
            j++;
        }
    }
    for (int i = 0; i < n; i++)
    {
        if (arr[i] % 2 != 0)
        {
            b[j] = arr[i];
            j++;
        }
    }
    for (int i = 0; i < n; i++)
    {
        System.out.print(b[i] + " ");
    }
    System.out.println("");
    
    }
    
 }
