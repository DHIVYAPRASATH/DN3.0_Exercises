package com.decoratorpattern;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create a base EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate with SMSNotifierDecorator
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Further decorate with SlackNotifierDecorator
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a message using the fully decorated notifier
        slackNotifier.send("Hello, this is a test message!");
    }
}
