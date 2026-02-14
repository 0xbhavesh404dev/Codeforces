import java.util.Scanner;

public class _427A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int countneg=0;
        int counthired=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                counthired+=arr[i];
            }
            if(arr[i]<0 && counthired<=0){
                count++;

            }
            if(arr[i]<0 && counthired>0){
                counthired--;
            }
        }
        System.out.println(count);
    }
}
