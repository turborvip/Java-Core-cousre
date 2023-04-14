package _14_Interface;

public interface Readable {
    //Gom co 2 phan
    //1.Thuoc tinh : Hang so (public final static)
    //2.Phuong thuc : abstract  (access modifier la public)
    int NUMBER_OF_BOOKS = 5;

    // minh co the hieu no la public abstract void readBook
    void readBook();
}

//Dac diem
/*
    No khong the tao duoc doi tuong
    Mot doi tuong co the co nhieu interface

Khi nao su dung
    Khi muon su dung tinh da hinh
    Khi muon bao mat che dau thong tin cua phuong thuc
*/
