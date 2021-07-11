/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Admin
 */

public class Duplicate {
    public static void removeDuplicates(int nums[], int numsSize){
     int i,j,k,s;
    for(i=0;i<numsSize;i++){
        for(j=i+1;j<numsSize;j++){
            if(nums[i]==nums[j])
            {
                for(k=j;k<numsSize-1;k++){
                nums[k]=nums[k+1];
                }
            
           numsSize--;
            j--;
            }
        }
        
    }
    
        System.out.println("the result array is");
        for(int b=0;b<numsSize;b++){
            System.out.println(nums[b]); 
        }


}
}

