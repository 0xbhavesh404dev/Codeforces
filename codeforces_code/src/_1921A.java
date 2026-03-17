import java.util.Scanner;

public class _1921A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int x3=sc.nextInt();
            int y3=sc.nextInt();
            int x4=sc.nextInt();
            int y4=sc.nextInt();
            int length1=0;
            int length2=99;
            if(x1==x2){
                length1=Math.abs(y1-y2);
            }
            else if(x1==x3){
                length1=Math.abs(y1-y3);
            }
            else if(x1==x4){
                length1=Math.abs(y1-y4);
            }
            else if(x2==x3){
                length1=Math.abs(x2-x3);
            }
            else if(x2==x4){
                length1=Math.abs(x2-x4);
            }
            else if(x3==x4){
                length1=Math.abs(x3-x4);
            }

            if(y1==y2){
                length2=Math.abs(x1-x2);
            }
            else if(y1==y3){
                length2=Math.abs(x1-x3);
            }
            else if(y1==y4){
                length2=Math.abs(x1-x4);
            }
            else if(y2==y3){
                length2=Math.abs(x2-x3);
            }
            else if(y2==y4){
                length2=Math.abs(x2-x4);
            }
            else if(y3==y4){
                length2=Math.abs(x3-x4);
            }
           // System.out.println((length1*length2));
            System.out.println(length1*length2);
        }
    }
}
