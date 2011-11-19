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

        public List<Funcionarios> getListaFuncionarios(){
            em.flush();
        Query query = em.createNamedQuery("Funcionarios.findAll");
        return query.getResultList();
    }
    
    public Funcionarios getFuncionarioByNome(String nome){
            em.flush();
        Query query = em.createNamedQuery("Funcionarios.findByNome");
        query.setParameter("nome", nome);
        Funcionarios resultado;
        try{
            resultado = (Funcionarios) query.getSingleResult();            
        }catch(Exception e){
            resultado = null;
        }
        return resultado;
    }
    public Funcionarios checaLogin(String nome, String senha){
            em.flush();
        Funcionarios logando = this.getFuncionarioByNome(nome);
        if(logando!= null){
            if(senha.equals(logando.getSenha()))
                return logando;
            else
                return null;
        }
        else           
            return null;
    }
    public void persist(Funcionarios object) {
        em.flush();
        em.persist(object);               
    }   
    
}
