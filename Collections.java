import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {
        // ArrayList
        System.out.println("\n************** Array List **************\n");
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(35);
        array.add(47);
        array.add(96);
        array.add(12);
        System.out.println("ArrayList : " + array);
        System.out.println("ArrayList Length : " + array.size());
        array.remove(3);
        System.out.println("ArrayList after removing an element : " + array);

        System.out.println("\n***************** List *****************\n");

        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("C");
        list.add("Ruby");
        System.out.println("List : " + list);
        list.remove("C");
        System.out.println("List after removing \"(C)\" : " + list);
        String item = list.remove(3);
        System.out.println("List after removing an item at index (3) : " + list);
        System.out.println("Item at index (3) : " + item);
        System.out.println("List length : " + list.size());

        System.out.println("\n***************** Queue *****************\n");

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(25);
        queue.add(50);
        queue.add(75);
        queue.add(100);
        System.out.println("Queue : " + queue);
        queue.remove();
        System.out.println("Queue after removing an item : " + queue);
        queue.add(150);
        System.out.println("Queue after adding an item : " + queue);

        System.out.println("\n***************** Stack *****************\n");
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(18);
        stack.push(45);
        System.out.println("Stack : " + stack);
        System.out.println("Peek Value : " + stack.peek());
        System.out.println("Stack : " + stack);
        System.out.println("Popped value : " + stack.pop());
        System.out.println("Stack after popping an element: " + stack);

        System.out.println("\n***************** Set *****************\n");
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("John");
        set.add("Mary");
        set.add("Peter");
        set.add("Peter");
        System.out.println("Set : " + set);
        System.out.println("Set Size : " + set.size());
        set.remove("Peter");
        System.out.println("Set after removing an element : " + set);
    }

}

