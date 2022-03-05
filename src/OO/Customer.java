package OO;

import java.util.Scanner;

public class Customer {

    Scanner input =new Scanner(System.in);

    //data customer'
     String cusName;
      String address;

    //function get customer info
    String getCusInfo(){
       System.out.print("hay nhap ten khach hang :");
       cusName = input.nextLine();
       System.out.print("hay nhap dia chia khach hang :");
       address = input.nextLine();
        return cusName+address;
    }
 
    
}
