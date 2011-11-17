import ejb.VagasFachadaLocal;
import ejb.Vagas;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class vagasMBean {
    @EJB
    private VagasFachadaLocal vagaFachada;

    public vagasMBean() {
    }
    public List<Vagas> getListaVagas(){
        return vagaFachada.getListaVagas();
    }
    public List<Vagas> getListaVagasByFuncionario(int id){
        return vagaFachada.getListaVagasByFuncionario(id);
    }
}
