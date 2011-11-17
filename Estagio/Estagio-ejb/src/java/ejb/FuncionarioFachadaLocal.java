package ejb;

import java.util.List;
import javax.ejb.Local;


@Local
public interface FuncionarioFachadaLocal {
    
    
    List<Funcionarios> getListaFuncionarios();
}
