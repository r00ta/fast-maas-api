package com.r00ta.maas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "django_session")
public class DjangoSession {
    @Id
    @Size(max = 40)
    @Column(name = "session_key", nullable = false, length = 40)
    private String sessionKey;

    @NotNull
    @Column(name = "session_data", nullable = false, length = Integer.MAX_VALUE)
    private String sessionData;

    @NotNull
    @Column(name = "expire_date", nullable = false)
    private OffsetDateTime expireDate;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getSessionData() {
        return sessionData;
    }

    public void setSessionData(String sessionData) {
        this.sessionData = sessionData;
    }

    public OffsetDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(OffsetDateTime expireDate) {
        this.expireDate = expireDate;
    }

}