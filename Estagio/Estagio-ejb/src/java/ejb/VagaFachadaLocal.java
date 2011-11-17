/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author grad
 */
@Local

public interface VagaFachadaLocal {
    List<Vagas> getListaVagas();
}
