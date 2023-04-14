package _12_4_properties_opject_oriented_program.polymorphism;

public class VisaCard implements PaymentGateway{
    public void payment() {
        System.out.println("Payment with VisaCard");
    }
}
