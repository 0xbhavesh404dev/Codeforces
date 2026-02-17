import java.util.Scanner;

public class _1080A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean flag1=false;
            boolean flag2=false;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]==67){
                    flag1=true;
                }
                else if(arr[i]==1){
                    flag2=true;
                }
            }
            if(flag1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
