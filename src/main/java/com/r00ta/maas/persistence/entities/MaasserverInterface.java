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
@Table(name = "maasserver_interface")
public class MaasserverInterface {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 20)
    @NotNull
    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "mac_address", length = Integer.MAX_VALUE)
    private String macAddress;

    @NotNull
    @Column(name = "params", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> params;

    @Column(name = "tags")
    private List<String> tags;

    @NotNull
    @Column(name = "enabled", nullable = false)
    private Boolean enabled = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vlan_id")
    private MaasserverVlan vlan;

    @NotNull
    @Column(name = "acquired", nullable = false)
    private Boolean acquired = false;

    @NotNull
    @Column(name = "mdns_discovery_state", nullable = false)
    private Boolean mdnsDiscoveryState = false;

    @NotNull
    @Column(name = "neighbour_discovery_state", nullable = false)
    private Boolean neighbourDiscoveryState = false;

    @Size(max = 255)
    @Column(name = "firmware_version")
    private String firmwareVersion;

    @Size(max = 255)
    @Column(name = "product")
    private String product;

    @Size(max = 255)
    @Column(name = "vendor")
    private String vendor;

    @NotNull
    @Column(name = "interface_speed", nullable = false)
    private Integer interfaceSpeed;

    @NotNull
    @Column(name = "link_connected", nullable = false)
    private Boolean linkConnected = false;

    @NotNull
    @Column(name = "link_speed", nullable = false)
    private Integer linkSpeed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "numa_node_id")
    private MaasserverNumanode numaNode;

    @NotNull
    @Column(name = "sriov_max_vf", nullable = false)
    private Integer sriovMaxVf;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "node_config_id")
    private MaasserverNodeconfig nodeConfig;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public MaasserverVlan getVlan() {
        return vlan;
    }

    public void setVlan(MaasserverVlan vlan) {
        this.vlan = vlan;
    }

    public Boolean getAcquired() {
        return acquired;
    }

    public void setAcquired(Boolean acquired) {
        this.acquired = acquired;
    }

    public Boolean getMdnsDiscoveryState() {
        return mdnsDiscoveryState;
    }

    public void setMdnsDiscoveryState(Boolean mdnsDiscoveryState) {
        this.mdnsDiscoveryState = mdnsDiscoveryState;
    }

    public Boolean getNeighbourDiscoveryState() {
        return neighbourDiscoveryState;
    }

    public void setNeighbourDiscoveryState(Boolean neighbourDiscoveryState) {
        this.neighbourDiscoveryState = neighbourDiscoveryState;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Integer getInterfaceSpeed() {
        return interfaceSpeed;
    }

    public void setInterfaceSpeed(Integer interfaceSpeed) {
        this.interfaceSpeed = interfaceSpeed;
    }

    public Boolean getLinkConnected() {
        return linkConnected;
    }

    public void setLinkConnected(Boolean linkConnected) {
        this.linkConnected = linkConnected;
    }

    public Integer getLinkSpeed() {
        return linkSpeed;
    }

    public void setLinkSpeed(Integer linkSpeed) {
        this.linkSpeed = linkSpeed;
    }

    public MaasserverNumanode getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(MaasserverNumanode numaNode) {
        this.numaNode = numaNode;
    }

    public Integer getSriovMaxVf() {
        return sriovMaxVf;
    }

    public void setSriovMaxVf(Integer sriovMaxVf) {
        this.sriovMaxVf = sriovMaxVf;
    }

    public MaasserverNodeconfig getNodeConfig() {
        return nodeConfig;
    }

    public void setNodeConfig(MaasserverNodeconfig nodeConfig) {
        this.nodeConfig = nodeConfig;
    }

}