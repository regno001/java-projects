import java.io.*;
class Person implements Serializable {
    int id;
    String name;
    void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        System.out.println("Name: SAWAN");
        System.out.println("Roll No: 56");
        System.out.println("Course: BCA G1");
        Person p1 = new Person();
        p1.setData(101, "SAWAN");
        // ---------- Serialization ----------
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
            out.writeObject(p1);
            out.close();
            System.out.println("Write operation completed (Object Serialized).");
        } catch (Exception e) {
            System.out.println(e);
        }
        // ---------- Deserialization ----------
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
            Person p2 = (Person) in.readObject();
            in.close();
            System.out.println("Object Deserialized:");
            System.out.println("ID: " + p2.id + ", Name: " + p2.name);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}