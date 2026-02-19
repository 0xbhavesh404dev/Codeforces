import java.util.Scanner;

public class _1850c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = 8;
            int m = 8;
            char[][] arr=new char[n][m];
            for(int i=0;i<n;i++){
                arr[i]=sc.next().toCharArray();
            }
            String str="";
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
//                    System.out.print(arr[i][j]+" ");
                    if(arr[i][j]!='.'){
                        str+=arr[i][j];
                    }
                }
              //  System.out.println();

            }
            System.out.println(str);
        }
    }
}
