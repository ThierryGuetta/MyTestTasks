package src.MyTests.Serialization;

import java.io.*;
import java.util.Arrays;

public class Person2 implements Serializable {
    public static void main(String[] args) throws IOException {
        String path;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream((path = br.readLine())));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

            Person2[] people = {new Person2(1, "Andrey"),
                    new Person2(2, "Ivan"),
                    new Person2(3, "Oleg")};

            oos.writeObject(people);
            Person2[] people1 = (Person2[]) ois.readObject();

            System.out.println(Arrays.toString(people1));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String name;
    private int id;

    Person2(int id, String name) {
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
