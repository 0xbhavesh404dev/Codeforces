import java.util.Scanner;

public class _1927A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int pos1=-1;
            int pos2=-1;

            for(int i=0;i<n;i++){
                if(s.charAt(i)=='B' && pos1<0){
                    pos1=i+1;
                }
                else if(s.charAt(i)=='B'){
                    pos2=i+1;
                }

            }
            if(pos1>0 && pos2>0) {
                System.out.println(pos2 - pos1 + 1);
            }
            else{
                System.out.println("1");
            }



        }
    }
}
