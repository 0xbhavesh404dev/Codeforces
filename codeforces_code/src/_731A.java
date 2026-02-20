import java.util.Scanner;

public class _731A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        char pointer = 'a';
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            int diff = Math.abs(target - pointer);
            count += Math.min(diff, 26 - diff);
            pointer = target;
        }

        System.out.println(count);
    }
}