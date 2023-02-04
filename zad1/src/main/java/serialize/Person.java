package serialize;

import java.io.Serializable;

public class Person implements Serializable {

    //private static final long serialVersionUID =
    private String Name;
    private String Surname;
    private int age;

    private String password;



    public Person(String name, String surname, int age, String password) {
        Name = name;
        Surname = surname;
        this.age = age;
        password = password;

    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
