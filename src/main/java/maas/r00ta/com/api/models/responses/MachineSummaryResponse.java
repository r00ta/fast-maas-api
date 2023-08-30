package maas.r00ta.com.api.models.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import maas.r00ta.com.api.models.responses.base.BaseResponse;
import maas.r00ta.com.models.MachineStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MachineSummaryResponse extends BaseResponse {
    public MachineSummaryResponse() {
        super("Machine");
    }

    @JsonProperty("system_id")
    private String systemId;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("fqdn")
    private String fqdn;

    @JsonProperty("architecture")
    private String architecture;

    @JsonProperty("osystem")
    private String osystem;

    @JsonProperty("distro_series")
    private String distroSeries;

    @JsonProperty("status")
    private MachineStatus status;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getOsystem() {
        return osystem;
    }

    public void setOsystem(String osystem) {
        this.osystem = osystem;
    }

    public String getDistroSeries() {
        return distroSeries;
    }

    public void setDistroSeries(String distroSeries) {
        this.distroSeries = distroSeries;
    }

    public MachineStatus getStatus() {
        return status;
    }

    public void setStatus(MachineStatus status) {
        this.status = status;
    }
}
