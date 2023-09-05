package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "maasserver_physicalblockdevice")
public class MaasserverPhysicalblockdevice {
    @Id
    @Column(name = "blockdevice_ptr_id", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "blockdevice_ptr_id", nullable = false)
    private MaasserverBlockdevice maasserverBlockdevice;

    @Size(max = 255)
    @NotNull
    @Column(name = "model", nullable = false)
    private String model;

    @Size(max = 255)
    @NotNull
    @Column(name = "serial", nullable = false)
    private String serial;

    @Size(max = 255)
    @Column(name = "firmware_version")
    private String firmwareVersion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numa_node_id", nullable = false)
    private MaasserverNumanode numaNode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MaasserverBlockdevice getMaasserverBlockdevice() {
        return maasserverBlockdevice;
    }

    public void setMaasserverBlockdevice(MaasserverBlockdevice maasserverBlockdevice) {
        this.maasserverBlockdevice = maasserverBlockdevice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public MaasserverNumanode getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(MaasserverNumanode numaNode) {
        this.numaNode = numaNode;
    }

}