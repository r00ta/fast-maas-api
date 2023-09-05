package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "maasserver_bootsourceselection")
public class MaasserverBootsourceselection {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 20)
    @NotNull
    @Column(name = "os", nullable = false, length = 20)
    private String os;

    @Size(max = 20)
    @NotNull
    @Column(name = "release", nullable = false, length = 20)
    private String release;

    @Column(name = "arches")
    private List<String> arches;

    @Column(name = "subarches")
    private List<String> subarches;

    @Column(name = "labels")
    private List<String> labels;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "boot_source_id", nullable = false)
    private MaasserverBootsource bootSource;

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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public List<String> getArches() {
        return arches;
    }

    public void setArches(List<String> arches) {
        this.arches = arches;
    }

    public List<String> getSubarches() {
        return subarches;
    }

    public void setSubarches(List<String> subarches) {
        this.subarches = subarches;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public MaasserverBootsource getBootSource() {
        return bootSource;
    }

    public void setBootSource(MaasserverBootsource bootSource) {
        this.bootSource = bootSource;
    }

}