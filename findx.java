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









