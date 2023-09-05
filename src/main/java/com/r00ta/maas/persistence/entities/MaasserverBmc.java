package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "maasserver_bmc")
public class MaasserverBmc {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 10)
    @NotNull
    @Column(name = "power_type", nullable = false, length = 10)
    private String powerType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ip_address_id")
    private MaasserverStaticipaddress ipAddress;

    @Column(name = "architectures")
    private List<String> architectures;

    @NotNull
    @Column(name = "bmc_type", nullable = false)
    private Integer bmcType;

    @Column(name = "capabilities")
    private List<String> capabilities;

    @NotNull
    @Column(name = "cores", nullable = false)
    private Integer cores;

    @NotNull
    @Column(name = "cpu_speed", nullable = false)
    private Integer cpuSpeed;

    @NotNull
    @Column(name = "local_storage", nullable = false)
    private Long localStorage;

    @NotNull
    @Column(name = "memory", nullable = false)
    private Integer memory;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pool_id")
    private MaasserverResourcepool pool;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id", nullable = false)
    private MaasserverZone zone;

    @Column(name = "tags")
    private List<String> tags;

    @NotNull
    @Column(name = "cpu_over_commit_ratio", nullable = false)
    private Double cpuOverCommitRatio;

    @NotNull
    @Column(name = "memory_over_commit_ratio", nullable = false)
    private Double memoryOverCommitRatio;

    @Column(name = "default_storage_pool_id")
    private Long defaultStoragePoolId;

    @NotNull
    @Column(name = "power_parameters", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> powerParameters;

    @Size(max = 32)
    @Column(name = "default_macvlan_mode", length = 32)
    private String defaultMacvlanMode;

    @NotNull
    @Column(name = "version", nullable = false, length = Integer.MAX_VALUE)
    private String version;

    @Column(name = "created_with_cert_expiration_days")
    private Integer createdWithCertExpirationDays;

    @Column(name = "created_with_maas_generated_cert")
    private Boolean createdWithMaasGeneratedCert;

    @Column(name = "created_with_trust_password")
    private Boolean createdWithTrustPassword;

    @Column(name = "created_by_commissioning")
    private Boolean createdByCommissioning;

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

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public MaasserverStaticipaddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(MaasserverStaticipaddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public List<String> getArchitectures() {
        return architectures;
    }

    public void setArchitectures(List<String> architectures) {
        this.architectures = architectures;
    }

    public Integer getBmcType() {
        return bmcType;
    }

    public void setBmcType(Integer bmcType) {
        this.bmcType = bmcType;
    }

    public List<String> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
    }

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public Integer getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(Integer cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public Long getLocalStorage() {
        return localStorage;
    }

    public void setLocalStorage(Long localStorage) {
        this.localStorage = localStorage;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaasserverResourcepool getPool() {
        return pool;
    }

    public void setPool(MaasserverResourcepool pool) {
        this.pool = pool;
    }

    public MaasserverZone getZone() {
        return zone;
    }

    public void setZone(MaasserverZone zone) {
        this.zone = zone;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Double getCpuOverCommitRatio() {
        return cpuOverCommitRatio;
    }

    public void setCpuOverCommitRatio(Double cpuOverCommitRatio) {
        this.cpuOverCommitRatio = cpuOverCommitRatio;
    }

    public Double getMemoryOverCommitRatio() {
        return memoryOverCommitRatio;
    }

    public void setMemoryOverCommitRatio(Double memoryOverCommitRatio) {
        this.memoryOverCommitRatio = memoryOverCommitRatio;
    }

    public Long getDefaultStoragePoolId() {
        return defaultStoragePoolId;
    }

    public void setDefaultStoragePoolId(Long defaultStoragePoolId) {
        this.defaultStoragePoolId = defaultStoragePoolId;
    }

    public Map<String, Object> getPowerParameters() {
        return powerParameters;
    }

    public void setPowerParameters(Map<String, Object> powerParameters) {
        this.powerParameters = powerParameters;
    }

    public String getDefaultMacvlanMode() {
        return defaultMacvlanMode;
    }

    public void setDefaultMacvlanMode(String defaultMacvlanMode) {
        this.defaultMacvlanMode = defaultMacvlanMode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getCreatedWithCertExpirationDays() {
        return createdWithCertExpirationDays;
    }

    public void setCreatedWithCertExpirationDays(Integer createdWithCertExpirationDays) {
        this.createdWithCertExpirationDays = createdWithCertExpirationDays;
    }

    public Boolean getCreatedWithMaasGeneratedCert() {
        return createdWithMaasGeneratedCert;
    }

    public void setCreatedWithMaasGeneratedCert(Boolean createdWithMaasGeneratedCert) {
        this.createdWithMaasGeneratedCert = createdWithMaasGeneratedCert;
    }

    public Boolean getCreatedWithTrustPassword() {
        return createdWithTrustPassword;
    }

    public void setCreatedWithTrustPassword(Boolean createdWithTrustPassword) {
        this.createdWithTrustPassword = createdWithTrustPassword;
    }

    public Boolean getCreatedByCommissioning() {
        return createdByCommissioning;
    }

    public void setCreatedByCommissioning(Boolean createdByCommissioning) {
        this.createdByCommissioning = createdByCommissioning;
    }

}