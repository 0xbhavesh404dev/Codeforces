import java.util.Scanner;

public class _2009B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            char[][] arr=new char[n][4];
            for(int i=0;i<n;i++){
                arr[i]=sc.next().toCharArray();
            }
            int[] arr1=new int[n];
            for(int i=0;i<n;i++){
                for(int j=0;j<4;j++){
                    if(arr[i][j]=='#'){
                        arr1[i]=j+1;
                    }
                }
            }
            for(int i=n-1;i>=0;i--){
                System.out.print(arr1[i]+" ");
            }
            System.out.println();

        }
    }
}
