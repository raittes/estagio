/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author raittes
 */
@Stateless
public class VagasFachada implements VagasFachadaLocal {
    @PersistenceContext(unitName = "Estagio-ejbPU")
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public List<Vagas> getListaVagas(){
        Query query = em.createNamedQuery("Vagas.findAll");
        return query.getResultList();
    }
    public List<Vagas> getListaVagasByFuncionario(int id){
        Query query = em.createNamedQuery("Vagas.findByIdfuncionario");
        query.setParameter("idFuncionario", id);
        return query.getResultList();
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
