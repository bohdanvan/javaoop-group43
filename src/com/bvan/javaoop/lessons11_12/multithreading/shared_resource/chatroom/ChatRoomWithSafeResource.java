package com.bvan.javaoop.lessons11_12.multithreading.shared_resource.chatroom;

/**
 * @author bvanchuhov
 */
public class ChatRoomWithSafeResource implements ChatRoom {

    private final StringBuffer room = new StringBuffer(); // safe resource

    @Override
    public void send(String message) {
        room.append(message + "\n"); // ok
    }

    @Override
    public String getContent() {
        return room.toString(); // ok
    }
}
