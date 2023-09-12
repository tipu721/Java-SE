package generics;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class WildCard {

    //unbounded
    static void printUnboundedList(List<?>numbers){
        for(Object o : numbers){
            System.out.println(o);
        }

    }
    //uper bounded
    static void printList(List<? extends Number> numbers){
        for(Number n : numbers){
            System.out.println(n);
        }
    }

    //lower bounded
    static void printLowerbounded(List<? super Integer>lowerList){
        for(Object o : lowerList){
            System.out.println(o);
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

        //unbounded wirld card
        List<String>myStringList = new ArrayList<>();
        List<Integer>myIntegerList = new ArrayList<>();

        myStringList.add("Unbounded1");
        myStringList.add("Unbounded2");
        printUnboundedList(myStringList);
        myIntegerList.add(8);
        myIntegerList.add(9);
        printUnboundedList(myIntegerList);


        //lowerBounded
        List<Integer>myList = new ArrayList<>();
        List<Object>objectList = new ArrayList<>();
        myList.add(5);
        myList.add(6);
        objectList.add("Tipu");
        objectList.add("Sultan");
        objectList.add("123");
        printLowerbounded(myList);
        printLowerbounded(objectList);




    }
}
