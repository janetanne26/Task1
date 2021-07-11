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
public class CheckElement {
     public static boolean CheckArray(int[] arr,int n,int ele){
         boolean test=false;
         for(int i=0;i<n;i++){
           if(arr[i]==ele){
               test=true;
               break;
           }  
             
     }
         return test;  
     }
       
}
