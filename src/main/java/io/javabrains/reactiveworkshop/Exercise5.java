package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here

      /*  ReactiveSources.intNumberMono().subscribe(s -> System.out.println(s),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")
        );*/
        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(new mySubscriber<>());


        System.out.println("Press a key to end");
        System.in.read();
    }

}

