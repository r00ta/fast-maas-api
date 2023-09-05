package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_template")
public class MaasserverTemplate {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 64)
    @NotNull
    @Column(name = "filename", nullable = false, length = 64)
    private String filename;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "default_version_id", nullable = false)
    private MaasserverVersionedtextfile defaultVersion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "version_id")
    private MaasserverVersionedtextfile version;

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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public MaasserverVersionedtextfile getDefaultVersion() {
        return defaultVersion;
    }

    public void setDefaultVersion(MaasserverVersionedtextfile defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public MaasserverVersionedtextfile getVersion() {
        return version;
    }

    public void setVersion(MaasserverVersionedtextfile version) {
        this.version = version;
    }

}