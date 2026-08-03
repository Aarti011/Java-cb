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







