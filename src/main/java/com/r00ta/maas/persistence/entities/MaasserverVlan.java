package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.net.InetAddress;
import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_vlan")
public class MaasserverVlan {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 256)
    @Column(name = "name", length = 256)
    private String name;

    @NotNull
    @Column(name = "vid", nullable = false)
    private Integer vid;

    @NotNull
    @Column(name = "mtu", nullable = false)
    private Integer mtu;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fabric_id", nullable = false)
    private MaasserverFabric fabric;

    @NotNull
    @Column(name = "dhcp_on", nullable = false)
    private Boolean dhcpOn = false;

    @Column(name = "primary_rack_id")
    private Long primaryRackId;

    @Column(name = "secondary_rack_id")
    private Long secondaryRackId;

    @Column(name = "external_dhcp")
    private InetAddress externalDhcp;

    @NotNull
    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "relay_vlan_id")
    private MaasserverVlan relayVlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "space_id")
    private MaasserverSpace space;

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

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public MaasserverFabric getFabric() {
        return fabric;
    }

    public void setFabric(MaasserverFabric fabric) {
        this.fabric = fabric;
    }

    public Boolean getDhcpOn() {
        return dhcpOn;
    }

    public void setDhcpOn(Boolean dhcpOn) {
        this.dhcpOn = dhcpOn;
    }

    public Long getPrimaryRackId() {
        return primaryRackId;
    }

    public void setPrimaryRackId(Long primaryRackId) {
        this.primaryRackId = primaryRackId;
    }

    public Long getSecondaryRackId() {
        return secondaryRackId;
    }

    public void setSecondaryRackId(Long secondaryRackId) {
        this.secondaryRackId = secondaryRackId;
    }

    public InetAddress getExternalDhcp() {
        return externalDhcp;
    }

    public void setExternalDhcp(InetAddress externalDhcp) {
        this.externalDhcp = externalDhcp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MaasserverVlan getRelayVlan() {
        return relayVlan;
    }

    public void setRelayVlan(MaasserverVlan relayVlan) {
        this.relayVlan = relayVlan;
    }

    public MaasserverSpace getSpace() {
        return space;
    }

    public void setSpace(MaasserverSpace space) {
        this.space = space;
    }

}