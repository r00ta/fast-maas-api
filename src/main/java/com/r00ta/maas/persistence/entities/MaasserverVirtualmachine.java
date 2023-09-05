package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "maasserver_virtualmachine")
public class MaasserverVirtualmachine {
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
    @Column(name = "identifier", nullable = false, length = Integer.MAX_VALUE)
    private String identifier;

    @NotNull
    @Column(name = "pinned_cores", nullable = false)
    private List<Integer> pinnedCores;

    @NotNull
    @Column(name = "unpinned_cores", nullable = false)
    private Integer unpinnedCores;

    @NotNull
    @Column(name = "memory", nullable = false)
    private Integer memory;

    @NotNull
    @Column(name = "hugepages_backed", nullable = false)
    private Boolean hugepagesBacked = false;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bmc_id", nullable = false)
    private MaasserverBmc bmc;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "machine_id")
    private MaasserverNode machine;

    @NotNull
    @Column(name = "project", nullable = false, length = Integer.MAX_VALUE)
    private String project;

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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<Integer> getPinnedCores() {
        return pinnedCores;
    }

    public void setPinnedCores(List<Integer> pinnedCores) {
        this.pinnedCores = pinnedCores;
    }

    public Integer getUnpinnedCores() {
        return unpinnedCores;
    }

    public void setUnpinnedCores(Integer unpinnedCores) {
        this.unpinnedCores = unpinnedCores;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Boolean getHugepagesBacked() {
        return hugepagesBacked;
    }

    public void setHugepagesBacked(Boolean hugepagesBacked) {
        this.hugepagesBacked = hugepagesBacked;
    }

    public MaasserverBmc getBmc() {
        return bmc;
    }

    public void setBmc(MaasserverBmc bmc) {
        this.bmc = bmc;
    }

    public MaasserverNode getMachine() {
        return machine;
    }

    public void setMachine(MaasserverNode machine) {
        this.machine = machine;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

}