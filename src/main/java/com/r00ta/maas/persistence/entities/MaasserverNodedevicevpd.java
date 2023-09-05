package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maasserver_nodedevicevpd")
public class MaasserverNodedevicevpd {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "key", nullable = false, length = Integer.MAX_VALUE)
    private String key;

    @NotNull
    @Column(name = "value", nullable = false, length = Integer.MAX_VALUE)
    private String value;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "node_device_id", nullable = false)
    private MaasserverNodedevice nodeDevice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MaasserverNodedevice getNodeDevice() {
        return nodeDevice;
    }

    public void setNodeDevice(MaasserverNodedevice nodeDevice) {
        this.nodeDevice = nodeDevice;
    }

}