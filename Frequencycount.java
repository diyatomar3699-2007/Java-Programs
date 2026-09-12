import java.util.Scanner;
class Frequency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String s=sc.nextLine();
System.out.println("string length=" + s.length());
for(int i=0;i<s.length();i++)
{
int count=0;
char ch=s.charAt(i);
boolean alreadycounted=false;
for(int j=0;j<i;j++)
{
if(s.charAt(j)==ch)
{
alreadycounted=true;
break;
}
}
for(int k=0;k<s.length();k++)
{
if(s.charAt(k)==ch)
{
count++;
}
}
System.out.println(ch + "=" +count);
}
}
}