package com.r00ta.maas.services;

import com.r00ta.maas.api.models.requests.QueryPageInfo;
import com.r00ta.maas.api.models.responses.MachineDetailsResponse;
import com.r00ta.maas.api.models.responses.MachineSummaryResponse;
import com.r00ta.maas.models.ListResult;
import com.r00ta.maas.persistence.dto.MachineSummary;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import com.r00ta.maas.persistence.dao.MachinesDAO;

import java.math.BigInteger;
import java.util.stream.Collectors;

@ApplicationScoped
public class MachineServiceImpl implements MachineService {

    @Inject
    MachinesDAO machinesDAO;

    @Override
    public ListResult<MachineSummaryResponse> list(QueryPageInfo queryPageInfo) {
        ListResult<MachineSummary> machines = machinesDAO.listAll(queryPageInfo.getPageNumber(), queryPageInfo.getPageSize());
        return new ListResult<>(machines.getItems().stream().map(MachineSummary::toSummaryResponse).collect(Collectors.toList()),
                machines.getPage(), machines.getSize());
    }

    @Override
    public MachineDetailsResponse get(BigInteger id) {
        return null;
    }
}
