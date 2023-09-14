package serializable;

import java.io.*;

public class Persist {
    public static void main(String[] args) {

        try{
            Student s1 = new Student(101, "Tipu Sultan");
            FileOutputStream fout = new FileOutputStream("file.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success");


            ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
            Student s2 = (Student) in.readObject();

            System.out.println(s2.id + " "+ s2.name);

            in.close();
        }
        catch(Exception e){
            System.out.println(e);


        }

    }


}
