package com.r00ta.maas.persistence.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.Map;

@Entity
@Table(name = "maasserver_scriptresult")
public class MaasserverScriptresult {
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
    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "exit_status")
    private Integer exitStatus;

    @Size(max = 255)
    @Column(name = "script_name")
    private String scriptName;

    @NotNull
    @Column(name = "stdout", nullable = false, length = Integer.MAX_VALUE)
    private String stdout;

    @NotNull
    @Column(name = "stderr", nullable = false, length = Integer.MAX_VALUE)
    private String stderr;

    @NotNull
    @Column(name = "result", nullable = false, length = Integer.MAX_VALUE)
    private String result;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "script_id")
    private MaasserverScript script;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "script_set_id", nullable = false)
    private MaasserverScriptset scriptSet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "script_version_id")
    private MaasserverVersionedtextfile scriptVersion;

    @NotNull
    @Column(name = "output", nullable = false, length = Integer.MAX_VALUE)
    private String output;

    @Column(name = "ended")
    private OffsetDateTime ended;

    @Column(name = "started")
    private OffsetDateTime started;

    @NotNull
    @Column(name = "parameters", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> parameters;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "physical_blockdevice_id")
    private MaasserverPhysicalblockdevice physicalBlockdevice;

    @NotNull
    @Column(name = "suppressed", nullable = false)
    private Boolean suppressed = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interface_id")
    private MaasserverInterface interfaceField;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getExitStatus() {
        return exitStatus;
    }

    public void setExitStatus(Integer exitStatus) {
        this.exitStatus = exitStatus;
    }

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public String getStdout() {
        return stdout;
    }

    public void setStdout(String stdout) {
        this.stdout = stdout;
    }

    public String getStderr() {
        return stderr;
    }

    public void setStderr(String stderr) {
        this.stderr = stderr;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public MaasserverScript getScript() {
        return script;
    }

    public void setScript(MaasserverScript script) {
        this.script = script;
    }

    public MaasserverScriptset getScriptSet() {
        return scriptSet;
    }

    public void setScriptSet(MaasserverScriptset scriptSet) {
        this.scriptSet = scriptSet;
    }

    public MaasserverVersionedtextfile getScriptVersion() {
        return scriptVersion;
    }

    public void setScriptVersion(MaasserverVersionedtextfile scriptVersion) {
        this.scriptVersion = scriptVersion;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public OffsetDateTime getEnded() {
        return ended;
    }

    public void setEnded(OffsetDateTime ended) {
        this.ended = ended;
    }

    public OffsetDateTime getStarted() {
        return started;
    }

    public void setStarted(OffsetDateTime started) {
        this.started = started;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public MaasserverPhysicalblockdevice getPhysicalBlockdevice() {
        return physicalBlockdevice;
    }

    public void setPhysicalBlockdevice(MaasserverPhysicalblockdevice physicalBlockdevice) {
        this.physicalBlockdevice = physicalBlockdevice;
    }

    public Boolean getSuppressed() {
        return suppressed;
    }

    public void setSuppressed(Boolean suppressed) {
        this.suppressed = suppressed;
    }

    public MaasserverInterface getInterfaceField() {
        return interfaceField;
    }

    public void setInterfaceField(MaasserverInterface interfaceField) {
        this.interfaceField = interfaceField;
    }

}