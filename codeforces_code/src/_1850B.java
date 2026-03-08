import java.util.Scanner;

public class _1850B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[][] max=new int[n][2];
            for(int i=0;i<n;i++){
                for(int j=0;j<2;j++){
                    max[i][j]=sc.nextInt();
                }
            }
            int index=0;
            int quality=0;
            for(int i=0;i<n;i++){
                if(max[i][0]<=10) {
                   if(max[i][1]>quality){
                       quality=max[i][1];
                       index=i;
                   }
                }
              //  System.out.println();
            }
            System.out.println(index+1);
        }
    }
}
