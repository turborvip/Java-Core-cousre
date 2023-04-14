package _12_4_properties_opject_oriented_program.polymorphism;

public class MasterCard implements PaymentGateway{
    public void payment(){
        System.out.println("Payment with MasterCard");
    }
}
