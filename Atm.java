import java.util.Scanner;
class Account {
    Scanner sc=new Scanner(System.in);
     public double balance;
     public String name;
     public long Accountnumber;
     public int Pin;
             void checkbalance(){
                  System.out.println("CURRENT BALANCE IS:"+balance);
             }
             void deposite(int amount){
                if(amount>0){
                  balance=balance+amount;
               System.out.println("AMOUNT DOPOSIT SUCCESSFULLY");  
               System.out.println("CURRENT BALANCE:"+balance); 
                } 
                else{
                    System.out.println("invalid amount please enter a value greater than 0.");
                }
             }
             void changepin(){
              System.out.println("enter old pin");
              int oldpin=sc.nextInt();
              if(oldpin==Pin){
                System.out.println("old pin is currect");
                System.out.println("enter new pin");
                int newpin=sc.nextInt();
                Pin=newpin;
                System.out.println("PIN CHANGE SUCCESSFULLY");
                System.out.println("YOUR CURRENT PIN IS"+" "+newpin);
              }
              else{
                System.out.println("old pin is wrong");
              }
               
                
             }
             void withdraw(int amount){
                if(amount<=balance&&amount>0){
                     balance=balance-amount;
                     System.out.println("AMOUNT WITHDRAW SUCCESSFULLY");
                     System.out.println("CURRENT BALANCE:"+balance);
                }
                else{
                    System.out.println("TRANSACTION FAILED!INVALID AMOUNT OR INSUFFICIENT BALANCE");
                    System.out.println("PLEASE TRY AGAIN");
                
                }

             }
        
            
        }
public class Atm {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int ch;
        char choice;
        int CurrentUser= -1;
        int i;
        Scanner sc=new Scanner(System.in);
        Account[] acc=new Account[5];
        acc[0]=new Account();
        acc[0].name="diya";
        acc[0].Accountnumber=12345678901L;
        acc[0].Pin=1234;
        acc[0].balance=20000;
        acc[1]=new Account();
        acc[1].name="ayush";
        acc[1].Accountnumber=12345578901L;
        acc[1].Pin=1134;
        acc[1].balance=25000;
        acc[2]=new Account();
        acc[2].name="ansh";
        acc[2].Accountnumber=11345678901L;
        acc[2].Pin=2234;
        acc[2].balance=30000;
        acc[3]=new Account();
        acc[3].name="ishika";
        acc[3].Accountnumber=12345676901L;
        acc[3].Pin=1233;
        acc[3].balance=35000;
        acc[4]=new Account();
        acc[4].name="sakshi";
        acc[4].Accountnumber=12345678991L;
        acc[4].Pin=1244;
        acc[4].balance=40000;
do{
    System.out.println("enter account number ");
         long   enterAccountNumber=sc.nextLong();
         System.out.println(" enter pin");
         int enterpin=sc.nextInt();
         for( i=0;i<acc.length;i++){
              if(acc[i].Accountnumber==enterAccountNumber&&acc[i].Pin==enterpin){
                System.out.println("hii\t"+acc[i].name+"\t YOUR ACCOUNT login successfully");
                CurrentUser=i;
                break;
              }
           }
           if(CurrentUser!=-1){
           do{
        System.out.println("1..CHECKBALANCE");
        System.out.println("2..DEPOSIT");
        System.out.println("3..WITHDRAW");
        System.out.println("4..CHANGE PIN");
        System.out.println("5..EXIT");
        System.out.println("ENTER YOUR CHOICE");
        ch=sc.nextInt();
         switch (ch) {
    
        case 1:
             acc[CurrentUser].checkbalance();
            break;
        case 2:
        System.out.println("enter deposite balance");
        int depositemoney=sc.nextInt();
            acc[CurrentUser].deposite(depositemoney);
            break;
        case 3:
            System.out.println("enter withdraw  balance");
        int withdrawmoney=sc.nextInt();
            acc[CurrentUser].withdraw(withdrawmoney);
            break;
        case 4:
           acc[CurrentUser].changepin();
            break;
        case 5:
            System.out.println("exit");
            break;
        default:
            System.out.println("wrong choice");
            break;
       }
    }
     while(ch!=4);
   }
   else{
    System.out.println("invalid account number or pin");
    }
        System.out.println("DO YOU WANT TO CONTINUE..(Y/N)");
        choice=sc.next().charAt(0);

}
        while (choice=='y'||choice=='Y'); {
        System.out.println("THANK YOU..");
    }

}
}