import java.util.Scanner;

public class _381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        int serija=0;
        int mana=0;
        int start=0;
        int n=t-1;
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        while(start<=n){
            if(start==n){
                serija+=arr[start];
                break;
            }
            if(arr[start]>arr[n]){
                serija+=arr[start];
              //  System.out.println("st sri"+arr[start]);
                start++;

            }
            else{
                serija+=arr[n];
              //  System.out.println("end sri"+arr[n]);
                n--;

            }
            if(arr[start]>arr[n]){
                mana+=arr[start];
              //  System.out.println("st man"+arr[start]);
                start++;

            }
            else{
                mana+=arr[n];
              //  System.out.println("end man"+arr[n]);
                n--;

            }
        }
        System.out.println(serija+" "+mana);
    }
}
