import java.util.Arrays;
import java.util.Scanner;

public class _1941A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[m];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                arr2[i]=sc.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr1[i]+arr2[j]<=k){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
