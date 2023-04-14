package _12_4_properties_opject_oriented_program.polymorphism;

public class AmexCard implements PaymentGateway{
    public void payment() {
        System.out.println("Payment with AmexCard");
    }
}
