/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.FuncionarioFachadaLocal;
import ejb.Funcionarios;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class funcionariosMBean {
    @EJB
    private FuncionarioFachadaLocal funcionarioFachada;

    /** Creates a new instance of funcionariosMBean */
    public funcionariosMBean() {
    }
    
     public List<Funcionarios> getListaFuncionarios(){
        return funcionarioFachada.getListaFuncionarios();
    }
}
