package com.r00ta.maas.persistence.entities;


import com.r00ta.maas.models.MachineStatus;
import com.r00ta.maas.persistence.dto.MachineSummary;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Date;

@SqlResultSetMapping(
        name = "MachineSummaryMapping",
        classes = @ConstructorResult(
                targetClass = MachineSummary.class,
                columns = {
                        @ColumnResult(name = "id", type = BigInteger.class),
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
})
@Entity
@Table(name = "maasserver_node")
public class Machine {

    @Id
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "created")
    private Date created;
    @Column(name = "updated")
    private Date updated;

    @Column(name = "system_id")
    private String systemId;

    @Column(name = "hostname")
    private String hostname;

    @Column(name = "status")
    private Integer status;
    @Column(name = "bios_boot_method")
    private String biosBootMethod;
    @Column(name = "osystem")
    private String osystem;
    @Column(name = "distro_series")
    private String distroSeries;
    @Column(name = "architecture")
    private String architecture;
    @Column(name = "min_hwe_kernel")
    private String minHweKernel;
    @Column(name = "hwe_kernel")
    private String hweKernel;

    @Column(name = "agent_name")
    private String agentName;
    @Column(name = "error_description")
    private String errorDescription;
    @Column(name = "cpu_count")
    private Integer cpuCount;
    @Column(name = "memory")
    private Integer memory;
    @Column(name = "swap_size")
    private BigInteger swapSize;
    @Column(name = "power_state")
    private String powerState;
    @Column(name = "power_state_updated")
    private String powerStateUpdated;

    @Column(name = "error")
    private String error;

    @Column(name = "netboot")
    private Boolean netboot;

    @Column(name = "license_key")
    private String licenseKey;

    // INET
    //            Column("boot_cluster_ip", INET, nullable=True),

    @Column(name = "enable_ssh")
    private Boolean enableSSH;

    @Column(name = "skip_networking")
    private Boolean skipNetworking;

    @Column(name = "skip_storage")
    private Boolean skipStorage;

//            Column("boot_interface_id", Integer, nullable=True),

    @Column(name = "gateway_link_ipv4_id")
    private Boolean gatewayLinkIpv4Id;

    @Column(name = "gateway_link_ipv6_id")
    private Boolean gatewayLinkIpv6Id;

//            Column("owner_id", Integer, ForeignKey("auth_user.id"), nullable=True),
//            Column(
    //            "parent_id",
    //            BigInteger,
    //            ForeignKey("maasserver_node.id"),
    //            nullable=True,
//            ),

//            Column(
//            "zone_id", BigInteger, ForeignKey("maasserver_zone.id"), nullable=False
//            ),
//            Column(
//            "boot_disk_id",
//            Integer,
//            ForeignKey("maasserver_physicalblockdevice.blockdevice_ptr_id"),
//            nullable=True,
//            ),

    @Column(name = "node_type")
    private Integer nodeType;

//            Column(
//            "domain_id", Integer, ForeignKey("maasserver_domain.id"), nullable=True
//            ),

    @Column(name = "dns_process_id")
    private Boolean dnsProcessId;

//            Column(
//            "bmc_id", BigInteger, ForeignKey("maasserver_bmc.id"), nullable=True
//            ),

    @Column(name = "address_ttl")
    private Integer addressTTL;

    @Column(name = "status_expires")
    private java.sql.Date statusExpires;

    @Column(name = "power_state_queried")
    private java.sql.Date powerStateQueried;

    @Column(name = "url")
    private String url;

    @Column(name = "managing_process_id")
    private Integer managingProcessId;

    @Column(name = "last_image_sync")
    private java.sql.Date lastImageSync;

    @Column(name = "previous_status")
    private Integer previousStatus;

    @Column(name = "default_user")
    private String defaultUser;

    @Column(name = "cpu_speed")
    private Integer cpuSpeed;


//            Column("current_commissioning_script_set_id", Integer, nullable=True),
//            Column("current_installation_script_set_id", Integer, nullable=True),
//            Column("current_testing_script_set_id", Integer, nullable=True),

    @Column(name = "install_rackd")
    private Boolean installRackd;

    @Column(name = "locked")
    private Boolean locked;

//            Column(
//            "pool_id",
//            Integer,
//            ForeignKey("maasserver_resourcepool.id"),
//            nullable=True,
//            ),
//            Column("instance_power_parameters", JSONB, nullable=False),

    @Column(name = "install_kvm")
    private Boolean installKvm;

    @Column(name = "hardware_uuid")
    private String hardwareUUID;

    @Column(name = "ephemeral_deploy")
    private Boolean ephemeralDeploy;

    @Column(name = "description")
    private String description;

    @Column(name = "dynamic")
    private Boolean dynamic;

    @Column(name = "register_vmhost")
    private Boolean registerVMHost;

    @Column(name = "last_applied_storage_layout")
    private String lastAppliedStorageLayout;

//            Column(
//            "current_config_id",
//            BigInteger,
//            ForeignKey("maasserver_nodeconfig.id"),
//            nullable=True,
//            ),

    @Column(name = "enable_hw_sync")
    private Boolean enableHWSync;

    @Column(name = "last_sync")
    private java.sql.Date lastSync;

    @Column(name = "sync_interval")
    private Integer syncInterval;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
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

    public BigInteger getSwapSize() {
        return swapSize;
    }

    public void setSwapSize(BigInteger swapSize) {
        this.swapSize = swapSize;
    }

    public String getPowerState() {
        return powerState;
    }

    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public String getPowerStateUpdated() {
        return powerStateUpdated;
    }

    public void setPowerStateUpdated(String powerStateUpdated) {
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

    public Boolean getEnableSSH() {
        return enableSSH;
    }

    public void setEnableSSH(Boolean enableSSH) {
        this.enableSSH = enableSSH;
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

    public Boolean getGatewayLinkIpv4Id() {
        return gatewayLinkIpv4Id;
    }

    public void setGatewayLinkIpv4Id(Boolean gatewayLinkIpv4Id) {
        this.gatewayLinkIpv4Id = gatewayLinkIpv4Id;
    }

    public Boolean getGatewayLinkIpv6Id() {
        return gatewayLinkIpv6Id;
    }

    public void setGatewayLinkIpv6Id(Boolean gatewayLinkIpv6Id) {
        this.gatewayLinkIpv6Id = gatewayLinkIpv6Id;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public Boolean getDnsProcessId() {
        return dnsProcessId;
    }

    public void setDnsProcessId(Boolean dnsProcessId) {
        this.dnsProcessId = dnsProcessId;
    }

    public Integer getAddressTTL() {
        return addressTTL;
    }

    public void setAddressTTL(Integer addressTTL) {
        this.addressTTL = addressTTL;
    }

    public java.sql.Date getStatusExpires() {
        return statusExpires;
    }

    public void setStatusExpires(java.sql.Date statusExpires) {
        this.statusExpires = statusExpires;
    }

    public java.sql.Date getPowerStateQueried() {
        return powerStateQueried;
    }

    public void setPowerStateQueried(java.sql.Date powerStateQueried) {
        this.powerStateQueried = powerStateQueried;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getManagingProcessId() {
        return managingProcessId;
    }

    public void setManagingProcessId(Integer managingProcessId) {
        this.managingProcessId = managingProcessId;
    }

    public java.sql.Date getLastImageSync() {
        return lastImageSync;
    }

    public void setLastImageSync(java.sql.Date lastImageSync) {
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

    public Boolean getInstallKvm() {
        return installKvm;
    }

    public void setInstallKvm(Boolean installKvm) {
        this.installKvm = installKvm;
    }

    public String getHardwareUUID() {
        return hardwareUUID;
    }

    public void setHardwareUUID(String hardwareUUID) {
        this.hardwareUUID = hardwareUUID;
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

    public Boolean getRegisterVMHost() {
        return registerVMHost;
    }

    public void setRegisterVMHost(Boolean registerVMHost) {
        this.registerVMHost = registerVMHost;
    }

    public String getLastAppliedStorageLayout() {
        return lastAppliedStorageLayout;
    }

    public void setLastAppliedStorageLayout(String lastAppliedStorageLayout) {
        this.lastAppliedStorageLayout = lastAppliedStorageLayout;
    }

    public Boolean getEnableHWSync() {
        return enableHWSync;
    }

    public void setEnableHWSync(Boolean enableHWSync) {
        this.enableHWSync = enableHWSync;
    }

    public java.sql.Date getLastSync() {
        return lastSync;
    }

    public void setLastSync(java.sql.Date lastSync) {
        this.lastSync = lastSync;
    }

    public Integer getSyncInterval() {
        return syncInterval;
    }

    public void setSyncInterval(Integer syncInterval) {
        this.syncInterval = syncInterval;
    }

}

