import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("SECOND NUMBER="+ b);
        System.out.println("FIRST NUMBER="+a);

    }
}
