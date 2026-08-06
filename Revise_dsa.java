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






// java code for fibonacci
import java.util.Scanner;
public class Main{
  public static int func(int n){
    if(n==0 || n==1){return n;}
    return func(n-1)+func(n-2);
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt(); 
    int ans= func(n);
    System.out.println(ans);
  }
}






//  java code for Stack
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt(); 
    Stack<Integer> st= new Stack<>();
    for(int i=0; i<n; i++){
        st.push(sc.nextInt());
    }
    // print complete stack
    System.out.println(st);
    // top element i.e at last index
    System.out.println(st.peek());
    // check if stack is empty
    System.out.println(st.isEmpty());
    // removing element at index
    st.remove(1);
    System.out.println(st);
    // check size of stack
    System.out.println(st.size());
    // updating any value at particular index
    st.set(0, 76);
    System.out.println(st);
    // displaying element at index
    System.out.println(st.get(1));
    // removing top element of stack
    System.out.println(st.pop());
    // remove element with same value
    st.remove(Integer.valueOf(30));
    // searching the element in stack
    System.out.println(st.search(30));
    // deleting all elements from stack
    st.clear();
    System.out.println(st);
    
    

  }
}










