import java.util.Scanner;

public class _431A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                sum+=a;
            }
            else if(s.charAt(i)=='2'){
                sum+=b;
            }
            else if(s.charAt(i)=='3'){
                sum+=c;
            }
            else if(s.charAt(i)=='4'){
                sum+=d;
            }
        }
        System.out.println(sum);
    }
}
