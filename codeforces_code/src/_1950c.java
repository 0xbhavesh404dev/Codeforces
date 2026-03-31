import java.util.Scanner;

public class _1950c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int h1=s.charAt(0)-'0';
            int h2=s.charAt(1)-'0';
            int hou=h1*10+h2;
           // System.out.println(hou);
            if(hou>11){
                if(hou-12==0){
                    hou=12;
                    System.out.println((hou) + ":" + (s.charAt(3) - '0') + (s.charAt(4) - '0') + " PM");
                }
                //pm
                else if(hou-12<10) {
                    System.out.println("0" + (hou - 12) + ":" + (s.charAt(3) - '0') + (s.charAt(4) - '0') + " PM");
                }
                else{
                    System.out.println((hou - 12) + ":" + (s.charAt(3) - '0') + (s.charAt(4) - '0') + " PM");
                }
            }
            else{
                //am
                if(hou==0){
                    hou=12;
                }
                if(hou<10){
                    System.out.println("0" + hou + ":" + (s.charAt(3) - '0') + (s.charAt(4) - '0') + " AM");
                }
                else {
                    System.out.println( hou + ":" + (s.charAt(3) - '0') + (s.charAt(4) - '0') + " AM");
                }
            }
        }
    }
}
