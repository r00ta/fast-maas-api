package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_bmcroutablerackcontrollerrelationship")
public class MaasserverBmcroutablerackcontrollerrelationship {
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
    @Column(name = "routable", nullable = false)
    private Boolean routable = false;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bmc_id", nullable = false)
    private MaasserverBmc bmc;

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

    public Boolean getRoutable() {
        return routable;
    }

    public void setRoutable(Boolean routable) {
        this.routable = routable;
    }

    public MaasserverBmc getBmc() {
        return bmc;
    }

    public void setBmc(MaasserverBmc bmc) {
        this.bmc = bmc;
    }

    public MaasserverNode getRackController() {
        return rackController;
    }

    public void setRackController(MaasserverNode rackController) {
        this.rackController = rackController;
    }

}