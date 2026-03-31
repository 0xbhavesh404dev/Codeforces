import java.util.Scanner;

public class _1399B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[n];
            int minA = Integer.MAX_VALUE;
            int minB = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++){
                arr1[i] = sc.nextInt();
                minA = Math.min(minA, arr1[i]);
            }

            for(int i = 0; i < n; i++){
                arr2[i] = sc.nextInt();
                minB = Math.min(minB, arr2[i]);
            }
            long c = 0;
            for(int i = 0; i < n; i++){
                long diff = arr1[i] - minA;
                long diff2 = arr2[i] - minB;
                c += Math.max(diff, diff2);
            }
//                if(arr1[i]==minA || arr2[i]==minB){
//                    int diff=Math.abs(arr1[i]-minA);
//                    int diff2=Math.abs(arr2[i]-minB);
//                    c+=Math.max(diff,diff2);
//                }

            System.out.println(c);




        }
    }
}
