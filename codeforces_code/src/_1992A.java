import java.util.Scanner;

public class _1992A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = 0;

            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 5; j++) {
                    for (int k = 0; k <= 5; k++) {
                        if (i + j + k <= 5) {
                            int val = (a + i) * (b + j) * (c + k);
                            max = Math.max(max, val);
                        }
                    }
                }
            }

            System.out.println(max);
        }
    }
}
