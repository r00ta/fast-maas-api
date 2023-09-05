package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "maasserver_scriptset")
public class MaasserverScriptset {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "last_ping")
    private OffsetDateTime lastPing;

    @NotNull
    @Column(name = "result_type", nullable = false)
    private Integer resultType;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "node_id", nullable = false)
    private MaasserverNode node;

    @Size(max = 10)
    @NotNull
    @Column(name = "power_state_before_transition", nullable = false, length = 10)
    private String powerStateBeforeTransition;

    @Column(name = "tags")
    private List<String> tags;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getLastPing() {
        return lastPing;
    }

    public void setLastPing(OffsetDateTime lastPing) {
        this.lastPing = lastPing;
    }

    public Integer getResultType() {
        return resultType;
    }

    public void setResultType(Integer resultType) {
        this.resultType = resultType;
    }

    public MaasserverNode getNode() {
        return node;
    }

    public void setNode(MaasserverNode node) {
        this.node = node;
    }

    public String getPowerStateBeforeTransition() {
        return powerStateBeforeTransition;
    }

    public void setPowerStateBeforeTransition(String powerStateBeforeTransition) {
        this.powerStateBeforeTransition = powerStateBeforeTransition;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

}