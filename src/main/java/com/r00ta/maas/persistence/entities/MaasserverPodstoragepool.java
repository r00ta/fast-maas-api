package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "maasserver_podstoragepool")
public class MaasserverPodstoragepool {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 255)
    @NotNull
    @Column(name = "pool_id", nullable = false)
    private String poolId;

    @Size(max = 255)
    @NotNull
    @Column(name = "pool_type", nullable = false)
    private String poolType;

    @Size(max = 4095)
    @NotNull
    @Column(name = "path", nullable = false, length = 4095)
    private String path;

    @NotNull
    @Column(name = "storage", nullable = false)
    private Long storage;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pod_id", nullable = false)
    private MaasserverBmc pod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getPoolType() {
        return poolType;
    }

    public void setPoolType(String poolType) {
        this.poolType = poolType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getStorage() {
        return storage;
    }

    public void setStorage(Long storage) {
        this.storage = storage;
    }

    public MaasserverBmc getPod() {
        return pod;
    }

    public void setPod(MaasserverBmc pod) {
        this.pod = pod;
    }

}