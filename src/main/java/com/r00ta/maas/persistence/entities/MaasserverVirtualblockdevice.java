package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maasserver_virtualblockdevice")
public class MaasserverVirtualblockdevice {
    @Id
    @Column(name = "blockdevice_ptr_id", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "blockdevice_ptr_id", nullable = false)
    private MaasserverBlockdevice maasserverBlockdevice;

    @NotNull
    @Column(name = "uuid", nullable = false, length = Integer.MAX_VALUE)
    private String uuid;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "filesystem_group_id", nullable = false)
    private MaasserverFilesystemgroup filesystemGroup;

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public MaasserverFilesystemgroup getFilesystemGroup() {
        return filesystemGroup;
    }

    public void setFilesystemGroup(MaasserverFilesystemgroup filesystemGroup) {
        this.filesystemGroup = filesystemGroup;
    }

}