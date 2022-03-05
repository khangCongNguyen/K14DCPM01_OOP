package OO;

import java.util.Scanner;

public class Account {
    
    // data
    int  accout_number = 112;
    int accout_balance=0;
    
    //tạo đối tượng 
    Scanner input=new Scanner(System.in);

    //function
     void show(){
        System.out.println(" thong tin tài khoan");
        System.out.println("accout_number :"+accout_number);
        System.out.println("accout_balance :"+accout_balance);  
    }

    void deposit(){
         //gui tien:deposit
         System.out.print("nhap so tien can gui :");
         int depositAmount;
         depositAmount= input.nextInt();
         accout_balance+=depositAmount;
    }
    void withdraw(){
        //rut tien :withdraw
       System.out.print("nhap so tien can rut :");
       int withdrawAmount;
       withdrawAmount=input.nextInt();
       accout_balance-=withdrawAmount;
   }
   
 
    
    
}
