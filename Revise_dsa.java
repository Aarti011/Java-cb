// print 1 to n
import java.util.Scanner;
public class Main{
  public static void func(int n){
    if(n<1)return;
    func(n-1);
    System.out.println(n);
    
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    func(n);
  }
}





// java code for n to 1 counting
import java.util.Scanner;
public class Main{
  public static void func(int n){
    if(n<1)return;
    System.out.println(n);
    func(n-1);
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    func(n);
  }
}







// java code for factorial
import java.util.Scanner;
public class Main{
  public static int func(int n){
    if(n==0 || n==1 || n==2)return n;
    return func(n-1)*n;    
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int ans= func(n);
    System.out.println(ans);
  }
}





// java code for sum of first n numbers
import java.util.Scanner;
public class Main{
  public static int func(int n){
    if(n==0 || n==1)return n;
    return func(n-1)+n;    
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int ans= func(n);
    System.out.println(ans);
  }
}






//  java code for fibonacci numbers
import java.util.Scanner;
public class Main{
  public static void func(int n,  char s, char a, char d){
    if(n==1){
    System.out.println(s+" source to destination "+d);
    return;
    }
    // moving rest disk to auxiliary position
    func(n-1, s,d,a);
    
    // moving largest disk
    System.out.println(s+" -> "+d);
    
    // moving n-1 to helper
    func(n-1,a,s,d);
    return ; 
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    func(n, 'S', 'A', 'D');
  }
}
