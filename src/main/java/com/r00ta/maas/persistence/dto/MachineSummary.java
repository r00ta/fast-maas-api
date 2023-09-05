package com.r00ta.maas.persistence.dto;

import com.r00ta.maas.api.models.responses.MachineSummaryResponse;
import com.r00ta.maas.models.MachineStatus;

import java.math.BigInteger;

public class MachineSummary {
    private Long id;

    private String systemId;

    private String hostname;

    private String owner;

    private String fqdn;

    private String architecture;

    private String osystem;

    private String distroSeries;

    private MachineStatus status;

    private String powerState;

    public MachineSummary(Long id, String systemId, String hostname, String owner, String fqdn, String architecture,
                          String osystem, String distroSeries, MachineStatus status, String powerState) {
        this.id = id;
        this.systemId = systemId;
        this.hostname = hostname;
        this.owner = owner;
        this.fqdn = fqdn;
        this.architecture = architecture;
        this.osystem = osystem;
        this.distroSeries = distroSeries;
        this.status = status;
        this.powerState = powerState;
    }

    public Long getId() {
        return id;
    }

    public String getSystemId() {
        return systemId;
    }

    public String getHostname() {
        return hostname;
    }

    public String getOwner() {
        return owner;
    }

    public String getFqdn() {
        return fqdn;
    }

    public String getArchitecture() {
        return architecture;
    }

    public String getOsystem() {
        return osystem;
    }

    public String getDistroSeries() {
        return distroSeries;
    }

    public MachineStatus getStatus() {
        return status;
    }

    public String getPowerState() {
        return powerState;
    }

    public MachineSummaryResponse toSummaryResponse() {
        MachineSummaryResponse response = new MachineSummaryResponse();
        response.setId(getId());
        response.setArchitecture(getArchitecture());
        response.setOsystem(getOsystem());
        response.setFqdn("");
        response.setDistroSeries(getDistroSeries());
        response.setSystemId(getSystemId());
        response.setHostname(getHostname());
        response.setHref("");
        response.setStatus(getStatus());
        response.setPowerState(getPowerState());
        return response;
    }
}
