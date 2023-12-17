package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;
import reactor.core.publisher.SignalType;

import java.io.IOException;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
        // TODO: Write code here
    /*    ReactiveSources.intNumbersFluxWithException()
                .doOnError(s -> System.out.println("Error happened " + s.getMessage()))
                .subscribe(s -> System.out.println(s));*/

   /*     ReactiveSources.intNumbersFluxWithException()
                .subscribe(s -> System.out.println(s),
                        err -> System.out.println("Error happened")
                );*/

        // Print values from intNumbersFluxWithException and continue on errors
        // TODO: Write code here
        /*ReactiveSources.intNumbersFluxWithException()
                .onErrorContinue((err, item) -> System.out.println("Error happened on item = " + item + " error = " + err.getMessage()))
                .subscribe(s -> System.out.println(s));*/

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
        // TODO: Write code here
        ReactiveSources.intNumbersFluxWithException()
                .onErrorResume(err -> Flux.just(-1, -2))
                .doFinally(signalType -> {
                    if (signalType == SignalType.ON_COMPLETE)
                        System.out.println("Function Completed");
                    else
                        System.out.println("Function not completed yet");
                })
                .subscribe(s -> System.out.println(s));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
