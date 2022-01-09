import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable {
    public String name;
    public String age;
    public int marks;

    public Student(String name, String age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return "Name : " + name + ", Age : " + age + ", Marks : " + marks;
    }
}

public class ObjectWriting {

    public static void main(String[] args) {

        // Student s1 = new Student("Avinash", "24", 100);
        // Student s2 = new Student("Ram", "14", 130);
        // try {
        // FileOutputStream fos = new FileOutputStream(new File("in.txt"));
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // oos.writeObject(s1);
        // oos.writeObject(s2);
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        try {
            FileInputStream fis = new FileInputStream(new File("in.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            int t = 2;
            while (t-- > 0) {
                Student s = (Student) ois.readObject();
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}