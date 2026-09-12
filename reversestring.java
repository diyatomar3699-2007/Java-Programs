import java.util.Scanner;
class reversestring
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String s=sc.nextLine();
System.out.println("length of string="+s.length());
System.out.println("reverse string");
for(int j=s.length()-1;j>=0;j--)
{
System.out.println(s.charAt(j));
}
}
}