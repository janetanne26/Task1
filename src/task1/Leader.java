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
public class Leader {
    public static void Leaders(int arr[],int n){
        int j;
         System.out.println("the leaders are");
        for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==n){
                    System.out.println(arr[i]+" ");
                }
        
    }
    
    }
    
}