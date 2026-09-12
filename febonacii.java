class febonacii
{
public static void main(String[] args)
{
int n=5,a=0,b=1,c,i;
for(i=1;i<=n;i++)
{
System.out.print(a + "  ");
c=a+b;
a=b;
b=c;
}
}
}