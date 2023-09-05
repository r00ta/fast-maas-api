package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.net.InetAddress;
import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_iprange")
public class MaasserverIprange {
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
    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @NotNull
    @Column(name = "start_ip", nullable = false)
    private InetAddress startIp;

    @NotNull
    @Column(name = "end_ip", nullable = false)
    private InetAddress endIp;

    @Size(max = 255)
    @Column(name = "comment")
    private String comment;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subnet_id", nullable = false)
    private MaasserverSubnet subnet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private AuthUser user;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InetAddress getStartIp() {
        return startIp;
    }

    public void setStartIp(InetAddress startIp) {
        this.startIp = startIp;
    }

    public InetAddress getEndIp() {
        return endIp;
    }

    public void setEndIp(InetAddress endIp) {
        this.endIp = endIp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

}