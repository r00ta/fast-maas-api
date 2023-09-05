package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_nodedevice")
public class MaasserverNodedevice {
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
    @Column(name = "bus", nullable = false)
    private Integer bus;

    @NotNull
    @Column(name = "hardware_type", nullable = false)
    private Integer hardwareType;

    @Size(max = 4)
    @NotNull
    @Column(name = "vendor_id", nullable = false, length = 4)
    private String vendorId;

    @Size(max = 4)
    @NotNull
    @Column(name = "product_id", nullable = false, length = 4)
    private String productId;

    @Size(max = 256)
    @NotNull
    @Column(name = "vendor_name", nullable = false, length = 256)
    private String vendorName;

    @Size(max = 256)
    @NotNull
    @Column(name = "product_name", nullable = false, length = 256)
    private String productName;

    @Size(max = 256)
    @NotNull
    @Column(name = "commissioning_driver", nullable = false, length = 256)
    private String commissioningDriver;

    @NotNull
    @Column(name = "bus_number", nullable = false)
    private Integer busNumber;

    @NotNull
    @Column(name = "device_number", nullable = false)
    private Integer deviceNumber;

    @Size(max = 64)
    @Column(name = "pci_address", length = 64)
    private String pciAddress;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numa_node_id", nullable = false)
    private MaasserverNumanode numaNode;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "physical_blockdevice_id")
    private MaasserverPhysicalblockdevice physicalBlockdevice;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "physical_interface_id")
    private MaasserverInterface physicalInterface;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "node_config_id", nullable = false)
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

    public Integer getBus() {
        return bus;
    }

    public void setBus(Integer bus) {
        this.bus = bus;
    }

    public Integer getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(Integer hardwareType) {
        this.hardwareType = hardwareType;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCommissioningDriver() {
        return commissioningDriver;
    }

    public void setCommissioningDriver(String commissioningDriver) {
        this.commissioningDriver = commissioningDriver;
    }

    public Integer getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Integer busNumber) {
        this.busNumber = busNumber;
    }

    public Integer getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(Integer deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public String getPciAddress() {
        return pciAddress;
    }

    public void setPciAddress(String pciAddress) {
        this.pciAddress = pciAddress;
    }

    public MaasserverNumanode getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(MaasserverNumanode numaNode) {
        this.numaNode = numaNode;
    }

    public MaasserverPhysicalblockdevice getPhysicalBlockdevice() {
        return physicalBlockdevice;
    }

    public void setPhysicalBlockdevice(MaasserverPhysicalblockdevice physicalBlockdevice) {
        this.physicalBlockdevice = physicalBlockdevice;
    }

    public MaasserverInterface getPhysicalInterface() {
        return physicalInterface;
    }

    public void setPhysicalInterface(MaasserverInterface physicalInterface) {
        this.physicalInterface = physicalInterface;
    }

    public MaasserverNodeconfig getNodeConfig() {
        return nodeConfig;
    }

    public void setNodeConfig(MaasserverNodeconfig nodeConfig) {
        this.nodeConfig = nodeConfig;
    }

}