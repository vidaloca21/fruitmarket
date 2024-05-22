package com.fruitmarket.beans.websocket;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WebSocketHandler extends TextWebSocketHandler {
    private ChatRoom chatRoom;
    private Gson gson;

    public WebSocketHandler() {
        chatRoom = new ChatRoom();
        gson = new Gson();
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        Message receivedMessage = gson.fromJson(message.getPayload(), Message.class);
        String sendType = receivedMessage.getSendType().toLowerCase();
        if (sendType.equals(ChatType.ENTER)) {
            chatRoom.enter(session, receivedMessage);
            chatRoom.sendAll(session, receivedMessage);
        } else if (sendType.equals(ChatType.ALL)) {
            chatRoom.sendAll(session, receivedMessage);

            receivedMessage.setSendToMe(true);
            chatRoom.sendToMe(session, receivedMessage);
        } else if (sendType.equals(ChatType.LEAVE)) {
            chatRoom.leave(session);
            chatRoom.sendAll(session, receivedMessage);
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        chatRoom.leave(session);
    }
}
