package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.Map;

@Entity
@Table(name = "maasserver_notification")
public class MaasserverNotification {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 40)
    @Column(name = "ident", length = 40)
    private String ident;

    @NotNull
    @Column(name = "users", nullable = false)
    private Boolean users = false;

    @NotNull
    @Column(name = "admins", nullable = false)
    private Boolean admins = false;

    @NotNull
    @Column(name = "message", nullable = false, length = Integer.MAX_VALUE)
    private String message;

    @NotNull
    @Column(name = "context", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> context;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private AuthUser user;

    @Size(max = 10)
    @NotNull
    @Column(name = "category", nullable = false, length = 10)
    private String category;

    @NotNull
    @Column(name = "dismissable", nullable = false)
    private Boolean dismissable = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public OffsetDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public Boolean getUsers() {
        return users;
    }

    public void setUsers(Boolean users) {
        this.users = users;
    }

    public Boolean getAdmins() {
        return admins;
    }

    public void setAdmins(Boolean admins) {
        this.admins = admins;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getContext() {
        return context;
    }

    public void setContext(Map<String, Object> context) {
        this.context = context;
    }

    public AuthUser getUser() {
        return user;
    }

    public void setUser(AuthUser user) {
        this.user = user;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getDismissable() {
        return dismissable;
    }

    public void setDismissable(Boolean dismissable) {
        this.dismissable = dismissable;
    }

}