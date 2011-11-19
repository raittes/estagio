package ejb;

import java.util.List;
import javax.ejb.Local;


@Local
public interface FuncionarioFachadaLocal {
    
    List<Funcionarios> getListaFuncionarios();
    Funcionarios getFuncionarioByNome(String nome);
    Funcionarios checaLogin(java.lang.String nome, java.lang.String senha);
    void persist(Funcionarios func);    
}
