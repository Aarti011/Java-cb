import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        k = k % n;

        int[] rotated = new int[n];
        for (int i = 0; i < k; i++) {
            rotated[i] = arr[n - k + i];
        }
        for (int i = k; i < n; i++) {
            rotated[i] = arr[i - k];
        }
        for (int num : rotated) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}


