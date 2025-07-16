package selvan.ponniyin.InterfacePrac.RWExm;

public class PaymentFactory {

    public static Payment getInstance(String paymentType){
        if(paymentType==null) return null;

        if(paymentType=="UPI"){
            return new UPIPayment();
        } else if (paymentType=="RazorPay") {
            return new RazorPay();
        }else if (paymentType.equalsIgnoreCase("CreditCard")){
            return new CreditCard();
        }

        return null;
    }


}
