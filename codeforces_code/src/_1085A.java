import java.util.Scanner;

public class _1085A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int first = -1, last = -1;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '1'){
                    if(first == -1) first = i;
                    last = i;
                }
            }

            if(first == -1){
                System.out.println("0 0");
                continue;
            }

            int L = last - first + 1;
            int max = L;
            int min = (L + 1) / 2;

            System.out.println(min + " " + max);
            int tg=sc.nextInt();
        }

        sc.close();
    }
}