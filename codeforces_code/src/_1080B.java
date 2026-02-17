import java.util.*;

public class _1080B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                b[i] = a[i];
            }

            Arrays.sort(b, 1, n + 1);

            boolean ok = true;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) continue; // start only from odd

                int len = 0;
                for (int j = i; j <= n; j *= 2) len++;

                int[] cur = new int[len];
                int[] need = new int[len];

                int idx = 0;
                for (int j = i; j <= n; j *= 2) {
                    cur[idx] = a[j];
                    need[idx] = b[j];
                    idx++;
                }

                Arrays.sort(cur);
                Arrays.sort(need);

                for (int k = 0; k < len; k++) {
                    if (cur[k] != need[k]) {
                        ok = false;
                        break;
                    }
                }

                if (!ok) break;
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
