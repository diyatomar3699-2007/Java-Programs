import java.util.*;
public class Booklibrary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] book=new String[3];
       //String [] book={"hindi","english","math"};
       System.out.println("enter books");
       for(int i=0;i<book.length;i++){
       book[i]=sc.nextLine();
       //System.out.println(book.length);
       }
       System.out.println("AVAILABLE BOOKS ");
       for(int i=0;i<book.length;i++){
        
       System.out.println(book[i]);
       }

      }
}