import java.util.Scanner;
public class Student_marks_manager {
    public static void main(String [] args){
        int [] student_marks= new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 10 STUDENTS MARKS");
        for(int i=0;i<10;i++){
        System.out.format("ENTER MARKS OF STUDENT %d =",i+1);
        student_marks[i]=sc.nextInt();
        }
        //System.out.println("array length="+student_marks.length);
        int N1= Integer.MIN_VALUE;
        int i;
        for( i=0;i<student_marks.length;i++){
            if(i>N1){
                N1=i;
            }
        }
        System.out.format ("HIGHEST MARKS  = "+ N1);
        int N2= Integer.MAX_VALUE;
        for(int ele:student_marks){
            if(ele<N2){
                N2=ele;
            }
        }
        System.out.println("LOWER MARKS = "+N2);
        int pass=0,fail=0;
        for(int n3:student_marks){
        if(n3>40){
            System.out.format("STUDENT WITH %d MARKS HAS PASSED\n",n3);
            pass=pass+1;
        }
        else{
            System.out.format("STUDENT WITH %d MARKS HAS FAILLED\n",n3);
            fail=fail+1;
        }
        }
        System.out.println("PASS STUDENT="+pass);
        System.out.println("FAIL STUDENT="+fail);
        
    }
    
}
