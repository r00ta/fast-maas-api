package maas.r00ta.com.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import maas.r00ta.com.api.models.requests.QueryPageInfo;
import maas.r00ta.com.api.models.responses.MachineSummaryResponse;
import maas.r00ta.com.models.ListResult;
import maas.r00ta.com.persistence.dao.MachinesDAO;
import maas.r00ta.com.persistence.models.Machine;

import java.util.stream.Collectors;

@ApplicationScoped
public class MachineServiceImpl implements MachineService {

    @Inject
    MachinesDAO machinesDAO;

    @Override
    public ListResult<MachineSummaryResponse> list(QueryPageInfo queryPageInfo) {
        ListResult<Machine> machines = machinesDAO.listAll(queryPageInfo.getPageNumber(), queryPageInfo.getPageSize());
        return new ListResult<>(machines.getItems().stream().map(Machine::toSummaryResponse).collect(Collectors.toList()),
                machines.getPage(), machines.getSize());
    }
}
