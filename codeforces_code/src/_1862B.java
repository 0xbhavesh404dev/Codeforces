import java.util.Scanner;

public class _1862B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] arr2=new int[n];
            arr2[0]=arr[0];
            for(int i=2;i<n;i++){
                if(arr[i-1]<=arr[i]){
                    arr2[i]=arr[i];
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr2[i]+" ");
            }
            System.out.println();
        }
    }
}
