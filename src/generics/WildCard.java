package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {

    static void printList(List<? extends Number> numbers){
        for(Number n : numbers){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        //List with number
        List<Number> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(5.5);
        numberList.add((5555555558.0002));
        for(Number n : numberList){
            System.out.println(n);
        }

        //list with wild card
        List<Integer>myIntList = new ArrayList<>();
        List<Double>myDoubleList = new ArrayList<>();

        myIntList.add(1);
        myIntList.add(2);
        myIntList.add(3);


        myDoubleList.add(1.5);
        myDoubleList.add(2.5);
        myDoubleList.add(3.5);

        printList(myIntList);
        printList(myDoubleList);




    }
}
