package com.r00ta.maas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "maasserver_packagerepository")
public class MaasserverPackagerepository {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created", nullable = false)
    private OffsetDateTime created;

    @NotNull
    @Column(name = "updated", nullable = false)
    private OffsetDateTime updated;

    @Size(max = 41)
    @NotNull
    @Column(name = "name", nullable = false, length = 41)
    private String name;

    @Size(max = 200)
    @NotNull
    @Column(name = "url", nullable = false, length = 200)
    private String url;

    @Column(name = "components")
    private List<String> components;

    @Column(name = "arches")
    private List<String> arches;

    @NotNull
    @Column(name = "key", nullable = false, length = Integer.MAX_VALUE)
    private String key;

    @NotNull
    @Column(name = "\"default\"", nullable = false)
    private Boolean defaultField = false;

    @NotNull
    @Column(name = "enabled", nullable = false)
    private Boolean enabled = false;

    @Column(name = "disabled_pockets")
    private List<String> disabledPockets;

    @Column(name = "distributions")
    private List<String> distributions;

    @Column(name = "disabled_components")
    private List<String> disabledComponents;

    @NotNull
    @Column(name = "disable_sources", nullable = false)
    private Boolean disableSources = false;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public List<String> getArches() {
        return arches;
    }

    public void setArches(List<String> arches) {
        this.arches = arches;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getDefaultField() {
        return defaultField;
    }

    public void setDefaultField(Boolean defaultField) {
        this.defaultField = defaultField;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<String> getDisabledPockets() {
        return disabledPockets;
    }

    public void setDisabledPockets(List<String> disabledPockets) {
        this.disabledPockets = disabledPockets;
    }

    public List<String> getDistributions() {
        return distributions;
    }

    public void setDistributions(List<String> distributions) {
        this.distributions = distributions;
    }

    public List<String> getDisabledComponents() {
        return disabledComponents;
    }

    public void setDisabledComponents(List<String> disabledComponents) {
        this.disabledComponents = disabledComponents;
    }

    public Boolean getDisableSources() {
        return disableSources;
    }

    public void setDisableSources(Boolean disableSources) {
        this.disableSources = disableSources;
    }

}