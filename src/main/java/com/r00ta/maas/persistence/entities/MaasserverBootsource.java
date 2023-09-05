package com.r00ta.maas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_bootsource")
public class MaasserverBootsource {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 200)
    @NotNull
    @Column(name = "url", nullable = false, length = 200)
    private String url;

    @Size(max = 4096)
    @NotNull
    @Column(name = "keyring_filename", nullable = false, length = 4096)
    private String keyringFilename;

    @NotNull
    @Column(name = "keyring_data", nullable = false)
    private byte[] keyringData;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKeyringFilename() {
        return keyringFilename;
    }

    public void setKeyringFilename(String keyringFilename) {
        this.keyringFilename = keyringFilename;
    }

    public byte[] getKeyringData() {
        return keyringData;
    }

    public void setKeyringData(byte[] keyringData) {
        this.keyringData = keyringData;
    }

}