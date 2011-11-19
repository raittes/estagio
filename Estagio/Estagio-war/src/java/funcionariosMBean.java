/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.FuncionarioFachadaLocal;
import ejb.Funcionarios;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped
public class funcionariosMBean {
    @EJB
    private FuncionarioFachadaLocal funcionarioFachada;
    private Funcionarios func;

    /** Creates a new instance of funcionariosMBean */
    public funcionariosMBean() {
        func = new Funcionarios();
    }

    public Funcionarios getFunc() {
        return func;
    }
    public void setFunc(Funcionarios func) {
        this.func = func;
    }    
     public List<Funcionarios> getListaFuncionarios(){
        return funcionarioFachada.getListaFuncionarios();
    }
     public Funcionarios checaLogin(String nome, String senha){
         return funcionarioFachada.checaLogin(nome, senha);
     }
     public String cadastrar(){
         /*if(this.getListaFuncionarios().size()==0)
             func.setId(1);
         else
            func.setId(this.getListaFuncionarios().size()+1);*/
         funcionarioFachada.persist(func);        
         return "usuarioCadastrado";
     }
}
