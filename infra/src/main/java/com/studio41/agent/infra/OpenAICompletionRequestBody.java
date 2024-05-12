package com.studio41.agent.infra;

import java.util.List;

import com.studio41.agent.domain.entities.Message;

public class OpenAICompletionRequestBody {
        private String model;
    private List<Message> messages;

    public OpenAICompletionRequestBody(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }

    // getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
