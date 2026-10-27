package ru.edu.patterns.builder;

public class Student {
    private final String name;
    private final int age;
    private final String group;

    private Student(Builder builder) {
        name = builder.name;
        age = builder.age;
        group = builder.group;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", group='" + group + "'}";
    }

    public static class Builder {
        private String name;
        private int age;
        private String group = "Не указана";

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder group(String group) {
            this.group = group;
            return this;
        }

        public Student build() {
            if (name == null || name.isBlank()) {
                throw new IllegalStateException("Укажите имя");
            }
            if (age < 16 || age > 100) {
                throw new IllegalStateException("Некорректный возраст");
            }
            return new Student(this);
        }
    }
}