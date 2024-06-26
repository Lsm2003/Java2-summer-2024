package Assignments.A4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;
public class ReversingLinkedLists {
    public static void main(String[] args) {

        LinkedList<Character> numbers = new LinkedList<Character>(Arrays.asList('0','1','2','3','4','5','6','7','8','9'));
        LinkedList<Character> numbers2 = new LinkedList<>();

        Iterator<Character> i = numbers.iterator();
        int index = numbers.size() - 1;
        while (i.hasNext()) {
            Character character = numbers.get(index);
            numbers2.add(character);
            if (index > 0) {
                index --;
            }
            else {
                break;
            }
        }
        System.out.println(numbers);
        System.out.println(numbers2);
    }
}
