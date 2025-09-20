// import java.util.*;
// class sliding_window {
//     public static void main (String[] args) {
//         int[] a={2,3,4,78,4,-1,5,8};
//         int k=3;
//         int sum=a[0]+a[1]+a[2];
//         int max=sum;
//         int i=0; int j=i+k;
//         while(j<a.length){
//             sum+=a[j]-a[i];
//             max=Math.max(sum, max);
//             i++;j++;
//         }
//         System.out.println(max);
//     }
// }








import java.util.*;
class sliding_window {
    public static void main (String[] args) {

        int[] a={2,3,4,78,4,-1,5,8};
        int k=3;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int i=0; int j=0;

        while(j<a.length){
            sum+=a[j];
            if(j-i+1==k){
                max=Math.max(sum, max);
                sum=sum-a[i];
                i++;
            }            
            j++;            
        }
        System.out.println(max);
    }
}
