package src.MyTests.Serialization;

import java.io.*;
import java.util.Arrays;

public class Person3 implements Serializable {
    public static void main(String[] args) throws IOException {
        String path;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream((path = br.readLine())));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

            Person3[] people = {new Person3(1, "Andrey"),
                    new Person3(2, "Ivan"),
                    new Person3(3, "Oleg")};

            oos.writeObject(people);
            Person3[] people1 = (Person3[]) ois.readObject();

            System.out.println(Arrays.toString(people1));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private transient String name;
    private transient int id;

    Person3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
