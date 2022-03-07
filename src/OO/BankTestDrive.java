package OO;

public class BankTestDrive {
    public static void main(String[] args) {
        //nhân viên
        Employee employee = new Employee();
        employee.getEmName();
        employee.getSaLary();

        //khách hàng
        Customer customer = new Customer();
        customer.getAddress();
        customer.getPhone();

        //tiền
        Account account= new Account();
        account.show();
    }
    
}
