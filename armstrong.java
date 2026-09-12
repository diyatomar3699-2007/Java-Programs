import java.util.Scanner;
class armstrong
{
public static void main(String[] args)
{
System.out.print("enter a number number :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem,arm=0;
int temp=n;
while(n>0)
{
rem=n%10;
arm=arm+(rem*rem*rem);
n=n/10;
}
if(arm==temp)
{
System.out.print("it is a armstong number");
}
else
{
System.out.print("it is not a armstong number");
}
}
}