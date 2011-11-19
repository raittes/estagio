import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="UsuarioBean")
@SessionScoped

public class UsuarioBean {
    private String nome;
    private String login;
    private String senha;
            
    public UsuarioBean(){
    }
    
    public UsuarioBean(String l, String p){
        this.login = l;
        this.senha = p;
    }
    public UsuarioBean(String n, String l, String p, Long t){
        this.login = l;
        this.senha = p;
        this.nome = n;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }       
    public String toString(){
        return nome+" :: "+login+" : ("+senha+") : ";
    }   
}
