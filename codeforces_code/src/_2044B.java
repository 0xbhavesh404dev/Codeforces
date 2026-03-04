import java.util.Scanner;

public class _2044B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s=sc.next();
             s = new StringBuilder(s).reverse().toString();
            String s1="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='q'){
                    s1+='p';
                }
                else if(s.charAt(i)=='p'){
                    s1+='q';
                }
                else{
                    s1+='w';
                }
            }
            System.out.println(s1);



        }
    }
}
