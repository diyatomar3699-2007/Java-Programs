public class rec {
    public static void printrec(int count) {
        if(count<5){
            System.out.println("java");
        }
        else{
            return;
        }
        printrec(count+1);
    }
    public static void main(String[] args) {
        printrec(0);
    }
    
}
