import java.util.Scanner;

public class _1791B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int x=0;
            int y=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='U'){
                    x++;
                }
                else if(str.charAt(i)=='D'){
                    x--;
                }
                else if(str.charAt(i)=='L'){
                    y--;
                }
                else if(str.charAt(i)=='R'){
                    y++;
                }
                 if(x==1 && y==1){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
