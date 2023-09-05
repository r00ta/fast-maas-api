package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_regionrackrpcconnection")
public class MaasserverRegionrackrpcconnection {
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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "endpoint_id", nullable = false)
    private MaasserverRegioncontrollerprocessendpoint endpoint;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rack_controller_id", nullable = false)
    private MaasserverNode rackController;

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

    public MaasserverRegioncontrollerprocessendpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(MaasserverRegioncontrollerprocessendpoint endpoint) {
        this.endpoint = endpoint;
    }

    public MaasserverNode getRackController() {
        return rackController;
    }

    public void setRackController(MaasserverNode rackController) {
        this.rackController = rackController;
    }

}