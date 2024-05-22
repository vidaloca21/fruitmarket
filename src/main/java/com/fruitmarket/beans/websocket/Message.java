package com.fruitmarket.beans.websocket;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    private String roomName;
    private String sendType;
    private String userId;
    private boolean sendToMe;
    private String message;
}
