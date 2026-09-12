import java.util.Scanner;
import java.util.Random;
class Game
{
public static void main(String[] args)
{
int i;
char choice;
Random r=new Random();
Scanner sc=new Scanner(System.in);
do
{
int atm=5;
int a=r.nextInt(20);
for(i=1;i<=atm;i++)
{
System.out.println("guess a number(b/w 0 to 20)");
int n=sc.nextInt();
if(n>a)
{
System.out.println("your guess is greater");
}
else if(n<a)
{
System.out.println("your guess is smaler");
}
else
{
System.out.println("your guess is match");
System.out.println("you win :");
break;
}
int L=atm-i;
System.out.println("ATTEMPT LEFT="+ L);
if(L==0){
    System.out.println("YOU ARE DEFEATED");
}
}
System.out.println("do you want to continue(y/n)");
choice=sc.next().charAt(0);
}
while(choice=='y'||choice=='Y');
System.out.println("GAME OVER");
}
}



