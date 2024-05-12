package com.studio41.agent.domain.entities;

public interface Message {

    String getRole();

    String getContent();

    void setContent(String content);

}