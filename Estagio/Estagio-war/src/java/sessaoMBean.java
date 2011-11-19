import ejb.Funcionarios;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author raittes
 */
@ManagedBean
@SessionScoped
public class sessaoMBean {
    
            
    private Funcionarios logado;
    /** Creates a new instance of SessaoMBean */
    public sessaoMBean() {
    }

    public Funcionarios getLogado() {
        return logado;
    }

    public void setLogado(Funcionarios logado) {
        this.logado = logado;
    } 
    
    public String logar(Funcionarios f){
        if(f!=null){
            this.logado=f;
            return "logado";
        }
        else
            return "erro";
    }
    public String deslogar(){
        this.logado = null;
        return "login";
    }
    public String getResponse(){
        if(logado==null)
            return "deslogado";
        else
            return "logado";
    }
    
}
