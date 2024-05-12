package com.studio41.agent;

import java.util.List;

import com.studio41.agent.domain.entities.Message;
import com.studio41.agent.domain.entities.SystemMessage;
import com.studio41.agent.domain.entities.UserMessage;
import com.studio41.agent.infra.OpenAICompletion;
import com.studio41.agent.infra.OpenAICompletionRequestBody;
import com.studio41.agent.infra.OpenAICompletionResponse;
import com.studio41.agent.infra.OpenAICompletionResponse.Choice;

public class Main {
    public static void main(String[] args) {

        SystemMessage systemMessage = new SystemMessage("You are a coffee machine that can make espresso or ristretto only.");
        UserMessage userMessage = new UserMessage("Can I have a cappuccino?");

        List<Message> messages = List.of(systemMessage, userMessage);

        OpenAICompletionResponse response = OpenAICompletion.chatGPT(new OpenAICompletionRequestBody(
            "gpt-3.5-turbo",
            messages
        ));

        for (Choice choice : response.getChoices()) {
            System.out.println("Role: " + choice.getMessage().getRole() + ", Content: " + choice.getMessage().getContent());
        }
    }
}
