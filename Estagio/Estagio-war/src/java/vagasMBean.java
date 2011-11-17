import ejb.VagaFachadaLocal;
import ejb.Vagas;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class vagasMBean {
    @EJB
    private VagaFachadaLocal vagaFachada;

    public vagasMBean() {
    }
    public List<Vagas> getListaVagas(){
        return vagaFachada.getListaVagas();
    }
}
