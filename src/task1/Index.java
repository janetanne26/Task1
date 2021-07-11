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
public class Index {

    /**
     * @param args the command line arguments
     */
        public static int Index(int arr[],int n,int element){
            int i=0;
            if(arr==null){
                return -1;
            }
            while(i<n){
                if(arr[i]==element){
                   return i;
                   }
                else
                i=i+1;
            }
            return -1;
        }
    
}  
        
 