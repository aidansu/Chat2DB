// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package ai.chat2db.server.web.api.controller.ai.azure.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * The configuration information for a chat completions request. Completions support a wide variety of tasks and
 * generate text that continues from or "completes" provided prompt data.
 */
@Data
public final class AzureChatCompletionsOptions {

    /*
     * The collection of context messages associated with this chat completions request.
     * Typical usage begins with a chat message for the System role that provides instructions for
     * the behavior of the assistant, followed by alternating messages between the User and
     * Assistant roles.
     */
    private List<AzureChatMessage> messages;

    ///*
    // * The maximum number of tokens to generate.
    // */
    ////@JsonProperty(value = "max_tokens")
    //private Integer maxTokens;
    //
    ///*
    // * The sampling temperature to use that controls the apparent creativity of generated completions.
    // * Higher values will make output more random while lower values will make results more focused
    // * and deterministic.
    // * It is not recommended to modify temperature and top_p for the same completions request as the
    // * interaction of these two settings is difficult to predict.
    // */
    ////@JsonProperty(value = "temperature")
    //private Double temperature;
    //
    ///*
    // * An alternative to sampling with temperature called nucleus sampling. This value causes the
    // * model to consider the results of tokens with the provided probability mass. As an example, a
    // * value of 0.15 will cause only the tokens comprising the top 15% of probability mass to be
    // * considered.
    // * It is not recommended to modify temperature and top_p for the same completions request as the
    // * interaction of these two settings is difficult to predict.
    // */
    ////@JsonProperty(value = "top_p")
    //private Double topP;
    //
    ///*
    // * A map between GPT token IDs and bias scores that influences the probability of specific tokens
    // * appearing in a completions response. Token IDs are computed via external tokenizer tools, while
    // * bias scores reside in the range of -100 to 100 with minimum and maximum values corresponding to
    // * a full ban or exclusive selection of a token, respectively. The exact behavior of a given bias
    // * score varies by model.
    // */
    ////@JsonProperty(value = "logit_bias")
    //private Map<String, Integer> logitBias;
    //
    ///*
    // * An identifier for the caller or end user of the operation. This may be used for tracking
    // * or rate-limiting purposes.
    // */
    ////@JsonProperty(value = "user")
    //private String user;
    //
    ///*
    // * The number of chat completions choices that should be generated for a chat completions
    // * response.
    // * Because this setting can generate many completions, it may quickly consume your token quota.
    // * Use carefully and ensure reasonable settings for max_tokens and stop.
    // */
    ////@JsonProperty(value = "n")
    //private Integer n;
    //
    ///*
    // * A collection of textual sequences that will end completions generation.
    // */
    ////@JsonProperty(value = "stop")
    //private List<String> stop;
    //
    ///*
    // * A value that influences the probability of generated tokens appearing based on their existing
    // * presence in generated text.
    // * Positive values will make tokens less likely to appear when they already exist and increase the
    // * model's likelihood to output new topics.
    // */
    ////@JsonProperty(value = "presence_penalty")
    //private Double presencePenalty;
    //
    ///*
    // * A value that influences the probability of generated tokens appearing based on their cumulative
    // * frequency in generated text.
    // * Positive values will make tokens less likely to appear as their frequency increases and
    // * decrease the likelihood of the model repeating the same statements verbatim.
    // */
    ////@JsonProperty(value = "frequency_penalty")
    //private Double frequencyPenalty;

    /*
     * A value indicating whether chat completions should be streamed for this request.
     */
    //@JsonProperty(value = "stream")
    private Boolean stream;
    //
    /*
     * The model name to provide as part of this completions request.
     * Not applicable to Azure OpenAI, where deployment information should be included in the Azure
     * resource URI that's connected to.
     */
    //@JsonProperty(value = "model")
    private String model;

