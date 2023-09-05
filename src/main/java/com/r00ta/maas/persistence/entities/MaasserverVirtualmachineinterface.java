package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;

@Entity
@Table(name = "maasserver_virtualmachineinterface")
public class MaasserverVirtualmachineinterface {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Column(name = "mac_address", length = Integer.MAX_VALUE)
    private String macAddress;

    @Size(max = 10)
    @NotNull
    @Column(name = "attachment_type", nullable = false, length = 10)
    private String attachmentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "host_interface_id")
    private MaasserverInterface hostInterface;

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

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public MaasserverInterface getHostInterface() {
        return hostInterface;
    }

    public void setHostInterface(MaasserverInterface hostInterface) {
        this.hostInterface = hostInterface;
    }

    public Long getVmId() {
        return vmId;
    }

    public void setVmId(Long vmId) {
        this.vmId = vmId;
    }

}