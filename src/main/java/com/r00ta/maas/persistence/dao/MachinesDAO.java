package com.r00ta.maas.persistence.dao;

import com.r00ta.maas.models.ListResult;
import com.r00ta.maas.persistence.dto.MachineDetails;
import com.r00ta.maas.persistence.dto.MachineSummary;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import com.r00ta.maas.persistence.entities.Machine;

import java.math.BigInteger;
import java.util.List;

@ApplicationScoped
@Transactional
public class MachinesDAO implements PanacheRepositoryBase<Machine, String> {
    public ListResult<MachineSummary> listAll(int page, int size){
        EntityManager em = getEntityManager();
        TypedQuery<Long> q = em.createNamedQuery("Machine.countAll", Long.class);
        Long count = q.getSingleResult();
        TypedQuery<MachineSummary> machinesQuery = em.createNamedQuery("Machine.findAllSummary", MachineSummary.class);
        List<MachineSummary> machines = machinesQuery.setFirstResult(page*size).setMaxResults(size).getResultList();
        return new ListResult<MachineSummary>(machines, page, count);
    }

    public MachineDetails get(BigInteger id){
        EntityManager em = getEntityManager();
        TypedQuery<MachineDetails> q = em.createNamedQuery("Machine.getDetails", MachineDetails.class);
        return q.getSingleResult();
    }
}
