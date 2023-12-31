package lec02;

import org.jetbrains.annotations.NotNull;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

        public Person(String name) {
        this.name = name;
        this.age = 10;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
