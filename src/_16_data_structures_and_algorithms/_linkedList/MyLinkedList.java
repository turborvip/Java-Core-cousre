package _16_data_structures_and_algorithms._linkedList;

// Danh sach lien ket.....@@ vcl
public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    /*
    * Phuong thuc khoi tao khong tham so
    * */

    public MyLinkedList(){}

    /*
    * Phuong thuc khoi tao tai vi tri index trong MyLinkedList
    * @param index
    * @param data
    * */

    /*
    * Phuong thuc tra ve so phan tu trong LinkedList
    * @return
    * */

    public int size(){
        return numNodes;
    }

    /*
    * Phuong thuc tra ve data theo index
    * @param index
    * @return
    * */

    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    /*
    * Phuong thuc kiem tra 1 phan tu co trong danh sach lien ket nay khong
    * @param element
    * @return
    * */

    public boolean contains(Object element){
        Node temp = head;
        while (temp.next  != null){
            if(temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        if (temp.getData().equals(element)){
            return true;
        }
        return false;
    }

    /*Phuong thuc tra ve vi tri phan tu trong danh sach
    * @param Object
    * return index
    * */

    public int indexOf(Object element){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    /*Phuong thuc them phan tu vao vi tri cuoi cung add last*/
    public void addLast(E e){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    /*Phuong thuc them phan tu vao vi tri dau tien*/
    public void addFirst(E e){
        Node temp = head;
        numNodes++;
        head = new Node(e);
        head.next = temp;

    }

    /*
    * Phuong thuc them phan tu
    *  */

    public void add(int index,E data){
        //Khai bao 1 node temp de chua node dau tien
        Node temp = head;

        //Khai bao node holder
        Node holder;
        
        //Cho con tro chay den vi tri index -1
        for (int i = 0; i < index - 1 && temp.next != null ; i++) {
            temp = temp.next;
        }

        //holder tham chieu den vi tri index
        holder= temp.next;
        //Node tai vi tri index -1 tro toi node moi
        temp.next = new Node(data);
        //Node moi tro toi holder
        temp.next.next = holder;
        //Tang so luong phan tu len
        numNodes++;
    }
    
    /*
    * Phuong thuc remove tai vi tri index
    * */
    
    public E remove(int index){
        //Khai bao mot node chua node dau tien
        Node temp = head;
        //Khai bao 1 doi tuong de nhap gia tri tra ve
        Object data;

        //Neu index = 0 thi tra ve vi tri hien tai va head se la node ke tiep
        if(index == 0){
            data = temp;
            head = head.next;
        }else {
            //Cho con tro chay den vi tri index-1
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            //data tro den node index
            data = temp.next.data;
            //node index tro den index + 1
            temp.next = temp.next.next;
        }
        numNodes--;

        return(E) data;
    }

    /*
    Phuong thuc xoa di du lieu data co trong linkedList
    */

    public boolean remove(E element){
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else{
            //Khai bao 1 con tro den head
            Node temp = head;
            //Cho vong lap chay den het danh sach
            while(temp.next != null){
                //Neu ton tai phan tu co data bang data truyen vao thi node do se tro den node thu 2 ke tiep\
                if (temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    /*
    * Phuong thuc tao ra bao sao cua danh sach lien ket
    * */

    public MyLinkedList<E> clone(){
        //Neu so phan tu bang 0 thi throw exception
        if(numNodes == 0){
            throw new NullPointerException();
        }
        //Khai bao danh sach tra ve
        MyLinkedList<E> temp = new MyLinkedList<E>();
        //Khai bao node tro den head
        Node tempNode = head;

        temp.addFirst((E) tempNode.data);
        //tro den node ke tiep
        tempNode = tempNode.next;

        //Add tat ca cac node vao danh sach
        while (tempNode != null){
            temp.addLast((E) tempNode.data);
            tempNode = tempNode.next;
        }

        return temp;
    }

}
