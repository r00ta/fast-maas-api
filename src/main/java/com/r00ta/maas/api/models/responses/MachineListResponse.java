package com.r00ta.maas.api.models.responses;

import com.r00ta.maas.api.models.responses.base.PagedListResponse;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public class MachineListResponse extends PagedListResponse<MachineSummaryResponse> {
    public MachineListResponse() {
        super("MachineSummary");
    }
}
