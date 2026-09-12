import java.util.Scanner;
public class AccountManage {
public static void main(String [] args)
{
    char ch;
    int amount=500308;
    Scanner sc=new Scanner(System.in);
    do{   
    System.out.println("CHOOSE ANY ONE OPTION");
    System.out.println("1..BALANCE_CHECK...");
    System.out.println("2..DEPOSITE...");
    System.out.println("3..WITH_DRAW..");
    System.out.println("4..EXIT..");
   // Scanner sc=new Scanner(System.in);
    System.out.println("ENTER YOUR CHOICE");
    int choice=sc.nextInt();
    switch (choice) {
    case 1:
    System.out.println("CURRENT BALANCE IS=" + amount);
    break;
    case 2:
    System.out.println("ENTER DEPOSIT AMOUNT..");    
    int deposit_amount=sc.nextInt();
    amount=amount+deposit_amount;
    System.out.println("MONEY DEPOSITED SUCCESSFULLY");
    System.out.println("CURRENT BALANCE =" + amount);
    break;
    case 3:
    System.out.println("ENTER YOUR WITHDRAW AMOUNT");
    int  withdraw_amount=sc.nextInt();
    if(withdraw_amount<=amount){
    amount=amount-withdraw_amount;
    System.out.println("MONEY WITHDRAW SUCCESSFULLY");
    System.out.println("CURRENT BALANCE =" + amount);
    }
    else{
        System.out.println("INSUFFICIENT BALANCE");
    }
    break;
    case 4:
    System.out.println("EXIT..");
    break;
    default:
    System.out.println(" ENTER WRONG CHOICE ..");
    break;
    }
    System.out.println("DO YOU WANT TO CONTINUE (Y/N)");
    ch=sc.next().charAt(0);

    } 
    while (ch=='y'||ch=='Y');
    System.out.println("THANK YOUU..");
}        
}
    
      



