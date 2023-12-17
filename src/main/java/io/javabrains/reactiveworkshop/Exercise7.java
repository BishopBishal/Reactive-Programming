package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
        // TODO: Write code here
       /* ReactiveSources.intNumbersFlux()
                .log()
                .filter(s -> s > 5)
                .subscribe(s -> System.out.println(s));*/


        // Print 10 times each value from intNumbersFlux that's greater than 5
        // TODO: Write code here
/*        ReactiveSources.intNumbersFlux().filter(s -> s > 5)
                .map(s -> s * 10)
                .subscribe(s -> System.out.println(s));*/

        // Print 10 times each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
        // TODO: Write code here
        /*ReactiveSources.intNumbersFlux()
                .filter(s -> s > 5)
                .take(3)
                .map(s -> s * 10)
                .subscribe(s -> System.out.println(s));*/
        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
        // TODO: Write code here
        /*ReactiveSources.intNumbersFlux()
                .filter(s -> s > 20)
                .defaultIfEmpty(-1)
                .subscribe(s -> System.out.println(s));*/
        // Switch ints from intNumbersFlux to the right user from userFlux
        // TODO: Write code here
        /*ReactiveSources.intNumbersFlux().flatMap(s -> ReactiveSources.userFlux().filter(i -> s == i.getId()))
                .subscribe(s -> System.out.println(s));*/

        // Print only distinct numbers from intNumbersFluxWithRepeat
        // TODO: Write code here
//        ReactiveSources.intNumbersFluxWithRepeat().distinct().subscribe(s -> System.out.println(s));

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        // TODO: Write code here
        ReactiveSources.intNumbersFluxWithRepeat().distinctUntilChanged().subscribe(s -> System.out.println(s));


        System.out.println("Press a key to end");
        System.in.read();
    }

}
