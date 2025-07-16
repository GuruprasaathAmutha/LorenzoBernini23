package selvan.ponniyin.InterfacePrac.RWExm;

public class PaymentExec {
    public static void main(String[] args) {


Payment p = PaymentFactory.getInstance("UPI");
p.pay("A","B",1000,"UPI");

    }
}
