import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.faces.bean.ApplicationScoped;


@ManagedBean(name="SistemaBean")
@ApplicationScoped
public class SistemaBean {
    
    private List usuarios;
    //private ArrayList<ComprovanteBean> resultadoGeral;
         
    public SistemaBean(){
        usuarios = new ArrayList<UsuarioBean>();
        // Usuarios Default
        usuarios.add(new UsuarioBean("Administrador","admin","admin",null));
        usuarios.add(new UsuarioBean("Marcos","marcos","paulo",null));
        usuarios.add(new UsuarioBean("Raittes","joao","paulo",null));
    }

    public void cadastrar(String nome, String login, String senha, Long telefone) {
        usuarios.add(new UsuarioBean(nome,login,senha,telefone));
    }   
    
    public UsuarioBean checaLogin(String slogin, String senha){
        for(Object u : usuarios){
            UsuarioBean user = (UsuarioBean) u;
            if(slogin.equals(user.getLogin().toString())){
                if(senha.equals(user.getSenha())){
                    //logou, retorna user
                    return user;                                        
                }
            }
        }        
        //login errado = null
        return null;
    }
         
    public List getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(List usuarios) {
        this.usuarios = usuarios;
    }
}
