import java.util.Scanner;

public class _1389A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int first=-1;
            int second=-1;
            for(int i=l;i<=r;i++){
                if(first==-1){
                    if(l%i==0 && l%i==0){
                        first=i;
                    }
                }
                else if(second==-1){
                    if(l%i==0 && l%i==0){
                        second=i;
                    }
                }
                if(first!=-1 && second!=-1){
                    break;
                }
            }
            System.out.println(first+" "+second);
        }
    }
}
