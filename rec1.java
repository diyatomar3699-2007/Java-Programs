

public class rec1 {
    public static void rec(int count){
     if(count>=0){
        System.out.println(count);
     }
     else{
        return;
     }
     rec(count-1);
    }
public static void main(String [] args){
 rec(5);
}
}
