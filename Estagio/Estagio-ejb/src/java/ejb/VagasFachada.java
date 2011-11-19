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

    // "Insert Code > Add Business Method")
    public List<Vagas> getListaVagas(){
            em.flush();
        Query query = em.createNamedQuery("Vagas.findAll");
        return query.getResultList();
    }
    public List<Vagas> getListaVagasByFuncionario(int id){
            em.flush();
        Query query = em.createNamedQuery("Vagas.findByIdfuncionario");
        query.setParameter("idfuncionario", id);
        return query.getResultList();
    }
    
    public Object getVagaById(int id){
            em.flush();
        Query query = em.createNamedQuery("Vagas.findById");
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void persist(Object object) {
            em.flush();
        em.persist(object);
        em.flush();
    }
    public void update(Object object) {
            em.flush();
        em.merge(object);
        
    }
    public void remove(Object object) { 
        Vagas vaga = (Vagas) object;
        vaga = em.find(Vagas.class, vaga.getId());
        em.remove(vaga);
        
        // nao precisou, mas recomenda-se
        //em.getTransaction().commit(); 
    }    
    
}
