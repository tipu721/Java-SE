package generics;

import oop.A;

public class Generic1<T> {

    void print(T a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Generic1<Integer> g1 = new Generic1<>();
        Generic1<String> g2 = new Generic1<>();
        Generic1<A> g3 = new Generic1<>();
        A a = new A();
        g3.print(a);
        g1.print(5666);
        g2.print("Tipu Sultan");
        //g1.print();
    }
}


//class A{
//    int a;
//}
//class Test{
//    String name;
//    String number;
//    public Test(String name,String number,A a){
//        this.name=name;
//        this.number=number;
//    }
//}
//class Program{
//    public static void main(String[] args) {
//        A a = new A();
//        Test t=new Test("abc","123",);
//    }
//}