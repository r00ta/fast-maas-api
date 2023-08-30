package maas.r00ta.com.persistence.models;


import jakarta.persistence.*;
import maas.r00ta.com.api.models.responses.MachineSummaryResponse;

import java.math.BigInteger;
import java.util.Date;

@NamedQueries({
        @NamedQuery(name = "Machine.findAll",
                query = "from Machine"),
})
@Entity
@Table(name = "maasserver_node")
public class Machine {

    @Id
    @Column(name="id")
    private BigInteger id;
    @Column(name="created")
    private Date created;
    @Column(name="updated")
    private Date updated;

    @Column(name="system_id")
    private String systemId;

    @Column(name="hostname")
    private String hostname;

    @Column(name="status")
    private Integer status;
    @Column(name="bios_boot_method")
    private String biosBootMethod;
    @Column(name="osystem")
    private String osystem;
    @Column(name="distro_series")
    private String distroSeries;
    @Column(name="architecture")
    private String architecture;
    @Column(name="min_hwe_kernel")
    private String minHweKernel;
    @Column(name="hwe_kernel")
    private String hweKernel;

    @Column(name="agent_name")
    private String agentName;
    @Column(name="error_description")
    private String errorDescription;
    @Column(name="cpu_count")
    private Integer cpuCount;
    @Column(name="memory")
    private Integer memory;
    @Column(name="swap_size")
    private BigInteger swapSize;
    @Column(name="power_state")
    private String powerState;
    @Column(name="power_state_updated")
    private String powerStateUpdated;

    @Column(name="error")
    private String error;

    @Column(name="netboot")
    private Boolean netboot;

    @Column(name="license_key")
    private String licenseKey;

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

    public MachineSummaryResponse toSummaryResponse(){
        MachineSummaryResponse response = new MachineSummaryResponse();
        response.setId(getId());
        response.setArchitecture(getArchitecture());
        response.setOsystem(getOsystem());
        response.setFqdn("");
        response.setDistroSeries(getDistroSeries());
        response.setSystemId(getSystemId());
        response.setHostname(getHostname());
        response.setHref("");
        return response;
    }

}

//            Column("boot_cluster_ip", INET, nullable=True),
//            Column("enable_ssh", Boolean, nullable=False),
//            Column("skip_networking", Boolean, nullable=False),
//            Column("skip_storage", Boolean, nullable=False),
//            Column("boot_interface_id", Integer, nullable=True),
//            Column("gateway_link_ipv4_id", Integer, nullable=True),
//            Column("gateway_link_ipv6_id", Integer, nullable=True),
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
//            Column("node_type", Integer, nullable=False),
//            Column(
//            "domain_id", Integer, ForeignKey("maasserver_domain.id"), nullable=True
//            ),
//            Column("dns_process_id", Integer, nullable=True),
//            Column(
//            "bmc_id", BigInteger, ForeignKey("maasserver_bmc.id"), nullable=True
//            ),
//            Column("address_ttl", Integer, nullable=True),
//            Column("status_expires", DateTime(timezone=True), nullable=True),
//            Column("power_state_queried", DateTime(timezone=True), nullable=True),
//            Column("url", String(255), nullable=False),
//            Column("managing_process_id", Integer, nullable=True),
//            Column("last_image_sync", DateTime(timezone=True), nullable=True),
//            Column("previous_status", Integer, nullable=False),
//            Column("default_user", String(32), nullable=False),
//            Column("cpu_speed", Integer, nullable=False),
//            Column("current_commissioning_script_set_id", Integer, nullable=True),
//            Column("current_installation_script_set_id", Integer, nullable=True),
//            Column("current_testing_script_set_id", Integer, nullable=True),
//            Column("install_rackd", Boolean, nullable=False),
//            Column("locked", Boolean, nullable=False),
//            Column(
//            "pool_id",
//            Integer,
//            ForeignKey("maasserver_resourcepool.id"),
//            nullable=True,
//            ),
//            Column("instance_power_parameters", JSONB, nullable=False),
//            Column("install_kvm", Boolean, nullable=False),
//            Column("hardware_uuid", String(36), nullable=True),
//            Column("ephemeral_deploy", Boolean, nullable=False),
//            Column("description", Text, nullable=False),
//            Column("dynamic", Boolean, nullable=False),
//            Column("register_vmhost", Boolean, nullable=False),
//            Column("last_applied_storage_layout", String(50), nullable=False),
//            Column(
//            "current_config_id",
//            BigInteger,
//            ForeignKey("maasserver_nodeconfig.id"),
//            nullable=True,
//            ),
//            Column("enable_hw_sync", Boolean, nullable=False),
//            Column("last_sync", DateTime(timezone=True), nullable=True),
//            Column("sync_interval", Integer, nullable=True),