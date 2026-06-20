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


// mixed pattern alphabet and numbers
class Main {
    public static void main(String[] args) {
        int n=9;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                for(int j=1; j<=i; j++){System.out.print(j + " ");}
            }
            else{
                for(char k='A'; k<'A'+; k++ ){System.out.print(k+ " ");}
            }
        System.out.println("");
        }    
    }
}

// Array  sum of each 
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len=sc.nextInt();
        int[] arr=new int[len]; 
        System.out.println("Now enter the values :");
        for (int i=0; i<len; i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        System.out.println("Only showing the values that are negative :");
        for(int i=0; i<len; i++){
            sum+=arr[i];
            System.out.println(sum);
        }
//max in array
      import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len=sc.nextInt();
        int[] arr=new int[len]; 
        System.out.println("Now enter the values :");
        for (int i=0; i<len; i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        System.out.println("Only showing the values that are negative :");
        for(int i=1; i<len; i++){
            if(arr[i]>max)max=arr[i];
        }
        System.out.println(max);

    }
}













      class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> result=new ArrayList<>();
    	int n=a.length;
    	if(n<3)return result;
    	Arrays.sort(a);
    	for(int i=0; i<n-2; i++) {
    		if(i>0 && a[i]==a[i-1])continue;
    		int s=i+1; int e=n-1;
    		while(s<e){
    			int sum=a[i]+a[s]+a[e];
    			if(sum==0) {
    				result.add(Arrays.asList(a[i],a[s],a[e]));
    				s++;
    				e--;
    				while(s<e && a[s]==a[s-1]) {s++;}
    				while(s<e && a[e]==a[e+1]) {e--;}
    				
    			}
    			else if(sum<0) {
    				s++;
    			}
    			else {
    				e--;
    			}
    			
    		}
    	}
    	return result;
    }
}









      
