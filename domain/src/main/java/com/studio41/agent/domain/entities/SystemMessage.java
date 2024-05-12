package com.studio41.agent.domain.entities;

public class SystemMessage implements Message {
    private static final String ROLE = "system";
    private String role;
    private String content;

    public SystemMessage(String content) {
        this.role = ROLE;
        this.content = content;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}