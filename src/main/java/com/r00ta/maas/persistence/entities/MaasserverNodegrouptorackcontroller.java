package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "maasserver_nodegrouptorackcontroller")
public class MaasserverNodegrouptorackcontroller {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subnet_id", nullable = false)
    private MaasserverSubnet subnet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public MaasserverSubnet getSubnet() {
        return subnet;
    }

    public void setSubnet(MaasserverSubnet subnet) {
        this.subnet = subnet;
    }

}