package com.r00ta.maas.persistence.entities;

import com.r00ta.maas.models.MachineStatus;
import com.r00ta.maas.persistence.dto.MachineSummary;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.net.InetAddress;
import java.time.OffsetDateTime;
import java.util.Map;

@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "MachineSummaryMapping",
                classes = @ConstructorResult(
                        targetClass = MachineSummary.class,
                        columns = {
                                @ColumnResult(name = "id", type = Long.class),
                                @ColumnResult(name = "system_id", type = String.class),
                                @ColumnResult(name = "hostname", type = String.class),
                                @ColumnResult(name = "owner", type = String.class),
                                @ColumnResult(name = "fqdn", type = String.class),
                                @ColumnResult(name = "architecture", type = String.class),
                                @ColumnResult(name = "osystem", type = String.class),
                                @ColumnResult(name = "distro_series", type = String.class),
                                @ColumnResult(name = "status", type = MachineStatus.class),
                                @ColumnResult(name = "power_state", type = String.class),
                        }
                )
        ),
}
)
@NamedNativeQueries({
        @NamedNativeQuery(name = "Machine.findAllSummary",
                query = "select " +
                        "id, system_id, hostname, hostname as owner, hostname as fqdn, architecture, " +
                        "osystem, distro_series, status, power_state " +
                        "from maasserver_node",
                resultSetMapping = "MachineSummaryMapping"
        ),
        @NamedNativeQuery(name = "Machine.countAll",
                query = "select count (*) from maasserver_node",
                resultClass = Long.class
        ),
        @NamedNativeQuery(name = "Machine.getDetails",
                query = "select " +
                        "id, system_id, hostname, hostname as owner, hostname as fqdn, architecture, " +
                        "osystem, distro_series, status, power_state " +
                        "from maasserver_node " +
                        "where system_id=:systemId"
                ,
                resultSetMapping = "MachineSummaryMapping"
        ),
})
@Entity
@Table(name = "maasserver_node")
public class MaasserverNode {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 41)
    @NotNull
    @Column(name = "system_id", nullable = false, length = 41)
    private String systemId;

    @Size(max = 255)
    @NotNull
    @Column(name = "hostname", nullable = false)
    private String hostname;

    @NotNull
    @Column(name = "status", nullable = false)
    private Integer status;

    @Size(max = 31)
    @Column(name = "bios_boot_method", length = 31)
    private String biosBootMethod;

    @Size(max = 255)
    @NotNull
    @Column(name = "osystem", nullable = false)
    private String osystem;

    @Size(max = 255)
    @NotNull
    @Column(name = "distro_series", nullable = false)
    private String distroSeries;

    @Size(max = 31)
    @Column(name = "architecture", length = 31)
    private String architecture;

    @Size(max = 31)
    @Column(name = "min_hwe_kernel", length = 31)
    private String minHweKernel;

    @Size(max = 31)
    @Column(name = "hwe_kernel", length = 31)
    private String hweKernel;

    @Size(max = 255)
    @Column(name = "agent_name")
    private String agentName;

    @NotNull
    @Column(name = "error_description", nullable = false, length = Integer.MAX_VALUE)
    private String errorDescription;

    @NotNull
    @Column(name = "cpu_count", nullable = false)
    private Integer cpuCount;

    @NotNull
    @Column(name = "memory", nullable = false)
    private Integer memory;

    @Column(name = "swap_size")
    private Long swapSize;

    @Size(max = 10)
    @NotNull
    @Column(name = "power_state", nullable = false, length = 10)
    private String powerState;

    @Column(name = "power_state_updated")
    private OffsetDateTime powerStateUpdated;

    @Size(max = 255)
    @NotNull
    @Column(name = "error", nullable = false)
    private String error;

    @NotNull
    @Column(name = "netboot", nullable = false)
    private Boolean netboot = false;

    @Size(max = 30)
    @Column(name = "license_key", length = 30)
    private String licenseKey;

    @Column(name = "boot_cluster_ip")
    private InetAddress bootClusterIp;

    @NotNull
    @Column(name = "enable_ssh", nullable = false)
    private Boolean enableSsh = false;

    @NotNull
    @Column(name = "skip_networking", nullable = false)
    private Boolean skipNetworking = false;

    @NotNull
    @Column(name = "skip_storage", nullable = false)
    private Boolean skipStorage = false;

    @Column(name = "boot_interface_id")
    private Long bootInterfaceId;

    @Column(name = "gateway_link_ipv4_id")
    private Long gatewayLinkIpv4Id;

    @Column(name = "gateway_link_ipv6_id")
    private Long gatewayLinkIpv6Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private AuthUser owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private MaasserverNode parent;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id", nullable = false)
    private MaasserverZone zone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boot_disk_id")
    private MaasserverPhysicalblockdevice bootDisk;

    @NotNull
    @Column(name = "node_type", nullable = false)
    private Integer nodeType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "domain_id")
    private MaasserverDomain domain;

    @Column(name = "dns_process_id")
    private Long dnsProcessId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bmc_id")
    private MaasserverBmc bmc;

    @Column(name = "address_ttl")
    private Integer addressTtl;

    @Column(name = "status_expires")
    private OffsetDateTime statusExpires;

    @Column(name = "power_state_queried")
    private OffsetDateTime powerStateQueried;

    @Size(max = 255)
    @NotNull
    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "managing_process_id")
    private Long managingProcessId;

    @Column(name = "last_image_sync")
    private OffsetDateTime lastImageSync;

    @NotNull
    @Column(name = "previous_status", nullable = false)
    private Integer previousStatus;

    @Size(max = 32)
    @NotNull
    @Column(name = "default_user", nullable = false, length = 32)
    private String defaultUser;

    @NotNull
    @Column(name = "cpu_speed", nullable = false)
    private Integer cpuSpeed;

    @Column(name = "current_commissioning_script_set_id")
    private Long currentCommissioningScriptSetId;

    @Column(name = "current_installation_script_set_id")
    private Long currentInstallationScriptSetId;

    @Column(name = "current_testing_script_set_id")
    private Long currentTestingScriptSetId;

    @NotNull
    @Column(name = "install_rackd", nullable = false)
    private Boolean installRackd = false;

    @NotNull
    @Column(name = "locked", nullable = false)
    private Boolean locked = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pool_id")
    private MaasserverResourcepool pool;

    @NotNull
    @Column(name = "instance_power_parameters", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> instancePowerParameters;

    @NotNull
    @Column(name = "install_kvm", nullable = false)
    private Boolean installKvm = false;

    @Size(max = 36)
    @Column(name = "hardware_uuid", length = 36)
    private String hardwareUuid;

    @NotNull
    @Column(name = "ephemeral_deploy", nullable = false)
    private Boolean ephemeralDeploy = false;

    @NotNull
    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    private String description;

    @NotNull
    @Column(name = "dynamic", nullable = false)
    private Boolean dynamic = false;

    @NotNull
    @Column(name = "register_vmhost", nullable = false)
    private Boolean registerVmhost = false;

    @Size(max = 50)
    @NotNull
    @Column(name = "last_applied_storage_layout", nullable = false, length = 50)
    private String lastAppliedStorageLayout;

    @Column(name = "current_config_id")
    private Long currentConfigId;

    @NotNull
    @Column(name = "enable_hw_sync", nullable = false)
    private Boolean enableHwSync = false;

    @Column(name = "last_sync")
    private OffsetDateTime lastSync;

    @Column(name = "sync_interval")
    private Integer syncInterval;

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

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBiosBootMethod() {
        return biosBootMethod;
    }

    public void setBiosBootMethod(String biosBootMethod) {
        this.biosBootMethod = biosBootMethod;
    }

    public String getOsystem() {
        return osystem;
    }

    public void setOsystem(String osystem) {
        this.osystem = osystem;
    }

    public String getDistroSeries() {
        return distroSeries;
    }

    public void setDistroSeries(String distroSeries) {
        this.distroSeries = distroSeries;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getMinHweKernel() {
        return minHweKernel;
    }

    public void setMinHweKernel(String minHweKernel) {
        this.minHweKernel = minHweKernel;
    }

    public String getHweKernel() {
        return hweKernel;
    }

    public void setHweKernel(String hweKernel) {
        this.hweKernel = hweKernel;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Long getSwapSize() {
        return swapSize;
    }

    public void setSwapSize(Long swapSize) {
        this.swapSize = swapSize;
    }

    public String getPowerState() {
        return powerState;
    }

    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public OffsetDateTime getPowerStateUpdated() {
        return powerStateUpdated;
    }

    public void setPowerStateUpdated(OffsetDateTime powerStateUpdated) {
        this.powerStateUpdated = powerStateUpdated;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Boolean getNetboot() {
        return netboot;
    }

    public void setNetboot(Boolean netboot) {
        this.netboot = netboot;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public InetAddress getBootClusterIp() {
        return bootClusterIp;
    }

    public void setBootClusterIp(InetAddress bootClusterIp) {
        this.bootClusterIp = bootClusterIp;
    }

    public Boolean getEnableSsh() {
        return enableSsh;
    }

    public void setEnableSsh(Boolean enableSsh) {
        this.enableSsh = enableSsh;
    }

    public Boolean getSkipNetworking() {
        return skipNetworking;
    }

    public void setSkipNetworking(Boolean skipNetworking) {
        this.skipNetworking = skipNetworking;
    }

    public Boolean getSkipStorage() {
        return skipStorage;
    }

    public void setSkipStorage(Boolean skipStorage) {
        this.skipStorage = skipStorage;
    }

    public Long getBootInterfaceId() {
        return bootInterfaceId;
    }

    public void setBootInterfaceId(Long bootInterfaceId) {
        this.bootInterfaceId = bootInterfaceId;
    }

    public Long getGatewayLinkIpv4Id() {
        return gatewayLinkIpv4Id;
    }

    public void setGatewayLinkIpv4Id(Long gatewayLinkIpv4Id) {
        this.gatewayLinkIpv4Id = gatewayLinkIpv4Id;
    }

    public Long getGatewayLinkIpv6Id() {
        return gatewayLinkIpv6Id;
    }

    public void setGatewayLinkIpv6Id(Long gatewayLinkIpv6Id) {
        this.gatewayLinkIpv6Id = gatewayLinkIpv6Id;
    }

    public AuthUser getOwner() {
        return owner;
    }

    public void setOwner(AuthUser owner) {
        this.owner = owner;
    }

    public MaasserverNode getParent() {
        return parent;
    }

    public void setParent(MaasserverNode parent) {
        this.parent = parent;
    }

    public MaasserverZone getZone() {
        return zone;
    }

    public void setZone(MaasserverZone zone) {
        this.zone = zone;
    }

    public MaasserverPhysicalblockdevice getBootDisk() {
        return bootDisk;
    }

    public void setBootDisk(MaasserverPhysicalblockdevice bootDisk) {
        this.bootDisk = bootDisk;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public MaasserverDomain getDomain() {
        return domain;
    }

    public void setDomain(MaasserverDomain domain) {
        this.domain = domain;
    }

    public Long getDnsProcessId() {
        return dnsProcessId;
    }

    public void setDnsProcessId(Long dnsProcessId) {
        this.dnsProcessId = dnsProcessId;
    }

    public MaasserverBmc getBmc() {
        return bmc;
    }

    public void setBmc(MaasserverBmc bmc) {
        this.bmc = bmc;
    }

    public Integer getAddressTtl() {
        return addressTtl;
    }

    public void setAddressTtl(Integer addressTtl) {
        this.addressTtl = addressTtl;
    }

    public OffsetDateTime getStatusExpires() {
        return statusExpires;
    }

    public void setStatusExpires(OffsetDateTime statusExpires) {
        this.statusExpires = statusExpires;
    }

    public OffsetDateTime getPowerStateQueried() {
        return powerStateQueried;
    }

    public void setPowerStateQueried(OffsetDateTime powerStateQueried) {
        this.powerStateQueried = powerStateQueried;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getManagingProcessId() {
        return managingProcessId;
    }

    public void setManagingProcessId(Long managingProcessId) {
        this.managingProcessId = managingProcessId;
    }

    public OffsetDateTime getLastImageSync() {
        return lastImageSync;
    }

    public void setLastImageSync(OffsetDateTime lastImageSync) {
        this.lastImageSync = lastImageSync;
    }

    public Integer getPreviousStatus() {
        return previousStatus;
    }

    public void setPreviousStatus(Integer previousStatus) {
        this.previousStatus = previousStatus;
    }

    public String getDefaultUser() {
        return defaultUser;
    }

    public void setDefaultUser(String defaultUser) {
        this.defaultUser = defaultUser;
    }

    public Integer getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(Integer cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public Long getCurrentCommissioningScriptSetId() {
        return currentCommissioningScriptSetId;
    }

    public void setCurrentCommissioningScriptSetId(Long currentCommissioningScriptSetId) {
        this.currentCommissioningScriptSetId = currentCommissioningScriptSetId;
    }

    public Long getCurrentInstallationScriptSetId() {
        return currentInstallationScriptSetId;
    }

    public void setCurrentInstallationScriptSetId(Long currentInstallationScriptSetId) {
        this.currentInstallationScriptSetId = currentInstallationScriptSetId;
    }

    public Long getCurrentTestingScriptSetId() {
        return currentTestingScriptSetId;
    }

    public void setCurrentTestingScriptSetId(Long currentTestingScriptSetId) {
        this.currentTestingScriptSetId = currentTestingScriptSetId;
    }

    public Boolean getInstallRackd() {
        return installRackd;
    }

    public void setInstallRackd(Boolean installRackd) {
        this.installRackd = installRackd;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public MaasserverResourcepool getPool() {
        return pool;
    }

    public void setPool(MaasserverResourcepool pool) {
        this.pool = pool;
    }

    public Map<String, Object> getInstancePowerParameters() {
        return instancePowerParameters;
    }

    public void setInstancePowerParameters(Map<String, Object> instancePowerParameters) {
        this.instancePowerParameters = instancePowerParameters;
    }

    public Boolean getInstallKvm() {
        return installKvm;
    }

    public void setInstallKvm(Boolean installKvm) {
        this.installKvm = installKvm;
    }

    public String getHardwareUuid() {
        return hardwareUuid;
    }

    public void setHardwareUuid(String hardwareUuid) {
        this.hardwareUuid = hardwareUuid;
    }

    public Boolean getEphemeralDeploy() {
        return ephemeralDeploy;
    }

    public void setEphemeralDeploy(Boolean ephemeralDeploy) {
        this.ephemeralDeploy = ephemeralDeploy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDynamic() {
        return dynamic;
    }

    public void setDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
    }

    public Boolean getRegisterVmhost() {
        return registerVmhost;
    }

    public void setRegisterVmhost(Boolean registerVmhost) {
        this.registerVmhost = registerVmhost;
    }

    public String getLastAppliedStorageLayout() {
        return lastAppliedStorageLayout;
    }

    public void setLastAppliedStorageLayout(String lastAppliedStorageLayout) {
        this.lastAppliedStorageLayout = lastAppliedStorageLayout;
    }

    public Long getCurrentConfigId() {
        return currentConfigId;
    }

    public void setCurrentConfigId(Long currentConfigId) {
        this.currentConfigId = currentConfigId;
    }

    public Boolean getEnableHwSync() {
        return enableHwSync;
    }

    public void setEnableHwSync(Boolean enableHwSync) {
        this.enableHwSync = enableHwSync;
    }

    public OffsetDateTime getLastSync() {
        return lastSync;
    }

    public void setLastSync(OffsetDateTime lastSync) {
        this.lastSync = lastSync;
    }

    public Integer getSyncInterval() {
        return syncInterval;
    }

    public void setSyncInterval(Integer syncInterval) {
        this.syncInterval = syncInterval;
    }

}