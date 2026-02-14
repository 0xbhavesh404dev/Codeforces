import java.util.Scanner;

public class _32B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                System.out.print("0");
            }
            else if(str.charAt(i) == '-' && str.charAt(i + 1) == '.'){
                System.out.print("1");
                i++;
            }
            else if(str.charAt(i) == '-' && str.charAt(i + 1) == '-'){
                System.out.print("2");
                i++;
            }
        }
    }
}
