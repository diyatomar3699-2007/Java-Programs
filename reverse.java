class reverse
{
public static void main(String[] args)
{
int n=232;
int temp=n;
int rem,rev=0;
while(n>0)
{
rem=n%10;
n=n/10;
rev=rev*10+rem;
}
if(rev==temp)
{
System.out.print("it is a reverse number");
}
else
{
System.out.print("it is not a reverse number");
}
}
}