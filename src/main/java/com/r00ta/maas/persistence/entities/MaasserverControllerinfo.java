package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_controllerinfo")
public class MaasserverControllerinfo {
    @Id
    @Column(name = "node_id", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "node_id", nullable = false)
    private MaasserverNode maasserverNode;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 255)
    @NotNull
    @Column(name = "version", nullable = false)
    private String version;

    @Size(max = 255)
    @NotNull
    @Column(name = "install_type", nullable = false)
    private String installType;

    @Size(max = 255)
    @NotNull
    @Column(name = "snap_cohort", nullable = false)
    private String snapCohort;

    @Size(max = 255)
    @NotNull
    @Column(name = "snap_revision", nullable = false)
    private String snapRevision;

    @Size(max = 255)
    @NotNull
    @Column(name = "snap_update_revision", nullable = false)
    private String snapUpdateRevision;

    @Size(max = 255)
    @NotNull
    @Column(name = "update_origin", nullable = false)
    private String updateOrigin;

    @Size(max = 255)
    @NotNull
    @Column(name = "update_version", nullable = false)
    private String updateVersion;

    @Column(name = "update_first_reported")
    private OffsetDateTime updateFirstReported;

    @NotNull
    @Column(name = "vault_configured", nullable = false)
    private Boolean vaultConfigured = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MaasserverNode getMaasserverNode() {
        return maasserverNode;
    }

    public void setMaasserverNode(MaasserverNode maasserverNode) {
        this.maasserverNode = maasserverNode;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getInstallType() {
        return installType;
    }

    public void setInstallType(String installType) {
        this.installType = installType;
    }

    public String getSnapCohort() {
        return snapCohort;
    }

    public void setSnapCohort(String snapCohort) {
        this.snapCohort = snapCohort;
    }

    public String getSnapRevision() {
        return snapRevision;
    }

    public void setSnapRevision(String snapRevision) {
        this.snapRevision = snapRevision;
    }

    public String getSnapUpdateRevision() {
        return snapUpdateRevision;
    }

    public void setSnapUpdateRevision(String snapUpdateRevision) {
        this.snapUpdateRevision = snapUpdateRevision;
    }

    public String getUpdateOrigin() {
        return updateOrigin;
    }

    public void setUpdateOrigin(String updateOrigin) {
        this.updateOrigin = updateOrigin;
    }

    public String getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion;
    }

    public OffsetDateTime getUpdateFirstReported() {
        return updateFirstReported;
    }

    public void setUpdateFirstReported(OffsetDateTime updateFirstReported) {
        this.updateFirstReported = updateFirstReported;
    }

    public Boolean getVaultConfigured() {
        return vaultConfigured;
    }

    public void setVaultConfigured(Boolean vaultConfigured) {
        this.vaultConfigured = vaultConfigured;
    }

}