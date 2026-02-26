import java.util.Scanner;

public class _268Ap2 {
    //frequnecy
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] home = new int[n];
        int[] guest = new int[n];
        int[] frq=new int[101];
        for(int i=0;i<n;i++){
            home[i]=sc.nextInt();
            guest[i]=sc.nextInt();
            frq[guest[i]]++;
        }
        int result=0;
        for(int i=0;i<n;i++){
            result+=frq[home[i]];    // guest match freq is increased by 1 or 2 or 3.... rest all are zero so this will go till where is it poiints i.e it will point to home  and see
            // Exclude self-match
            if(home[i]==guest[i]){
                result--;
            }

        }
        System.out.println(result);

    }
}