    /**
     * Creates an instance of ChatCompletionsOptions class.
     *
     * @param messages the messages value to set.
     */
    @JsonCreator
    public AzureChatCompletionsOptions(@JsonProperty(value = "messages") List<AzureChatMessage> messages) {
        this.messages = messages;
    }
    //
    ///**
    // * Get the messages property: The collection of context messages associated with this chat completions request.
    // * Typical usage begins with a chat message for the System role that provides instructions for the behavior of the
    // * assistant, followed by alternating messages between the User and Assistant roles.
    // *
    // * @return the messages value.
    // */
    //public List<AzureChatMessage> getMessages() {
    //    return this.messages;
    //}
    //
    ///**
    // * Get the maxTokens property: The maximum number of tokens to generate.
    // *
    // * @return the maxTokens value.
    // */
    //public Integer getMaxTokens() {
    //    return this.maxTokens;
    //}
    //
    ///**
    // * Set the maxTokens property: The maximum number of tokens to generate.
    // *
    // * @param maxTokens the maxTokens value to set.
    // * @return the ChatCompletionsOptions object itself.
    // */
    //public AzureChatCompletionsOptions setMaxTokens(Integer maxTokens) {
    //    this.maxTokens = maxTokens;
    //    return this;
    //}
    //
    ///**
    // * Get the temperature property: The sampling temperature to use that controls the apparent creativity of generated
    // * completions. Higher values will make output more random while lower values will make results more focused and
    // * deterministic. It is not recommended to modify temperature and top_p for the same completions request as the
    // * interaction of these two settings is difficult to predict.
    // *
    // * @return the temperature value.
    // */
    //public Double getTemperature() {
    //    return this.temperature;
    //}
    //
    ///**
    // * Set the temperature property: The sampling temperature to use that controls the apparent creativity of generated
    // * completions. Higher values will make output more random while lower values will make results more focused and
    // * deterministic. It is not recommended to modify temperature and top_p for the same completions request as the
    // * interaction of these two settings is difficult to predict.
    // *
    // * @param temperature the temperature value to set.
    // * @return the ChatCompletionsOptions object itself.
    // */
    //public AzureChatCompletionsOptions setTemperature(Double temperature) {
    //    this.temperature = temperature;
    //    return this;
    //}
    //
    ///**
    // * Get the topP property: An alternative to sampling with temperature called nucleus sampling. This value causes the
    // * model to consider the results of tokens with the provided probability mass. As an example, a value of 0.15 will
    // * cause only the tokens comprising the top 15% of probability mass to be considered. It is not recommended to
    // * modify temperature and top_p for the same completions request as the interaction of these two settings is
    // * difficult to predict.
    // *
    // * @return the topP value.
    // */
    //public Double getTopP() {
    //    return this.topP;
    //}
    //
    ///**
    // * Set the topP property: An alternative to sampling with temperature called nucleus sampling. This value causes the
    // * model to consider the results of tokens with the provided probability mass. As an example, a value of 0.15 will
    // * cause only the tokens comprising the top 15% of probability mass to be considered. It is not recommended to
    // * modify temperature and top_p for the same completions request as the interaction of these two settings is
    // * difficult to predict.
    // *
    // * @param topP the topP value to set.
    // * @return the ChatCompletionsOptions object itself.
    // */
    //public AzureChatCompletionsOptions setTopP(Double topP) {
    //    this.topP = topP;
    //    return this;
    //}
    //
    ///**
    // * Get the logitBias property: A map between GPT token IDs and bias scores that influences the probability of
    // * specific tokens appearing in a completions response. Token IDs are computed via external tokenizer tools, while
    // * bias scores reside in the range of -100 to 100 with minimum and maximum values corresponding to a full ban or
    // * exclusive selection of a token, respectively. The exact behavior of a given bias score varies by model.
    // *
    // * @return the logitBias value.
    // */
    //public Map<String, Integer> getLogitBias() {
    //    return this.logitBias;
    //}
    //
    ///**
    // * Set the logitBias property: A map between GPT token IDs and bias scores that influences the probability of
    // * specific tokens appearing in a completions response. Token IDs are computed via external tokenizer tools, while
    // * bias scores reside in the range of -100 to 100 with minimum and maximum values corresponding to a full ban or
    // * exclusive selection of a token, respectively. The exact behavior of a given bias score varies by model.
    // *
    // * @param logitBias the logitBias value to set.
    // * @return the ChatCompletionsOptions object itself.
    // */
    //public AzureChatCompletionsOptions setLogitBias(Map<String, Integer> logitBias) {
    //    this.logitBias = logitBias;
    //    return this;
    //}
    //
    ///**
    // * Get the user property: An identifier for the caller or end user of the operation. This may be used for tracking
    // * or rate-limiting purposes.
    // *
    // * @return the user value.
    // */
    //public String getUser() {
    //    return this.user;
    //}
    //
    ///**
    // * Set the user property: An identifier for the caller or end user of the operation. This may be used for tracking
    // * or rate-limiting purposes.
    // *
    // * @param user the user value to set.
    // * @return the ChatCompletionsOptions object itself.
    // */
    //public AzureChatCompletionsOptions setUser(String user) {
    //    this.user = user;
    //    return this;
    //}
    //
    ///**
    // * Get the n property: The number of chat completions choices that should be generated for a chat completions
    // * response. Because this setting can generate many completions, it may quickly consume your token quota. Use
    // * carefully and ensure reasonable settings for max_tokens and stop.
    // *
    // * @return the n value.
    // */
    //public Integer getN() {
    //    return this.n;
    //}
    //
    ///**
    // * Set the n property: The number of chat completions choices that should be generated for a chat completions
    // * response. Because this setting can generate many completions, it may quickly consume your token quota. Use
    // * carefully and ensure reasonable settings for max_tokens and stop.
    // *
    // * @param n the n value to set.
    // * @return the ChatCompletionsOptions object itself.
    // */
    //public AzureChatCompletionsOptions setN(Integer n) {
    //    this.n = n;
    //    return this;
    //}
    //
    ///**
    // * Get the stop property: A collection of textual sequences that will end completions generation.
    // *
    // * @return the stop value.
    // */
    //public List<String> getStop() {
    //    return this.stop;
    //}
    //
    ///**
    // * Set the stop property: A collection of textual sequences that will end completions generation.
    // *
    // * @param stop the stop value to set.
    // * @return the ChatCompletionsOptions object itself.
    // */
    //public AzureChatCompletionsOptions setStop(List<String> stop) {
    //    this.stop = stop;
    //    return this;
    //}
    //
    ///**
    // * Get the presencePenalty property: A value that influences the probability of generated tokens appearing based on
    // * their existing presence in generated text. Positive values will make tokens less likely to appear when they
    // * already exist and increase the model's likelihood to output new topics.
    // *
    // * @return the presencePenalty value.
    // */
    //public Double getPresencePenalty() {
    //    return this.presencePenalty;
    //}
    //
    ///**
    // * Set the presencePenalty property: A value that influences the probability of generated tokens appearing based on
    // * their existing presence in generated text. Positive values will make tokens less likely to appear when they
    // * already exist and increase the model's likelihood to output new topics.
    // *
    // * @param presencePenalty the presencePenalty value to set.
    // * @return the ChatCompletionsOptions object itself.
    // */
    //public AzureChatCompletionsOptions setPresencePenalty(Double presencePenalty) {
    //    this.presencePenalty = presencePenalty;
    //    return this;
    //}
    //
    ///**
    // * Get the frequencyPenalty property: A value that influences the probability of generated tokens appearing based on
    // * their cumulative frequency in generated text. Positive values will make tokens less likely to appear as their
    // * frequency increases and decrease the likelihood of the model repeating the same statements verbatim.
    // *
    // * @return the frequencyPenalty value.
    // */
    //public Double getFrequencyPenalty() {
    //    return this.frequencyPenalty;
    //}
    //
    ///**
    // * Set the frequencyPenalty property: A value that influences the probability of generated tokens appearing based on
    // * their cumulative frequency in generated text. Positive values will make tokens less likely to appear as their
    // * frequency increases and decrease the likelihood of the model repeating the same statements verbatim.
    // *
    // * @param frequencyPenalty the frequencyPenalty value to set.
    // * @return the ChatCompletionsOptions object itself.
    // */
    //public AzureChatCompletionsOptions setFrequencyPenalty(Double frequencyPenalty) {
    //    this.frequencyPenalty = frequencyPenalty;
    //    return this;
    //}

    /**
     * Get the stream property: A value indicating whether chat completions should be streamed for this request.
     *
     * @return the stream value.
     */
    public Boolean isStream() {
        return this.stream;
    }

    /**
     * Set the stream property: A value indicating whether chat completions should be streamed for this request.
     *
     * @param stream the stream value to set.
     * @return the ChatCompletionsOptions object itself.
     */
    public AzureChatCompletionsOptions setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    /**
     * Get the model property: The model name to provide as part of this completions request. Not applicable to Azure
     * OpenAI, where deployment information should be included in the Azure resource URI that's connected to.
     *
     * @return the model value.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model name to provide as part of this completions request. Not applicable to Azure
     * OpenAI, where deployment information should be included in the Azure resource URI that's connected to.
     *
     * @param model the model value to set.
     * @return the ChatCompletionsOptions object itself.
     */
    public AzureChatCompletionsOptions setModel(String model) {
        this.model = model;
        return this;
    }
}