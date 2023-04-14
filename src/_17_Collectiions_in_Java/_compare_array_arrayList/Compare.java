package _17_Collectiions_in_Java._compare_array_arrayList;

public class Compare {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        //Error because array.length = 3
        //array[3] = 4;

        for (int number : array){
            System.out.print(number + "\t");
        }

        //1.Diem khac nhau thu nhat la array co kich thuoc co dinh con arrayList thi khong
        //2.Diem khac nhau thi array co the khai bao du lieu nguyen thuy con arrayList tu java 5 tro xuong thi khong
        //3.Array co toc do luu tru va thao tac nhanh hon arrayList
        //4.Array chi co thuoc tinh length con ArrayList co nhieu phuong thuc thao tac hon add(), indexOf()...
    }
}
