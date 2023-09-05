package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_filesystemgroup")
public class MaasserverFilesystemgroup {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @NotNull
    @Column(name = "uuid", nullable = false, length = Integer.MAX_VALUE)
    private String uuid;

    @Size(max = 20)
    @NotNull
    @Column(name = "group_type", nullable = false, length = 20)
    private String groupType;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 255)
    @Column(name = "create_params")
    private String createParams;

    @Size(max = 20)
    @Column(name = "cache_mode", length = 20)
    private String cacheMode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cache_set_id")
    private MaasserverCacheset cacheSet;

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateParams() {
        return createParams;
    }

    public void setCreateParams(String createParams) {
        this.createParams = createParams;
    }

    public String getCacheMode() {
        return cacheMode;
    }

    public void setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
    }

    public MaasserverCacheset getCacheSet() {
        return cacheSet;
    }

    public void setCacheSet(MaasserverCacheset cacheSet) {
        this.cacheSet = cacheSet;
    }

}