import java.util.Arrays;
import java.util.Scanner;

public class _1021A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int max=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            Arrays.sort(arr);
            boolean ok=false;
            for(int i=0;i<n-3;i++){
                if(arr[i]==arr[i+3]){
                    ok=true;
                }
            }
            for(int i=0;i<n-3;i++){
                if(arr[i]+1==arr[i+1] && arr[i]+2==arr[i+3]){
               //     ok=true;
                }
            }
            if(ok==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
