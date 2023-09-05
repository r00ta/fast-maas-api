package com.r00ta.maas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maasserver_dnsresource_ip_addresses")
public class MaasserverDnsresourceIpAddress {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "dnsresource_id", nullable = false)
    private Long dnsresourceId;

    @NotNull
    @Column(name = "staticipaddress_id", nullable = false)
    private Long staticipaddressId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDnsresourceId() {
        return dnsresourceId;
    }

    public void setDnsresourceId(Long dnsresourceId) {
        this.dnsresourceId = dnsresourceId;
    }

    public Long getStaticipaddressId() {
        return staticipaddressId;
    }

    public void setStaticipaddressId(Long staticipaddressId) {
        this.staticipaddressId = staticipaddressId;
    }

}