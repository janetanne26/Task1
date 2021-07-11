/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class CommonString {
     public static void CheckCommonString(String[] arr1,
                                         String[] arr2)
    {
   	for (int i = 0; i < arr1.length; i++)
	{
	for (int j = 0; j < arr2.length; j++)
	{
            if(arr1[i].equals(arr2[j]))
		{
                  System.out.println("Common elements");
	          System.out.println(arr1[i]);
                 break;
		}
	}
	}
		
    }
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int size1= s.nextInt();
        String Array1[]=new String[size1];
        for(int i=0;i<Array1.length;i++){
           Array1[i]=s1.nextLine();
        }
        System.out.println("enter the size of second array");
        int size2=s.nextInt();
        String Array2[]=new String[size2];
        for(int i=0;i<size2;i++){
            Array2[i]=s1.nextLine();
        }
        
         CheckCommonString(Array1,Array2);
       
        
    }
    
}
