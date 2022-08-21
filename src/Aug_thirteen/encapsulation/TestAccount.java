package Aug_thirteen.encapsulation;

public class TestAccount {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setAcc_no(111211000);
        acc.setName("Goutam");
        acc.setEmail("goutamvante@gmail.com");
        acc.setAmount(5000000f);

        System.out.println("Account number: "+   "  Account holder Name:"+" mailid " +       " Amount ");
        System.out.println(acc.getAcc_no() +"    "+ acc.getName()+"     "+  acc.getEmail()+" "+acc.getAmount());
    }
}
