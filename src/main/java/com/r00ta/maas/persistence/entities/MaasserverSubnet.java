package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.net.InetAddress;
import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "maasserver_subnet")
public class MaasserverSubnet {
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

    @Column(name = "gateway_ip")
    private InetAddress gatewayIp;

    @Column(name = "dns_servers")
    private List<String> dnsServers;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vlan_id", nullable = false)
    private MaasserverVlan vlan;

    @NotNull
    @Column(name = "rdns_mode", nullable = false)
    private Integer rdnsMode;

    @NotNull
    @Column(name = "allow_proxy", nullable = false)
    private Boolean allowProxy = false;

    @NotNull
    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    private String description;

    @NotNull
    @Column(name = "active_discovery", nullable = false)
    private Boolean activeDiscovery = false;

    @NotNull
    @Column(name = "managed", nullable = false)
    private Boolean managed = false;

    @NotNull
    @Column(name = "allow_dns", nullable = false)
    private Boolean allowDns = false;
    @NotNull
    @Column(name = "disabled_boot_architectures", nullable = false)
    private List<String> disabledBootArchitectures;

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

    public InetAddress getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(InetAddress gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public List<String> getDnsServers() {
        return dnsServers;
    }

    public void setDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }

    public MaasserverVlan getVlan() {
        return vlan;
    }

    public void setVlan(MaasserverVlan vlan) {
        this.vlan = vlan;
    }

    public Integer getRdnsMode() {
        return rdnsMode;
    }

    public void setRdnsMode(Integer rdnsMode) {
        this.rdnsMode = rdnsMode;
    }

    public Boolean getAllowProxy() {
        return allowProxy;
    }

    public void setAllowProxy(Boolean allowProxy) {
        this.allowProxy = allowProxy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActiveDiscovery() {
        return activeDiscovery;
    }

    public void setActiveDiscovery(Boolean activeDiscovery) {
        this.activeDiscovery = activeDiscovery;
    }

    public Boolean getManaged() {
        return managed;
    }

    public void setManaged(Boolean managed) {
        this.managed = managed;
    }

    public Boolean getAllowDns() {
        return allowDns;
    }

    public void setAllowDns(Boolean allowDns) {
        this.allowDns = allowDns;
    }

    public List<String> getDisabledBootArchitectures() {
        return disabledBootArchitectures;
    }

    public void setDisabledBootArchitectures(List<String> disabledBootArchitectures) {
        this.disabledBootArchitectures = disabledBootArchitectures;
    }

/*
    TODO [JPA Buddy] create field to map the 'cidr' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "cidr", columnDefinition = "cidr(0, 0) not null")
    private Object cidr;
*/
}