import java.util.Scanner;
class evodd
{
public static void main(String[] args)
{
System.out.print("enter a number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%2==0)
{
System.out.print("even");
}
else
{
System.out.print("odd");
}
}
}