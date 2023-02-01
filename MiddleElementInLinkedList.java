import java.util.LinkedList;
class MiddleElementInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();

    number.add(1);
    number.add(2);
    number.add(3);
    number.add(4);
    number.add(5);
    number.add(6);
    System.out.println("LinkedList: " + number);

    int middle = number.get(number.size()/2);
    System.out.println("Middle Element: " + middle);
    }
}