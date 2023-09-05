package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Map;

@Entity
@Table(name = "maasserver_bootsourcecache")
public class MaasserverBootsourcecache {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 32)
    @NotNull
    @Column(name = "os", nullable = false, length = 32)
    private String os;

    @Size(max = 32)
    @NotNull
    @Column(name = "arch", nullable = false, length = 32)
    private String arch;

    @Size(max = 32)
    @NotNull
    @Column(name = "subarch", nullable = false, length = 32)
    private String subarch;

    @Size(max = 32)
    @NotNull
    @Column(name = "release", nullable = false, length = 32)
    private String release;

    @Size(max = 32)
    @NotNull
    @Column(name = "label", nullable = false, length = 32)
    private String label;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "boot_source_id", nullable = false)
    private MaasserverBootsource bootSource;

    @Size(max = 255)
    @Column(name = "release_codename")
    private String releaseCodename;

    @Size(max = 255)
    @Column(name = "release_title")
    private String releaseTitle;

    @Column(name = "support_eol")
    private LocalDate supportEol;

    @Size(max = 32)
    @Column(name = "kflavor", length = 32)
    private String kflavor;

    @Size(max = 32)
    @Column(name = "bootloader_type", length = 32)
    private String bootloaderType;

    @NotNull
    @Column(name = "extra", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> extra;

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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public String getSubarch() {
        return subarch;
    }

    public void setSubarch(String subarch) {
        this.subarch = subarch;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public MaasserverBootsource getBootSource() {
        return bootSource;
    }

    public void setBootSource(MaasserverBootsource bootSource) {
        this.bootSource = bootSource;
    }

    public String getReleaseCodename() {
        return releaseCodename;
    }

    public void setReleaseCodename(String releaseCodename) {
        this.releaseCodename = releaseCodename;
    }

    public String getReleaseTitle() {
        return releaseTitle;
    }

    public void setReleaseTitle(String releaseTitle) {
        this.releaseTitle = releaseTitle;
    }

    public LocalDate getSupportEol() {
        return supportEol;
    }

    public void setSupportEol(LocalDate supportEol) {
        this.supportEol = supportEol;
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

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

}