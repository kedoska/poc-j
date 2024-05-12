package com.studio41.agent.domain.entities;

public class AssistantMessage implements Message {
    private String role;
    private String content;

    // No-argument constructor
    public AssistantMessage() {}

    // Getter and setter methods
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}