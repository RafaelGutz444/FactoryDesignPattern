package com.company;

public class Main {

    public static void main(String[] args) {
        ChatFactory chatfactory = new ChatFactory();

        // gets message response for a follow
        UserActions user1 = chatfactory.getResponse("follow");

        user1.respond();

        // gets message response for a subscribe
        UserActions user2 = chatfactory.getResponse("subscribe");

        user2.respond();

        // gets message response for a host
        UserActions user3 = chatfactory.getResponse("host");

        user3.respond();

        // gets message response for a donation
        UserActions user4 = chatfactory.getResponse("donate");

        user4.respond();

    }
}
