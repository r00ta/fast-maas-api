package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_dnsdata")
public class MaasserverDnsdatum {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 8)
    @NotNull
    @Column(name = "rrtype", nullable = false, length = 8)
    private String rrtype;

    @NotNull
    @Column(name = "rrdata", nullable = false, length = Integer.MAX_VALUE)
    private String rrdata;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dnsresource_id", nullable = false)
    private MaasserverDnsresource dnsresource;

    @Column(name = "ttl")
    private Integer ttl;

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

    public String getRrtype() {
        return rrtype;
    }

    public void setRrtype(String rrtype) {
        this.rrtype = rrtype;
    }

    public String getRrdata() {
        return rrdata;
    }

    public void setRrdata(String rrdata) {
        this.rrdata = rrdata;
    }

    public MaasserverDnsresource getDnsresource() {
        return dnsresource;
    }

    public void setDnsresource(MaasserverDnsresource dnsresource) {
        this.dnsresource = dnsresource;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

}