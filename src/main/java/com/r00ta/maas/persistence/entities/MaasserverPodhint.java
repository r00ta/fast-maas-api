package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maasserver_podhints")
public class MaasserverPodhint {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "cores", nullable = false)
    private Integer cores;

    @NotNull
    @Column(name = "memory", nullable = false)
    private Integer memory;

    @NotNull
    @Column(name = "local_storage", nullable = false)
    private Long localStorage;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pod_id", nullable = false)
    private MaasserverBmc pod;

    @NotNull
    @Column(name = "cpu_speed", nullable = false)
    private Integer cpuSpeed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cluster_id")
    private MaasserverVmcluster cluster;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Long getLocalStorage() {
        return localStorage;
    }

    public void setLocalStorage(Long localStorage) {
        this.localStorage = localStorage;
    }

    public MaasserverBmc getPod() {
        return pod;
    }

    public void setPod(MaasserverBmc pod) {
        this.pod = pod;
    }

    public Integer getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(Integer cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public MaasserverVmcluster getCluster() {
        return cluster;
    }

    public void setCluster(MaasserverVmcluster cluster) {
        this.cluster = cluster;
    }

}