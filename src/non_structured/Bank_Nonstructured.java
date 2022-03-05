package non_structured;
import java.util.Scanner;;
public class Bank_Nonstructured {
    public static void main(String[] args) {
        int  accout_number = 112;
        int accout_balance=0;

        //thao tac len du liệu (data)
        
        Scanner 
        input=new Scanner (System.in);

        //gui tien:deposit
        System.out.print("nhap so tien can gui :");
        int depositAmount;
        depositAmount= input.nextInt();
        accout_balance+=depositAmount;

        // show 
        System.out.println(" thong tin tài khoan ");
        System.out.println("accout_number :"+accout_number);
        System.out.println("accout_balance :"+accout_balance);


        //rut tien :withdraw
        System.out.print("nhap so tien can rut :");
        int withdrawAmount;
        withdrawAmount=input.nextInt();
        accout_balance-=withdrawAmount;
        

        // show accout
        System.out.println(" thong tin tài khoan");
        System.out.println("accout_number :"+accout_number);
        System.out.println("accout_balance :"+accout_balance);  
    }
    
}
