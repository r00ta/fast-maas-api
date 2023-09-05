package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_virtualmachinedisk")
public class MaasserverVirtualmachinedisk {
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

    @NotNull
    @Column(name = "size", nullable = false)
    private Long size;

    @Column(name = "backing_pool_id")
    private Long backingPoolId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "block_device_id")
    private MaasserverBlockdevice blockDevice;

    @NotNull
    @Column(name = "vm_id", nullable = false)
    private Long vmId;

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

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getBackingPoolId() {
        return backingPoolId;
    }

    public void setBackingPoolId(Long backingPoolId) {
        this.backingPoolId = backingPoolId;
    }

    public MaasserverBlockdevice getBlockDevice() {
        return blockDevice;
    }

    public void setBlockDevice(MaasserverBlockdevice blockDevice) {
        this.blockDevice = blockDevice;
    }

    public Long getVmId() {
        return vmId;
    }

    public void setVmId(Long vmId) {
        this.vmId = vmId;
    }

}