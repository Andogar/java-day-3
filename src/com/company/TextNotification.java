package com.company;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        printText();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println("Time made:" + getCreatedAt());
        System.out.println("Subject: " + getSubject());
        System.out.println("Body: " + getBody());
        System.out.println("Recipient: " + getRecipient());
        System.out.println("Provider: " + getSmsProvider());
    }
}
