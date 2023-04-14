package _09_object;

public class Car {
    int modelYear;
    String modelName;

    public void run(){
        System.out.println("My ca:"+modelName+" is running...");
    }

    public Car(int modelYear,String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        Car myCar = new Car(1986, "BMW");
        System.out.println(myCar.modelYear+ "\t" + myCar.modelName);

        Car myCar_2 = new Car(1991, "Porsche");
        System.out.println(myCar_2.modelYear + "\t" + myCar_2.modelName);
    }
}
