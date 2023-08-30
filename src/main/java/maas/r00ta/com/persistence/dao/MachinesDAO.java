package maas.r00ta.com.persistence.dao;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.quarkus.panache.common.Parameters;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import maas.r00ta.com.models.ListResult;
import maas.r00ta.com.persistence.models.Machine;

import java.util.List;

@ApplicationScoped
@Transactional
public class MachinesDAO implements PanacheRepositoryBase<Machine, String> {
    public ListResult<Machine> listAll(int page, int size){
        long count = find("#Machine.findAll").count();
        List<Machine> machines = find("#Machine.findAll").page(page, size).list();
        return new ListResult<Machine>(machines, page, count);
    }
}
