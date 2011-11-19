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
        // gambiarra, pq AutoIncrement NAO FUNCIONA
        //vaga.setId(this.getListaVagas().size());
        vagaFachada.update(vaga);        
    }
    public String remover(){
        vagaFachada.remove(vaga);
        return "removida";
    }
    public String crie(){
        vagaFachada.persist(vaga);
        return "logado";
    }
    public String novaVaga(){
        vaga = new Vagas();
        //vagaFachada.persist(vaga);
        criar = true;
        return "EditarVaga";
    }
}
