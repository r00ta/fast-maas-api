package maas.r00ta.com.api.models.responses;

import maas.r00ta.com.api.models.responses.base.PagedListResponse;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public class MachineListResponse extends PagedListResponse<MachineSummaryResponse> {
    public MachineListResponse() {
        super("MachineList");
    }
}
