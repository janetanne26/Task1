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
public class Sorting {
    public static void Sort(int arr[],int n){
        System.out.println("Ascending order");
        Arrays.sort(arr);
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
        System.out.println("Descending order");
        for (int i = 0; i < n; i++)   
          {  
         for (int j = i + 1; j < n; j++)   
           {  
          int tmp = 0;  
       if (arr[i] < arr[j])   
         {  
           tmp = arr[i];  
           arr[i] = arr[j];  
           arr[j] = tmp;  
           }  
         }  
              System.out.println(arr[i]);
         
          }  
        
        
        
        
    }
}
