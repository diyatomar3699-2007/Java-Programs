import java.util.Random;
import java.util.Scanner;
public class Papergame {
public static void main(String[] args)
{
    System.out.println("0..REPRESENTS>>STONE");
    System.out.println("1..REPRESENTS>>PAPER");
    System.out.println("2..REPRESENTS>>SCISSOR");
   Random r=new Random();
   Scanner sc=new Scanner(System.in); 
   char ch;
   do{
   int rn=r.nextInt(2);
   int atm=3;
   for(int i=atm;i>0;i--)
   {
    System.out.println("enter your choice(0,1,2)");
    int n=sc.nextInt();
    if((n==0 && rn==2)||(n==2 && rn==1)||(n==1 && rn==0))
    {
        System.out.println("you win");
        break;
    }
    else if ((n==1 && rn==2) ||(n==2 && rn==0) ||(n==0 && rn==1) ){
        System.out.println("you defeat");
    }
    else if (n==rn){
        System.out.println("game tie... ");
    }
    int L=atm-1;
    System.out.println("ATTEMPT LEFT="+L);
   }
   System.out.println("DO YOU WANT TO CONTINUE(Y/N)");
    ch=sc.next().charAt(0);
   }
   while(ch=='y'||ch=='Y');
   System.out.println("THANK YOU....");
}
}
