package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "maasserver_script")
public class MaasserverScript {
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

    @NotNull
    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "tags")
    private List<String> tags;

    @NotNull
    @Column(name = "script_type", nullable = false)
    private Integer scriptType;

    @NotNull
    @Column(name = "destructive", nullable = false)
    private Boolean destructive = false;

    @NotNull
    @Column(name = "\"default\"", nullable = false)
    private Boolean defaultField = false;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "script_id", nullable = false)
    private MaasserverVersionedtextfile script;

    @Size(max = 255)
    @NotNull
    @Column(name = "title", nullable = false)
    private String title;

    @NotNull
    @Column(name = "hardware_type", nullable = false)
    private Integer hardwareType;

    @NotNull
    @Column(name = "packages", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> packages;

    @NotNull
    @Column(name = "parallel", nullable = false)
    private Integer parallel;

    @NotNull
    @Column(name = "parameters", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> parameters;

    @NotNull
    @Column(name = "results", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> results;

    @NotNull
    @Column(name = "for_hardware", nullable = false)
    private List<String> forHardware;

    @NotNull
    @Column(name = "may_reboot", nullable = false)
    private Boolean mayReboot = false;

    @NotNull
    @Column(name = "recommission", nullable = false)
    private Boolean recommission = false;
    @NotNull
    @Column(name = "apply_configured_networking", nullable = false)
    private Boolean applyConfiguredNetworking = false;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getScriptType() {
        return scriptType;
    }

    public void setScriptType(Integer scriptType) {
        this.scriptType = scriptType;
    }

    public Boolean getDestructive() {
        return destructive;
    }

    public void setDestructive(Boolean destructive) {
        this.destructive = destructive;
    }

    public Boolean getDefaultField() {
        return defaultField;
    }

    public void setDefaultField(Boolean defaultField) {
        this.defaultField = defaultField;
    }

    public MaasserverVersionedtextfile getScript() {
        return script;
    }

    public void setScript(MaasserverVersionedtextfile script) {
        this.script = script;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(Integer hardwareType) {
        this.hardwareType = hardwareType;
    }

    public Map<String, Object> getPackages() {
        return packages;
    }

    public void setPackages(Map<String, Object> packages) {
        this.packages = packages;
    }

    public Integer getParallel() {
        return parallel;
    }

    public void setParallel(Integer parallel) {
        this.parallel = parallel;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public Map<String, Object> getResults() {
        return results;
    }

    public void setResults(Map<String, Object> results) {
        this.results = results;
    }

    public List<String> getForHardware() {
        return forHardware;
    }

    public void setForHardware(List<String> forHardware) {
        this.forHardware = forHardware;
    }

    public Boolean getMayReboot() {
        return mayReboot;
    }

    public void setMayReboot(Boolean mayReboot) {
        this.mayReboot = mayReboot;
    }

    public Boolean getRecommission() {
        return recommission;
    }

    public void setRecommission(Boolean recommission) {
        this.recommission = recommission;
    }

    public Boolean getApplyConfiguredNetworking() {
        return applyConfiguredNetworking;
    }

    public void setApplyConfiguredNetworking(Boolean applyConfiguredNetworking) {
        this.applyConfiguredNetworking = applyConfiguredNetworking;
    }

/*
    TODO [JPA Buddy] create field to map the 'timeout' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "timeout", columnDefinition = "interval(0, 0) not null")
    private Object timeout;
*/
}