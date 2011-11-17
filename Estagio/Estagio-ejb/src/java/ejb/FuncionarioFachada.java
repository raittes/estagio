package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class FuncionarioFachada implements FuncionarioFachadaLocal {
    @PersistenceContext(unitName = "Estagio-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public List<Funcionarios> getListaFuncionarios(){
        Query query = em.createNamedQuery("Funcionarios.findAll");
        return query.getResultList();
    }
    
    public List<Funcionarios> getFuncionarioByNome(String nome){
        Query query = em.createNamedQuery("Funcionarios.findByNome");
        query.setParameter("nome", nome);
        return query.getResultList();
    }
    
    
}
