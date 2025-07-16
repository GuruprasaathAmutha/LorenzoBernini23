package selvan.ponniyin.InterfacePrac.RWExm;

public class UPIPayment implements Payment{

    @Override
    public void pay(String remitter, String Beneficiary, double Amount, String Gateway) {
        System.out.println("paid using UPI");
    }
}
