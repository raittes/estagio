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
    private Vagas vaga;
    private boolean criar;

    public vagasMBean() {
        criar = false;
    }

    public Vagas getVaga() {
        return vaga;
    }

    public void setVaga(Vagas vaga) {
        this.vaga = vaga;
    }

    public boolean isCriar() {
        return criar;
    }

    public void setCriar(boolean criar) {
        this.criar = criar;
    }
    
    public List<Vagas> getListaVagas(){
        return vagaFachada.getListaVagas();
    }
    public List<Vagas> getListaVagasByFuncionario(int id){
        return vagaFachada.getListaVagasByFuncionario(id);
    }
    public String editar(int id){
        criar=false;
        vaga = (Vagas) vagaFachada.getVagaById(id);
        return "EditarVaga";
    }
    public String detalhes(int id){
        vaga = (Vagas) vagaFachada.getVagaById(id);
        return "VagaDetalhes";
    }
    public void salvar(){
        vagaFachada.update(vaga);        
    }
    public void remover(){
        vagaFachada.remove(vaga);
    }
    public void criar(){
        vagaFachada.persist(vaga);
    }
    public String novaVaga(){
        vaga = new Vagas();
        //vagaFachada.persist(vaga);
        criar = true;
        return "EditarVaga";
    }
}
