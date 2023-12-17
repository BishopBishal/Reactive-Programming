package io.javabrains.reactiveworkshop;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class mySubscriber<T> implements Subscriber<T> {
    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("On Subscription called"
        );
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(T t) {
        System.out.println("Next Called" + " " + t.toString());
        subscription.request(1);

    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Error is happended");

    }

    @Override
    public void onComplete() {
        System.out.println("subscription fetched completly");

    }
}