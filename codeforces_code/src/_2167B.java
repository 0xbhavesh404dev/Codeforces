import java.util.Scanner;

public class _2167B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String name=sc.next();
            int[] hash=new int[123];
            for(int i=0;i<n;i++){
                hash[s.charAt(i)-'a']++;
            }
            for(int i=0;i<n;i++){
                hash[name.charAt(i)-'a']--;
            }
            boolean flag=true;
            for(int i=0;i<123;i++){
                if(hash[i]!=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
