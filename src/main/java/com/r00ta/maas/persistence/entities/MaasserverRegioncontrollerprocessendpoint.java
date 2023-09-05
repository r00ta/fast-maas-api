package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.net.InetAddress;
import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_regioncontrollerprocessendpoint")
public class MaasserverRegioncontrollerprocessendpoint {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @NotNull
    @Column(name = "address", nullable = false)
    private InetAddress address;

    @NotNull
    @Column(name = "port", nullable = false)
    private Integer port;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "process_id", nullable = false)
    private MaasserverRegioncontrollerprocess process;

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

    public InetAddress getAddress() {
        return address;
    }

    public void setAddress(InetAddress address) {
        this.address = address;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public MaasserverRegioncontrollerprocess getProcess() {
        return process;
    }

    public void setProcess(MaasserverRegioncontrollerprocess process) {
        this.process = process;
    }

}