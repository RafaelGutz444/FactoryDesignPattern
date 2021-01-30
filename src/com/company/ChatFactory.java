package com.company;

public class ChatFactory {
    // Use getResponse method to get appropriate object of type Message
    public UserActions getResponse(String MessageType){
        if(MessageType == null){
            return null;
        }

        if(MessageType.equalsIgnoreCase("follow")){
            return new follow();

        }
        else if(MessageType.equalsIgnoreCase(("subscribe"))){
            return new subscribe();

        }
        else if(MessageType.equalsIgnoreCase("host")){
            return new host();

        }
        else if(MessageType.equalsIgnoreCase("donate")){
            return new donate();

        }
        return null;
    }
}
