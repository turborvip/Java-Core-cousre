package _14_Interface;

public class Student implements Readable,Playable {
    @Override
    public void readBook() {
        System.out.println("Sinh vien doc sach de tot hon");
    }

    @Override
    public void playGame() {
        System.out.println("Sinh vien choi game :))");
    }
}
