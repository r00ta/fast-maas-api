package com.r00ta.maas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maasserver_vaultsecret")
public class MaasserverVaultsecret {
    @Id
    @Column(name = "path", nullable = false, length = Integer.MAX_VALUE)
    private String path;

    @NotNull
    @Column(name = "deleted", nullable = false)
    private Boolean deleted = false;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

}