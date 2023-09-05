package com.r00ta.maas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "piston3_nonce")
public class Piston3Nonce {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 18)
    @NotNull
    @Column(name = "token_key", nullable = false, length = 18)
    private String tokenKey;

    @Size(max = 18)
    @NotNull
    @Column(name = "consumer_key", nullable = false, length = 18)
    private String consumerKey;

    @Size(max = 255)
    @NotNull
    @Column(name = "key", nullable = false)
    private String key;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}