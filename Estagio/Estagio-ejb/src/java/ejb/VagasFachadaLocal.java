/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author raittes
 */
@Local
public interface VagasFachadaLocal {
    
    public List<Vagas> getListaVagas();
    public List<Vagas> getListaVagasByFuncionario(int id);
}
