package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "piston3_token")
public class Piston3Token {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 18)
    @NotNull
    @Column(name = "key", nullable = false, length = 18)
    private String key;

    @Size(max = 32)
    @NotNull
    @Column(name = "secret", nullable = false, length = 32)
    private String secret;

    @Size(max = 10)
    @NotNull
    @Column(name = "verifier", nullable = false, length = 10)
    private String verifier;

    @NotNull
    @Column(name = "token_type", nullable = false)
    private Integer tokenType;

    @NotNull
    @Column(name = "\"timestamp\"", nullable = false)
    private Integer timestamp;

    @NotNull
    @Column(name = "is_approved", nullable = false)
    private Boolean isApproved = false;

    @Size(max = 255)
    @Column(name = "callback")
    private String callback;

    @NotNull
    @Column(name = "callback_confirmed", nullable = false)
    private Boolean callbackConfirmed = false;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "consumer_id", nullable = false)
    private Piston3Consumer consumer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private AuthUser user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier;
    }

    public Integer getTokenType() {
        return tokenType;
    }

    public void setTokenType(Integer tokenType) {
        this.tokenType = tokenType;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public Boolean getCallbackConfirmed() {
        return callbackConfirmed;
    }

    public void setCallbackConfirmed(Boolean callbackConfirmed) {
        this.callbackConfirmed = callbackConfirmed;
    }

    public Piston3Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Piston3Consumer consumer) {
        this.consumer = consumer;
    }

    public AuthUser getUser() {
        return user;
    }

    public void setUser(AuthUser user) {
        this.user = user;
    }

}