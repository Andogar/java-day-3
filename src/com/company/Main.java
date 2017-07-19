package com.company;

public class Main {

    public static void main(String[] args) {
        EmailNotification email = new EmailNotification("Hello", "This is a test", "Myself@earthlink.net", "gmail");
        email.transport();

        TextNotification text = new TextNotification("yo", "wyd", "the homie","t-mobile");
        text.transport();

        System.out.println("Different statuses ********************");
        email.showStatus();
        text.showStatus();

        email.printText();

        try {
            Object emailNotificationClone = email.clone();
            System.out.println("Clone equals email instance: " + emailNotificationClone.equals(email));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
