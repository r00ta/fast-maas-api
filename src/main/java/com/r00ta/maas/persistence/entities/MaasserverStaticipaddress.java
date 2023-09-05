package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.net.InetAddress;
import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_staticipaddress")
public class MaasserverStaticipaddress {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Column(name = "ip")
    private InetAddress ip;

    @NotNull
    @Column(name = "alloc_type", nullable = false)
    private Integer allocType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subnet_id")
    private MaasserverSubnet subnet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private AuthUser user;

    @NotNull
    @Column(name = "lease_time", nullable = false)
    private Integer leaseTime;

    @Column(name = "temp_expires_on")
    private OffsetDateTime tempExpiresOn;

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

    public InetAddress getIp() {
        return ip;
    }

    public void setIp(InetAddress ip) {
        this.ip = ip;
    }

    public Integer getAllocType() {
        return allocType;
    }

    public void setAllocType(Integer allocType) {
        this.allocType = allocType;
    }

    public MaasserverSubnet getSubnet() {
        return subnet;
    }

    public void setSubnet(MaasserverSubnet subnet) {
        this.subnet = subnet;
    }

    public AuthUser getUser() {
        return user;
    }

    public void setUser(AuthUser user) {
        this.user = user;
    }

    public Integer getLeaseTime() {
        return leaseTime;
    }

    public void setLeaseTime(Integer leaseTime) {
        this.leaseTime = leaseTime;
    }

    public OffsetDateTime getTempExpiresOn() {
        return tempExpiresOn;
    }

    public void setTempExpiresOn(OffsetDateTime tempExpiresOn) {
        this.tempExpiresOn = tempExpiresOn;
    }

}