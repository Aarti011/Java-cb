// import java.util.*;
// import java.util.Arrays;
// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String str="coding";
//         for(int i=0; i<n; i++){
//             if(i==n-1){
//                 a[i]=a[0];
//             }
//             a[i]=a[i+1];
//         }
//         System.out.print(str);

//        sc.close();
//     }     
// }








import java.util.Scanner;
class Main {
    public static void maxString(String s) {
        int count = 1;
        int max=0;
        char c='0';
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
            	if(count>max)	c=s.charAt(i - 1);
                count = 1;
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        maxString(s);
        scanner.close();
    }
}









