import java.util.Scanner;

public class _1783A {
    public static Scanner sc=new Scanner(System.in);
    static void function(){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=arr[0];

        boolean flag=true;
        for(int i=1;i<n;i++){
            if(sum==arr[i]){
                flag=false;
                break;
            }
            sum+=arr[i];
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

    public static void main(String[] args) {

        int t=sc.nextInt();
        while(t-->0){
            function();
        }
    }
}
