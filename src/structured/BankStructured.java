package structured;
import java.util.Scanner;


public class BankStructured {
    //toan cuc global
   static int  accout_number = 112;
   static int accout_balance=0;
   static Scanner input=new Scanner (System.in);

    public static void main(String[] args) {
        deposit();//deposit
        show();//show 
        withdraw();//withdraw
        show();//show 
    }
   static void show(){
        System.out.println(" thong tin tài khoan");
        System.out.println("accout_number :"+accout_number);
        System.out.println("accout_balance :"+accout_balance);  
    }

   static void deposit(){
         //gui tien:deposit
         System.out.print("nhap so tien can gui :");
         int depositAmount;
         depositAmount= input.nextInt();
         accout_balance+=depositAmount;
    }

   static void withdraw(){
         //rut tien :withdraw
        System.out.print("nhap so tien can rut :");
        int withdrawAmount;
        withdrawAmount=input.nextInt();
        accout_balance-=withdrawAmount;
    }
   
    
    }

