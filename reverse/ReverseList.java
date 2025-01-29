import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static List<Integer> reverseList(List<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        for (int item : list) {
            stack.push(item);
        }
        List<Integer> reversedList = new ArrayList<>();
        while (!stack.isEmpty()) {
            reversedList.add(stack.pop());
        }
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Reversed List: " + reverseList(list));
    }
}
