package maas.r00ta.com.services;

import maas.r00ta.com.api.models.requests.QueryPageInfo;
import maas.r00ta.com.api.models.responses.MachineSummaryResponse;
import maas.r00ta.com.models.ListResult;

public interface MachineService {
    ListResult<MachineSummaryResponse> list(QueryPageInfo queryPageInfo);
}
