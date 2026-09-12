public class Pattern_program3{
  public static void main(String[] args) {
     for(int i=5;i>0;i--){//row
        for(int j=0;j<5-i+1;j++){//spaces
          System.out.print(" ");
        }
        for(int k=i*2-1;k>0;k--){//star
        System.out.print("*");
        }
        System.out.println( );
     }
     //System.out.println( );
  }
    
    
}
