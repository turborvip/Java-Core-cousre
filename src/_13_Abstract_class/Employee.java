package _13_Abstract_class;

public class Employee extends Person{

    private String salary;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public void learn(){
        System.out.println("Hoc lam employee!");
    }
}
