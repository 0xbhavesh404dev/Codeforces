import java.util.Scanner;

public class _1807B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-->0){
             int n = sc.nextInt();
             int[] arr=new int[n];
             int maxeven=0;
             int maxodd=0;
             int sumeven=0;
             int sumodd=0;
             for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
                 if(arr[i]%2==0){
                     if(arr[i]>maxeven){
                         maxeven=arr[i];
                     }
                     sumeven+=arr[i];
                 }
                 else if(arr[i]%2!=0){
                     if(arr[i]>maxodd){
                         maxodd=arr[i];
                     }
                     sumodd+=arr[i];
                 }
             }
             if(sumeven>sumodd){
                 System.out.println("YES");
             }
             else{
                 System.out.println("NO");
             }
         }
    }
}
