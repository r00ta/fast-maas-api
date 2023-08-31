package com.r00ta.maas.persistence.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.math.BigInteger;
import java.util.Date;

public class MachineDetails {
    // TODO: wip
    private BigInteger id;
    private Date created;
    private Date updated;
    private String systemId;
    private String hostname;
    private Integer status;
    private String biosBootMethod;
    private String osystem;
    private String distroSeries;
    private String architecture;
    private String minHweKernel;
    private String hweKernel;
    private Integer cpuCount;
    private Integer memory;
    private BigInteger swapSize;
    private String powerState;
    private Boolean netboot;
    private Integer nodeType;
    private String url;
    private java.sql.Date lastImageSync;
    private String defaultUser;
    private Integer cpuSpeed;
    private Boolean locked;
    private String hardwareUUID;
    private Boolean ephemeralDeploy;
    private String description;
    private Boolean enableHWSync;
    private java.sql.Date lastSync;
    private Integer syncInterval;
}
