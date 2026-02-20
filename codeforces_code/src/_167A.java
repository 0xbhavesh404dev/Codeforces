import java.util.Scanner;

public class _167A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            String ss="";
            ss+=s.charAt(0);
            for(int i=1;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    ss+=s.charAt(i);
                    i++;
                }
                else{
                    ss+=s.charAt(i);
                }
            }
            ss+=s.charAt(s.length()-1);
            System.out.println(ss);
        }
    }
}
