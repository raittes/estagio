import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="LoginBean")
@SessionScoped
public class LoginBean {
    
    private UsuarioBean usuario;
    private String login;
    private String senha;      
    private String empresa;
    
    public LoginBean() {
        usuario = null;
    }
    public String logar(UsuarioBean user){
        if(user==null)
            return "erro";
        else{
            this.usuario = user;
            return "logado";
        }            
    }  
    public String deslogar(UsuarioBean user){
        this.usuario=null;
        this.login=null;
        this.senha=null;
        return "index";
    }
    public UsuarioBean getUsuario() {
        return usuario;
    }
    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
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
    
    public String getResponse(){
        if(usuario == null)
            return "deslogado";
        else
            return "logado";
    }
    public LoginBean getThis(){
        return this;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}