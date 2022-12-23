package src.MyTests.Serialization;

import java.io.*;
import java.util.Arrays;

public class Person implements Serializable {
    public static void main(String[] args) throws IOException {
        String path;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream((path = br.readLine())));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

            Person[] people = {new Person(1, "Andrey"),
                    new Person(2, "Ivan"),
                    new Person(3, "Oleg")};

            int personCount = people.length;
            oos.writeInt(personCount);
            for (Person person : people) {
                oos.writeObject(person);
            }

            int personCount2 = ois.readInt();
            Person[] people1 = new Person[personCount2];
            for (int i = 0; i < people1.length; i++) {
                people1[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(people1));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String name;
    private int id;

    Person(int id, String name) {
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
