/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Scanner;
import static task1.CheckElement.CheckArray;
import static task1.CommonInteger.CheckCommonInteger;
import static task1.CommonString.CheckCommonString;
import static task1.Index.Index;
import static task1.Insert.InsertEle;
import static task1.Leader.Leaders;
import static task1.OddEven.OddEven;
import static task1.Remove.RemovingElement;
import static task1.Sum.Sum;
import static task1.TwoSum.TwoSumArray;
/**
 *
 * @author Admin
 */
public class Task1Runner {
    
     
     public static void Input(int Array[],int size){
        Scanner s=new Scanner(System.in);
         System.out.println("enter the array elements");
        for(int i=0;i<size;i++){
        Array[i]=s.nextInt();
        }
     }
    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
       Scanner s1=new Scanner(System.in);  
       System.out.println("enter the array size");
      int size =s.nextInt(); 
       int Array[]=new int[size]; 
       
       while(true){
        System.out.println("enter the program choice between 1 to 16");
        int choice=s.nextInt();
        if(choice>=17){
            System.out.println("no program");
            break;
        }
        else{
        switch(choice){
     case 1:
                Task1Runner.Input(Array,size);
                System.out.println("enter the element");
                 int t =s.nextInt();
           
               System.out.println("the index of element is "+Index.Index(Array,size,t));
                 break;
      case 2:
                  Task1Runner.Input(Array,size);
                  System.out.println("Sum is "+Sum.Sum(Array,size)); 
                  break;
       case 3:
                    Task1Runner.Input(Array,size);
                    System.out.println("enter the element to be removed");
                int r=s.nextInt(); 
                 Remove.RemovingElement(Array, r);
                 break;
        case 4:
                 Task1Runner.Input(Array,size);
                 System.out.println("enter the position of element to be inserted");
                int pos= s.nextInt();
                System.out.println("enter the element to be inserted");
               int m=s.nextInt(); 
                    int b[]= Insert.InsertEle(Array,size,pos,m);
               System.out.println("updated array");
               for(int i=0;i<size+1;i++){
                   System.out.println(b[i]);
                       }
                  break;
        
        case 5:
                    Task1Runner.Input(Array,size);
                    System.out.println("enter the element to be checjked");
                int p=s.nextInt();
                boolean b1=CheckElement.CheckArray(Array,size,p);
                if(b1)
                    System.out.println(p +" is found");
                else
                    System.out.println(p +" is not found");
                    break;
        case 6:
                    Task1Runner.Input(Array,size);
                    MaxMin.findMaxMin(Array);
                    break;
        case 7:
                    System.out.println("enter the size of first array");
                int size1= s.nextInt();
                System.out.println("Enter the elements of first string array");
                String Array1[]=new String[size1];
                for(int i=0;i<Array1.length;i++){
                   Array1[i]=s1.nextLine();
                }
                System.out.println("enter the size of second array");
                int size2=s.nextInt();
                String Array2[]=new String[size2];
                System.out.println("Enter the elements of second string array");
                for(int i=0;i<size2;i++){
                    Array2[i]=s1.nextLine();
                }
                  CommonString.CheckCommonString(Array1,Array2); 
                    break;
        case 8:
                Task1Runner.Input(Array,size);
                System.out.println("enter the second array size");
                int length2=s.nextInt();
                int NextArray[]=new int[length2];
                 for(int i=0;i<length2;i++){
                NextArray[i]=s.nextInt();
                  }
                System.out.println("the common elements are");
                CommonInteger.CheckCommonInteger(Array,NextArray);
                 break;
        case 9:
            Task1Runner.Input(Array,size);
            Duplicate.removeDuplicates(Array,size);
            break;
        case 10:
            Task1Runner.Input(Array,size);
            EvenOdd.numberOfEvenOdd(Array);
            break;
        case 11:
            Task1Runner.Input(Array,size);
            AverageValue.findAverage(Array);
            break;
        case 12:
            Task1Runner.Input(Array,size);
            System.out.println("enter the sum value");
           int sum=s.nextInt();
            TwoSum.TwoSumArray(Array,size,sum);
            break;
        case 13:
            Task1Runner.Input(Array,size);
            Reverse.reverseArray(Array);
            break;
        case 14:
            Task1Runner.Input(Array,size);
            OddEven.OddEven(Array,size);
            break;
        case 15:
            Task1Runner.Input(Array,size);
            Sorting.Sort(Array,size);
            break;
        case 16:
            Task1Runner.Input(Array,size);
            Leader.Leaders(Array,size);
             break;       
        default:
            System.out.println("No program");
             break;
        }
        
       }
       }
        
    }    
    }
    
