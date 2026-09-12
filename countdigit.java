import java.util.Scanner;
class countdigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter a number");
int n=sc.nextInt();
int a=0,r;
while(n>0)
{
r=n%10;
n=n/10;
a=a+1;
//System.out.print(r + " " );
}
System.out.print("number of digit=");
System.out.print(a);

}
}