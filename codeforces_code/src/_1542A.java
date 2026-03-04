import java.util.Scanner;

public class _1542A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[2 * n];
            int max = 0;
            int odd = 0;
            int even = 0;
            for (int i = 0; i < 2 * n; i++) {
                arr[i] = sc.nextInt();
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (arr[i] % 2 == 0) {
                    even++;
                }
                if (arr[i] % 2 == 1) {
                    odd++;
                }
            }
            int[] has = new int[max + 1];
            for (int i = 0; i < 2 * n; i++) {
                has[arr[i]]++;
            }
            boolean flag = true;
            for (int i = 0; i < max + 1; i++) {
                if (has[i] > 2) {
                    flag = false;
                    break;
                }
            }
//            if (2*n == 2) {
//                if(odd>0){
//                    System.out.println("YES");
//                }
//                else{
//                    System.out.println("NO");
//                }
//            } else {
//
//
//                if ((flag) && (odd > 1) && (odd % 2 == 0)) {
//                    System.out.println("YES");
//                }
//                else if(odd==even && odd>1){
//                    System.out.println("YES");
//                }else {
//                    System.out.println("NO");
//                }

            if (odd == even) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

}

