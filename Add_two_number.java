public class Add_two_number {
    static int add(int a,int b){
        return a+b;
        
    }
    static float add(float a,float b){
        return a+b;
    }
    static float add(float a,int b){
        return a+b;
    }
    static float add(int a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("addition="+add(2.0f,4.0f));
        
    }
}
