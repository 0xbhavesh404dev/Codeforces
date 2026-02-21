import java.util.Scanner;

public class _1837A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int k=sc.nextInt();
            int num=x;
            int sum=0;
            int count=0;
            while(sum<x){
                if(num%k!=0 && sum+num<=x){
                    count++;
                   // System.out.print(num+" ");
                    sum=sum+num;
                }
                else{
                    num--;
                }
            }
            System.out.println(count);
            num=x;
            sum=0;
            count=0;

            while(sum<x){
                if(num%k!=0 && sum+num<=x){
                    count++;
                    System.out.print(num+" ");
                    sum=sum+num;
                }
                else{
                    num--;
                }
            }
            System.out.println();
            //System.out.println(sum+"dd");
//            int[] arr=new int[count];
//            while(sum<=x){
//                if(num%k!=0){
//                    arr[count-1]=num;
//                    count--;
//
//                }
//                else{
//                    num--;
//                }
//            }
//            for(int i=0;i<count;i++){
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();

        }
    }
}
