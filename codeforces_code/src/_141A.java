import java.util.Scanner;

public class _141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String ss=sc.next();
        String sss=sc.next();
        int[] fre=new int[126];
        int[] fre2=new int[126];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)]++;
        }
        for(int i=0;i<ss.length();i++){
            fre[ss.charAt(i)]++;
        }
        for(int i=0;i<sss.length();i++){
            fre2[sss.charAt(i)]++;
        }
        int count=0;
        for(int i=0;i<fre2.length;i++){
            if(fre2[i]!=fre[i]){
                count++;
            }
        }
        if(count>0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
