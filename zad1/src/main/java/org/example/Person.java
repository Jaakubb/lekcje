package org.example;

public class Person {
    private String Name;
    private String Surname;
    private int age;

    public Person(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        this.age = age;
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
