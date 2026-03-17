import java.util.Scanner;

public class _1915B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1=sc.next();
            String s2=sc.next();
            String s3=sc.next();
            char[][] arr=new char[3][3];
            int row=0;
            int col=0;

            for(int i=0;i<3;i++){
                arr[0][i]=s1.charAt(i);
            }
            for(int i=0;i<3;i++){
                arr[1][i]=s2.charAt(i);
            }
            for(int i=0;i<3;i++){
                arr[2][i]=s3.charAt(i);
            }



            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    ;
                    if(arr[i][j]=='?'){
                        row=i;
                        col=j;
                    }
                }
            }
            boolean a=false;
            boolean b=false;
            boolean c=false;
            for(int i=0;i<3;i++){
               if(arr[row][i]=='A'){
                   a=true;
                }
               if(arr[row][i]=='B'){
                   b=true;
               }
               if(arr[row][i]=='C'){
                   c=true;
               }
            }
            if(a==false){
                System.out.println("A");

            }
            if(b==false){
                System.out.println("B");

            }
            else if(c==false){
                System.out.println("C");


            }
        }
    }
}
