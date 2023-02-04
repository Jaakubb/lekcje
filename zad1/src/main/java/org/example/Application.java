package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<String> strings = List.of("A","A","B","B","B","C","D");

        List<String> collect = strings.stream()
                .filter(s -> "A".equals(s))
                .map(s -> s.concat("B"))
                .distinct()
                .collect(Collectors.toList());

        for (String s : collect){
            System.out.println(s);
        }

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan","Kowalski",40));
        people.add(new Person("Jan","Nowak",23));
        people.add(new Person("Andrzej","Nowak",31));

        List<Person> people1 = people.stream()
                .sorted((o1, o2) -> {
                    if (o1.getAge() > o2.getAge()) {
                        return 1;
                    }
                    if (o1.getAge() < o2.getAge()) {
                        return -1;
                    }
                    return 0;
                })
                .toList();
        for (Person person : people1) {
            System.out.println(person.getAge());
        }



        //List<String> filterStrings = new ArrayList<>();

        //for (String s : strings){
        //    if("A".equals(s)){
        //        filterStrings.add(s);
        //    }
        //}
        //for(String filterString : filterStrings){
        //    System.out.println(filterString);
        //}
    }
}
