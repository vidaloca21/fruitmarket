package com.fruitmarket.beans.websocket;

import org.springframework.web.socket.WebSocketSession;

public class ChatUser {
    private WebSocketSession session;
    private String userId;

    public ChatUser(WebSocketSession session, String userId) {
        this.session = session;
        this.userId = userId;
    }

    public WebSocketSession getSession() {
        return session;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object obj) {
        WebSocketSession otherSession = (WebSocketSession) obj;
        return this.session.getId().equals(otherSession.getId());
    }
}
