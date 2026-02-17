import java.util.Scanner;

public class Round693_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int[]  arr=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
            int count1=0;
            int count2=0;
            for(int i=0;i<a;i++){
                if(arr[i]==1){
                    count1++;
                }
                else if(arr[i]==2){
                    count2++;
                }
            }
            if((count1%2==0) && ((count2*2)%2==0) && count1!=0){
                System.out.println("YES");
            }
            else if((count2%2!=0)){
                System.out.println("NO");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
