package lombok;

import java.io.Serializable;
@AllArgsConstructor//(acces = AccessLevel.PRIVATE)
@Getter
@ToString
@Builder
public class Person {

    private String Name;
    private String Surname;
    private int age;
    private String username;
    private String password;

    public static void main(String[] args) {
        Person jan = Person.builder()
                .age(12)
                .username("Jan")
                .build();
        System.out.println(jan.toString());

    }

    }
