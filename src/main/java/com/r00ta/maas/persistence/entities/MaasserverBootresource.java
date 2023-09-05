package com.r00ta.maas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.Map;

@Entity
@Table(name = "maasserver_bootresource")
public class MaasserverBootresource {
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
    @Column(name = "rtype", nullable = false)
    private Integer rtype;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 255)
    @NotNull
    @Column(name = "architecture", nullable = false)
    private String architecture;

    @NotNull
    @Column(name = "extra", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> extra;

    @Size(max = 32)
    @Column(name = "kflavor", length = 32)
    private String kflavor;

    @Size(max = 32)
    @Column(name = "bootloader_type", length = 32)
    private String bootloaderType;

    @NotNull
    @Column(name = "rolling", nullable = false)
    private Boolean rolling = false;

    @Size(max = 255)
    @NotNull
    @Column(name = "base_image", nullable = false)
    private String baseImage;

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

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    public String getKflavor() {
        return kflavor;
    }

    public void setKflavor(String kflavor) {
        this.kflavor = kflavor;
    }

    public String getBootloaderType() {
        return bootloaderType;
    }

    public void setBootloaderType(String bootloaderType) {
        this.bootloaderType = bootloaderType;
    }

    public Boolean getRolling() {
        return rolling;
    }

    public void setRolling(Boolean rolling) {
        this.rolling = rolling;
    }

    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

}