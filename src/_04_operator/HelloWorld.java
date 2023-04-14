package _04_operator;

public class HelloWorld {
    public  static void main(String[] args){
        //1. Toan tu so hoc +, -, *, /, %, ++, --
        int x = 8;
        System.out.println(x++);
        System.out.println(x);

        //2. Toan tu gan =, +=, -=, *=, /=, %=
        System.out.println(x+=1);

        //3. Toan tu so sanh ==, !=, >, <, >=, <=
        System.out.println(9!=8);

        //4. Toan tu logic &&, ||, !
        System.out.println(6>2 || 6>9);

        //5. Toan tu bit &, |, ^, <<, >>, >>>
        System.out.println((char)('A'|' '));

    }
}
