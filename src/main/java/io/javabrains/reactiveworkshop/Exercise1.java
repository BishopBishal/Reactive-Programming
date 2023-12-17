package io.javabrains.reactiveworkshop;

import java.util.concurrent.atomic.AtomicInteger;

public class Exercise1 {

    public static void main(String[] args) {

        AtomicInteger count = new AtomicInteger();
        AtomicInteger integer = new AtomicInteger();
        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        System.out.println("Print all numbers in the intNumbersStream stream");
        StreamSources.intNumbersStream().forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        System.out.println("Print numbers from intNumbersStream that are less than 5");
        StreamSources.intNumbersStream().filter(digit -> digit < 5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        System.out.println("Print the second and third numbers in intNumbersStream that's greater than 5");
        StreamSources.intNumbersStream().filter(digit -> digit > 5).skip(1).limit(2).forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        System.out.println("Print the first number in intNumbersStream that's greater than 5.\n" +
                "  If nothing is found, print -1");
        // TODO: Write code here
        System.out.println(StreamSources.intNumbersStream()
                .filter(digit -> digit > 5)
                .findFirst().orElse(-1));


        // Print first names of all users in userStream
        // TODO: Write code here

        System.out.println("Print first names of all users in userStream");
        StreamSources.userStream().map(user -> user.getFirstName()).forEach(System.out::println);

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println(" Print first names in userStream for users that have IDs from number stream");

        StreamSources.intNumbersStream()
                .flatMap(s -> StreamSources.userStream()
                        .filter(d -> d.getId() == s))
                .map(s -> s.getFirstName())
                .forEach(System.out::println);

        System.out.println("Different Approach");

        StreamSources.userStream().filter(s -> StreamSources.intNumbersStream()
                        .anyMatch(d -> s.getId() == d))
                .forEach(System.out::println);

    }

}
