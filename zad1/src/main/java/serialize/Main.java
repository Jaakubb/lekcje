package serialize;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Jan","Kowalski",32, "weewr");

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.bin"));
        outputStream.writeObject(person);

        //ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.bin"));
        //Person personDesarialize = (Person) inputStream.readObject();

        //System.out.println(personDesarialize.getAge());
    }
}
