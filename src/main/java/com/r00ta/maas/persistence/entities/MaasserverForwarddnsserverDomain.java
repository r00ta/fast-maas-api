package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maasserver_forwarddnsserver_domains")
public class MaasserverForwarddnsserverDomain {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "forwarddnsserver_id", nullable = false)
    private Long forwarddnsserverId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "domain_id", nullable = false)
    private MaasserverDomain domain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getForwarddnsserverId() {
        return forwarddnsserverId;
    }

    public void setForwarddnsserverId(Long forwarddnsserverId) {
        this.forwarddnsserverId = forwarddnsserverId;
    }

    public MaasserverDomain getDomain() {
        return domain;
    }

    public void setDomain(MaasserverDomain domain) {
        this.domain = domain;
    }

}