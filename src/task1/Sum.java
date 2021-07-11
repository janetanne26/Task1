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
public class Sum {
    public static int Sum(int arr[],int n){
          int i=0,sum=0;
           if(n<1){
           return 0;
            }
         while(i<n){
             sum=sum+arr[i];
             i++;
         }
         return sum;
    }
}   
   

