import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        System.out.println(calPoints("()"));

//        ArrayList array = new ArrayList();
//
//        array.add(5);
//        array.addIndex(0, 3);
//        array.addIndex(0, 10);
//        array.remove(0);
//
//        array.print();

        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] arr = new int[5];
    }



    public static boolean calPoints(String s) {
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == '(') {
                stack.push(c);
                for (char sc : chars) {
                    if (sc == ')') {
                        stack.push(sc);
                    } else {
                        return false;
                    }
                }
            }

            if (c == '{') {
                stack.push(c);
                for (char sc : chars) {
                    if (sc == '}') {
                        stack.push(sc);
                    } else {
                        return false;
                    }
                }
            }

            if (c == '[') {
                stack.push(c);
                for (char sc : chars) {
                    if (sc == ']') {
                        stack.push(sc);
                    } else {
                        return false;
                    }
                }
            }
        }

        for (char c : stack) {
            System.out.println(c);
        }

        return true;
    }
}