package ru.edu.patterns;

import ru.edu.patterns.strategy.*;
import ru.edu.patterns.chain.*;
import ru.edu.patterns.builder.Student;
import ru.edu.patterns.proxy.*;
import ru.edu.patterns.decorator.*;
import ru.edu.patterns.adapter.*;

import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        System.out.println("=== Strategy ===");

        SortContext sorter =
                new SortContext(new AscendingSortStrategy());

        System.out.println(sorter.sort(List.of(5, 2, 8, 1)));

        sorter.setStrategy(new DescendingSortStrategy());

        System.out.println(sorter.sort(List.of(5, 2, 8, 1)));



        System.out.println("\n=== Chain of Responsibility ===");

        Handler handler = new NameValidationHandler();
        handler.setNext(new AgeValidationHandler());

        System.out.println(handler.handle(new UserData("Александр", 20)));

        System.out.println(handler.handle(new UserData("", 15)));



        System.out.println("\n=== Builder ===");

        Student student = new Student.Builder().name("Леонид").age(20).group("Java-21").build();

        System.out.println(student);



        System.out.println("\n=== Proxy ===");

        FileReader reader = new SecureFileReaderProxy(new RealFileReader());

        try {
            System.out.println(reader.read(Path.of("data.txt")));
        }
        catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }



        System.out.println("\n=== Decorator ===");

        Message message = new BasicMessage("Привет, мир!");
        message = new UppercaseDecorator(message);
        message = new TimestampDecorator(message);

        System.out.println(message.getText());



        System.out.println("\n=== Adapter ===");

        ContactProvider contacts = new LegacyContactAdapter(new LegacyContactSource());

        System.out.println(contacts.getContacts());
    }
}