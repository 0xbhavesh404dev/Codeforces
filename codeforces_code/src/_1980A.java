import java.util.Scanner;

public class _1980A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            char[] arr=new char[n];
            String str=sc.next();
            arr=str.toCharArray();
            int[] freq=new int[8];
            for(int i=0;i<n;i++){
                freq[arr[i]-'A']++;
            }
//            for(int i=0;i<8-1;i++){
//               System.out.print(freq[i]+" ");
//            }
            int count=0;
            for(int i=0;i<8-1;i++){
                if(freq[i]<m){
                    count+=m-freq[i];
                }
            }

          //  System.out.println();
            System.out.println(count);
        }

    }
}
