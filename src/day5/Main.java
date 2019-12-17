package day5;

public class Main {

    public static void main(String[] args) {
        MyCircularDeque dq = new MyCircularDeque(9);

        System.out.println(dq.insertFront(1));
        System.out.println(dq.getFront());
        System.out.println(dq.insertLast(9));
        System.out.println(dq.getRear());
        System.out.println(dq.isEmpty());
        dq.insertFront(2);
        dq.insertLast(8);
        System.out.println(dq.isFull());
        System.out.println(dq.deleteFront());
        System.out.println(dq.getFront());

        System.out.println("length:" + dq.length);

        System.out.println(dq.getFront());
        dq.deleteFront();
        System.out.println("length:" + dq.length);

        System.out.println(dq.getFront());
        dq.deleteFront();
        System.out.println("length:" + dq.length);

        System.out.println(dq.getFront());
        dq.deleteFront();
        System.out.println("length:" + dq.length);

        System.out.println(dq.getFront());
        dq.deleteFront();
        System.out.println("length:" + dq.length);

        System.out.println(dq.getFront());
        System.out.println("length:" + dq.length);

        System.out.println(dq.getRear());
    }
}
