package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_userprofile")
public class MaasserverUserprofile {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private AuthUser user;

    @NotNull
    @Column(name = "completed_intro", nullable = false)
    private Boolean completedIntro = false;

    @Column(name = "auth_last_check")
    private OffsetDateTime authLastCheck;

    @NotNull
    @Column(name = "is_local", nullable = false)
    private Boolean isLocal = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuthUser getUser() {
        return user;
    }

    public void setUser(AuthUser user) {
        this.user = user;
    }

    public Boolean getCompletedIntro() {
        return completedIntro;
    }

    public void setCompletedIntro(Boolean completedIntro) {
        this.completedIntro = completedIntro;
    }

    public OffsetDateTime getAuthLastCheck() {
        return authLastCheck;
    }

    public void setAuthLastCheck(OffsetDateTime authLastCheck) {
        this.authLastCheck = authLastCheck;
    }

    public Boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

}