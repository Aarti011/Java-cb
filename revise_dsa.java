//just printing
import java.util.Scanner;

public class Welcome{
  public static void main(String args[]){
    SCanner num=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n=num.nextINt();
    System.out.print("Done");
  }
}

//basic pattern
import java.util.Scanner;

public class Welcome{
  public static void main(String args[]){
    Scanner num=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n=num.nextInt();
    
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.print("*\t");
        }
        System.out.println("");
    }
    
  }
}

//pattern
import java.util.Scanner;

public class Welcome{
  public static void main(String args[]){
    Scanner num=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n=num.nextInt();
    
    for(int i=0; i<n; i++){
        
        for(int j=0; j<n; j++){
            if(i==0 || i==n-1){System.out.print("*\t");}
        
            else{
                if(j==0 || j==n-1){System.out.print("*\t");}
                else{System.out.print("\t");}
            }
        }
        System.out.println("");
    }
    num.close();
    
  }
}
