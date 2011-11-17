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

@Stateless
public class VagaFachada implements VagaFachadaLocal {
    @PersistenceContext(unitName = "Estagio-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    public List<Vagas> getListaVagas(){
        Query query = em.createNamedQuery("Vagas.findAll");
        return query.getResultList();
    }

    
}
