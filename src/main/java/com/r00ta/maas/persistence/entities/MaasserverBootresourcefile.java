package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.Map;

@Entity
@Table(name = "maasserver_bootresourcefile")
public class MaasserverBootresourcefile {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 255)
    @NotNull
    @Column(name = "filename", nullable = false)
    private String filename;

    @Size(max = 20)
    @NotNull
    @Column(name = "filetype", nullable = false, length = 20)
    private String filetype;

    @NotNull
    @Column(name = "extra", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> extra;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "largefile_id", nullable = false)
    private MaasserverLargefile largefile;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "resource_set_id", nullable = false)
    private MaasserverBootresourceset resourceSet;

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

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    public MaasserverLargefile getLargefile() {
        return largefile;
    }

    public void setLargefile(MaasserverLargefile largefile) {
        this.largefile = largefile;
    }

    public MaasserverBootresourceset getResourceSet() {
        return resourceSet;
    }

    public void setResourceSet(MaasserverBootresourceset resourceSet) {
        this.resourceSet = resourceSet;
    }

}