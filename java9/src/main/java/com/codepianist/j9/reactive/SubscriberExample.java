package com.codepianist.j9.reactive;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Flow;

@Slf4j
public class SubscriberExample<T> implements Flow.Subscriber<T> {

    Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        log.info("Subscribed! {}", subscription.toString());
        this.subscription = subscription;
        subscription.request(1); // Needs to request
    }

    @Override
    public void onNext(T item) {
        log.info("Received {}", item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        log.info("Failed: {}", throwable.getMessage());
    }

    @Override
    public void onComplete() {
        log.info("Completed - All items are processed");
    }
}
