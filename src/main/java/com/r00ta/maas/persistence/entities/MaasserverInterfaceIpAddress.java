package com.r00ta.maas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maasserver_interface_ip_addresses")
public class MaasserverInterfaceIpAddress {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "interface_id", nullable = false)
    private Long interfaceId;

    @NotNull
    @Column(name = "staticipaddress_id", nullable = false)
    private Long staticipaddressId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Long interfaceId) {
        this.interfaceId = interfaceId;
    }

    public Long getStaticipaddressId() {
        return staticipaddressId;
    }

    public void setStaticipaddressId(Long staticipaddressId) {
        this.staticipaddressId = staticipaddressId;
    }

}