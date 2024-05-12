package com.studio41.agent.infra;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.studio41.agent.domain.entities.AssistantMessage;

public class OpenAICompletionResponse {
    private String id;
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    private String object;
    public String getObject() {
        return object;
    }


    public void setObject(String object) {
        this.object = object;
    }


    private long created;
    public long getCreated() {
        return created;
    }


    public void setCreated(long created) {
        this.created = created;
    }


    private String model;
    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    private String system_fingerprint;
    public String getSystem_fingerprint() {
        return system_fingerprint;
    }


    public void setSystem_fingerprint(String system_fingerprint) {
        this.system_fingerprint = system_fingerprint;
    }


    private List<Choice> choices;
    public List<Choice> getChoices() {
        return choices;
    }


    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }


    private Usage usage;

    public Usage getUsage() {
        return usage;
    }


    public void setUsage(Usage usage) {
        this.usage = usage;
    }


    public static class Choice {
        private int index;
        public int getIndex() {
            return index;
        }
        public void setIndex(int index) {
            this.index = index;
        }

        private AssistantMessage message;
        public AssistantMessage getMessage() {
            return message;
        }
        public void setMessage(AssistantMessage message) {
            this.message = message;
        }
        private String logprobs; 
        public String getLogprobs() {
            return logprobs;
        }
        public void setLogprobs(String logprobs) {
            this.logprobs = logprobs;
        }
        private String finish_reason;
        public String getFinish_reason() {
            return finish_reason;
        }
        public void setFinish_reason(String finish_reason) {
            this.finish_reason = finish_reason;
        }

    }


    public static class Usage {
        private int prompt_tokens;
        public int getPrompt_tokens() {
            return prompt_tokens;
        }
        public void setPrompt_tokens(int prompt_tokens) {
            this.prompt_tokens = prompt_tokens;
        }
        private int completion_tokens;
        public int getCompletion_tokens() {
            return completion_tokens;
        }
        public void setCompletion_tokens(int completion_tokens) {
            this.completion_tokens = completion_tokens;
        }
        private int total_tokens;
        public int getTotal_tokens() {
            return total_tokens;
        }
        public void setTotal_tokens(int total_tokens) {
            this.total_tokens = total_tokens;
        }

    }
}
