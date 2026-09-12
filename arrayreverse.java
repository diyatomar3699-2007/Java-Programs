import java.util.Scanner;
class arrayreverse
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,j;
int arr[]=new int[5];
System.out.println("length of aary:"+ arr.length);
System.out.println("enter 5 values in array");
for(i=0;i<5;i++)
{
System.out.println(arr[i]=sc.nextInt());
}
System.out.println("you entered: ");
for(i=0;i<5;i++)
{
System.out.println(arr[i]);
}
System.out.println("reverse array:");
for(j=4;j>=0;j--)
{
System.out.println(arr[j]);
}
}
}
