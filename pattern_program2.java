public class pattern_program2 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){//row
        for(int j=0;j<5-i-1;j++){//spaces
        System.out.print(" ");
             }
        for(int k=0;k<i*2+1;k++){//star
         System.out.print("*" );
            }
        System.out.println();
        }
        //****** *
        for(int a=4;a>0;a--){//row
        for(int j=0;j<5-a;j++){//spaces
        System.out.print(" ");
        }
        for(int k=a*2-1;k>0;k--){//star      
        System.out.print("*" );
        }
         System.out.println();
        }
    
}
}

