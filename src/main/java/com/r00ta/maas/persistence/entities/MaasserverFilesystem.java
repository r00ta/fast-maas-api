package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_filesystem")
public class MaasserverFilesystem {
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
    @Column(name = "uuid", nullable = false, length = Integer.MAX_VALUE)
    private String uuid;

    @Size(max = 20)
    @NotNull
    @Column(name = "fstype", nullable = false, length = 20)
    private String fstype;

    @Size(max = 255)
    @Column(name = "label")
    private String label;

    @Size(max = 255)
    @Column(name = "create_params")
    private String createParams;

    @Size(max = 255)
    @Column(name = "mount_point")
    private String mountPoint;

    @Size(max = 255)
    @Column(name = "mount_options")
    private String mountOptions;

    @NotNull
    @Column(name = "acquired", nullable = false)
    private Boolean acquired = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "block_device_id")
    private MaasserverBlockdevice blockDevice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cache_set_id")
    private MaasserverCacheset cacheSet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "filesystem_group_id")
    private MaasserverFilesystemgroup filesystemGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "partition_id")
    private MaasserverPartition partition;

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFstype() {
        return fstype;
    }

    public void setFstype(String fstype) {
        this.fstype = fstype;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCreateParams() {
        return createParams;
    }

    public void setCreateParams(String createParams) {
        this.createParams = createParams;
    }

    public String getMountPoint() {
        return mountPoint;
    }

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    public String getMountOptions() {
        return mountOptions;
    }

    public void setMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
    }

    public Boolean getAcquired() {
        return acquired;
    }

    public void setAcquired(Boolean acquired) {
        this.acquired = acquired;
    }

    public MaasserverBlockdevice getBlockDevice() {
        return blockDevice;
    }

    public void setBlockDevice(MaasserverBlockdevice blockDevice) {
        this.blockDevice = blockDevice;
    }

    public MaasserverCacheset getCacheSet() {
        return cacheSet;
    }

    public void setCacheSet(MaasserverCacheset cacheSet) {
        this.cacheSet = cacheSet;
    }

    public MaasserverFilesystemgroup getFilesystemGroup() {
        return filesystemGroup;
    }

    public void setFilesystemGroup(MaasserverFilesystemgroup filesystemGroup) {
        this.filesystemGroup = filesystemGroup;
    }

    public MaasserverPartition getPartition() {
        return partition;
    }

    public void setPartition(MaasserverPartition partition) {
        this.partition = partition;
    }

    public MaasserverNodeconfig getNodeConfig() {
        return nodeConfig;
    }

    public void setNodeConfig(MaasserverNodeconfig nodeConfig) {
        this.nodeConfig = nodeConfig;
    }

}