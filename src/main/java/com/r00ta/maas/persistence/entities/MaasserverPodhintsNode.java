package com.r00ta.maas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maasserver_podhints_nodes")
public class MaasserverPodhintsNode {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "podhints_id", nullable = false)
    private Long podhintsId;

    @NotNull
    @Column(name = "node_id", nullable = false)
    private Long nodeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPodhintsId() {
        return podhintsId;
    }

    public void setPodhintsId(Long podhintsId) {
        this.podhintsId = podhintsId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

}