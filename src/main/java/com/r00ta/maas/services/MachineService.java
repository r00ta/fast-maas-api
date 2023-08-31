package com.r00ta.maas.services;

import com.r00ta.maas.api.models.requests.QueryPageInfo;
import com.r00ta.maas.api.models.responses.MachineDetailsResponse;
import com.r00ta.maas.api.models.responses.MachineSummaryResponse;
import com.r00ta.maas.models.ListResult;
import com.r00ta.maas.persistence.dto.MachineDetails;

import java.math.BigInteger;

public interface MachineService {
    ListResult<MachineSummaryResponse> list(QueryPageInfo queryPageInfo);
    MachineDetailsResponse get(BigInteger id);
}
