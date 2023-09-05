package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maasserver_nodeuserdata")
public class MaasserverNodeuserdatum {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "data", nullable = false, length = Integer.MAX_VALUE)
    private String data;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "node_id", nullable = false)
    private MaasserverNode node;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MaasserverNode getNode() {
        return node;
    }

    public void setNode(MaasserverNode node) {
        this.node = node;
    }

}