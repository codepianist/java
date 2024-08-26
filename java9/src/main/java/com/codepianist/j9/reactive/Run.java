package com.codepianist.j9.reactive;

import java.util.concurrent.SubmissionPublisher;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        // Create a Publisher
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        // Create a Subscriber and subscribe it to the Publisher
        SubscriberExample<String> subscriber = new SubscriberExample<>();
        publisher.subscribe(subscriber);

        // Publish items
        System.out.println("Publishing items...");
        String[] items = {"item1", "item2", "item3", "item4"};
        for (String item : items) {
            publisher.submit(item);
        }

        // Close the publisher
        publisher.close();

        // Give some time to ensure all messages are processed before the main thread exits
        Thread.sleep(5000);
    }

}
