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
public class Insert {
    public static int[] InsertEle(int arr[],int n,int pos,int ele){
        int newarr[]=new int[n+1];
        int i;
         for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = ele;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }
    
}
