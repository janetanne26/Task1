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
public class TwoSum {
    public static void TwoSumArray(int arr[],int n,int s){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==s){
                    System.out.println("pair found: "+"("+ arr[i] +","+ arr[j]+")");
                    break;
                }
                
            }
        }
         
        
    }
}