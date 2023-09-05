package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_dhcpsnippet")
public class MaasserverDhcpsnippet {
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
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    private String description;

    @NotNull
    @Column(name = "enabled", nullable = false)
    private Boolean enabled = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "node_id")
    private MaasserverNode node;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subnet_id")
    private MaasserverSubnet subnet;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "value_id", nullable = false)
    private MaasserverVersionedtextfile value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iprange_id")
    private MaasserverIprange iprange;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public MaasserverNode getNode() {
        return node;
    }

    public void setNode(MaasserverNode node) {
        this.node = node;
    }

    public MaasserverSubnet getSubnet() {
        return subnet;
    }

    public void setSubnet(MaasserverSubnet subnet) {
        this.subnet = subnet;
    }

    public MaasserverVersionedtextfile getValue() {
        return value;
    }

    public void setValue(MaasserverVersionedtextfile value) {
        this.value = value;
    }

    public MaasserverIprange getIprange() {
        return iprange;
    }

    public void setIprange(MaasserverIprange iprange) {
        this.iprange = iprange;
    }

}