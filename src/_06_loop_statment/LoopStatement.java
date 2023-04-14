package _06_loop_statment;

public class LoopStatement {
    public static void main(String[] args) {
/*        for(inital-action; Loop-condition; action-after-each-iteration){
            //Code block to be executed
        }
    }
 */
        for(int index = 1; index <= 4; index++) {
            if (index == 3) continue;
            System.out.print(index + "\t");
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String element: cars){
            System.out.print(element + '\t');
        }

        int i = 0;
        while (i< 5){
            System.out.print(i + "\t");
            i++;
        }

        int j = 0;
        do{
            System.out.print(j + "\t");
            j++;
        }while (j<10);

    }
}
