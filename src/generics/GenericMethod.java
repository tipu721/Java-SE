package generics;

public class GenericMethod {

    public static <E> void printArray(E[] elements){
        for(E element: elements){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        printArray(arr);
        Character[] ch = {'A', 'B', 'C', 'D'};
        printArray(ch);
    }

}
