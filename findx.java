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





// selection sort
import java.util.*;
public class Main{
    public static void sort(int[] arr){
        int len= arr.length;
        for(int i=0; i<len-1; i++) {
            for(int j=i+1; j<len; j++){
                if(arr[i]>arr[j])swap(arr,i,j);
            }
        }
    }
    public static void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr= {43,64,2,63,53,6};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}





// remove duplicacy
import java.util.*;
public class Main{
    
    public static int duplicacy(int[] a){
        if(a.length==1)return 1;
        int j=0;
        for(int i=1; i<a.length; i++){
            if(a[i]!=a[j]) {
                j++;
                a[j]=a[i];
            }
        }
        return j+1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr= {43,64,2,63,53,6,2};
        int len=duplicacy(arr);
        for(int i=0; i<len; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}




// binary serach using recursion

import java.util.*;
public class Main{
    public static int search(int[] a, int l, int r, int key){
        if(l>r) return -1;
        int mid= l+(r-l)/2;
        if(a[mid]==key)return mid;
        if(a[mid]<key)return search(a, mid+1, r, key);
        else return search(a, l, mid-1, key);
    }
   
  
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr= {43,64,2,63,53,6,2};
        int l=0;
        int r=arr.length-1;
        int key=64;
        Arrays.sort(arr);
        int ans= search(arr, l, r, key);
        if(ans==-1)System.out.println("not found");
        else System.out.println("found at index : "+ ans);
        sc.close();
    }
}




// Arrays and aarray list in java
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int l=sc.nexctInt();
        int[] arr= new int[l];
        for(int i=0; i<l; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<l; i++){
            System.out.println("Element" + arr[i]);
        }       
        sc.close();
    }
}




// SLiding window problem
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Map<Integer, Integer> map= new HashMap<>(); //create map
        map.put(1, 5635563); //insert values in map
        map.put(2, 5668444);
        System.out.print(map.get(1)); //print int values from map
        map.put(1, 875937); //updating value
        System.out.print(map);
        System.out.print(map.containsKey(1));
        map.remove(2);
        System.out.print(map.size());     
    }
}





// java code for sliding window variable length
// code for finding maximum length unique substring
import java.util.*;
public class Main{
    public static int func(String s){
        HashSet<Character> hs= new HashSet<>();
        int maxlen=0;
        int left=0;
        for(int i=0; i<s.length(); i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(i));
            maxlen=Math.max(maxlen, i-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args){
        String s="abcdbcdbb";
        int ans=func(s);
        System.out.println(ans);
        
    }
}










    
