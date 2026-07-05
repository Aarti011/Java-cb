public class Main{
    static void func1(){
          System.out.println("hello1");
          func2();
    }
    static void func2(){
          System.out.println("hello2");
          func3();
    }
    static void func3(){
          System.out.println("hello3");
    }  
  
    public static void main(String args[]){
      System.out.println("Started");
      func1();
      System.out.println("Over");  
  }
}



// Recursion code in java

import java.util.Scanner;
public class Main{
    public static void func(int num){
        func(num-1);
        System.out.println(num);      
    }
    public static void main(){
        Scanner cs= new Scanner(System.in);
        int n=nextInt();
        System.out.println("Started");
        func(n);
        System.out.println("Done");
    }
}










// fibonacci using recursion

public class Main{
    public static int func(int n){
        if(n<2)return n;
        return func(n-1)+func(n-2);

    }
    public static void main(String args[]){
        int n=4;
        System.out.println(func(n));
    }
}




// binary search without recursion
import java.util.*;
public class Main{
    public static int func(int[] a, int t){
        int u=a.length-1;
        int l=0;
        while(l<=u){
            int mid=l+ (u-l)/2;
            if(a[mid]==t) return mid;
            else if(a[mid]<t)l=mid+1;
            else{ u=mid-1;}
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int target=sc.nextInt();
        int[] arr= {12,6,7,34,58};
        Arrays.sort(arr);
        int value=func(arr, target);
        if(value!=-1){System.out.println("Target found at index:"+ value);}
        else{System.out.print("Target not found in given array");}
        System.out.print("Done");
        sc.close();
    }
}








