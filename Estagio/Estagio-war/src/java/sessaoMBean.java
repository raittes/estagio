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
    
    private String login;
    private String senha;      
    private String empresa;    
            
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
