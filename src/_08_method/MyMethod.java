package _08_method;

public class MyMethod {
    public static int sum (int a, int b){
        int result = a+b;
        return result;
    }

    public static void myMethod(){
        System.out.println("I just got executed.");
    }

    public static void main(String[] args) {
        //accessModifier static/nonStatic returnType  methodName(list of parameter){
        //Method body;
        //}


        System.out.println(sum(7,9));
        myMethod();
    }

}
